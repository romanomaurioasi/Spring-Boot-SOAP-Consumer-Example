
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.SalaryDeclarationType;


/**
 * <p>Classe Java per SalaryDeclarationRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryDeclarationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}RequestContextType"/&gt;
 *         &lt;element name="Job" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}JobType"/&gt;
 *         &lt;element name="Substitution" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}SubstitutionType" minOccurs="0"/&gt;
 *         &lt;element name="SalaryDeclaration" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryDeclarationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryDeclarationRequestType", propOrder = {
    "requestContext",
    "job",
    "substitution",
    "salaryDeclaration"
})
public class SalaryDeclarationRequestType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "Job", required = true)
    protected JobType job;
    @XmlElement(name = "Substitution")
    protected SubstitutionType substitution;
    @XmlElement(name = "SalaryDeclaration", required = true)
    protected SalaryDeclarationType salaryDeclaration;

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
     * Recupera il valore della proprietà substitution.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionType }
     *     
     */
    public SubstitutionType getSubstitution() {
        return substitution;
    }

    /**
     * Imposta il valore della proprietà substitution.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionType }
     *     
     */
    public void setSubstitution(SubstitutionType value) {
        this.substitution = value;
    }

    /**
     * Recupera il valore della proprietà salaryDeclaration.
     * 
     * @return
     *     possible object is
     *     {@link SalaryDeclarationType }
     *     
     */
    public SalaryDeclarationType getSalaryDeclaration() {
        return salaryDeclaration;
    }

    /**
     * Imposta il valore della proprietà salaryDeclaration.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryDeclarationType }
     *     
     */
    public void setSalaryDeclaration(SalaryDeclarationType value) {
        this.salaryDeclaration = value;
    }

}
