
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MonthValuesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonthValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityRate" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ActivityRateType" minOccurs="0"/&gt;
 *         &lt;element name="TotalHoursOfWork" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TotalHoursOfWorkType" minOccurs="0"/&gt;
 *         &lt;element name="TotalLessonsOfWork" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TotalLessonsOfWorkType" minOccurs="0"/&gt;
 *         &lt;element name="GrossEarnings" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="SocialContributions" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Allowances" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentsByThird" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FamilyIncomeSupplement" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-RegularContribution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthValuesType", propOrder = {
    "activityRate",
    "totalHoursOfWork",
    "totalLessonsOfWork",
    "grossEarnings",
    "socialContributions",
    "allowances",
    "paymentsByThird",
    "familyIncomeSupplement",
    "bvglppRegularContribution"
})
public class MonthValuesType {

    @XmlElement(name = "ActivityRate")
    @XmlSchemaType(name = "integer")
    protected Integer activityRate;
    @XmlElement(name = "TotalHoursOfWork")
    protected BigDecimal totalHoursOfWork;
    @XmlElement(name = "TotalLessonsOfWork")
    @XmlSchemaType(name = "integer")
    protected Integer totalLessonsOfWork;
    @XmlElement(name = "GrossEarnings")
    protected BigDecimal grossEarnings;
    @XmlElement(name = "SocialContributions")
    protected BigDecimal socialContributions;
    @XmlElement(name = "Allowances")
    protected BigDecimal allowances;
    @XmlElement(name = "PaymentsByThird")
    protected BigDecimal paymentsByThird;
    @XmlElement(name = "FamilyIncomeSupplement")
    protected BigDecimal familyIncomeSupplement;
    @XmlElement(name = "BVG-LPP-RegularContribution")
    protected BigDecimal bvglppRegularContribution;

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
     * Recupera il valore della proprietà totalHoursOfWork.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalHoursOfWork() {
        return totalHoursOfWork;
    }

    /**
     * Imposta il valore della proprietà totalHoursOfWork.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalHoursOfWork(BigDecimal value) {
        this.totalHoursOfWork = value;
    }

    /**
     * Recupera il valore della proprietà totalLessonsOfWork.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLessonsOfWork() {
        return totalLessonsOfWork;
    }

    /**
     * Imposta il valore della proprietà totalLessonsOfWork.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLessonsOfWork(Integer value) {
        this.totalLessonsOfWork = value;
    }

    /**
     * Recupera il valore della proprietà grossEarnings.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossEarnings() {
        return grossEarnings;
    }

    /**
     * Imposta il valore della proprietà grossEarnings.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossEarnings(BigDecimal value) {
        this.grossEarnings = value;
    }

    /**
     * Recupera il valore della proprietà socialContributions.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSocialContributions() {
        return socialContributions;
    }

    /**
     * Imposta il valore della proprietà socialContributions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSocialContributions(BigDecimal value) {
        this.socialContributions = value;
    }

    /**
     * Recupera il valore della proprietà allowances.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllowances() {
        return allowances;
    }

    /**
     * Imposta il valore della proprietà allowances.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllowances(BigDecimal value) {
        this.allowances = value;
    }

    /**
     * Recupera il valore della proprietà paymentsByThird.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentsByThird() {
        return paymentsByThird;
    }

    /**
     * Imposta il valore della proprietà paymentsByThird.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentsByThird(BigDecimal value) {
        this.paymentsByThird = value;
    }

    /**
     * Recupera il valore della proprietà familyIncomeSupplement.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFamilyIncomeSupplement() {
        return familyIncomeSupplement;
    }

    /**
     * Imposta il valore della proprietà familyIncomeSupplement.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFamilyIncomeSupplement(BigDecimal value) {
        this.familyIncomeSupplement = value;
    }

    /**
     * Recupera il valore della proprietà bvglppRegularContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPRegularContribution() {
        return bvglppRegularContribution;
    }

    /**
     * Imposta il valore della proprietà bvglppRegularContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPRegularContribution(BigDecimal value) {
        this.bvglppRegularContribution = value;
    }

}
