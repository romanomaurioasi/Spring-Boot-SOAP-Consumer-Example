
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatisticSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="October" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}MonthValuesType" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TimePeriodType"/&gt;
 *         &lt;element name="TotalHoursOfWork" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TotalHoursOfWorkType" minOccurs="0"/&gt;
 *         &lt;element name="TotalLessonsOfWork" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TotalLessonsOfWorkType" minOccurs="0"/&gt;
 *         &lt;element name="GrossEarnings" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="SocialContributions" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Allowances" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Overtime" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Earnings13th" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="SporadicBenefits" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentsByThird" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FamilyIncomeSupplement" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FringeBenefits" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="CapitalPayment" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="OtherBenefits" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-RegularContribution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-PurchaseContribution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Education" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EducationType"/&gt;
 *         &lt;element name="Position" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}PositionType"/&gt;
 *         &lt;element name="Contract" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmploymentContractType"/&gt;
 *         &lt;element name="JobTitle" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}IDType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="workplaceIDRef" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}WorkplaceIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticSalaryType", propOrder = {
    "october",
    "period",
    "totalHoursOfWork",
    "totalLessonsOfWork",
    "grossEarnings",
    "socialContributions",
    "allowances",
    "overtime",
    "earnings13Th",
    "sporadicBenefits",
    "paymentsByThird",
    "familyIncomeSupplement",
    "fringeBenefits",
    "capitalPayment",
    "otherBenefits",
    "bvglppRegularContribution",
    "bvglppPurchaseContribution",
    "education",
    "position",
    "contract",
    "jobTitle"
})
public class StatisticSalaryType {

    @XmlElement(name = "October")
    protected MonthValuesType october;
    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
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
    @XmlElement(name = "Overtime")
    protected BigDecimal overtime;
    @XmlElement(name = "Earnings13th")
    protected BigDecimal earnings13Th;
    @XmlElement(name = "SporadicBenefits")
    protected BigDecimal sporadicBenefits;
    @XmlElement(name = "PaymentsByThird")
    protected BigDecimal paymentsByThird;
    @XmlElement(name = "FamilyIncomeSupplement")
    protected BigDecimal familyIncomeSupplement;
    @XmlElement(name = "FringeBenefits")
    protected BigDecimal fringeBenefits;
    @XmlElement(name = "CapitalPayment")
    protected BigDecimal capitalPayment;
    @XmlElement(name = "OtherBenefits")
    protected BigDecimal otherBenefits;
    @XmlElement(name = "BVG-LPP-RegularContribution")
    protected BigDecimal bvglppRegularContribution;
    @XmlElement(name = "BVG-LPP-PurchaseContribution")
    protected BigDecimal bvglppPurchaseContribution;
    @XmlElement(name = "Education", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected EducationType education;
    @XmlElement(name = "Position", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected PositionType position;
    @XmlElement(name = "Contract", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected EmploymentContractType contract;
    @XmlElement(name = "JobTitle", required = true)
    protected String jobTitle;
    @XmlAttribute(name = "workplaceIDRef", required = true)
    protected String workplaceIDRef;

    /**
     * Recupera il valore della proprietà october.
     * 
     * @return
     *     possible object is
     *     {@link MonthValuesType }
     *     
     */
    public MonthValuesType getOctober() {
        return october;
    }

    /**
     * Imposta il valore della proprietà october.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthValuesType }
     *     
     */
    public void setOctober(MonthValuesType value) {
        this.october = value;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setPeriod(TimePeriodType value) {
        this.period = value;
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
     * Recupera il valore della proprietà overtime.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOvertime() {
        return overtime;
    }

    /**
     * Imposta il valore della proprietà overtime.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOvertime(BigDecimal value) {
        this.overtime = value;
    }

    /**
     * Recupera il valore della proprietà earnings13Th.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarnings13Th() {
        return earnings13Th;
    }

    /**
     * Imposta il valore della proprietà earnings13Th.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarnings13Th(BigDecimal value) {
        this.earnings13Th = value;
    }

    /**
     * Recupera il valore della proprietà sporadicBenefits.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSporadicBenefits() {
        return sporadicBenefits;
    }

    /**
     * Imposta il valore della proprietà sporadicBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSporadicBenefits(BigDecimal value) {
        this.sporadicBenefits = value;
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
     * Recupera il valore della proprietà fringeBenefits.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFringeBenefits() {
        return fringeBenefits;
    }

    /**
     * Imposta il valore della proprietà fringeBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFringeBenefits(BigDecimal value) {
        this.fringeBenefits = value;
    }

    /**
     * Recupera il valore della proprietà capitalPayment.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalPayment() {
        return capitalPayment;
    }

    /**
     * Imposta il valore della proprietà capitalPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalPayment(BigDecimal value) {
        this.capitalPayment = value;
    }

    /**
     * Recupera il valore della proprietà otherBenefits.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherBenefits() {
        return otherBenefits;
    }

    /**
     * Imposta il valore della proprietà otherBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherBenefits(BigDecimal value) {
        this.otherBenefits = value;
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

    /**
     * Recupera il valore della proprietà bvglppPurchaseContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPPurchaseContribution() {
        return bvglppPurchaseContribution;
    }

    /**
     * Imposta il valore della proprietà bvglppPurchaseContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPPurchaseContribution(BigDecimal value) {
        this.bvglppPurchaseContribution = value;
    }

    /**
     * Recupera il valore della proprietà education.
     * 
     * @return
     *     possible object is
     *     {@link EducationType }
     *     
     */
    public EducationType getEducation() {
        return education;
    }

    /**
     * Imposta il valore della proprietà education.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationType }
     *     
     */
    public void setEducation(EducationType value) {
        this.education = value;
    }

    /**
     * Recupera il valore della proprietà position.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * Recupera il valore della proprietà contract.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentContractType }
     *     
     */
    public EmploymentContractType getContract() {
        return contract;
    }

    /**
     * Imposta il valore della proprietà contract.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentContractType }
     *     
     */
    public void setContract(EmploymentContractType value) {
        this.contract = value;
    }

    /**
     * Recupera il valore della proprietà jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Imposta il valore della proprietà jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Recupera il valore della proprietà workplaceIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceIDRef() {
        return workplaceIDRef;
    }

    /**
     * Imposta il valore della proprietà workplaceIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceIDRef(String value) {
        this.workplaceIDRef = value;
    }

}
