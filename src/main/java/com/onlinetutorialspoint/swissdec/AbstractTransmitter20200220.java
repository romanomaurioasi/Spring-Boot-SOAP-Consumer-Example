/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.swissdec;

import ch.swissdec.schema.common._20200220.common.CheckInteroperabilityResponseType;
import ch.swissdec.schema.common._20200220.common.CheckInteroperabilityType;
import ch.swissdec.schema.common._20200220.common.PingResponseType;
import ch.swissdec.schema.common._20200220.common.PingType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.*;
import ch.swissdec.schema.sd._20200220.salarydeclarationservicetypes.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import java.net.URL;
import java.security.KeyStore;

/**
 * <p>Specific implementation for ELMv5 (20200220) standard.</p>
 * <ul>
 *     <li>ELM Version 5, 20200220</li>
 *     <li>Ping is not secured</li>
 *     <li>All operations MAY be secured with an UID signature</li>
 *     <li>Default URL to next refapps-receiver</li>
 *     <li>No additional callbacks nor interceptors</li>
 * </ul>
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-03 12:13:26 +0200 (Do., 03 Sep 2020) $
 */
public class AbstractTransmitter20200220 extends AbstractTransmitter {

    // JAXBContext holding the SalaryDeclarationServiceTypes for ELMv5 (20200220)
    private static final JAXBContext JAXB_CONTEXT_SDST;

    // JAXB ObjectFactory for SalaryDeclarationServiceTypes for ELMv5 (20200220)
    protected ObjectFactory objectFactory = new ObjectFactory();

