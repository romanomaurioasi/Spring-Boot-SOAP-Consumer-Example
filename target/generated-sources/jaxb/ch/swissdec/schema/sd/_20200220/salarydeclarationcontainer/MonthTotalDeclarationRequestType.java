
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.MonthTotalDeclarationType;


/**
 * <p>Classe Java per MonthTotalDeclarationRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonthTotalDeclarationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}RequestContextType"/&gt;
 *         &lt;element name="JobMonthTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}JobDeclareMonthTotalType"/&gt;
 *         &lt;element name="Substitution" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}SubstitutionType" minOccurs="0"/&gt;
 *         &lt;element name="MonthTotalDeclaration" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}MonthTotalDeclarationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthTotalDeclarationRequestType", propOrder = {
    "requestContext",
    "jobMonthTotal",
    "substitution",
    "monthTotalDeclaration"
})
public class MonthTotalDeclarationRequestType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "JobMonthTotal", required = true)
    protected JobDeclareMonthTotalType jobMonthTotal;
    @XmlElement(name = "Substitution")
    protected SubstitutionType substitution;
    @XmlElement(name = "MonthTotalDeclaration", required = true)
    protected MonthTotalDeclarationType monthTotalDeclaration;

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
     * Recupera il valore della proprietà jobMonthTotal.
     * 
     * @return
     *     possible object is
     *     {@link JobDeclareMonthTotalType }
     *     
     */
    public JobDeclareMonthTotalType getJobMonthTotal() {
        return jobMonthTotal;
    }

    /**
     * Imposta il valore della proprietà jobMonthTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDeclareMonthTotalType }
     *     
     */
    public void setJobMonthTotal(JobDeclareMonthTotalType value) {
        this.jobMonthTotal = value;
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
     * Recupera il valore della proprietà monthTotalDeclaration.
     * 
     * @return
     *     possible object is
     *     {@link MonthTotalDeclarationType }
     *     
     */
    public MonthTotalDeclarationType getMonthTotalDeclaration() {
        return monthTotalDeclaration;
    }

    /**
     * Imposta il valore della proprietà monthTotalDeclaration.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthTotalDeclarationType }
     *     
     */
    public void setMonthTotalDeclaration(MonthTotalDeclarationType value) {
        this.monthTotalDeclaration = value;
    }

}
