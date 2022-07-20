
package ch.swissdec.schema.sd._20200220.salarydeclaration;

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
 *         &lt;element name="Denomination" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DenominationType" minOccurs="0"/&gt;
 *         &lt;element name="OtherActivities" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}OtherActivitiesType" minOccurs="0"/&gt;
 *         &lt;element name="SingleParentFamily" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SingleParentFamilyType" minOccurs="0"/&gt;
 *         &lt;element name="MarriagePartner" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}MarriagePartnerType" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}ChildType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "otherActivities",
    "singleParentFamily",
    "marriagePartner",
    "children"
})
public class AdditionalParticularsType {

    @XmlElement(name = "Denomination")
    @XmlSchemaType(name = "NMTOKEN")
    protected DenominationType denomination;
    @XmlElement(name = "OtherActivities")
    protected OtherActivitiesType otherActivities;
    @XmlElement(name = "SingleParentFamily")
    protected SingleParentFamilyType singleParentFamily;
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
     * Recupera il valore della proprietà singleParentFamily.
     * 
     * @return
     *     possible object is
     *     {@link SingleParentFamilyType }
     *     
     */
    public SingleParentFamilyType getSingleParentFamily() {
        return singleParentFamily;
    }

    /**
     * Imposta il valore della proprietà singleParentFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleParentFamilyType }
     *     
     */
    public void setSingleParentFamily(SingleParentFamilyType value) {
        this.singleParentFamily = value;
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
