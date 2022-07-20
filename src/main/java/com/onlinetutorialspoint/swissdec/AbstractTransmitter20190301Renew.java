/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.swissdec;

import ch.swissdec.schema.common._20180901.common.CheckInteroperabilityResponseType;
import ch.swissdec.schema.common._20180901.common.CheckInteroperabilityType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.RenewCertificateRequestType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.RenewCertificateResponseType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.SignCertificateResponseType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationservicetypes.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import java.net.URL;
import java.security.KeyStore;

/**
 * <p>Specific implementation for SUAv1 renew (20190301) standard.</p>
 * <ul>
 *     <li>SUA Version 1, 20190301</li>
 *     <li>All operations are secured with a UID signature</li>
 *     <li>Default URL to next refapps-receiver</li>
 *     <li>No additional callbacks nor interceptors</li>
 * </ul>
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-04 11:45:00 +0200 (Fr., 04 Sep 2020) $
 */
public abstract class AbstractTransmitter20190301Renew extends AbstractTransmitter {

    // JAXBContext holding the OrganizationAuthenticationServiceTypes for SUAv1 (20190301)
    private static final JAXBContext JAXB_CONTEXT_OAST;

    // JAXB ObjectFactory for the OrganizationAuthenticationServiceTypes for SUAv1 (20190301)
    private final ObjectFactory objectFactory = new ObjectFactory();

    static {
        try {
            // preload painful JAXBContext
            JAXB_CONTEXT_OAST = JAXBContext.newInstance("ch.swissdec.schema.oa._20190301.organizationauthenticationservicetypes");
        } catch (Exception e) {
            throw new RuntimeException("Initialization of AbstractTransmitter20190301Renew failed!", e);
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
        return AbstractTransmitter20190301Renew.class.getClassLoader().getResource("20190301/wsdl/OrganizationAuthenticationRenewService.wsdl");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getPort() {
        return new ch.swissdec.schema.oa._20190301.organizationauthenticationrenewservice.OrganizationAuthenticationRenewService(getWSDL()).getOrganizationAuthenticationRenew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getUrl() {
        return "https://tst.itserve.ch/swissdec/refapps/next/receiver/services/OrganizationAuthenticationRenewService20190301";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected JAXBContext getJAXBContext() {
        return JAXB_CONTEXT_OAST;
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
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation renewCertificate.Takes an
     * {@link RenewCertificateRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param renewCertificateRequest the operation payload
     * @param keyStore                  JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link SignCertificateResponseType}
     * @throws Exception if an exception happened
     */
    public RenewCertificateResponseType renewCertificate(RenewCertificateRequestType renewCertificateRequest, KeyStore keyStore) throws Exception {
        return (RenewCertificateResponseType) invoke(objectFactory.createRenewCertificate(renewCertificateRequest), keyStore);
    }
}
