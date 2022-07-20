
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AdditionalParticularsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AdditionalParticularsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Denomination" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DenominationType" minOccurs="0"/&gt;
 *         &lt;element name="Employment" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmploymentType" minOccurs="0"/&gt;
 *         &lt;element name="OtherActivities" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}OtherActivitiesType" minOccurs="0"/&gt;
 *         &lt;element name="Annuity" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="Concubinage" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ConcubinageType" minOccurs="0"/&gt;
 *         &lt;element name="MarriagePartner" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}MarriagePartnerType" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ChildType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalParticularsType", propOrder = {
    "denomination",
    "employment",
    "otherActivities",
    "annuity",
    "concubinage",
    "marriagePartner",
    "children"
})
public class AdditionalParticularsType {

    @XmlElement(name = "Denomination")
    @XmlSchemaType(name = "NMTOKEN")
    protected DenominationType denomination;
    @XmlElement(name = "Employment")
    @XmlSchemaType(name = "NMTOKEN")
    protected EmploymentType employment;
    @XmlElement(name = "OtherActivities")
    @XmlSchemaType(name = "NMTOKEN")
    protected OtherActivitiesType otherActivities;
    @XmlElement(name = "Annuity")
    protected EmptyType annuity;
    @XmlElement(name = "Concubinage")
    @XmlSchemaType(name = "NMTOKEN")
    protected ConcubinageType concubinage;
    @XmlElement(name = "MarriagePartner")
    protected MarriagePartnerType marriagePartner;
    @XmlElement(name = "Children")
    protected List<ChildType> children;

    /**
     * Recupera il valore della proprietà denomination.
     * 
     * @return
     *     possible object is
     *     {@link DenominationType }
     *     
     */
    public DenominationType getDenomination() {
        return denomination;
    }

    /**
     * Imposta il valore della proprietà denomination.
     * 
     * @param value
     *     allowed object is
     *     {@link DenominationType }
     *     
     */
    public void setDenomination(DenominationType value) {
        this.denomination = value;
    }

    /**
     * Recupera il valore della proprietà employment.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentType }
     *     
     */
    public EmploymentType getEmployment() {
        return employment;
    }

    /**
     * Imposta il valore della proprietà employment.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentType }
     *     
     */
    public void setEmployment(EmploymentType value) {
        this.employment = value;
    }

    /**
     * Recupera il valore della proprietà otherActivities.
     * 
     * @return
     *     possible object is
     *     {@link OtherActivitiesType }
     *     
     */
    public OtherActivitiesType getOtherActivities() {
        return otherActivities;
    }

    /**
     * Imposta il valore della proprietà otherActivities.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherActivitiesType }
     *     
     */
    public void setOtherActivities(OtherActivitiesType value) {
        this.otherActivities = value;
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

    /**
     * Recupera il valore della proprietà concubinage.
     * 
     * @return
     *     possible object is
     *     {@link ConcubinageType }
     *     
     */
    public ConcubinageType getConcubinage() {
        return concubinage;
    }

    /**
     * Imposta il valore della proprietà concubinage.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcubinageType }
     *     
     */
    public void setConcubinage(ConcubinageType value) {
        this.concubinage = value;
    }

    /**
     * Recupera il valore della proprietà marriagePartner.
     * 
     * @return
     *     possible object is
     *     {@link MarriagePartnerType }
     *     
     */
    public MarriagePartnerType getMarriagePartner() {
        return marriagePartner;
    }

    /**
     * Imposta il valore della proprietà marriagePartner.
     * 
     * @param value
     *     allowed object is
     *     {@link MarriagePartnerType }
     *     
     */
    public void setMarriagePartner(MarriagePartnerType value) {
        this.marriagePartner = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildType }
     * 
     * 
     */
    public List<ChildType> getChildren() {
        if (children == null) {
            children = new ArrayList<ChildType>();
        }
        return this.children;
    }

}
