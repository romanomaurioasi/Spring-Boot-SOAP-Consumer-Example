
package ch.swissdec.schema.id._20180901.incidentdeclarationservicetypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ch.swissdec.schema.common._20180901.common.CheckInteroperabilityResponseType;
import ch.swissdec.schema.common._20180901.common.CheckInteroperabilityType;
import ch.swissdec.schema.common._20180901.common.PingResponseType;
import ch.swissdec.schema.common._20180901.common.PingType;
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.DeclareIncidentRequestType;
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.DeclareIncidentResponseType;
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.IncidentDeclarationFaultType;
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.SynchronizeIncidentRequestType;
import ch.swissdec.schema.id._20180901.incidentdeclarationcontainer.SynchronizeIncidentResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.swissdec.schema.id._20180901.incidentdeclarationservicetypes package. 
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

    private final static QName _Ping_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "Ping");
    private final static QName _PingResponse_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "PingResponse");
    private final static QName _CheckInteroperability_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "CheckInteroperability");
    private final static QName _CheckInteroperabilityResponse_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "CheckInteroperabilityResponse");
    private final static QName _DeclareIncident_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "DeclareIncident");
    private final static QName _DeclareIncidentResponse_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "DeclareIncidentResponse");
    private final static QName _SynchronizeIncident_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "SynchronizeIncident");
    private final static QName _SynchronizeIncidentResponse_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "SynchronizeIncidentResponse");
    private final static QName _IncidentDeclarationFault_QNAME = new QName("http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", "IncidentDeclarationFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.swissdec.schema.id._20180901.incidentdeclarationservicetypes
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "Ping")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "PingResponse")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "CheckInteroperability")
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
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "CheckInteroperabilityResponse")
    public JAXBElement<CheckInteroperabilityResponseType> createCheckInteroperabilityResponse(CheckInteroperabilityResponseType value) {
        return new JAXBElement<CheckInteroperabilityResponseType>(_CheckInteroperabilityResponse_QNAME, CheckInteroperabilityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclareIncidentRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclareIncidentRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "DeclareIncident")
    public JAXBElement<DeclareIncidentRequestType> createDeclareIncident(DeclareIncidentRequestType value) {
        return new JAXBElement<DeclareIncidentRequestType>(_DeclareIncident_QNAME, DeclareIncidentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclareIncidentResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclareIncidentResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "DeclareIncidentResponse")
    public JAXBElement<DeclareIncidentResponseType> createDeclareIncidentResponse(DeclareIncidentResponseType value) {
        return new JAXBElement<DeclareIncidentResponseType>(_DeclareIncidentResponse_QNAME, DeclareIncidentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SynchronizeIncidentRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SynchronizeIncidentRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "SynchronizeIncident")
    public JAXBElement<SynchronizeIncidentRequestType> createSynchronizeIncident(SynchronizeIncidentRequestType value) {
        return new JAXBElement<SynchronizeIncidentRequestType>(_SynchronizeIncident_QNAME, SynchronizeIncidentRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SynchronizeIncidentResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SynchronizeIncidentResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "SynchronizeIncidentResponse")
    public JAXBElement<SynchronizeIncidentResponseType> createSynchronizeIncidentResponse(SynchronizeIncidentResponseType value) {
        return new JAXBElement<SynchronizeIncidentResponseType>(_SynchronizeIncidentResponse_QNAME, SynchronizeIncidentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentDeclarationFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentDeclarationFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationServiceTypes", name = "IncidentDeclarationFault")
    public JAXBElement<IncidentDeclarationFaultType> createIncidentDeclarationFault(IncidentDeclarationFaultType value) {
        return new JAXBElement<IncidentDeclarationFaultType>(_IncidentDeclarationFault_QNAME, IncidentDeclarationFaultType.class, null, value);
    }

}
