
package ch.swissdec.schema.oa._20190301.organizationauthenticationservicetypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ch.swissdec.schema.common._20180901.common.CheckInteroperabilityResponseType;
import ch.swissdec.schema.common._20180901.common.CheckInteroperabilityType;
import ch.swissdec.schema.common._20180901.common.PingResponseType;
import ch.swissdec.schema.common._20180901.common.PingType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.GetResultFromOrganizationRegistrationRequestType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.GetResultFromOrganizationRegistrationResponseType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.OrganizationAuthenticationFaultType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.RegisterOrganizationRequestType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.RegisterOrganizationResponseType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.RenewCertificateRequestType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.RenewCertificateResponseType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.SignCertificateRequestType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.SignCertificateResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.swissdec.schema.oa._20190301.organizationauthenticationservicetypes package. 
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

    private final static QName _Ping_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "Ping");
    private final static QName _PingResponse_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "PingResponse");
    private final static QName _CheckInteroperability_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "CheckInteroperability");
    private final static QName _CheckInteroperabilityResponse_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "CheckInteroperabilityResponse");
    private final static QName _RegisterOrganization_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "RegisterOrganization");
    private final static QName _RegisterOrganizationResponse_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "RegisterOrganizationResponse");
    private final static QName _GetResultFromOrganizationRegistration_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "GetResultFromOrganizationRegistration");
    private final static QName _GetResultFromOrganizationRegistrationResponse_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "GetResultFromOrganizationRegistrationResponse");
    private final static QName _SignCertificate_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "SignCertificate");
    private final static QName _SignCertificateResponse_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "SignCertificateResponse");
    private final static QName _RenewCertificate_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "RenewCertificate");
    private final static QName _RenewCertificateResponse_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "RenewCertificateResponse");
    private final static QName _OrganizationAuthenticationFault_QNAME = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", "OrganizationAuthenticationFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.swissdec.schema.oa._20190301.organizationauthenticationservicetypes
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "Ping")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "PingResponse")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "CheckInteroperability")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "CheckInteroperabilityResponse")
    public JAXBElement<CheckInteroperabilityResponseType> createCheckInteroperabilityResponse(CheckInteroperabilityResponseType value) {
        return new JAXBElement<CheckInteroperabilityResponseType>(_CheckInteroperabilityResponse_QNAME, CheckInteroperabilityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "RegisterOrganization")
    public JAXBElement<RegisterOrganizationRequestType> createRegisterOrganization(RegisterOrganizationRequestType value) {
        return new JAXBElement<RegisterOrganizationRequestType>(_RegisterOrganization_QNAME, RegisterOrganizationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "RegisterOrganizationResponse")
    public JAXBElement<RegisterOrganizationResponseType> createRegisterOrganizationResponse(RegisterOrganizationResponseType value) {
        return new JAXBElement<RegisterOrganizationResponseType>(_RegisterOrganizationResponse_QNAME, RegisterOrganizationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromOrganizationRegistrationRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromOrganizationRegistrationRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "GetResultFromOrganizationRegistration")
    public JAXBElement<GetResultFromOrganizationRegistrationRequestType> createGetResultFromOrganizationRegistration(GetResultFromOrganizationRegistrationRequestType value) {
        return new JAXBElement<GetResultFromOrganizationRegistrationRequestType>(_GetResultFromOrganizationRegistration_QNAME, GetResultFromOrganizationRegistrationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultFromOrganizationRegistrationResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResultFromOrganizationRegistrationResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "GetResultFromOrganizationRegistrationResponse")
    public JAXBElement<GetResultFromOrganizationRegistrationResponseType> createGetResultFromOrganizationRegistrationResponse(GetResultFromOrganizationRegistrationResponseType value) {
        return new JAXBElement<GetResultFromOrganizationRegistrationResponseType>(_GetResultFromOrganizationRegistrationResponse_QNAME, GetResultFromOrganizationRegistrationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignCertificateRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignCertificateRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "SignCertificate")
    public JAXBElement<SignCertificateRequestType> createSignCertificate(SignCertificateRequestType value) {
        return new JAXBElement<SignCertificateRequestType>(_SignCertificate_QNAME, SignCertificateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignCertificateResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignCertificateResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "SignCertificateResponse")
    public JAXBElement<SignCertificateResponseType> createSignCertificateResponse(SignCertificateResponseType value) {
        return new JAXBElement<SignCertificateResponseType>(_SignCertificateResponse_QNAME, SignCertificateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenewCertificateRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RenewCertificateRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "RenewCertificate")
    public JAXBElement<RenewCertificateRequestType> createRenewCertificate(RenewCertificateRequestType value) {
        return new JAXBElement<RenewCertificateRequestType>(_RenewCertificate_QNAME, RenewCertificateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenewCertificateResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RenewCertificateResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "RenewCertificateResponse")
    public JAXBElement<RenewCertificateResponseType> createRenewCertificateResponse(RenewCertificateResponseType value) {
        return new JAXBElement<RenewCertificateResponseType>(_RenewCertificateResponse_QNAME, RenewCertificateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationAuthenticationFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationAuthenticationFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes", name = "OrganizationAuthenticationFault")
    public JAXBElement<OrganizationAuthenticationFaultType> createOrganizationAuthenticationFault(OrganizationAuthenticationFaultType value) {
        return new JAXBElement<OrganizationAuthenticationFaultType>(_OrganizationAuthenticationFault_QNAME, OrganizationAuthenticationFaultType.class, null, value);
    }

}
