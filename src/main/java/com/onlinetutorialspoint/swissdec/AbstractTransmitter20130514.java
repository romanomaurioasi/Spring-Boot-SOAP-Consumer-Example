/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.swissdec;

import ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.*;
import ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.CheckInteroperabilityResponseType;
import ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.CheckInteroperabilityType;
import ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.ObjectFactory;
import ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.PingType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import java.net.URL;

/**
 * <p>Specific implementation for ELMv4 (20130514) standard.</p>
 * <ul>
 *     <li>ELM Version 4, 20130514</li>
 *     <li>Ping is not secured</li>
 *     <li>Default URL to next refapps-receiver</li>
 *     <li>No additional callbacks nor interceptors</li>
 * </ul>
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-03 12:13:26 +0200 (Do., 03 Sep 2020) $
 */
public abstract class AbstractTransmitter20130514 extends AbstractTransmitter {

    // JAXBContext holding the SalaryDeclarationServiceTypes for ELMv4 (20130514)
    private static final JAXBContext JAXB_CONTEXT_SDST;

    // JAXB ObjectFactory for the SalaryDeclarationServiceTypes for ELMv4 (20130514)
    private final ObjectFactory objectFactory = new ObjectFactory();

    static {
        try {
            // preload painful JAXBContext
            JAXB_CONTEXT_SDST = JAXBContext.newInstance("ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes");
        } catch (Exception e) {
            throw new RuntimeException("Initialization of AbstractTransmitter20130514 failed!", e);
        }
    }

    public ObjectFactory getObjectFactory() {
        return objectFactory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected URL getWSDL() {
        return AbstractTransmitter20130514.class.getClassLoader().getResource("20130514/wsdl/SalaryDeclarationService.wsdl");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getPort() {
        return new ch.swissdec.schema.sd._20130514.salarydeclarationservice.SalaryDeclarationService(getWSDL()).getSalaryDeclaration();
    }

    /**
     * {@inheritDoc}
     */
    protected String getUrl() {
        return "https://tst.itserve.ch/swissdec/refapps/next/receiver/services/SalaryDeclarationService20130514";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected JAXBContext getJAXBContext() {
        return JAXB_CONTEXT_SDST;
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement, boolean)} for the operation Ping, which is not secured.
     *
     * @param pingType the operation payload
     * @return the operations response as {@link PingType}
     * @throws Exception if an exception happened
     */
    public PingType ping(PingType pingType) throws Exception {
        return (PingType) this.invoke(objectFactory.createPing(pingType), true);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation CheckInteroperability.
     *
     * @param checkInteroperabilityType the operation payload
     * @return the operations response as {@link CheckInteroperabilityResponseType}
     * @throws Exception if an exception happened
     */
    public CheckInteroperabilityResponseType checkInteroperability(CheckInteroperabilityType checkInteroperabilityType) throws Exception {
        return (CheckInteroperabilityResponseType) this.invoke(objectFactory.createCheckInteroperability(checkInteroperabilityType));
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation CheckInteroperability. Takes an
     * {@link SalaryDeclarationRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param salaryDeclarationRequestType the operation payload
     * @return the operations response as {@link DeclareSalaryResponseType}
     * @throws Exception if an exception happened
     */
    public DeclareSalaryResponseType declareSalary(SalaryDeclarationRequestType salaryDeclarationRequestType) throws Exception {
        return (DeclareSalaryResponseType) this.invoke(objectFactory.createDeclareSalary(salaryDeclarationRequestType));
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getStatusFromDeclareSalary. Takes an
     * {@link GetStatusFromDeclareSalaryType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param getStatusFromDeclareSalaryType the operation payload
     * @return the operations response as {@link SalaryDeclarationStatusResponseType}
     * @throws Exception if an exception happened
     */
    public SalaryDeclarationStatusResponseType getStatusFromDeclareSalary(GetStatusFromDeclareSalaryType getStatusFromDeclareSalaryType) throws Exception {
        return (SalaryDeclarationStatusResponseType) this.invoke(objectFactory.createGetStatusFromDeclareSalary(getStatusFromDeclareSalaryType));
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getResultFromSynchronizeContract. Takes an
     * {@link GetResultFromDeclareSalaryType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param getResultFromDeclareSalaryType the operation payload
     * @return the operations response as {@link GetResultFromDeclareSalaryResponseType}
     * @throws Exception if an exception happened
     */
    public GetResultFromDeclareSalaryResponseType getResultFromSynchronizeContract(GetResultFromDeclareSalaryType getResultFromDeclareSalaryType) throws Exception {
        return (GetResultFromDeclareSalaryResponseType) invoke(objectFactory.createGetResultFromSynchronizeContract(getResultFromDeclareSalaryType));
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation synchronizeContract. Takes an
     * {@link SalaryDeclarationRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param salaryDeclarationRequestType the operation payload
     * @return the operations response as {@link DeclareSalaryResponseType}
     * @throws Exception if an exception happened
     */
    public DeclareSalaryResponseType synchronizeContract(SalaryDeclarationRequestType salaryDeclarationRequestType) throws Exception {
        return (DeclareSalaryResponseType) invoke(objectFactory.createSynchronizeContract(salaryDeclarationRequestType));
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getStatusFromSynchronizeContract. Takes an
     * {@link GetStatusFromDeclareSalaryType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param getStatusFromDeclareSalaryType the operation payload
     * @return the operations response as {@link SalaryDeclarationStatusResponseType}
     * @throws Exception if an exception happened
     */
    public SalaryDeclarationStatusResponseType getStatusFromSynchronizeContract(GetStatusFromDeclareSalaryType getStatusFromDeclareSalaryType) throws Exception {
        return (SalaryDeclarationStatusResponseType) invoke(objectFactory.createGetStatusFromSynchronizeContract(getStatusFromDeclareSalaryType));
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getResultFromDeclareSalary. Takes an
     * {@link GetResultFromDeclareSalaryType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     *
     * @param getResultFromDeclareSalaryType the operation payload
     * @return the operations response as {@link GetResultFromDeclareSalaryResponseType}
     * @throws Exception if an exception happened
     */
    public GetResultFromDeclareSalaryResponseType getResultFromDeclareSalary(GetResultFromDeclareSalaryType getResultFromDeclareSalaryType) throws Exception {
        return (GetResultFromDeclareSalaryResponseType) invoke(objectFactory.createGetResultFromDeclareSalary(getResultFromDeclareSalaryType));
    }
}
