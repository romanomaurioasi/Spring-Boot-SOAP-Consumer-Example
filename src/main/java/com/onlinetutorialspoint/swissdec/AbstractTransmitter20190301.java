/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.swissdec;

import ch.swissdec.schema.common._20180901.common.CheckInteroperabilityResponseType;
import ch.swissdec.schema.common._20180901.common.CheckInteroperabilityType;
import ch.swissdec.schema.common._20180901.common.PingResponseType;
import ch.swissdec.schema.common._20180901.common.PingType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.*;
import ch.swissdec.schema.oa._20190301.organizationauthenticationservicetypes.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import java.net.URL;
import java.security.KeyStore;

/**
 * <p>Specific implementation for SUAv1 (20190301) standard.</p>
 * <ul>
 *     <li>SUA Version 1, 20190301</li>
 *     <li>Ping is not secured</li>
 *     <li>RenewCertificate is secured with a UID signature</li>
 *     <li>Default URL to next refapps-receiver</li>
 *     <li>No additional callbacks nor interceptors</li>
 * </ul>
 *
 * @author $Author: koch $
 * @version $Date: 2020-09-07 14:46:41 +0200 (Mo., 07 Sep 2020) $
 */
public abstract class AbstractTransmitter20190301 extends AbstractTransmitter {

    // JAXBContext holding the OrganizationAuthenticationServiceTypes for SUAv1 (20190301)
    private static final JAXBContext JAXB_CONTEXT_OAST;

    // JAXB ObjectFactory for the OrganizationAuthenticationServiceTypes for SUAv1 (20190301)
    protected final ObjectFactory objectFactory = new ObjectFactory();

    static {
        try {
            // preload painful JAXBContext
            JAXB_CONTEXT_OAST = JAXBContext.newInstance("ch.swissdec.schema.oa._20190301.organizationauthenticationservicetypes");
        } catch (Exception e) {
            throw new RuntimeException("Initialization of AbstractTransmitter20190301 failed!", e);
        }
    }

    /**
     * Getter for the JAXB ObjectFactory for the OrganizationAuthenticationServiceTypes for SUAv1 (20190301)
     * @return the {@link ObjectFactory}
     */
    public ObjectFactory getObjectFactory() {
        return objectFactory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected URL getWSDL() {
        return AbstractTransmitter20190301.class.getClassLoader().getResource("20190301/wsdl/OrganizationAuthenticationService.wsdl");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getPort() {
        return new ch.swissdec.schema.oa._20190301.organizationauthenticationservice.OrganizationAuthenticationService(getWSDL()).getOrganizationAuthentication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getUrl() {
        return "https://tst.itserve.ch/swissdec/refapps/next/receiver/services/OrganizationAuthenticationService20190301";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected JAXBContext getJAXBContext() {
        return JAXB_CONTEXT_OAST;
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement, boolean)} for the operation Ping, which is not secured.
     *
     * @param pingType the operation payload
     * @return the operations response as {@link PingType}
     * @throws Exception if an exception happened
     */
    public PingResponseType ping(PingType pingType) throws Exception {
        return (PingResponseType) invoke(objectFactory.createPing(pingType), true);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation CheckInteroperability. If a KeyStore is
     * provided, the CheckInteroperability is secured with a optional second signature.
     *
     * @param checkInteroperabilityType the operation payload
     * @param keyStore                  JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link CheckInteroperabilityResponseType}
     * @throws Exception if an exception happened
     */
    public CheckInteroperabilityResponseType checkInteroperability(CheckInteroperabilityType checkInteroperabilityType, KeyStore keyStore) throws Exception {
        return (CheckInteroperabilityResponseType) invoke(objectFactory.createCheckInteroperability(checkInteroperabilityType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation registerOrganization.Takes an
     * {@link RegisterOrganizationRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param registerOrganizationRequest the operation payload
     * @return the operations response as {@link RegisterOrganizationResponseType}
     * @throws Exception if an exception happened
     */
    public RegisterOrganizationResponseType registerOrganization(RegisterOrganizationRequestType registerOrganizationRequest) throws Exception {
        return (RegisterOrganizationResponseType) invoke(objectFactory.createRegisterOrganization(registerOrganizationRequest));
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getResultFromOrganizationRegistration.Takes an
     * {@link GetResultFromOrganizationRegistrationRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param getResultFromOrganizationRegistrationRequest the operation payload
     * @return the operations response as {@link GetResultFromOrganizationRegistrationResponseType}
     * @throws Exception if an exception happened
     */
    public GetResultFromOrganizationRegistrationResponseType getResultFromOrganizationRegistration(
            GetResultFromOrganizationRegistrationRequestType getResultFromOrganizationRegistrationRequest) throws Exception {
        return (GetResultFromOrganizationRegistrationResponseType) invoke(objectFactory.createGetResultFromOrganizationRegistration(getResultFromOrganizationRegistrationRequest));
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation signCertificate.Takes an
     * {@link SignCertificateRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param signCertificateRequest the operation payload
     * @return the operations response as {@link SignCertificateResponseType}
     * @throws Exception if an exception happened
     */
    public SignCertificateResponseType signCertificate(SignCertificateRequestType signCertificateRequest) throws Exception {
        return (SignCertificateResponseType) invoke(objectFactory.createSignCertificate(signCertificateRequest));
    }
}
