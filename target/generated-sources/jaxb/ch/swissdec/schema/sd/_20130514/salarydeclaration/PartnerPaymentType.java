
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PartnerPaymentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartnerPaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="WorkOrCompensatory" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}WorkOrCompensatoryType"/&gt;
 *         &lt;element name="WorkOrCompensatoryAndAnnuity" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}WorkOrCompensatoryType"/&gt;
 *         &lt;element name="Annuity" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerPaymentType", propOrder = {
    "workOrCompensatory",
    "workOrCompensatoryAndAnnuity",
    "annuity"
})
public class PartnerPaymentType {

    @XmlElement(name = "WorkOrCompensatory")
    protected WorkOrCompensatoryType workOrCompensatory;
    @XmlElement(name = "WorkOrCompensatoryAndAnnuity")
    protected WorkOrCompensatoryType workOrCompensatoryAndAnnuity;
    @XmlElement(name = "Annuity")
    protected EmptyType annuity;

    /**
     * Recupera il valore della proprietà workOrCompensatory.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrCompensatoryType }
     *     
     */
    public WorkOrCompensatoryType getWorkOrCompensatory() {
        return workOrCompensatory;
    }

    /**
     * Imposta il valore della proprietà workOrCompensatory.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrCompensatoryType }
     *     
     */
    public void setWorkOrCompensatory(WorkOrCompensatoryType value) {
        this.workOrCompensatory = value;
    }

    /**
     * Recupera il valore della proprietà workOrCompensatoryAndAnnuity.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrCompensatoryType }
     *     
     */
    public WorkOrCompensatoryType getWorkOrCompensatoryAndAnnuity() {
        return workOrCompensatoryAndAnnuity;
    }

    /**
     * Imposta il valore della proprietà workOrCompensatoryAndAnnuity.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrCompensatoryType }
     *     
     */
    public void setWorkOrCompensatoryAndAnnuity(WorkOrCompensatoryType value) {
        this.workOrCompensatoryAndAnnuity = value;
    }

    /**
     * Recupera il valore della proprietà annuity.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getAnnuity() {
        return annuity;
    }

    /**
     * Imposta il valore della proprietà annuity.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setAnnuity(EmptyType value) {
        this.annuity = value;
    }

}
