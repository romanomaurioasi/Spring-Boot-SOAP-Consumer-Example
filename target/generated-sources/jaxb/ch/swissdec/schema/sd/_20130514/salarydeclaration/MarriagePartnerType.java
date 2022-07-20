
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Social-InsuranceIdentification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}Social-InsuranceIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="SeparateAddress" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AddressType" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}PartnerPaymentType" minOccurs="0"/&gt;
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
    "separateAddress",
    "payment"
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
    @XmlElement(name = "SeparateAddress")
    protected AddressType separateAddress;
    @XmlElement(name = "Payment")
    protected PartnerPaymentType payment;

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
     * Recupera il valore della proprietà separateAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getSeparateAddress() {
        return separateAddress;
    }

    /**
     * Imposta il valore della proprietà separateAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setSeparateAddress(AddressType value) {
        this.separateAddress = value;
    }

    /**
     * Recupera il valore della proprietà payment.
     * 
     * @return
     *     possible object is
     *     {@link PartnerPaymentType }
     *     
     */
    public PartnerPaymentType getPayment() {
        return payment;
    }

    /**
     * Imposta il valore della proprietà payment.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerPaymentType }
     *     
     */
    public void setPayment(PartnerPaymentType value) {
        this.payment = value;
    }

}
