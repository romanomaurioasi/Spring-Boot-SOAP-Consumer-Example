
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AwaitPartType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AwaitPartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncapacitiesToWork" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="TakeWorkUpFully" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="Treatments" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="Agreement" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="AnnualSalary" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionsPerson" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="Absence" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialCode" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *         &lt;element name="AccidentDescription" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartControlType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwaitPartType", propOrder = {
    "incapacitiesToWork",
    "takeWorkUpFully",
    "treatments",
    "agreement",
    "annualSalary",
    "payment",
    "additionsPerson",
    "absence",
    "specialCode",
    "accidentDescription"
})
public class AwaitPartType {

    @XmlElement(name = "IncapacitiesToWork")
    protected AwaitPartControlType incapacitiesToWork;
    @XmlElement(name = "TakeWorkUpFully")
    protected AwaitPartControlType takeWorkUpFully;
    @XmlElement(name = "Treatments")
    protected AwaitPartControlType treatments;
    @XmlElement(name = "Agreement")
    protected AwaitPartControlType agreement;
    @XmlElement(name = "AnnualSalary")
    protected AwaitPartControlType annualSalary;
    @XmlElement(name = "Payment")
    protected AwaitPartControlType payment;
    @XmlElement(name = "AdditionsPerson")
    protected AwaitPartControlType additionsPerson;
    @XmlElement(name = "Absence")
    protected AwaitPartControlType absence;
    @XmlElement(name = "SpecialCode")
    protected AwaitPartControlType specialCode;
    @XmlElement(name = "AccidentDescription")
    protected AwaitPartControlType accidentDescription;

    /**
     * Recupera il valore della proprietà incapacitiesToWork.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getIncapacitiesToWork() {
        return incapacitiesToWork;
    }

    /**
     * Imposta il valore della proprietà incapacitiesToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setIncapacitiesToWork(AwaitPartControlType value) {
        this.incapacitiesToWork = value;
    }

    /**
     * Recupera il valore della proprietà takeWorkUpFully.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getTakeWorkUpFully() {
        return takeWorkUpFully;
    }

    /**
     * Imposta il valore della proprietà takeWorkUpFully.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setTakeWorkUpFully(AwaitPartControlType value) {
        this.takeWorkUpFully = value;
    }

    /**
     * Recupera il valore della proprietà treatments.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getTreatments() {
        return treatments;
    }

    /**
     * Imposta il valore della proprietà treatments.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setTreatments(AwaitPartControlType value) {
        this.treatments = value;
    }

    /**
     * Recupera il valore della proprietà agreement.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getAgreement() {
        return agreement;
    }

    /**
     * Imposta il valore della proprietà agreement.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setAgreement(AwaitPartControlType value) {
        this.agreement = value;
    }

    /**
     * Recupera il valore della proprietà annualSalary.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Imposta il valore della proprietà annualSalary.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setAnnualSalary(AwaitPartControlType value) {
        this.annualSalary = value;
    }

    /**
     * Recupera il valore della proprietà payment.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getPayment() {
        return payment;
    }

    /**
     * Imposta il valore della proprietà payment.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setPayment(AwaitPartControlType value) {
        this.payment = value;
    }

    /**
     * Recupera il valore della proprietà additionsPerson.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getAdditionsPerson() {
        return additionsPerson;
    }

    /**
     * Imposta il valore della proprietà additionsPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setAdditionsPerson(AwaitPartControlType value) {
        this.additionsPerson = value;
    }

    /**
     * Recupera il valore della proprietà absence.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getAbsence() {
        return absence;
    }

    /**
     * Imposta il valore della proprietà absence.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setAbsence(AwaitPartControlType value) {
        this.absence = value;
    }

    /**
     * Recupera il valore della proprietà specialCode.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getSpecialCode() {
        return specialCode;
    }

    /**
     * Imposta il valore della proprietà specialCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setSpecialCode(AwaitPartControlType value) {
        this.specialCode = value;
    }

    /**
     * Recupera il valore della proprietà accidentDescription.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartControlType }
     *     
     */
    public AwaitPartControlType getAccidentDescription() {
        return accidentDescription;
    }

    /**
     * Imposta il valore della proprietà accidentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartControlType }
     *     
     */
    public void setAccidentDescription(AwaitPartControlType value) {
        this.accidentDescription = value;
    }

}
