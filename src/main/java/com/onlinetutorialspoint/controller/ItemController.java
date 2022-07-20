package com.onlinetutorialspoint.controller;

import ch.swissdec.schema.common._20200220.common.*;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.*;
import com.onlinetutorialspoint.SpringBootSoapConsumerExampleApplication;
import com.onlinetutorialspoint.client.SoapClient;
import com.onlinetutorialspoint.model.LogItem;
import com.onlinetutorialspoint.repository.LogItemRepository;
import com.onlinetutorialspoint.soap.bindings.*;
import com.onlinetutorialspoint.soap.swissdec.FileNameRequest;
import com.onlinetutorialspoint.soap.swissdec.StatusRequest;
import com.onlinetutorialspoint.swissdec.AbstractTransmitter20200220;
import com.onlinetutorialspoint.utils.Utils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.KeyStore;

@RestController
public class ItemController {
    @Autowired
    SoapClient soapClient;
    ControllerCommon common = new ControllerCommon();

    @Autowired
    LogItemRepository logItemRepository;

    @PostMapping("/item")
    public ItemResponse item(@RequestBody ItemRequest itemRequest){
        logItemRepository.save(new LogItem(DateTime.now(), String.format("Internal Test: %d", itemRequest.getId())));
        return soapClient.getItemInfo(itemRequest);
    }

    @PostMapping("/ping")
    public PingResponseType ping()
    {
        logItemRepository.save(new LogItem(DateTime.now(), "Ping - Start"));

        AbstractTransmitter20200220 tx = new AbstractTransmitter20200220();
        PingType pingType = new PingType();
        PingResponseType pingResponse = null;

        try {
            pingType.setUserAgent( common.getUserAgent());
            pingType.setSystemDateTime(Utils.getXMLGregorianCalendar());
            pingType.setMonitoringID( common.getMonitoringID());

            pingResponse = tx.ping(pingType);
        }
        catch( Exception e) {
            String err = e.toString();
        }
        logItemRepository.save(new LogItem(DateTime.now(), "Ping - End"));
        return pingResponse;
    }

    @PostMapping("/interoperability")
    public CheckInteroperabilityResponseType interoperability()
    {
        logItemRepository.save(new LogItem(DateTime.now(), "Interoperability - Start"));

        AbstractTransmitter20200220 tx = new AbstractTransmitter20200220();
        CheckInteroperabilityResponseType interoperabilityResponse = null;
        CheckInteroperabilityType interoperabilityType = new CheckInteroperabilityType();

        try {
            BigDecimal firstOperand = BigDecimal.valueOf(Double.parseDouble(common.getProperty("interop.firstoperand")));
            firstOperand = firstOperand.setScale(2, RoundingMode.HALF_EVEN);
            BigDecimal secondOperand = BigDecimal.valueOf(Double.parseDouble(common.getProperty("interop.secondoperand")));
            secondOperand = secondOperand.setScale(2, RoundingMode.HALF_EVEN);

            interoperabilityType.setUserAgent( common.getUserAgent());
            interoperabilityType.setSystemDateTime(Utils.getXMLGregorianCalendar());
            interoperabilityType.setMonitoringID( common.getMonitoringID());

            interoperabilityType.setUmlautString( common.getProperty("interop.umlautstring"));
            interoperabilityType.setFirstOperand(firstOperand);
            interoperabilityType.setSecondOperand(secondOperand);

            interoperabilityResponse = tx.checkInteroperability(interoperabilityType, common.getKeyStore());
        }
        catch( Exception e) {
            String err = e.toString();
        }
        logItemRepository.save(new LogItem(DateTime.now(), "Interoperability - End"));
        return interoperabilityResponse;
    }

    @PostMapping("/declareSalary")
    public DeclareSalaryResponseType declareSalary(@RequestBody FileNameRequest fileNameRequest)
    {
        logItemRepository.save(new LogItem(DateTime.now(), "DeclareSalary - Start"));

        AbstractTransmitter20200220 tx = new AbstractTransmitter20200220();
        DeclareSalaryResponseType salaryResponse = null;

        try {
            JAXBElement<SalaryDeclarationRequestType> salaryType = (JAXBElement<SalaryDeclarationRequestType>) common.unMarshall(new File(fileNameRequest.getFileName()), tx.getJAXBContext());
            salaryType.getValue().setRequestContext( common.getContextType());

            salaryResponse = tx.declareSalary(salaryType.getValue(), common.getKeyStore());
        }
        catch( Exception e) {
            String err = e.toString();
        }
        logItemRepository.save(new LogItem(DateTime.now(), "DeclareSalary - End"));
        return salaryResponse;
    }

