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
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.DeclareIncidentRequestType;
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.DeclareIncidentResponseType;
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.SynchronizeIncidentRequestType;
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.SynchronizeIncidentResponseType;
import ch.swissdec.schema.id._20180901.incidentdeclarationservicetypes.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import java.net.URL;
import java.security.KeyStore;

/**
 * <p>Specific implementation for KLEv1 (20180901) standard.</p>
 * <ul>
 *     <li>KLE Version 1, 20180901</li>
 *     <li>Ping is not secured</li>
 *     <li>Business operations need a UID signature</li>
 *     <li>Default URL to next refapps-receiver</li>
 *     <li>No additional callbacks nor interceptors</li>
 * </ul>
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-03 12:13:26 +0200 (Do., 03 Sep 2020) $
 */
public abstract class AbstractTransmitter20180901 extends AbstractTransmitter {

    // JAXBContext holding the IncidentDeclarationServiceTypes for KLEv1 (20180901)
    private static final JAXBContext JAXB_CONTEXT_IDST;

    // JAXB ObjectFactory for the IncidentDeclarationServiceTypes for KLEv1 (20180901)
    protected final ObjectFactory objectFactory = new ObjectFactory();

    static {
        try {
            // preload painful JAXBContext
            JAXB_CONTEXT_IDST = JAXBContext.newInstance("ch.swissdec.schema.id._20180901.incidentdeclarationservicetypes");
        } catch (Exception e) {
            throw new RuntimeException("Initialization of AbstractTransmitter20180901 failed!", e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected URL getWSDL() {
        return AbstractTransmitter20180901.class.getClassLoader().getResource("20180901/wsdl/IncidentDeclarationService.wsdl");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getPort() {
        return new ch.swissdec.schema.id._20180901.incidentdeclarationservice.IncidentDeclarationService(getWSDL()).getIncidentDeclaration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getUrl() {
        return "https://tst.itserve.ch/swissdec/refapps/next/receiver/services/IncidentDeclarationService20180901";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected JAXBContext getJAXBContext() {
        return JAXB_CONTEXT_IDST;
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement, boolean)} for the operation Ping, which is not secured.
     *
     * @param pingType the operation payload
     * @return the operations response as {@link PingType}
     * @throws Exception if an exception happened
     */
    public PingResponseType ping(PingType pingType) throws Exception {
        return (PingResponseType) this.invoke(objectFactory.createPing(pingType), true);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation CheckInteroperability.
     *
     * @param checkInteroperabilityType the operation payload
     * @param keyStore                  JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link CheckInteroperabilityResponseType}
     * @throws Exception if an exception happened
     */
    public CheckInteroperabilityResponseType checkInteroperability(CheckInteroperabilityType checkInteroperabilityType, KeyStore keyStore) throws Exception {
        return (CheckInteroperabilityResponseType) this.invoke(objectFactory.createCheckInteroperability(checkInteroperabilityType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation declareIncident.Takes an
     * {@link DeclareIncidentRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param declareIncidentRequestType the operation payload
     * @param keyStore                  JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link DeclareIncidentResponseType}
     * @throws Exception if an exception happened
     */
    public DeclareIncidentResponseType declareIncident(DeclareIncidentRequestType declareIncidentRequestType, KeyStore keyStore) throws Exception {
        return (DeclareIncidentResponseType) this.invoke(objectFactory.createDeclareIncident(declareIncidentRequestType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation synchronizeIncident.Takes an
     * {@link SynchronizeIncidentRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param synchronizeIncidentRequestType the operation payload
     * @param keyStore                  JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link SynchronizeIncidentResponseType}
     * @throws Exception if an exception happened
     */
    public SynchronizeIncidentResponseType synchronizeIncident(SynchronizeIncidentRequestType synchronizeIncidentRequestType, KeyStore keyStore) throws Exception {
        return (SynchronizeIncidentResponseType) this.invoke(objectFactory.createSynchronizeIncident(synchronizeIncidentRequestType), keyStore);
    }
}
