
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per DelegateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DelegateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.swissdec.ch/schema/common/20180901/Common}CompanyNameType"/&gt;
 *         &lt;element name="Owner" type="{http://www.swissdec.ch/schema/common/20180901/Common}CompanyOwnerType" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.swissdec.ch/schema/common/20180901/Common}AddressType"/&gt;
 *         &lt;element name="UID-BFS" type="{http://www.swissdec.ch/schema/common/20180901/Common}UID-BFSType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelegateType", propOrder = {
    "name",
    "owner",
    "address",
    "uidbfs"
})
public class DelegateType {

    @XmlElement(name = "Name", required = true)
    protected CompanyNameType name;
    @XmlElement(name = "Owner")
    protected CompanyOwnerType owner;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "UID-BFS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String uidbfs;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setName(CompanyNameType value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà owner.
     * 
     * @return
     *     possible object is
     *     {@link CompanyOwnerType }
     *     
     */
    public CompanyOwnerType getOwner() {
        return owner;
    }

    /**
     * Imposta il valore della proprietà owner.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyOwnerType }
     *     
     */
    public void setOwner(CompanyOwnerType value) {
        this.owner = value;
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

}
