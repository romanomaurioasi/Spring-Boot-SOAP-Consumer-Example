
package ch.swissdec.schema.common._20200220.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per WorkplaceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WorkplaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="BUR-REE-Number" type="{http://www.swissdec.ch/schema/common/20200220/Common}BUR-REE-NumberType"/&gt;
 *           &lt;element name="InHouseID" type="{http://www.swissdec.ch/schema/common/20200220/Common}IDType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AddressExtended" type="{http://www.swissdec.ch/schema/common/20200220/Common}AddressExtensionType"/&gt;
 *         &lt;element name="CompanyWorkingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyWorkingTimeIDType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="workplaceID" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkplaceType", propOrder = {
    "burreeNumber",
    "inHouseID",
    "addressExtended",
    "companyWorkingTime"
})
public class WorkplaceType {

    @XmlElement(name = "BUR-REE-Number")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String burreeNumber;
    @XmlElement(name = "InHouseID")
    protected String inHouseID;
    @XmlElement(name = "AddressExtended", required = true)
    protected AddressExtensionType addressExtended;
    @XmlElement(name = "CompanyWorkingTime", required = true)
    protected List<CompanyWorkingTimeIDType> companyWorkingTime;
    @XmlAttribute(name = "workplaceID", required = true)
    protected String workplaceID;

    /**
     * Recupera il valore della proprietà burreeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBURREENumber() {
        return burreeNumber;
    }

    /**
     * Imposta il valore della proprietà burreeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBURREENumber(String value) {
        this.burreeNumber = value;
    }

    /**
     * Recupera il valore della proprietà inHouseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHouseID() {
        return inHouseID;
    }

    /**
     * Imposta il valore della proprietà inHouseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHouseID(String value) {
        this.inHouseID = value;
    }

    /**
     * Recupera il valore della proprietà addressExtended.
     * 
     * @return
     *     possible object is
     *     {@link AddressExtensionType }
     *     
     */
    public AddressExtensionType getAddressExtended() {
        return addressExtended;
    }

    /**
     * Imposta il valore della proprietà addressExtended.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressExtensionType }
     *     
     */
    public void setAddressExtended(AddressExtensionType value) {
        this.addressExtended = value;
    }

    /**
     * Gets the value of the companyWorkingTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyWorkingTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyWorkingTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyWorkingTimeIDType }
     * 
     * 
     */
    public List<CompanyWorkingTimeIDType> getCompanyWorkingTime() {
        if (companyWorkingTime == null) {
            companyWorkingTime = new ArrayList<CompanyWorkingTimeIDType>();
        }
        return this.companyWorkingTime;
    }

    /**
     * Recupera il valore della proprietà workplaceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceID() {
        return workplaceID;
    }

    /**
     * Imposta il valore della proprietà workplaceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceID(String value) {
        this.workplaceID = value;
    }

}
