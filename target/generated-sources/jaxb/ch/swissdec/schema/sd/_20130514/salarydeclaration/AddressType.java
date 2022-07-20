
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AddressType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComplementaryLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Postbox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZIP-Code" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ZIP-CodeType"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "complementaryLine",
    "street",
    "postbox",
    "locality",
    "zipCode",
    "city",
    "country"
})
@XmlSeeAlso({
    AddressExtensionType.class
})
public class AddressType {

    @XmlElement(name = "ComplementaryLine")
    protected String complementaryLine;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Postbox")
    protected String postbox;
    @XmlElement(name = "Locality")
    protected String locality;
    @XmlElement(name = "ZIP-Code", required = true)
    protected String zipCode;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Country")
    protected String country;

    /**
     * Recupera il valore della proprietà complementaryLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementaryLine() {
        return complementaryLine;
    }

    /**
     * Imposta il valore della proprietà complementaryLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementaryLine(String value) {
        this.complementaryLine = value;
    }

    /**
     * Recupera il valore della proprietà street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Imposta il valore della proprietà street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Recupera il valore della proprietà postbox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostbox() {
        return postbox;
    }

    /**
     * Imposta il valore della proprietà postbox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostbox(String value) {
        this.postbox = value;
    }

    /**
     * Recupera il valore della proprietà locality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Imposta il valore della proprietà locality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Recupera il valore della proprietà zipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPCode() {
        return zipCode;
    }

    /**
     * Imposta il valore della proprietà zipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPCode(String value) {
        this.zipCode = value;
    }

    /**
     * Recupera il valore della proprietà city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Imposta il valore della proprietà city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
