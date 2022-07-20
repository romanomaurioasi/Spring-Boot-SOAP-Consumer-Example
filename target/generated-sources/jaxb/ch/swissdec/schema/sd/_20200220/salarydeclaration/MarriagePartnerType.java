
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.AddressType;
import ch.swissdec.schema.common._20200220.common.SocialInsuranceIdentificationType;


/**
 * <p>Classe Java per MarriagePartnerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MarriagePartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Social-InsuranceIdentification" type="{http://www.swissdec.ch/schema/common/20200220/Common}Social-InsuranceIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Address" type="{http://www.swissdec.ch/schema/common/20200220/Common}AddressType"/&gt;
 *         &lt;element name="Residence" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceResidencePartnerType"/&gt;
 *         &lt;element name="WorkOrCompensatory" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}WorkOrCompensatoryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarriagePartnerType", propOrder = {
    "socialInsuranceIdentification",
    "lastname",
    "firstname",
    "dateOfBirth",
    "address",
    "residence",
    "workOrCompensatory"
})
public class MarriagePartnerType {

    @XmlElement(name = "Social-InsuranceIdentification")
    protected SocialInsuranceIdentificationType socialInsuranceIdentification;
    @XmlElement(name = "Lastname", required = true)
    protected String lastname;
    @XmlElement(name = "Firstname", required = true)
    protected String firstname;
    @XmlElement(name = "DateOfBirth", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "Residence", required = true)
    protected TaxAtSourceResidencePartnerType residence;
    @XmlElement(name = "WorkOrCompensatory")
    protected WorkOrCompensatoryType workOrCompensatory;

    /**
     * Recupera il valore della proprietà socialInsuranceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link SocialInsuranceIdentificationType }
     *     
     */
    public SocialInsuranceIdentificationType getSocialInsuranceIdentification() {
        return socialInsuranceIdentification;
    }

    /**
     * Imposta il valore della proprietà socialInsuranceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialInsuranceIdentificationType }
     *     
     */
    public void setSocialInsuranceIdentification(SocialInsuranceIdentificationType value) {
        this.socialInsuranceIdentification = value;
    }

    /**
     * Recupera il valore della proprietà lastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Imposta il valore della proprietà lastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Recupera il valore della proprietà firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Imposta il valore della proprietà firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Recupera il valore della proprietà dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Imposta il valore della proprietà dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

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
     * Recupera il valore della proprietà residence.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceResidencePartnerType }
     *     
     */
    public TaxAtSourceResidencePartnerType getResidence() {
        return residence;
    }

    /**
     * Imposta il valore della proprietà residence.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceResidencePartnerType }
     *     
     */
    public void setResidence(TaxAtSourceResidencePartnerType value) {
        this.residence = value;
    }

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

}
