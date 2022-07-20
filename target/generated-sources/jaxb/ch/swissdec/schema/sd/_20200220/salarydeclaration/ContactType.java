
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.AddressType;


/**
 * <p>Classe Java per ContactType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HR-RC-Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address" type="{http://www.swissdec.ch/schema/common/20200220/Common}AddressType"/&gt;
 *         &lt;element name="Person" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "hrrcName",
    "address",
    "person",
    "phoneNumber"
})
public class ContactType {

    @XmlElement(name = "HR-RC-Name", required = true)
    protected String hrrcName;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "Person", required = true)
    protected String person;
    @XmlElement(name = "PhoneNumber", required = true)
    protected String phoneNumber;

    /**
     * Recupera il valore della proprietà hrrcName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRRCName() {
        return hrrcName;
    }

    /**
     * Imposta il valore della proprietà hrrcName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRRCName(String value) {
        this.hrrcName = value;
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
     * Recupera il valore della proprietà person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerson() {
        return person;
    }

    /**
     * Imposta il valore della proprietà person.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerson(String value) {
        this.person = value;
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

}
