
package ch.swissdec.schema.sd._20130514.salarydeclaration;

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
 *         &lt;element name="BUR-REE-Number" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BUR-REE-NumberType" minOccurs="0"/&gt;
 *         &lt;element name="InHouseID" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}IDType" minOccurs="0"/&gt;
 *         &lt;element name="AddressExtended" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AddressExtensionType"/&gt;
 *         &lt;element name="CompanyWorkingTime" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CompanyWorkingTimeType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="workplaceID" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}WorkplaceIDType" /&gt;
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
    protected CompanyWorkingTimeType companyWorkingTime;
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
     * Recupera il valore della proprietà companyWorkingTime.
     * 
     * @return
     *     possible object is
     *     {@link CompanyWorkingTimeType }
     *     
     */
    public CompanyWorkingTimeType getCompanyWorkingTime() {
        return companyWorkingTime;
    }

    /**
     * Imposta il valore della proprietà companyWorkingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyWorkingTimeType }
     *     
     */
    public void setCompanyWorkingTime(CompanyWorkingTimeType value) {
        this.companyWorkingTime = value;
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
