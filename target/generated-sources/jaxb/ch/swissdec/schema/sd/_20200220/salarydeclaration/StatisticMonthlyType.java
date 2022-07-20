
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
 * <p>Classe Java per StatisticMonthlyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticMonthlyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contract" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}EmploymentMonthlyContractType"/&gt;
 *         &lt;element name="ContractualMonthlyWage" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="Contractual13th" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="WorkingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyWorkingTimeRefType"/&gt;
 *         &lt;element name="ActivityRate" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticMonthlyType", propOrder = {
    "contract",
    "contractualMonthlyWage",
    "contractual13Th",
    "workingTime",
    "activityRate"
})
public class StatisticMonthlyType {

    @XmlElement(name = "Contract", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected EmploymentMonthlyContractType contract;
    @XmlElement(name = "ContractualMonthlyWage", required = true)
    protected BigDecimal contractualMonthlyWage;
    @XmlElement(name = "Contractual13th", required = true)
    protected List<BigDecimal> contractual13Th;
    @XmlElement(name = "WorkingTime", required = true)
    protected CompanyWorkingTimeRefType workingTime;
    @XmlElement(name = "ActivityRate", required = true)
    protected BigDecimal activityRate;

    /**
     * Recupera il valore della proprietà contract.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentMonthlyContractType }
     *     
     */
    public EmploymentMonthlyContractType getContract() {
        return contract;
    }

    /**
     * Imposta il valore della proprietà contract.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentMonthlyContractType }
     *     
     */
    public void setContract(EmploymentMonthlyContractType value) {
        this.contract = value;
    }

    /**
     * Recupera il valore della proprietà contractualMonthlyWage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractualMonthlyWage() {
        return contractualMonthlyWage;
    }

    /**
     * Imposta il valore della proprietà contractualMonthlyWage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractualMonthlyWage(BigDecimal value) {
        this.contractualMonthlyWage = value;
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

}
