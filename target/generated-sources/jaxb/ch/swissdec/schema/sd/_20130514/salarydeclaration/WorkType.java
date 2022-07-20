
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per WorkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WorkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkingTime" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}WorkingTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ActivityRate" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ActivityRateType" minOccurs="0"/&gt;
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="WithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AgriculturalEmployee" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="LeaveEntitlement" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DaysPerYearType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkType", propOrder = {
    "workingTime",
    "activityRate",
    "entryDate",
    "withdrawalDate",
    "agriculturalEmployee",
    "leaveEntitlement"
})
public class WorkType {

    @XmlElement(name = "WorkingTime")
    protected WorkingTimeType workingTime;
    @XmlElement(name = "ActivityRate")
    @XmlSchemaType(name = "integer")
    protected Integer activityRate;
    @XmlElement(name = "EntryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "WithdrawalDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withdrawalDate;
    @XmlElement(name = "AgriculturalEmployee")
    protected EmptyType agriculturalEmployee;
    @XmlElement(name = "LeaveEntitlement")
    @XmlSchemaType(name = "integer")
    protected Integer leaveEntitlement;

    /**
     * Recupera il valore della proprietà workingTime.
     * 
     * @return
     *     possible object is
     *     {@link WorkingTimeType }
     *     
     */
    public WorkingTimeType getWorkingTime() {
        return workingTime;
    }

    /**
     * Imposta il valore della proprietà workingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingTimeType }
     *     
     */
    public void setWorkingTime(WorkingTimeType value) {
        this.workingTime = value;
    }

    /**
     * Recupera il valore della proprietà activityRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityRate() {
        return activityRate;
    }

    /**
     * Imposta il valore della proprietà activityRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityRate(Integer value) {
        this.activityRate = value;
    }

    /**
     * Recupera il valore della proprietà entryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Imposta il valore della proprietà entryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Recupera il valore della proprietà withdrawalDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalDate() {
        return withdrawalDate;
    }

    /**
     * Imposta il valore della proprietà withdrawalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalDate(XMLGregorianCalendar value) {
        this.withdrawalDate = value;
    }

    /**
     * Recupera il valore della proprietà agriculturalEmployee.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getAgriculturalEmployee() {
        return agriculturalEmployee;
    }

    /**
     * Imposta il valore della proprietà agriculturalEmployee.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setAgriculturalEmployee(EmptyType value) {
        this.agriculturalEmployee = value;
    }

    /**
     * Recupera il valore della proprietà leaveEntitlement.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeaveEntitlement() {
        return leaveEntitlement;
    }

    /**
     * Imposta il valore della proprietà leaveEntitlement.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeaveEntitlement(Integer value) {
        this.leaveEntitlement = value;
    }

}
