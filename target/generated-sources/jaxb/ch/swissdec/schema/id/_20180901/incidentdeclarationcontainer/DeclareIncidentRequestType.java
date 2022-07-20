
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.id._20180901.incidentdeclaration.IncidentDeclarationType;


/**
 * <p>Classe Java per DeclareIncidentRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclareIncidentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}RequestContextType"/&gt;
 *         &lt;element name="Job" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}JobType"/&gt;
 *         &lt;element name="IncidentDeclaration" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncidentDeclarationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclareIncidentRequestType", propOrder = {
    "requestContext",
    "job",
    "incidentDeclaration"
})
public class DeclareIncidentRequestType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "Job", required = true)
    protected JobType job;
    @XmlElement(name = "IncidentDeclaration", required = true)
    protected IncidentDeclarationType incidentDeclaration;

    /**
     * Recupera il valore della proprietà requestContext.
     * 
     * @return
     *     possible object is
     *     {@link RequestContextType }
     *     
     */
    public RequestContextType getRequestContext() {
        return requestContext;
    }

    /**
     * Imposta il valore della proprietà requestContext.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestContextType }
     *     
     */
    public void setRequestContext(RequestContextType value) {
        this.requestContext = value;
    }

    /**
     * Recupera il valore della proprietà job.
     * 
     * @return
     *     possible object is
     *     {@link JobType }
     *     
     */
    public JobType getJob() {
        return job;
    }

    /**
     * Imposta il valore della proprietà job.
     * 
     * @param value
     *     allowed object is
     *     {@link JobType }
     *     
     */
    public void setJob(JobType value) {
        this.job = value;
    }

    /**
     * Recupera il valore della proprietà incidentDeclaration.
     * 
     * @return
     *     possible object is
     *     {@link IncidentDeclarationType }
     *     
     */
    public IncidentDeclarationType getIncidentDeclaration() {
        return incidentDeclaration;
    }

    /**
     * Imposta il valore della proprietà incidentDeclaration.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentDeclarationType }
     *     
     */
    public void setIncidentDeclaration(IncidentDeclarationType value) {
        this.incidentDeclaration = value;
    }

}
