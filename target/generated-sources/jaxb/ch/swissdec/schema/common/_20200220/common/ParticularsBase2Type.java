
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ParticularsBase2Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParticularsBase2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/common/20200220/Common}ParticularsBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.swissdec.ch/schema/common/20200220/Common}AddressType"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCanton" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAndEXType"/&gt;
 *         &lt;element name="MunicipalityID" type="{http://www.swissdec.ch/schema/common/20200220/Common}MunicipalityIDType" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCategory" type="{http://www.swissdec.ch/schema/common/20200220/Common}ResidenceCategoryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticularsBase2Type", propOrder = {
    "address",
    "emailAddress",
    "phoneNumber",
    "mobilePhoneNumber",
    "residenceCanton",
    "municipalityID",
    "residenceCategory"
})
@XmlSeeAlso({
    ParticularsType.class
})
public class ParticularsBase2Type
    extends ParticularsBaseType
{

    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "MobilePhoneNumber")
    protected String mobilePhoneNumber;
    @XmlElement(name = "ResidenceCanton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAndEXType residenceCanton;
    @XmlElement(name = "MunicipalityID")
    protected Integer municipalityID;
    @XmlElement(name = "ResidenceCategory")
    @XmlSchemaType(name = "NMTOKEN")
    protected ResidenceCategoryType residenceCategory;

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Recupera il valore della proprietà emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Imposta il valore della proprietà emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Recupera il valore della proprietà phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Imposta il valore della proprietà phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Recupera il valore della proprietà mobilePhoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Imposta il valore della proprietà mobilePhoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Recupera il valore della proprietà residenceCanton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAndEXType }
     *     
     */
    public CantonAndEXType getResidenceCanton() {
        return residenceCanton;
    }

    /**
     * Imposta il valore della proprietà residenceCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAndEXType }
     *     
     */
    public void setResidenceCanton(CantonAndEXType value) {
        this.residenceCanton = value;
    }

    /**
     * Recupera il valore della proprietà municipalityID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipalityID() {
        return municipalityID;
    }

    /**
     * Imposta il valore della proprietà municipalityID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipalityID(Integer value) {
        this.municipalityID = value;
    }

    /**
     * Recupera il valore della proprietà residenceCategory.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceCategoryType }
     *     
     */
    public ResidenceCategoryType getResidenceCategory() {
        return residenceCategory;
    }

    /**
     * Imposta il valore della proprietà residenceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceCategoryType }
     *     
     */
    public void setResidenceCategory(ResidenceCategoryType value) {
        this.residenceCategory = value;
    }

}
