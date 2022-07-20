package com.onlinetutorialspoint.controller;

import ch.swissdec.schema.common._20200220.common.EmptyType;
import ch.swissdec.schema.common._20200220.common.LanguageCodeType;
import ch.swissdec.schema.common._20200220.common.UserAgentType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.CertificateSignRequestType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.SignCertificateResponseType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationservice.OrganizationAuthenticationPort;
import ch.swissdec.schema.oa._20190301.organizationauthenticationservice.OrganizationAuthenticationService;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.RequestContextType;
import org.apache.xml.security.stax.impl.util.IDGenerator;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.Properties;

public class ControllerCommon {
    private Properties properties;

    public ControllerCommon() {
        loadSetUp();
    }

    public void loadSetUp() {
        properties = new Properties();
        try {
            ClassLoader cl = ItemController.class.getClassLoader();
            InputStream is = ItemController.class.getClassLoader().getResourceAsStream("transmitter.properties");
            properties.load(new InputStreamReader(
                    Objects.requireNonNull(ItemController.class.getClassLoader().getResourceAsStream("transmitter.properties")),
                    StandardCharsets.UTF_8));
        }
        catch (Exception e) {
        }
    }

    public String getProperty( String propertyName ) {
        return properties.getProperty(propertyName);
    }

    public Object unMarshall(String file, JAXBContext context) throws Exception {
        return context.createUnmarshaller().unmarshal(
                this.getClass().getClassLoader().getResourceAsStream(file));
    }

    public Object unMarshall(File file, JAXBContext context) throws Exception {
        return context.createUnmarshaller().unmarshal( file );
    }

    public UserAgentType getUserAgent() {
        UserAgentType userAgent = new UserAgentType();

        if (!properties.getProperty("ua.name").isEmpty()) {
            userAgent.setName(properties.getProperty("ua.name"));
        }
        if (!properties.getProperty("ua.producer").isEmpty()) {
            userAgent.setProducer(properties.getProperty("ua.producer"));
        }
        if (!properties.getProperty("ua.version").isEmpty()) {
            userAgent.setVersion(properties.getProperty("ua.version"));
        }
        if (!properties.getProperty("ua.certificate").isEmpty()) {
            userAgent.setCertificate(properties.getProperty("ua.certificate"));
        }
        if (!properties.getProperty("ua.stdVersion").isEmpty()) {
            userAgent.setStandardVersion(new BigDecimal(50));
        }
        return userAgent;
    }

    public ch.swissdec.schema.common._20180901.common.UserAgentType getUserAgent_2018() {
        UserAgentType tempAgent = new UserAgentType();
        ch.swissdec.schema.common._20180901.common.UserAgentType userAgent = new ch.swissdec.schema.common._20180901.common.UserAgentType();

        userAgent.setName( tempAgent.getName());
        userAgent.setProducer( tempAgent.getProducer());
        userAgent.setCertificate(tempAgent.getCertificate());
        userAgent.setVersion(tempAgent.getVersion());
        userAgent.setStandardVersion(tempAgent.getStandardVersion());

        return userAgent;
    }

    public ch.swissdec.schema.common._20200220.common.CompanyNameType getCompanyName() {
        ch.swissdec.schema.common._20200220.common.CompanyNameType companyName = new ch.swissdec.schema.common._20200220.common.CompanyNameType();
        companyName.setHRRCName( "Oasi" );
        return companyName;
    }

    public ch.swissdec.schema.oa._20190301.organizationauthentication.CertificateSignRequestType getRequestType() {
        ch.swissdec.schema.oa._20190301.organizationauthentication.CertificateSignRequestType reqType = new ch.swissdec.schema.oa._20190301.organizationauthentication.CertificateSignRequestType();
        reqType.setOneTimePassword( "testSwissdec" );
        return reqType;
    }

    public RequestContextType getContextType() {
        RequestContextType contextType = new RequestContextType();
        contextType.setUserAgent( getUserAgent());
        contextType.setCompanyName(getCompanyName());
        contextType.setTransmissionDate( getSystemDateTime());

        if (Boolean.parseBoolean(properties.getProperty("testcase"))) {
            contextType.setTestCase(new EmptyType());
        }

        contextType.setMonitoringID( getMonitoringID());
        contextType.setLanguageCode( LanguageCodeType.fromValue( "it"));
        contextType.setRequestID( IDGenerator.generateID("JTS"));
        return contextType;
    }

    public CertificateSignRequestType getCertificateSignRequest() {
        CertificateSignRequestType signRequest = new CertificateSignRequestType();
        signRequest.setOneTimePassword( "testSwissdec" );
        return signRequest;
    }

    public String getMonitoringID() {
        return properties.getProperty("monitoringID");
    }

    public XMLGregorianCalendar getSystemDateTime() {
        XMLGregorianCalendar actTime = null;
        try {
            actTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        }
        catch( Exception e) {
        }
        return actTime;
    }

    public KeyStore getKeyStore() {
        KeyStore keyStore = null;
        //try {
        //    keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        //    char[] password = "changeit".toCharArray();
        //    keyStore.load(null, password);
        //}
        //catch( Exception e) {
        //    keyStore = null;
        //}
        return keyStore;
    }

//    public SignCertificateResponseType getCertificate() {
//        SignCertificateResponseType certificateResponse = null;
//
//        OrganizationAuthenticationService srv = new OrganizationAuthenticationService();
//        OrganizationAuthenticationPort authPort = srv.getOrganizationAuthentication();
//
//        try {
//            ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.SignCertificateRequestType parameters = new ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.SignCertificateRequestType();
//            parameters.setCertificateRequestID( "A001" );
//            parameters.setCertificateSignRequest( getCertificateSignRequest());
//            parameters.setRequestContext( getContextType());
//            ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.SignCertificateResponseType signCert = authPort.signCertificate( parameters );
//        }
//        catch( Exception e ) {
//            String err = e.toString();
//        }
//        return certificateResponse;
//    }
}