    static {
        try {
            // preload painful JAXBContext
            JAXB_CONTEXT_SDST = JAXBContext.newInstance("ch.swissdec.schema.sd._20200220.salarydeclarationservicetypes");
        } catch (Exception e) {
            throw new RuntimeException("Initialization of AbstractTransmitter20200220 failed!", e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected URL getWSDL() {
        return AbstractTransmitter20200220.class.getClassLoader().getResource("20200220/wsdl/SalaryDeclarationService.wsdl");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object getPort() {
        return new ch.swissdec.schema.sd._20200220.salarydeclarationservice.SalaryDeclarationService(getWSDL()).getSalaryDeclaration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getUrl() {
        return "https://tst.itserve.ch/swissdec/refapps/next/receiver/services/SalaryDeclarationService20200220";
    }

    @Override
    public JAXBContext getJAXBContext() {
        return JAXB_CONTEXT_SDST;
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement, boolean)} for the operation Ping, which is not secured.
     *
     * @param pingType the operation payload
     * @return the operations response as {@link ch.swissdec.schema.common._20180901.common.PingType}
     * @throws Exception if an exception happened
     */
    public PingResponseType ping(PingType pingType) throws Exception {
        return (PingResponseType) this.invoke(objectFactory.createPing(pingType), true);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation CheckInteroperability.  If a KeyStore is
     * provided, the request is secured with a optional second signature.
     *
     * @param checkInteroperabilityType the operation payload
     * @param keyStore                  JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.CheckInteroperabilityResponseType}
     * @throws Exception if an exception happened
     */
    public CheckInteroperabilityResponseType checkInteroperability(CheckInteroperabilityType checkInteroperabilityType, KeyStore keyStore) throws Exception {
        return (CheckInteroperabilityResponseType) this.invoke(objectFactory.createCheckInteroperability(checkInteroperabilityType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation CheckInteroperability. Takes an
     * {@link SalaryDeclarationRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     * If a KeyStore is provided, the request is secured with a optional second signature.
     *
     * @param salaryDeclarationRequestType the operation payload
     * @param keyStore                     JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link DeclareSalaryResponseType}
     * @throws Exception if an exception happened
     */
    public DeclareSalaryResponseType declareSalary(SalaryDeclarationRequestType salaryDeclarationRequestType, KeyStore keyStore) throws Exception {
        return (DeclareSalaryResponseType) this.invoke(objectFactory.createDeclareSalary(salaryDeclarationRequestType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getStatusFromDeclareSalary. Takes an
     * {@link GetStatusFromDeclareSalaryType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     * If a KeyStore is provided, the request is secured with a optional second signature.
     *
     * @param getStatusFromDeclareSalaryType the operation payload
     * @param keyStore                       JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link SalaryDeclarationStatusResponseType}
     * @throws Exception if an exception happened
     */
    public SalaryDeclarationStatusResponseType getStatusFromDeclareSalary(GetStatusFromDeclareSalaryType getStatusFromDeclareSalaryType, KeyStore keyStore) throws Exception {
        return (SalaryDeclarationStatusResponseType) this.invoke(objectFactory.createGetStatusFromDeclareSalary(getStatusFromDeclareSalaryType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getResultFromDeclareSalary. Takes an
     * {@link GetResultFromDeclareSalaryType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     * If a KeyStore is provided, the request is secured with a optional second signature.
     *
     * @param getResultFromDeclareSalaryType the operation payload
     * @param keyStore                       JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link GetResultFromDeclareSalaryResponseType}
     * @throws Exception if an exception happened
     */
    public GetResultFromDeclareSalaryResponseType getResultFromDeclareSalary(GetResultFromDeclareSalaryType getResultFromDeclareSalaryType, KeyStore keyStore) throws Exception {
        return (GetResultFromDeclareSalaryResponseType) this.invoke(objectFactory.createGetResultFromDeclareSalary(getResultFromDeclareSalaryType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation declareMonthTotal. Takes an
     * {@link MonthTotalDeclarationRequestType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     * If a KeyStore is provided, the request is secured with a optional second signature.
     *
     * @param monthTotalDeclarationRequestType the operation payload
     * @param keyStore                         JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link DeclareSalaryResponseType}
     * @throws Exception if an exception happened
     */
    public DeclareSalaryResponseType declareMonthTotal(MonthTotalDeclarationRequestType monthTotalDeclarationRequestType, KeyStore keyStore) throws Exception {
        return (DeclareSalaryResponseType) this.invoke(objectFactory.createDeclareMonthTotal(monthTotalDeclarationRequestType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getStatusFromDeclareMonthTotal. Takes an
     * {@link GetStatusFromDeclareSalaryType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     * If a KeyStore is provided, the request is secured with a optional second signature.
     *
     * @param getStatusFromDeclareSalaryType the operation payload
     * @param keyStore                         JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link GetStatusFromDeclareMonthTotalResponseType}
     * @throws Exception if an exception happened
     */
    public GetStatusFromDeclareMonthTotalResponseType getStatusFromDeclareMonthTotal(GetStatusFromDeclareSalaryType getStatusFromDeclareSalaryType, KeyStore keyStore) throws Exception {
        return (GetStatusFromDeclareMonthTotalResponseType) this.invoke(objectFactory.createGetStatusFromDeclareMonthTotal(getStatusFromDeclareSalaryType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getResultFromDeclareMonthTotal. Takes an
     * {@link GetResultFromDeclareMonthTotalType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     * If a KeyStore is provided, the request is secured with a optional second signature.
     *
     * @param getResultFromDeclareMonthTotalType the operation payload
     * @param keyStore                         JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link GetResultFromDeclareMonthTotalResponseType}
     * @throws Exception if an exception happened
     */
    public GetResultFromDeclareMonthTotalResponseType getResultFromDeclareMonthTotal(GetResultFromDeclareMonthTotalType getResultFromDeclareMonthTotalType, KeyStore keyStore) throws Exception {
        return (GetResultFromDeclareMonthTotalResponseType) this.invoke(objectFactory.createGetResultFromDeclareMonthTotal(getResultFromDeclareMonthTotalType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation getDialog. Takes an
     * {@link GetResultFromDeclareSalaryType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     * If a KeyStore is provided, the request is secured with a optional second signature.
     *
     * @param getResultFromDeclareSalaryType the operation payload
     * @param keyStore                         JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link GetDialogResponseType}
     * @throws Exception if an exception happened
     */
    public GetDialogResponseType getDialog(GetResultFromDeclareSalaryType getResultFromDeclareSalaryType, KeyStore keyStore) throws Exception {
        return (GetDialogResponseType) this.invoke(objectFactory.createGetDialog(getResultFromDeclareSalaryType), keyStore);
    }

    /**
     * Wrapper method to {@link #invoke(JAXBElement)} for the operation replyDialog. Takes an
     * {@link ReplyDialogType} and wraps it to an {@link JAXBElement} using the {@link ObjectFactory}.
     * If a KeyStore is provided, the request is secured with a optional second signature.
     *
     * @param replyDialogType the operation payload
     * @param keyStore                         JavaKeyStore containing the UID keyPair for the second signature
     * @return the operations response as {@link GetDialogResponseType}
     * @throws Exception if an exception happened
     */
    public GetDialogResponseType replyDialog(ReplyDialogType replyDialogType, KeyStore keyStore) throws Exception {
        return (GetDialogResponseType) this.invoke(objectFactory.createReplyDialog(replyDialogType), keyStore);
    }
}
