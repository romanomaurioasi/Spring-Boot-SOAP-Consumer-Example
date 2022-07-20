
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompanyDescriptionBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyDescriptionBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyNameType"/&gt;
 *         &lt;element name="Owner" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyOwnerType" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.swissdec.ch/schema/common/20200220/Common}AddressType"/&gt;
 *         &lt;element name="UID-BFS" type="{http://www.swissdec.ch/schema/common/20200220/Common}UID-BFS-UnknownType"/&gt;
 *         &lt;element name="Delegate" type="{http://www.swissdec.ch/schema/common/20200220/Common}DelegateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDescriptionBaseType", propOrder = {
    "name",
    "owner",
    "address",
    "uidbfs",
    "delegate"
})
@XmlSeeAlso({
    CompanyDescriptionType.class
})
public class CompanyDescriptionBaseType {

    @XmlElement(name = "Name", required = true)
    protected CompanyNameType name;
    @XmlElement(name = "Owner")
    protected CompanyOwnerType owner;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "UID-BFS", required = true)
    protected UIDBFSUnknownType uidbfs;
    @XmlElement(name = "Delegate")
    protected DelegateType delegate;

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
     *     {@link UIDBFSUnknownType }
     *     
     */
    public UIDBFSUnknownType getUIDBFS() {
        return uidbfs;
    }

    /**
     * Imposta il valore della proprietà uidbfs.
     * 
     * @param value
     *     allowed object is
     *     {@link UIDBFSUnknownType }
     *     
     */
    public void setUIDBFS(UIDBFSUnknownType value) {
        this.uidbfs = value;
    }

    /**
     * Recupera il valore della proprietà delegate.
     * 
     * @return
     *     possible object is
     *     {@link DelegateType }
     *     
     */
    public DelegateType getDelegate() {
        return delegate;
    }

    /**
     * Imposta il valore della proprietà delegate.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateType }
     *     
     */
    public void setDelegate(DelegateType value) {
        this.delegate = value;
    }

}