    @PostMapping("/statusSalary")
    public SalaryDeclarationStatusResponseType statusSalary(@RequestBody StatusRequest statusRequest)
    {
        logItemRepository.save(new LogItem(DateTime.now(), "StatusSalary - Start"));

        AbstractTransmitter20200220 tx = new AbstractTransmitter20200220();
        SalaryDeclarationStatusResponseType statusResponse = null;
        GetStatusFromDeclareSalaryType statusSalary = new GetStatusFromDeclareSalaryType();

        try {
            statusSalary.setJobKey(statusRequest.getJobKey());
            statusSalary.setRequestContext(common.getContextType());

            do {
                statusSalary.getRequestContext().setTransmissionDate(Utils.getXMLGregorianCalendar());
                statusResponse = tx.getStatusFromDeclareSalary(statusSalary, common.getKeyStore());

                if (!statusResponse.isJobFinished()) {
                    long delaySeconds = ( statusRequest.getTimeout() > 0 ) ? statusRequest.getTimeout() : 15;
                    Thread.sleep(delaySeconds * 1000);
                }
            } while (!statusResponse.isJobFinished());
        }
        catch( Exception e) {
            String err = e.toString();
        }
        logItemRepository.save(new LogItem(DateTime.now(), "StatusSalary - End"));
        return statusResponse;
    }

/*
    public GetResultFromDeclareSalaryResponseType getResultFromDeclareSalary(GetResultFromDeclareSalaryType getResultFromDeclareSalaryType, KeyStore keyStore) throws Exception {
        public JAXBElement<GetResultFromDeclareSalaryType> createGetResultFromDeclareSalary(GetResultFromDeclareSalaryType value) {
        public JAXBElement<GetResultFromDeclareSalaryResponseType> createGetResultFromDeclareSalaryResponse(GetResultFromDeclareSalaryResponseType value) {
*/
    @PostMapping("/resultSalary")
    public GetResultFromDeclareSalaryResponseType resultSalary()
    {
        AbstractTransmitter20200220 tx = new AbstractTransmitter20200220();
        GetResultFromDeclareSalaryResponseType salaryResponse = null;
        GetResultFromDeclareSalaryType salaryResult = new GetResultFromDeclareSalaryType();

        try {
            salaryResult.setRequestContext( common.getContextType());
            //@XmlElement(name = "Domain", required = true)
            //DomainIdentificationType domain;

            salaryResponse = tx.getResultFromDeclareSalary(salaryResult, common.getKeyStore());
        }
        catch( Exception e) {
            String err = e.toString();
        }
        return salaryResponse;
    }

    @PostMapping("/declareMonthTotal")
    public DeclareSalaryResponseType declareMonthTotal(@RequestBody FileNameRequest fileNameRequest)
    {
        logItemRepository.save(new LogItem(DateTime.now(), "DeclareMonthTotal - Start"));

        AbstractTransmitter20200220 tx = new AbstractTransmitter20200220();
        DeclareSalaryResponseType monthResponse = null;

        try {
            JAXBElement<MonthTotalDeclarationRequestType> monthType = (JAXBElement<MonthTotalDeclarationRequestType>) common.unMarshall(new File(fileNameRequest.getFileName()), tx.getJAXBContext());
            monthType.getValue().setRequestContext( common.getContextType());

            monthResponse = tx.declareMonthTotal(monthType.getValue(), common.getKeyStore());
        }
        catch( Exception e) {
            String err = e.toString();
        }
        logItemRepository.save(new LogItem(DateTime.now(), "DeclareMonthTotal - End"));
        return monthResponse;
    }

    @PostMapping("/statusMonthTotal")
    public GetStatusFromDeclareMonthTotalResponseType statusMonthTotal(@RequestBody StatusRequest statusRequest)
    {
        logItemRepository.save(new LogItem(DateTime.now(), "StatusMonthTotal - Start"));

        AbstractTransmitter20200220 tx = new AbstractTransmitter20200220();
        GetStatusFromDeclareMonthTotalResponseType statusResponse = null;
        GetStatusFromDeclareSalaryType statusMonth = new GetStatusFromDeclareSalaryType();

        try {
            statusMonth.setJobKey(statusRequest.getJobKey());
            statusMonth.setRequestContext(common.getContextType());

            do {
                statusMonth.getRequestContext().setTransmissionDate(Utils.getXMLGregorianCalendar());
                statusResponse = tx.getStatusFromDeclareMonthTotal(statusMonth, common.getKeyStore());

                if (!statusResponse.isJobFinished()) {
                    long delaySeconds = ( statusRequest.getTimeout() > 0 ) ? statusRequest.getTimeout() : 15;
                    Thread.sleep(delaySeconds * 1000);
                }
            } while (!statusResponse.isJobFinished());
        }
        catch( Exception e) {
            String err = e.toString();
        }
        logItemRepository.save(new LogItem(DateTime.now(), "StatusMonthTotal - End"));
        return statusResponse;
    }

/*
    public GetResultFromDeclareMonthTotalResponseType getResultFromDeclareMonthTotal(GetResultFromDeclareMonthTotalType getResultFromDeclareMonthTotalType, KeyStore keyStore) throws Exception {
        public JAXBElement<GetResultFromDeclareMonthTotalType> createGetResultFromDeclareMonthTotal(GetResultFromDeclareMonthTotalType value) {
        public JAXBElement<GetResultFromDeclareMonthTotalResponseType> createGetResultFromDeclareMonthTotalResponse(GetResultFromDeclareMonthTotalResponseType value) {
*/
    @PostMapping("/resultMonthTotal")
    public GetResultFromDeclareMonthTotalResponseType resultMonthTotal()
    {
        AbstractTransmitter20200220 tx = new AbstractTransmitter20200220();
        GetResultFromDeclareMonthTotalResponseType monthResponse = null;
        GetResultFromDeclareMonthTotalType monthResult = new GetResultFromDeclareMonthTotalType();

        try {
            monthResult.setRequestContext( common.getContextType());
            //@XmlElement(name = "Domain", required = true)
            //DomainIdentificationType domain;

            monthResponse = tx.getResultFromDeclareMonthTotal(monthResult, common.getKeyStore());
        }
        catch( Exception e) {
            String err = e.toString();
        }
        return monthResponse;
    }
}
