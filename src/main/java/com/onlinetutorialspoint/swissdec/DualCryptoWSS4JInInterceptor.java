/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.swissdec;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.saaj.SAAJInInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.wss4j.common.crypto.Crypto;
import org.apache.wss4j.common.crypto.Merlin;
import org.apache.wss4j.common.ext.WSSecurityException;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.engine.WSSecurityEngineResult;
import org.apache.wss4j.dom.handler.RequestData;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.WebServiceException;
import java.util.List;

/**
 * Performs WS-Security inbound actions with two {@link Merlin} references. This is needed for operations secured with
 * a second signature with an UID certificate.
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-02 17:16:49 +0200 (Wed, 02 Sep 2020) $
 */
public class DualCryptoWSS4JInInterceptor extends WSS4JInInterceptor {
    private boolean decryption = true;

    private Merlin suaCrypto;

    /**
     * Setter for an additional Merlin.
     *
     * @param suaCrypto {@link Merlin} instance with the SUA keypair
     */
    public void setSuaCrypto(Merlin suaCrypto) {
        this.suaCrypto = suaCrypto;
    }

    /**
     * {@inheritDoc}
     */
    public void handleMessage(SoapMessage msg) throws Fault {
        SOAPMessage doc = getSOAPMessage(msg);

        try {
            QName operation = getOperation(doc.getSOAPBody());

            if (operation != null && operation.getLocalPart().equals("Fault")) {
                decryption = false;
            }

            super.handleMessage(msg);

        } catch (Exception e) {
            throw new WebServiceException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean checkReceiverResultsAnyOrder(List<WSSecurityEngineResult> wsResult, List<Integer> actions) {
        for (org.apache.wss4j.dom.engine.WSSecurityEngineResult result : wsResult) {
            final Integer act = (Integer) result.get(org.apache.wss4j.dom.engine.WSSecurityEngineResult.TAG_ACTION);
            if (act == WSConstants.SC || act == WSConstants.BST) {
                continue;
            }

            assert act != WSConstants.ENCR || (decryption);
        }
        return true;
    }

    /**
     * Overridden method to use the additional {@link Merlin} for the decryption.
     *
     * @param requestData the RequestData object
     * @return a Crypto instance to use for Decryption creation/verification
     */
    @Override
    protected Crypto loadDecryptionCrypto(RequestData requestData) throws WSSecurityException {
        if (suaCrypto != null) {
            return suaCrypto;
        }
        return super.loadDecryptionCrypto(requestData);
    }

    //
    // PRIVATE HELPER METHODS
    //

    private SOAPMessage getSOAPMessage(SoapMessage msg) {
        SAAJInInterceptor.INSTANCE.handleMessage(msg);
        return msg.getContent(SOAPMessage.class);
    }

    private QName getOperation(Element body) {
        NodeList nl = body.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Node node = nl.item(i);
                return new QName(node.getNamespaceURI(), node.getLocalName());
            }
        }
        return null;
    }
}