/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.swissdec;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.ClientImpl;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.PhaseInterceptor;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.common.EncryptionActionToken;
import org.apache.wss4j.common.SignatureActionToken;
import org.apache.wss4j.common.WSEncryptionPart;
import org.apache.wss4j.common.crypto.Merlin;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.HandlerAction;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.security.KeyStore;
import java.util.*;

/**
 * <p>Abstract base class for all Swissdec standards and versions. Handles the shared configuration like WS-Security,
 * proxy server, etc. and provides extension points to override specialities for the specific standard/version
 * implementations.
 *
 * <p>There is no need to extend this class directly, but the standard/version specific subclasses:
 * <ul>
 *     <li>{@link AbstractTransmitter20130514}</li>
 *     <li>{@link AbstractTransmitter20180901}</li>
 *     <li>{@link AbstractTransmitter20190301}</li>
 *     <li>{@link AbstractTransmitter20200220}</li>
 * </ul>
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-04 12:00:08 +0200 (Fr., 04 Sep 2020) $
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public abstract class AbstractTransmitter {
    private static final DocumentBuilderFactory factory;

    // Proxy information
    private Boolean proxyEnabled = false;
    private String proxyHost = null;
    private Integer proxyPort = null;

    /**
     * Cache WS-Security inbound properties
     */
    private Map<String, Object> inSecurityProperties;

    static {
        // preload and setup painful DOM DocumentBuilderFactory
        factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setIgnoringComments(true);
    }

    /**
     * Extension point to override the {@link java.net.URL} to the WSDL
     *
     * @return the URL to the WSDL
     */
    protected abstract URL getWSDL();

    /**
     * Extension point to get the JAXWS-Port
     *
     * @return the JAXWS-Port for the specific standard/version
     */
    protected abstract Object getPort();

    /**
     * Extension point to get the endpoint url
     *
     * @return the endpoint url as string
     */
    protected abstract String getUrl();

    /**
     * Extension point to override the {@link javax.xml.bind.JAXBContext} for the specific standard/version
     *
     * @return the endpoint url as string
     */
    protected abstract JAXBContext getJAXBContext();

    /**
     * <p>Extension point to inject CXF-{@link org.apache.cxf.phase.PhaseInterceptor} into the SOAP stack and
     * execute after WS-Signature.</p>
     * <p>If no signature is issued then these list of Interceptors is ignored.</p>
     *
     * @return the the list of {@link org.apache.cxf.phase.PhaseInterceptor} to execute after WS-Signature
     */
    protected List<PhaseInterceptor<SoapMessage>> getAfterSignatureCallbacks(){
        return Collections.emptyList();
    }

    /**
     * Extension point to inject CXF-{@link org.apache.cxf.phase.PhaseInterceptor} into the SOAP stack and
     * execute after WS-Encryption
     *
     * @return the the list of {@link org.apache.cxf.phase.PhaseInterceptor} to execute after WS-Encryption
     */
    protected List<PhaseInterceptor<SoapMessage>> getAfterEncryptionCallbacks(){
        return Collections.emptyList();
    }

    /**
     * Getter for the WS-Security properties inbound
     *
     * @return the WSS4J properties as {@link java.util.Map}
     */
    public Map<String, Object> getInSecurityProperties() {
        if (inSecurityProperties == null || inSecurityProperties.size() == 0) {
            inSecurityProperties = new HashMap<>();
            inSecurityProperties.put(WSHandlerConstants.ACTION, "Timestamp Signature Encrypt");
            inSecurityProperties.put(WSHandlerConstants.PW_CALLBACK_CLASS, getPasswordCallbackClass());
            inSecurityProperties.put(WSHandlerConstants.SIG_PROP_FILE, "insecurity-client.properties");
            inSecurityProperties.put(WSHandlerConstants.TTL_TIMESTAMP, "1800"); // 30 minutes
            inSecurityProperties.put(WSHandlerConstants.SIG_SUBJECT_CERT_CONSTRAINTS, ".*");
            inSecurityProperties.put(WSHandlerConstants.IS_BSP_COMPLIANT, "false");
            inSecurityProperties.put(WSHandlerConstants.DEC_PROP_FILE, "outsecurity-client.properties");
        }
        return inSecurityProperties;
    }

    /**
     * Getter for the WS-Security {@link javax.security.auth.callback.CallbackHandler} to resolve the private key password
     *
     * @return {@link javax.security.auth.callback.CallbackHandler} implementation
     */
    protected String getPasswordCallbackClass() {
        return PasswordCallback.class.getName();
    }

    /**
     * Sets the value of the proxyEnabled property.
     * <p>If true, the outgoing connection is established through the specified proxy server.</p>
     *
     * @param proxyEnabled boolean if the proxy server should be used
     */
    public void setProxyEnabled(Boolean proxyEnabled) {
        this.proxyEnabled = proxyEnabled;
    }

    /**
     * Sets the value of the proxyHost property.
     * <p>If property proxyEnabled is false, this value is ignored.</p>
     *
     * @param proxyHost allowed object is
     *                  {@link String }
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * Sets the value of the proxyPort property.
     * <p>If property proxyEnabled is false, this value is ignored.</p>
     *
     * @param proxyPort allowed object is
     *                  {@link Integer }
     */
    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Extension point to specify additional {@link org.apache.cxf.interceptor.Interceptor} to add in the CXF outbound chain.
     *
     * @return a list of Interceptors to add
     */
    protected List<Interceptor<? extends Message>> getOutInterceptors() {
        return Collections.emptyList();
    }

    /**
     * Extension point to specify additional {@link org.apache.cxf.interceptor.Interceptor} to add in the CXF inbound chain.
     *
     * @return a list of Interceptors to add
     */
    protected List<Interceptor<? extends Message>> getInInterceptors() {
        return Collections.emptyList();
    }

    /**
     * Extension point to specify if the outgoing requests should be signed.
     *
     * @return a boolean, defaults to true
     */
    protected boolean doSignature() {
        return true;
    }


    /**
     * Extension point to specify if the outgoing requests should be encrypted.
     *
     * @return a boolean, defaults to true
     */
    protected boolean doEncryption() {
        return true;
    }

    /**
     * Method to issue a SOAP-request with the given {@link JAXBElement}.
     *
     * @param jaxbElement the request payload
     * @return {@link JAXBElement} with the response
     * @throws Exception if a exception is happen during the process
     */
    public Object invoke(JAXBElement jaxbElement) throws Exception {
        return invoke(jaxbElement, getUrl(), false, null);
    }


    /**
     * Method to issue a SOAP-request with the given {@link JAXBElement}.
     * <p>Overloaded method to specify if the request should be secured. This is useful for the operation Ping.</p>
     *
     * @param jaxbElement the request payload
     * @param noSec       boolean value if the request should not be secured
     * @return {@link JAXBElement} with the response
     * @throws Exception if a exception is happen during the process
     */
    public Object invoke(JAXBElement jaxbElement, boolean noSec) throws Exception {
        return invoke(jaxbElement, getUrl(), noSec, null);
    }

    /**
     * Method to issue a SOAP-request with the given {@link JAXBElement}.
     * <p>Overloaded method to specify a second {@link KeyStore}. If set, there will be a second signature.</p>
     * <p>Used for all operations who needs a UID-signature. This is mandatory for:</p>
     * <ul>
     *     <li>KLEv1 (20180901)</li>
     *     <li>SUAv1 Renew (20190301)</li>
     * </ul>
     * <p>This is optional for:</p>
     * <ul>
     *     <li>ELMv4 (20130514)</li>
     *     <li>ELMv5 (20200220)</li>
     * </ul>
     *
     * @param jaxbElement the request payload
     * @param keystore    {@link KeyStore} with the UID keypair to issue a second signature
     * @return {@link JAXBElement} with the response
     * @throws Exception if a exception is happen during the process
     */
    public Object invoke(JAXBElement jaxbElement, KeyStore keystore) throws Exception {
        return this.invoke(jaxbElement, getUrl(), false, keystore);
    }

    /* Base invoke method */
    private Object invoke(JAXBElement jaxbElement, String url, boolean noSec, KeyStore keystore) throws Exception {
        Object port = getPort();

        final ClientImpl client = (ClientImpl) ClientProxy.getClient(port);

        client.getRequestContext().put(Message.ENDPOINT_ADDRESS, url);
        client.setThreadLocalRequestContext(true);
        client.setSynchronousTimeout(1300000);

        final HTTPConduit httpConduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setReceiveTimeout(1200000);
        httpClientPolicy.setAllowChunking(true);
        httpClientPolicy.setMaxRetransmits(0);
        httpConduit.setClient(httpClientPolicy);

        if (proxyEnabled) {
            httpClientPolicy.setProxyServer(proxyHost);
            httpClientPolicy.setProxyServerPort(proxyPort);
        }

        TLSClientParameters tlsClientParameters = new TLSClientParameters();
        tlsClientParameters.setSecureSocketProtocol("TLS");
        tlsClientParameters.setDisableCNCheck(true);
        httpConduit.setTlsClientParameters(tlsClientParameters);

        if (!noSec) {
            if (doSignature()) {
                client.getOutInterceptors().add(getSignatureOutHandler(keystore));
            }
            if (doEncryption()) {
                client.getOutInterceptors().add(getEncryptionOutHandler());
            }
            client.getInInterceptors().add(getSecurityInHandler(keystore));
        }
        client.getOutInterceptors().addAll(getOutInterceptors());
        client.getInInterceptors().addAll(getInInterceptors());

        String operation = jaxbElement.getName().getLocalPart();
        // workaround schema bug in sua ...
        if (operation.equals("GetResultFromOrganizationRegistration")) {
            operation = "GetResultFromRegisterOrganization";
        }

        Object[] object = client.invoke(operation, jaxbElement.getValue());
        return object[0];
    }

    //
    // PRIVATE HELPER METHODS
    //
    private Interceptor getSecurityInHandler(KeyStore keyStore) {
        DualCryptoWSS4JInInterceptor wss4JInInterceptor = new DualCryptoWSS4JInInterceptor(); //overwritten handler for dual crypto handling
        wss4JInInterceptor.setProperties(getInSecurityProperties());

        if (keyStore != null) {
            Merlin crypto = new Merlin();
            crypto.setKeyStore(keyStore);
            wss4JInInterceptor.setSuaCrypto(crypto);
            wss4JInInterceptor.setProperty(WSHandlerConstants.DEC_PROP_FILE, null);  // Attention: overwrites entry in inSecurityProperties by reference
        } else {
            // Reset property if there is no SUA (Certainly after the use of SUA)
            wss4JInInterceptor.setProperty(WSHandlerConstants.DEC_PROP_FILE, "outsecurity-client.properties");
        }
        return wss4JInInterceptor;
    }

    private WSS4JOutInterceptor getSignatureOutHandler(KeyStore keystore) {
        Map<String, Object> properties = new HashMap<>();

        WSEncryptionPart sigTimestamp = new WSEncryptionPart("Timestamp", WSConstants.WSU_NS, "");
        WSEncryptionPart sigBody = new WSEncryptionPart("Body", WSConstants.URI_SOAP11_ENV, "");

        SignatureActionToken erpSignature = new SignatureActionToken();
        erpSignature.setUser("receiver");
        erpSignature.setCryptoProperties("outsecurity-client.properties");
        erpSignature.setKeyIdentifierId(WSConstants.BST_DIRECT_REFERENCE);
        erpSignature.setParts(Arrays.asList(sigTimestamp, sigBody));

        List<HandlerAction> actions = new ArrayList<>();
        actions.add(new HandlerAction(WSConstants.TS, null));
        actions.add(new HandlerAction(WSConstants.SIGN, erpSignature));

        SignatureActionToken uidSignature = new SignatureActionToken();
        if (keystore != null) {
            uidSignature.setUser("1");
            Merlin crypto = new Merlin();
            crypto.setKeyStore(keystore);
            uidSignature.setCrypto(crypto);
            uidSignature.setKeyIdentifierId(WSConstants.BST_DIRECT_REFERENCE);
            uidSignature.setParts(Arrays.asList(sigBody, sigTimestamp));
            actions.add(new HandlerAction(WSConstants.SIGN, uidSignature));
        }

        properties.put(WSHandlerConstants.SIG_KEY_ID, "DirectReference");
        properties.put(WSHandlerConstants.MUST_UNDERSTAND, "false");
        properties.put(WSHandlerConstants.TIMESTAMP_PRECISION, "true");
        properties.put(WSHandlerConstants.PW_CALLBACK_CLASS, getPasswordCallbackClass());
        properties.put(WSHandlerConstants.IS_BSP_COMPLIANT, "false");
        properties.put(WSHandlerConstants.ENABLE_SIGNATURE_CONFIRMATION, "true");
        properties.put(WSHandlerConstants.TTL_TIMESTAMP, "900");
        properties.put(WSHandlerConstants.SIG_SUBJECT_CERT_CONSTRAINTS, ".*");

        properties.put(WSHandlerConstants.HANDLER_ACTIONS, actions);
        ExtensibleWSS4JOutInterceptor wss4JOutInterceptor = new ExtensibleWSS4JOutInterceptor(properties, getAfterSignatureCallbacks());
        wss4JOutInterceptor.setId("WSS4JOutSignatureInterceptor");
        return wss4JOutInterceptor;
    }

    private WSS4JOutInterceptor getEncryptionOutHandler() {
        Map<String, Object> properties = new HashMap<>();
        List<HandlerAction> actions = new ArrayList<>();

        EncryptionActionToken encryption = new EncryptionActionToken();
        encryption.setUser("receiver");
        encryption.setCryptoProperties("outsecurity-client.properties");
        encryption.setSymmetricAlgorithm(WSConstants.AES_256_GCM);
        actions.add(new HandlerAction(WSConstants.ENCR, encryption));

        properties.put(WSHandlerConstants.HANDLER_ACTIONS, actions);
        ExtensibleWSS4JOutInterceptor wss4JOutInterceptor = new ExtensibleWSS4JOutInterceptor(properties, getAfterEncryptionCallbacks());
        wss4JOutInterceptor.setId("WSS4JOutEncryptionInterceptor");
        return wss4JOutInterceptor;
    }
}
