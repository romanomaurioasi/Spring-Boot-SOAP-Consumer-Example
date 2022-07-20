
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TimePeriodType"/&gt;
 *         &lt;element name="FreeTransport" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="CanteenLunchCheck" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="Income" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FringeBenefits" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FringeBenefitsType" minOccurs="0"/&gt;
 *         &lt;element name="SporadicBenefits" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SortSumType" minOccurs="0"/&gt;
 *         &lt;element name="CapitalPayment" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SortSumType" minOccurs="0"/&gt;
 *         &lt;element name="OwnershipRight" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="BoardOfDirectorsRemuneration" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="OtherBenefits" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SortSumType" minOccurs="0"/&gt;
 *         &lt;element name="GrossIncome" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="AHV-ALV-NBUV-AVS-AC-AANP-Contribution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-Contribution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}Tax-BVG-LPP-ContributionType" minOccurs="0"/&gt;
 *         &lt;element name="NetIncome" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="DeductionAtSource" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ChargesRule" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ChargesRuleType" minOccurs="0"/&gt;
 *         &lt;element name="Charges" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="OtherFringeBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StandardRemark" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}StandardRemarkType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnershipRightDetails" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}OwnershipRightDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ContactType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSalaryType", propOrder = {
    "period",
    "freeTransport",
    "canteenLunchCheck",
    "income",
    "fringeBenefits",
    "sporadicBenefits",
    "capitalPayment",
    "ownershipRight",
    "boardOfDirectorsRemuneration",
    "otherBenefits",
    "grossIncome",
    "ahvalvnbuvavsacaanpContribution",
    "bvglppContribution",
    "netIncome",
    "deductionAtSource",
    "chargesRule",
    "charges",
    "otherFringeBenefits",
    "standardRemark",
    "remark",
    "ownershipRightDetails",
    "contact"
})
public class TaxSalaryType {

    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
    @XmlElement(name = "FreeTransport")
    protected EmptyType freeTransport;
    @XmlElement(name = "CanteenLunchCheck")
    protected EmptyType canteenLunchCheck;
    @XmlElement(name = "Income")
    protected BigDecimal income;
    @XmlElement(name = "FringeBenefits")
    protected FringeBenefitsType fringeBenefits;
    @XmlElement(name = "SporadicBenefits")
    protected SortSumType sporadicBenefits;
    @XmlElement(name = "CapitalPayment")
    protected SortSumType capitalPayment;
    @XmlElement(name = "OwnershipRight")
    protected BigDecimal ownershipRight;
    @XmlElement(name = "BoardOfDirectorsRemuneration")
    protected BigDecimal boardOfDirectorsRemuneration;
    @XmlElement(name = "OtherBenefits")
    protected SortSumType otherBenefits;
    @XmlElement(name = "GrossIncome", required = true)
    protected BigDecimal grossIncome;
    @XmlElement(name = "AHV-ALV-NBUV-AVS-AC-AANP-Contribution")
    protected BigDecimal ahvalvnbuvavsacaanpContribution;
    @XmlElement(name = "BVG-LPP-Contribution")
    protected TaxBVGLPPContributionType bvglppContribution;
    @XmlElement(name = "NetIncome", required = true)
    protected BigDecimal netIncome;
    @XmlElement(name = "DeductionAtSource")
    protected BigDecimal deductionAtSource;
    @XmlElement(name = "ChargesRule")
    protected ChargesRuleType chargesRule;
    @XmlElement(name = "Charges")
    protected ChargesType charges;
    @XmlElement(name = "OtherFringeBenefits")
    protected String otherFringeBenefits;
    @XmlElement(name = "StandardRemark")
    protected StandardRemarkType standardRemark;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "OwnershipRightDetails")
    protected OwnershipRightDetailsType ownershipRightDetails;
    @XmlElement(name = "Contact")
    protected ContactType contact;

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
     * Recupera il valore della proprietà freeTransport.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getFreeTransport() {
        return freeTransport;
    }

    /**
     * Imposta il valore della proprietà freeTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setFreeTransport(EmptyType value) {
        this.freeTransport = value;
    }

    /**
     * Recupera il valore della proprietà canteenLunchCheck.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getCanteenLunchCheck() {
        return canteenLunchCheck;
    }

    /**
     * Imposta il valore della proprietà canteenLunchCheck.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setCanteenLunchCheck(EmptyType value) {
        this.canteenLunchCheck = value;
    }

    /**
     * Recupera il valore della proprietà income.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncome() {
        return income;
    }

    /**
     * Imposta il valore della proprietà income.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncome(BigDecimal value) {
        this.income = value;
    }

    /**
     * Recupera il valore della proprietà fringeBenefits.
     * 
     * @return
     *     possible object is
     *     {@link FringeBenefitsType }
     *     
     */
    public FringeBenefitsType getFringeBenefits() {
        return fringeBenefits;
    }

    /**
     * Imposta il valore della proprietà fringeBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link FringeBenefitsType }
     *     
     */
    public void setFringeBenefits(FringeBenefitsType value) {
        this.fringeBenefits = value;
    }

    /**
     * Recupera il valore della proprietà sporadicBenefits.
     * 
     * @return
     *     possible object is
     *     {@link SortSumType }
     *     
     */
    public SortSumType getSporadicBenefits() {
        return sporadicBenefits;
    }

    /**
     * Imposta il valore della proprietà sporadicBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumType }
     *     
     */
    public void setSporadicBenefits(SortSumType value) {
        this.sporadicBenefits = value;
    }

    /**
     * Recupera il valore della proprietà capitalPayment.
     * 
     * @return
     *     possible object is
     *     {@link SortSumType }
     *     
     */
    public SortSumType getCapitalPayment() {
        return capitalPayment;
    }

    /**
     * Imposta il valore della proprietà capitalPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumType }
     *     
     */
    public void setCapitalPayment(SortSumType value) {
        this.capitalPayment = value;
    }

    /**
     * Recupera il valore della proprietà ownershipRight.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnershipRight() {
        return ownershipRight;
    }

    /**
     * Imposta il valore della proprietà ownershipRight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnershipRight(BigDecimal value) {
        this.ownershipRight = value;
    }

    /**
     * Recupera il valore della proprietà boardOfDirectorsRemuneration.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoardOfDirectorsRemuneration() {
        return boardOfDirectorsRemuneration;
    }

    /**
     * Imposta il valore della proprietà boardOfDirectorsRemuneration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoardOfDirectorsRemuneration(BigDecimal value) {
        this.boardOfDirectorsRemuneration = value;
    }

    /**
     * Recupera il valore della proprietà otherBenefits.
     * 
     * @return
     *     possible object is
     *     {@link SortSumType }
     *     
     */
    public SortSumType getOtherBenefits() {
        return otherBenefits;
    }

    /**
     * Imposta il valore della proprietà otherBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumType }
     *     
     */
    public void setOtherBenefits(SortSumType value) {
        this.otherBenefits = value;
    }

    /**
     * Recupera il valore della proprietà grossIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossIncome() {
        return grossIncome;
    }

    /**
     * Imposta il valore della proprietà grossIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossIncome(BigDecimal value) {
        this.grossIncome = value;
    }

    /**
     * Recupera il valore della proprietà ahvalvnbuvavsacaanpContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAHVALVNBUVAVSACAANPContribution() {
        return ahvalvnbuvavsacaanpContribution;
    }

    /**
     * Imposta il valore della proprietà ahvalvnbuvavsacaanpContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAHVALVNBUVAVSACAANPContribution(BigDecimal value) {
        this.ahvalvnbuvavsacaanpContribution = value;
    }

    /**
     * Recupera il valore della proprietà bvglppContribution.
     * 
     * @return
     *     possible object is
     *     {@link TaxBVGLPPContributionType }
     *     
     */
    public TaxBVGLPPContributionType getBVGLPPContribution() {
        return bvglppContribution;
    }

    /**
     * Imposta il valore della proprietà bvglppContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBVGLPPContributionType }
     *     
     */
    public void setBVGLPPContribution(TaxBVGLPPContributionType value) {
        this.bvglppContribution = value;
    }

    /**
     * Recupera il valore della proprietà netIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetIncome() {
        return netIncome;
    }

    /**
     * Imposta il valore della proprietà netIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetIncome(BigDecimal value) {
        this.netIncome = value;
    }

    /**
     * Recupera il valore della proprietà deductionAtSource.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductionAtSource() {
        return deductionAtSource;
    }

    /**
     * Imposta il valore della proprietà deductionAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductionAtSource(BigDecimal value) {
        this.deductionAtSource = value;
    }

    /**
     * Recupera il valore della proprietà chargesRule.
     * 
     * @return
     *     possible object is
     *     {@link ChargesRuleType }
     *     
     */
    public ChargesRuleType getChargesRule() {
        return chargesRule;
    }

    /**
     * Imposta il valore della proprietà chargesRule.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesRuleType }
     *     
     */
    public void setChargesRule(ChargesRuleType value) {
        this.chargesRule = value;
    }

    /**
     * Recupera il valore della proprietà charges.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getCharges() {
        return charges;
    }

    /**
     * Imposta il valore della proprietà charges.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setCharges(ChargesType value) {
        this.charges = value;
    }

    /**
     * Recupera il valore della proprietà otherFringeBenefits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFringeBenefits() {
        return otherFringeBenefits;
    }

    /**
     * Imposta il valore della proprietà otherFringeBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFringeBenefits(String value) {
        this.otherFringeBenefits = value;
    }

    /**
     * Recupera il valore della proprietà standardRemark.
     * 
     * @return
     *     possible object is
     *     {@link StandardRemarkType }
     *     
     */
    public StandardRemarkType getStandardRemark() {
        return standardRemark;
    }

    /**
     * Imposta il valore della proprietà standardRemark.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardRemarkType }
     *     
     */
    public void setStandardRemark(StandardRemarkType value) {
        this.standardRemark = value;
    }

    /**
     * Recupera il valore della proprietà remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Imposta il valore della proprietà remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Recupera il valore della proprietà ownershipRightDetails.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipRightDetailsType }
     *     
     */
    public OwnershipRightDetailsType getOwnershipRightDetails() {
        return ownershipRightDetails;
    }

    /**
     * Imposta il valore della proprietà ownershipRightDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipRightDetailsType }
     *     
     */
    public void setOwnershipRightDetails(OwnershipRightDetailsType value) {
        this.ownershipRightDetails = value;
    }

    /**
     * Recupera il valore della proprietà contact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Imposta il valore della proprietà contact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

}
