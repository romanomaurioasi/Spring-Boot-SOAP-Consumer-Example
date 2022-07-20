
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per BVG-LPP-PeriodCategoryTotal complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-PeriodCategoryTotal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="BVG-LPP-Code" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="BVG-LPP-PeriodBasisTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="BVG-LPP-PeriodContributorySalaryTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *             &lt;element name="EmployeePeriodContributionTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *             &lt;element name="EmployerPeriodContributionTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *             &lt;element name="ThirdPartyPeriodContributionTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-PeriodCategoryTotal", propOrder = {
    "accountingTime",
    "bvglppCode",
    "bvglppPeriodBasisTotal",
    "bvglppPeriodContributorySalaryTotal",
    "employeePeriodContributionTotal",
    "employerPeriodContributionTotal",
    "thirdPartyPeriodContributionTotal"
})
public class BVGLPPPeriodCategoryTotal {

    @XmlElement(name = "AccountingTime", required = true)
    protected TimePeriodType accountingTime;
    @XmlElement(name = "BVG-LPP-Code")
    protected String bvglppCode;
    @XmlElement(name = "BVG-LPP-PeriodBasisTotal")
    protected BigDecimal bvglppPeriodBasisTotal;
    @XmlElement(name = "BVG-LPP-PeriodContributorySalaryTotal")
    protected BigDecimal bvglppPeriodContributorySalaryTotal;
    @XmlElement(name = "EmployeePeriodContributionTotal")
    protected BigDecimal employeePeriodContributionTotal;
    @XmlElement(name = "EmployerPeriodContributionTotal")
    protected BigDecimal employerPeriodContributionTotal;
    @XmlElement(name = "ThirdPartyPeriodContributionTotal")
    protected BigDecimal thirdPartyPeriodContributionTotal;

    /**
     * Recupera il valore della proprietà accountingTime.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getAccountingTime() {
        return accountingTime;
    }

    /**
     * Imposta il valore della proprietà accountingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setAccountingTime(TimePeriodType value) {
        this.accountingTime = value;
    }

    /**
     * Recupera il valore della proprietà bvglppCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVGLPPCode() {
        return bvglppCode;
    }

    /**
     * Imposta il valore della proprietà bvglppCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVGLPPCode(String value) {
        this.bvglppCode = value;
    }

    /**
     * Recupera il valore della proprietà bvglppPeriodBasisTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPPeriodBasisTotal() {
        return bvglppPeriodBasisTotal;
    }

    /**
     * Imposta il valore della proprietà bvglppPeriodBasisTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPPeriodBasisTotal(BigDecimal value) {
        this.bvglppPeriodBasisTotal = value;
    }

    /**
     * Recupera il valore della proprietà bvglppPeriodContributorySalaryTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPPeriodContributorySalaryTotal() {
        return bvglppPeriodContributorySalaryTotal;
    }

    /**
     * Imposta il valore della proprietà bvglppPeriodContributorySalaryTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPPeriodContributorySalaryTotal(BigDecimal value) {
        this.bvglppPeriodContributorySalaryTotal = value;
    }

    /**
     * Recupera il valore della proprietà employeePeriodContributionTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeePeriodContributionTotal() {
        return employeePeriodContributionTotal;
    }

    /**
     * Imposta il valore della proprietà employeePeriodContributionTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeePeriodContributionTotal(BigDecimal value) {
        this.employeePeriodContributionTotal = value;
    }

    /**
     * Recupera il valore della proprietà employerPeriodContributionTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployerPeriodContributionTotal() {
        return employerPeriodContributionTotal;
    }

    /**
     * Imposta il valore della proprietà employerPeriodContributionTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployerPeriodContributionTotal(BigDecimal value) {
        this.employerPeriodContributionTotal = value;
    }

    /**
     * Recupera il valore della proprietà thirdPartyPeriodContributionTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThirdPartyPeriodContributionTotal() {
        return thirdPartyPeriodContributionTotal;
    }

    /**
     * Imposta il valore della proprietà thirdPartyPeriodContributionTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThirdPartyPeriodContributionTotal(BigDecimal value) {
        this.thirdPartyPeriodContributionTotal = value;
    }

}
