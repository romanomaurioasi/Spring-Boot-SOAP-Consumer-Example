
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.CompanyWorkingTimeRefType;


/**
 * <p>Classe Java per NoTimeConstraintType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NoTimeConstraintType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contract" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}EmploymentNoTimeConstraintContractType"/&gt;
 *         &lt;element name="ContractualAnnualWage" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="WorkingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyWorkingTimeRefType" minOccurs="0"/&gt;
 *         &lt;element name="ActivityRate" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="Vacation" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="PublicHolidayCompensation" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="Contractual13th" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoTimeConstraintType", propOrder = {
    "contract",
    "contractualAnnualWage",
    "workingTime",
    "activityRate",
    "vacation",
    "publicHolidayCompensation",
    "contractual13Th"
})
public class NoTimeConstraintType {

    @XmlElement(name = "Contract", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected EmploymentNoTimeConstraintContractType contract;
    @XmlElement(name = "ContractualAnnualWage", required = true)
    protected BigDecimal contractualAnnualWage;
    @XmlElement(name = "WorkingTime")
    protected CompanyWorkingTimeRefType workingTime;
    @XmlElement(name = "ActivityRate")
    protected BigDecimal activityRate;
    @XmlElement(name = "Vacation")
    protected BigDecimal vacation;
    @XmlElement(name = "PublicHolidayCompensation")
    protected BigDecimal publicHolidayCompensation;
    @XmlElement(name = "Contractual13th")
    protected List<BigDecimal> contractual13Th;

    /**
     * Recupera il valore della proprietà contract.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentNoTimeConstraintContractType }
     *     
     */
    public EmploymentNoTimeConstraintContractType getContract() {
        return contract;
    }

    /**
     * Imposta il valore della proprietà contract.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentNoTimeConstraintContractType }
     *     
     */
    public void setContract(EmploymentNoTimeConstraintContractType value) {
        this.contract = value;
    }

    /**
     * Recupera il valore della proprietà contractualAnnualWage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractualAnnualWage() {
        return contractualAnnualWage;
    }

    /**
     * Imposta il valore della proprietà contractualAnnualWage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractualAnnualWage(BigDecimal value) {
        this.contractualAnnualWage = value;
    }

    /**
     * Recupera il valore della proprietà workingTime.
     * 
     * @return
     *     possible object is
     *     {@link CompanyWorkingTimeRefType }
     *     
     */
    public CompanyWorkingTimeRefType getWorkingTime() {
        return workingTime;
    }

    /**
     * Imposta il valore della proprietà workingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyWorkingTimeRefType }
     *     
     */
    public void setWorkingTime(CompanyWorkingTimeRefType value) {
        this.workingTime = value;
    }

    /**
     * Recupera il valore della proprietà activityRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivityRate() {
        return activityRate;
    }

    /**
     * Imposta il valore della proprietà activityRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivityRate(BigDecimal value) {
        this.activityRate = value;
    }

    /**
     * Recupera il valore della proprietà vacation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVacation() {
        return vacation;
    }

    /**
     * Imposta il valore della proprietà vacation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVacation(BigDecimal value) {
        this.vacation = value;
    }

    /**
     * Recupera il valore della proprietà publicHolidayCompensation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPublicHolidayCompensation() {
        return publicHolidayCompensation;
    }

    /**
     * Imposta il valore della proprietà publicHolidayCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPublicHolidayCompensation(BigDecimal value) {
        this.publicHolidayCompensation = value;
    }

    /**
     * Gets the value of the contractual13Th property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractual13Th property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractual13Th().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getContractual13Th() {
        if (contractual13Th == null) {
            contractual13Th = new ArrayList<BigDecimal>();
        }
        return this.contractual13Th;
    }

}
