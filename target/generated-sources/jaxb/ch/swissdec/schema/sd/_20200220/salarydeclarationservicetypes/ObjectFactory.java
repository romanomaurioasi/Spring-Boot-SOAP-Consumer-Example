
package ch.swissdec.schema.sd._20200220.salarydeclarationservicetypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ch.swissdec.schema.common._20200220.common.CheckInteroperabilityResponseType;
import ch.swissdec.schema.common._20200220.common.CheckInteroperabilityType;
import ch.swissdec.schema.common._20200220.common.PingResponseType;
import ch.swissdec.schema.common._20200220.common.PingType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.DeclareSalaryResponseType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.GetDialogResponseType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.GetResultFromDeclareMonthTotalResponseType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.GetResultFromDeclareMonthTotalType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.GetResultFromDeclareSalaryResponseType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.GetResultFromDeclareSalaryType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.GetStatusFromDeclareMonthTotalResponseType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.GetStatusFromDeclareSalaryType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.MonthTotalDeclarationRequestType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.ReplyDialogType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.SalaryDeclarationFaultType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.SalaryDeclarationRequestType;
import ch.swissdec.schema.sd._20200220.salarydeclarationcontainer.SalaryDeclarationStatusResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.swissdec.schema.sd._20200220.salarydeclarationservicetypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Ping_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "Ping");
    private final static QName _PingResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "PingResponse");
    private final static QName _CheckInteroperability_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "CheckInteroperability");
    private final static QName _CheckInteroperabilityResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "CheckInteroperabilityResponse");
    private final static QName _DeclareSalary_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "DeclareSalary");
    private final static QName _DeclareSalaryResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "DeclareSalaryResponse");
    private final static QName _GetStatusFromDeclareSalary_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetStatusFromDeclareSalary");
    private final static QName _GetStatusFromDeclareSalaryResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetStatusFromDeclareSalaryResponse");
    private final static QName _GetResultFromDeclareSalary_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetResultFromDeclareSalary");
    private final static QName _GetResultFromDeclareSalaryResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetResultFromDeclareSalaryResponse");
    private final static QName _DeclareMonthTotal_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "DeclareMonthTotal");
    private final static QName _DeclareMonthTotalResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "DeclareMonthTotalResponse");
    private final static QName _GetStatusFromDeclareMonthTotal_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetStatusFromDeclareMonthTotal");
    private final static QName _GetStatusFromDeclareMonthTotalResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetStatusFromDeclareMonthTotalResponse");
    private final static QName _GetResultFromDeclareMonthTotal_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetResultFromDeclareMonthTotal");
    private final static QName _GetResultFromDeclareMonthTotalResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetResultFromDeclareMonthTotalResponse");
    private final static QName _GetDialog_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetDialog");
    private final static QName _GetDialogResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "GetDialogResponse");
    private final static QName _ReplyDialog_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "ReplyDialog");
    private final static QName _ReplyDialogResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "ReplyDialogResponse");
    private final static QName _SalaryDeclarationFault_QNAME = new QName("http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", "SalaryDeclarationFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.swissdec.schema.sd._20200220.salarydeclarationservicetypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "Ping")
    public JAXBElement<PingType> createPing(PingType value) {
        return new JAXBElement<PingType>(_Ping_QNAME, PingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PingResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "PingResponse")
    public JAXBElement<PingResponseType> createPingResponse(PingResponseType value) {
        return new JAXBElement<PingResponseType>(_PingResponse_QNAME, PingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInteroperabilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckInteroperabilityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "CheckInteroperability")
    public JAXBElement<CheckInteroperabilityType> createCheckInteroperability(CheckInteroperabilityType value) {
        return new JAXBElement<CheckInteroperabilityType>(_CheckInteroperability_QNAME, CheckInteroperabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInteroperabilityResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckInteroperabilityResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "CheckInteroperabilityResponse")
    public JAXBElement<CheckInteroperabilityResponseType> createCheckInteroperabilityResponse(CheckInteroperabilityResponseType value) {
        return new JAXBElement<CheckInteroperabilityResponseType>(_CheckInteroperabilityResponse_QNAME, CheckInteroperabilityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "DeclareSalary")
    public JAXBElement<SalaryDeclarationRequestType> createDeclareSalary(SalaryDeclarationRequestType value) {
        return new JAXBElement<SalaryDeclarationRequestType>(_DeclareSalary_QNAME, SalaryDeclarationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclareSalaryResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclareSalaryResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "DeclareSalaryResponse")
    public JAXBElement<DeclareSalaryResponseType> createDeclareSalaryResponse(DeclareSalaryResponseType value) {
        return new JAXBElement<DeclareSalaryResponseType>(_DeclareSalaryResponse_QNAME, DeclareSalaryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusFromDeclareSalaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusFromDeclareSalaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetStatusFromDeclareSalary")
    public JAXBElement<GetStatusFromDeclareSalaryType> createGetStatusFromDeclareSalary(GetStatusFromDeclareSalaryType value) {
        return new JAXBElement<GetStatusFromDeclareSalaryType>(_GetStatusFromDeclareSalary_QNAME, GetStatusFromDeclareSalaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationStatusResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationStatusResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetStatusFromDeclareSalaryResponse")
    public JAXBElement<SalaryDeclarationStatusResponseType> createGetStatusFromDeclareSalaryResponse(SalaryDeclarationStatusResponseType value) {
        return new JAXBElement<SalaryDeclarationStatusResponseType>(_GetStatusFromDeclareSalaryResponse_QNAME, SalaryDeclarationStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetResultFromDeclareSalary")
    public JAXBElement<GetResultFromDeclareSalaryType> createGetResultFromDeclareSalary(GetResultFromDeclareSalaryType value) {
        return new JAXBElement<GetResultFromDeclareSalaryType>(_GetResultFromDeclareSalary_QNAME, GetResultFromDeclareSalaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetResultFromDeclareSalaryResponse")
    public JAXBElement<GetResultFromDeclareSalaryResponseType> createGetResultFromDeclareSalaryResponse(GetResultFromDeclareSalaryResponseType value) {
        return new JAXBElement<GetResultFromDeclareSalaryResponseType>(_GetResultFromDeclareSalaryResponse_QNAME, GetResultFromDeclareSalaryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthTotalDeclarationRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonthTotalDeclarationRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "DeclareMonthTotal")
    public JAXBElement<MonthTotalDeclarationRequestType> createDeclareMonthTotal(MonthTotalDeclarationRequestType value) {
        return new JAXBElement<MonthTotalDeclarationRequestType>(_DeclareMonthTotal_QNAME, MonthTotalDeclarationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclareSalaryResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclareSalaryResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "DeclareMonthTotalResponse")
    public JAXBElement<DeclareSalaryResponseType> createDeclareMonthTotalResponse(DeclareSalaryResponseType value) {
        return new JAXBElement<DeclareSalaryResponseType>(_DeclareMonthTotalResponse_QNAME, DeclareSalaryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusFromDeclareSalaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusFromDeclareSalaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetStatusFromDeclareMonthTotal")
    public JAXBElement<GetStatusFromDeclareSalaryType> createGetStatusFromDeclareMonthTotal(GetStatusFromDeclareSalaryType value) {
        return new JAXBElement<GetStatusFromDeclareSalaryType>(_GetStatusFromDeclareMonthTotal_QNAME, GetStatusFromDeclareSalaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusFromDeclareMonthTotalResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusFromDeclareMonthTotalResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetStatusFromDeclareMonthTotalResponse")
    public JAXBElement<GetStatusFromDeclareMonthTotalResponseType> createGetStatusFromDeclareMonthTotalResponse(GetStatusFromDeclareMonthTotalResponseType value) {
        return new JAXBElement<GetStatusFromDeclareMonthTotalResponseType>(_GetStatusFromDeclareMonthTotalResponse_QNAME, GetStatusFromDeclareMonthTotalResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareMonthTotalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareMonthTotalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetResultFromDeclareMonthTotal")
    public JAXBElement<GetResultFromDeclareMonthTotalType> createGetResultFromDeclareMonthTotal(GetResultFromDeclareMonthTotalType value) {
        return new JAXBElement<GetResultFromDeclareMonthTotalType>(_GetResultFromDeclareMonthTotal_QNAME, GetResultFromDeclareMonthTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareMonthTotalResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareMonthTotalResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetResultFromDeclareMonthTotalResponse")
    public JAXBElement<GetResultFromDeclareMonthTotalResponseType> createGetResultFromDeclareMonthTotalResponse(GetResultFromDeclareMonthTotalResponseType value) {
        return new JAXBElement<GetResultFromDeclareMonthTotalResponseType>(_GetResultFromDeclareMonthTotalResponse_QNAME, GetResultFromDeclareMonthTotalResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetDialog")
    public JAXBElement<GetResultFromDeclareSalaryType> createGetDialog(GetResultFromDeclareSalaryType value) {
        return new JAXBElement<GetResultFromDeclareSalaryType>(_GetDialog_QNAME, GetResultFromDeclareSalaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDialogResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDialogResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "GetDialogResponse")
    public JAXBElement<GetDialogResponseType> createGetDialogResponse(GetDialogResponseType value) {
        return new JAXBElement<GetDialogResponseType>(_GetDialogResponse_QNAME, GetDialogResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyDialogType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyDialogType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "ReplyDialog")
    public JAXBElement<ReplyDialogType> createReplyDialog(ReplyDialogType value) {
        return new JAXBElement<ReplyDialogType>(_ReplyDialog_QNAME, ReplyDialogType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDialogResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDialogResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "ReplyDialogResponse")
    public JAXBElement<GetDialogResponseType> createReplyDialogResponse(GetDialogResponseType value) {
        return new JAXBElement<GetDialogResponseType>(_ReplyDialogResponse_QNAME, GetDialogResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationServiceTypes", name = "SalaryDeclarationFault")
    public JAXBElement<SalaryDeclarationFaultType> createSalaryDeclarationFault(SalaryDeclarationFaultType value) {
        return new JAXBElement<SalaryDeclarationFaultType>(_SalaryDeclarationFault_QNAME, SalaryDeclarationFaultType.class, null, value);
    }

}
