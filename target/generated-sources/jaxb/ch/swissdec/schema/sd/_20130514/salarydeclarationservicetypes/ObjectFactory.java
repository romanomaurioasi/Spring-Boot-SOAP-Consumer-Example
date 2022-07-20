
package ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.DeclareSalaryResponseType;
import ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetResultFromDeclareSalaryResponseType;
import ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetResultFromDeclareSalaryType;
import ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetStatusFromDeclareSalaryType;
import ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationFaultType;
import ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationRequestType;
import ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationStatusResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes package. 
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

    private final static QName _Ping_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "Ping");
    private final static QName _PingResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "PingResponse");
    private final static QName _CheckInteroperability_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "CheckInteroperability");
    private final static QName _CheckInteroperabilityResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "CheckInteroperabilityResponse");
    private final static QName _DeclareSalary_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "DeclareSalary");
    private final static QName _DeclareSalaryResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "DeclareSalaryResponse");
    private final static QName _GetStatusFromDeclareSalary_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "GetStatusFromDeclareSalary");
    private final static QName _GetStatusFromDeclareSalaryResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "GetStatusFromDeclareSalaryResponse");
    private final static QName _GetResultFromDeclareSalary_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "GetResultFromDeclareSalary");
    private final static QName _GetResultFromDeclareSalaryResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "GetResultFromDeclareSalaryResponse");
    private final static QName _SynchronizeContract_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "SynchronizeContract");
    private final static QName _SynchronizeContractResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "SynchronizeContractResponse");
    private final static QName _GetStatusFromSynchronizeContract_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "GetStatusFromSynchronizeContract");
    private final static QName _GetStatusFromSynchronizeContractResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "GetStatusFromSynchronizeContractResponse");
    private final static QName _GetResultFromSynchronizeContract_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "GetResultFromSynchronizeContract");
    private final static QName _GetResultFromSynchronizeContractResponse_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "GetResultFromSynchronizeContractResponse");
    private final static QName _SalaryDeclarationFault_QNAME = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", "SalaryDeclarationFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PingType }
     * 
     */
    public PingType createPingType() {
        return new PingType();
    }

    /**
     * Create an instance of {@link CheckInteroperabilityType }
     * 
     */
    public CheckInteroperabilityType createCheckInteroperabilityType() {
        return new CheckInteroperabilityType();
    }

    /**
     * Create an instance of {@link CheckInteroperabilityResponseType }
     * 
     */
    public CheckInteroperabilityResponseType createCheckInteroperabilityResponseType() {
        return new CheckInteroperabilityResponseType();
    }

    /**
     * Create an instance of {@link EmptyType }
     * 
     */
    public EmptyType createEmptyType() {
        return new EmptyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "Ping")
    public JAXBElement<PingType> createPing(PingType value) {
        return new JAXBElement<PingType>(_Ping_QNAME, PingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "PingResponse")
    public JAXBElement<PingType> createPingResponse(PingType value) {
        return new JAXBElement<PingType>(_PingResponse_QNAME, PingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInteroperabilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckInteroperabilityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "CheckInteroperability")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "CheckInteroperabilityResponse")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "DeclareSalary")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "DeclareSalaryResponse")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "GetStatusFromDeclareSalary")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "GetStatusFromDeclareSalaryResponse")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "GetResultFromDeclareSalary")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "GetResultFromDeclareSalaryResponse")
    public JAXBElement<GetResultFromDeclareSalaryResponseType> createGetResultFromDeclareSalaryResponse(GetResultFromDeclareSalaryResponseType value) {
        return new JAXBElement<GetResultFromDeclareSalaryResponseType>(_GetResultFromDeclareSalaryResponse_QNAME, GetResultFromDeclareSalaryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "SynchronizeContract")
    public JAXBElement<SalaryDeclarationRequestType> createSynchronizeContract(SalaryDeclarationRequestType value) {
        return new JAXBElement<SalaryDeclarationRequestType>(_SynchronizeContract_QNAME, SalaryDeclarationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclareSalaryResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclareSalaryResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "SynchronizeContractResponse")
    public JAXBElement<DeclareSalaryResponseType> createSynchronizeContractResponse(DeclareSalaryResponseType value) {
        return new JAXBElement<DeclareSalaryResponseType>(_SynchronizeContractResponse_QNAME, DeclareSalaryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusFromDeclareSalaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusFromDeclareSalaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "GetStatusFromSynchronizeContract")
    public JAXBElement<GetStatusFromDeclareSalaryType> createGetStatusFromSynchronizeContract(GetStatusFromDeclareSalaryType value) {
        return new JAXBElement<GetStatusFromDeclareSalaryType>(_GetStatusFromSynchronizeContract_QNAME, GetStatusFromDeclareSalaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationStatusResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationStatusResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "GetStatusFromSynchronizeContractResponse")
    public JAXBElement<SalaryDeclarationStatusResponseType> createGetStatusFromSynchronizeContractResponse(SalaryDeclarationStatusResponseType value) {
        return new JAXBElement<SalaryDeclarationStatusResponseType>(_GetStatusFromSynchronizeContractResponse_QNAME, SalaryDeclarationStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "GetResultFromSynchronizeContract")
    public JAXBElement<GetResultFromDeclareSalaryType> createGetResultFromSynchronizeContract(GetResultFromDeclareSalaryType value) {
        return new JAXBElement<GetResultFromDeclareSalaryType>(_GetResultFromSynchronizeContract_QNAME, GetResultFromDeclareSalaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromDeclareSalaryResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "GetResultFromSynchronizeContractResponse")
    public JAXBElement<GetResultFromDeclareSalaryResponseType> createGetResultFromSynchronizeContractResponse(GetResultFromDeclareSalaryResponseType value) {
        return new JAXBElement<GetResultFromDeclareSalaryResponseType>(_GetResultFromSynchronizeContractResponse_QNAME, GetResultFromDeclareSalaryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalaryDeclarationFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", name = "SalaryDeclarationFault")
    public JAXBElement<SalaryDeclarationFaultType> createSalaryDeclarationFault(SalaryDeclarationFaultType value) {
        return new JAXBElement<SalaryDeclarationFaultType>(_SalaryDeclarationFault_QNAME, SalaryDeclarationFaultType.class, null, value);
    }

}
