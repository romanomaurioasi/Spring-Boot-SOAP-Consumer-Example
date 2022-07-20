
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.NotificationsType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per HeaderCommonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HeaderCommonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocID" type="{http://www.swissdec.ch/schema/common/20200220/Common}IDType"/&gt;
 *         &lt;element name="Rectificate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}RectificateType" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfOwnership" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TypeOfOwnershipType"/&gt;
 *         &lt;element name="DateOfAttestation" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="ContactName" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="ContactPhone" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="ContactEmail" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="ConcernName" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="ShareName" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="EmployerName" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="Currency" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}CurrencyType"/&gt;
 *         &lt;element name="Ruling" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}GrantType" minOccurs="0"/&gt;
 *         &lt;element name="Particulars" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}ParticularsORDType"/&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderCommonType", propOrder = {
    "docID",
    "rectificate",
    "typeOfOwnership",
    "dateOfAttestation",
    "companyName",
    "contactName",
    "contactPhone",
    "contactEmail",
    "concernName",
    "shareName",
    "employerName",
    "currency",
    "ruling",
    "particulars",
    "period",
    "comment"
})
@XmlSeeAlso({
    HeaderFormCType.class
})
public class HeaderCommonType {

    @XmlElement(name = "DocID", required = true)
    protected String docID;
    @XmlElement(name = "Rectificate")
    protected RectificateType rectificate;
    @XmlElement(name = "TypeOfOwnership", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected TypeOfOwnershipType typeOfOwnership;
    @XmlElement(name = "DateOfAttestation", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfAttestation;
    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "ContactName", required = true)
    protected String contactName;
    @XmlElement(name = "ContactPhone", required = true)
    protected String contactPhone;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElement(name = "ConcernName")
    protected String concernName;
    @XmlElement(name = "ShareName")
    protected String shareName;
    @XmlElement(name = "EmployerName", required = true)
    protected String employerName;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Ruling")
    protected GrantType ruling;
    @XmlElement(name = "Particulars", required = true)
    protected ParticularsORDType particulars;
    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà docID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocID() {
        return docID;
    }

    /**
     * Imposta il valore della proprietà docID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocID(String value) {
        this.docID = value;
    }

    /**
     * Recupera il valore della proprietà rectificate.
     * 
     * @return
     *     possible object is
     *     {@link RectificateType }
     *     
     */
    public RectificateType getRectificate() {
        return rectificate;
    }

    /**
     * Imposta il valore della proprietà rectificate.
     * 
     * @param value
     *     allowed object is
     *     {@link RectificateType }
     *     
     */
    public void setRectificate(RectificateType value) {
        this.rectificate = value;
    }

    /**
     * Recupera il valore della proprietà typeOfOwnership.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfOwnershipType }
     *     
     */
    public TypeOfOwnershipType getTypeOfOwnership() {
        return typeOfOwnership;
    }

    /**
     * Imposta il valore della proprietà typeOfOwnership.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfOwnershipType }
     *     
     */
    public void setTypeOfOwnership(TypeOfOwnershipType value) {
        this.typeOfOwnership = value;
    }

    /**
     * Recupera il valore della proprietà dateOfAttestation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfAttestation() {
        return dateOfAttestation;
    }

    /**
     * Imposta il valore della proprietà dateOfAttestation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfAttestation(XMLGregorianCalendar value) {
        this.dateOfAttestation = value;
    }

    /**
     * Recupera il valore della proprietà companyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Imposta il valore della proprietà companyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Recupera il valore della proprietà contactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Imposta il valore della proprietà contactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Recupera il valore della proprietà contactPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Imposta il valore della proprietà contactPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Recupera il valore della proprietà contactEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Imposta il valore della proprietà contactEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Recupera il valore della proprietà concernName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcernName() {
        return concernName;
    }

    /**
     * Imposta il valore della proprietà concernName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcernName(String value) {
        this.concernName = value;
    }

    /**
     * Recupera il valore della proprietà shareName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareName() {
        return shareName;
    }

    /**
     * Imposta il valore della proprietà shareName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareName(String value) {
        this.shareName = value;
    }

    /**
     * Recupera il valore della proprietà employerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Imposta il valore della proprietà employerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerName(String value) {
        this.employerName = value;
    }

    /**
     * Recupera il valore della proprietà currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Imposta il valore della proprietà currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Recupera il valore della proprietà ruling.
     * 
     * @return
     *     possible object is
     *     {@link GrantType }
     *     
     */
    public GrantType getRuling() {
        return ruling;
    }

    /**
     * Imposta il valore della proprietà ruling.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantType }
     *     
     */
    public void setRuling(GrantType value) {
        this.ruling = value;
    }

    /**
     * Recupera il valore della proprietà particulars.
     * 
     * @return
     *     possible object is
     *     {@link ParticularsORDType }
     *     
     */
    public ParticularsORDType getParticulars() {
        return particulars;
    }

    /**
     * Imposta il valore della proprietà particulars.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticularsORDType }
     *     
     */
    public void setParticulars(ParticularsORDType value) {
        this.particulars = value;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setPeriod(TimePeriodType value) {
        this.period = value;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setComment(NotificationsType value) {
        this.comment = value;
    }

}
