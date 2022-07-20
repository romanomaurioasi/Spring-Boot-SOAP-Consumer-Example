
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.swissdec.schema.common._20180901.common.AddressType;


/**
 * <p>Classe Java per TreatmentAddressExtensionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TreatmentAddressExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZSRNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UID-BFS" type="{http://www.swissdec.ch/schema/common/20180901/Common}UID-BFSType" minOccurs="0"/&gt;
 *         &lt;element name="GLNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TreatmentInstitution" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address" type="{http://www.swissdec.ch/schema/common/20180901/Common}AddressType"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreatmentAddressExtensionType", propOrder = {
    "zsrNumber",
    "uidbfs",
    "glnNumber",
    "treatmentInstitution",
    "address",
    "emailAddress",
    "phoneNumber",
    "mobilePhoneNumber"
})
public class TreatmentAddressExtensionType {

    @XmlElement(name = "ZSRNumber")
    protected String zsrNumber;
    @XmlElement(name = "UID-BFS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String uidbfs;
    @XmlElement(name = "GLNNumber")
    protected String glnNumber;
    @XmlElement(name = "TreatmentInstitution", required = true)
    protected String treatmentInstitution;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "MobilePhoneNumber")
    protected String mobilePhoneNumber;

    /**
     * Recupera il valore della proprietà zsrNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZSRNumber() {
        return zsrNumber;
    }

    /**
     * Imposta il valore della proprietà zsrNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZSRNumber(String value) {
        this.zsrNumber = value;
    }

    /**
     * Recupera il valore della proprietà uidbfs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIDBFS() {
        return uidbfs;
    }

    /**
     * Imposta il valore della proprietà uidbfs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIDBFS(String value) {
        this.uidbfs = value;
    }

    /**
     * Recupera il valore della proprietà glnNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLNNumber() {
        return glnNumber;
    }

    /**
     * Imposta il valore della proprietà glnNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLNNumber(String value) {
        this.glnNumber = value;
    }

    /**
     * Recupera il valore della proprietà treatmentInstitution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentInstitution() {
        return treatmentInstitution;
    }

    /**
     * Imposta il valore della proprietà treatmentInstitution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentInstitution(String value) {
        this.treatmentInstitution = value;
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

}
