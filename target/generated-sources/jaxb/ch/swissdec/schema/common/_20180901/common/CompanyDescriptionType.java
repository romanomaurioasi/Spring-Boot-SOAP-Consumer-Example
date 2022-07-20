
package ch.swissdec.schema.common._20180901.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompanyDescriptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.swissdec.ch/schema/common/20180901/Common}CompanyNameType"/&gt;
 *         &lt;element name="Owner" type="{http://www.swissdec.ch/schema/common/20180901/Common}CompanyOwnerType" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.swissdec.ch/schema/common/20180901/Common}AddressType"/&gt;
 *         &lt;element name="UID-BFS" type="{http://www.swissdec.ch/schema/common/20180901/Common}UID-BFS-UnknownType"/&gt;
 *         &lt;element name="Workplace" type="{http://www.swissdec.ch/schema/common/20180901/Common}WorkplaceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Delegate" type="{http://www.swissdec.ch/schema/common/20180901/Common}DelegateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDescriptionType", propOrder = {
    "name",
    "owner",
    "address",
    "uidbfs",
    "workplace",
    "delegate"
})
public class CompanyDescriptionType {

    @XmlElement(name = "Name", required = true)
    protected CompanyNameType name;
    @XmlElement(name = "Owner")
    protected CompanyOwnerType owner;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "UID-BFS", required = true)
    protected UIDBFSUnknownType uidbfs;
    @XmlElement(name = "Workplace", required = true)
    protected List<WorkplaceType> workplace;
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
     * Gets the value of the workplace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workplace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkplace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkplaceType }
     * 
     * 
     */
    public List<WorkplaceType> getWorkplace() {
        if (workplace == null) {
            workplace = new ArrayList<WorkplaceType>();
        }
        return this.workplace;
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
