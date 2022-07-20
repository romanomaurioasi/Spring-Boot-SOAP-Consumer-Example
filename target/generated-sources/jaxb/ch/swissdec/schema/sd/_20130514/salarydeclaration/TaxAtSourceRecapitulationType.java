
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceRecapitulationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceRecapitulationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TimePeriodType"/&gt;
 *         &lt;element name="LastTax" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}PercentType"/&gt;
 *         &lt;element name="TaxableEarningCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="TaxAtSourceCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="ChurchTaxCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TerminationPayCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="SporadicBenefitsCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="OwnershipRightCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="BoardOfDirectorsRemunerationCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FamilyIncomeCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ChargesEffectiveCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ChargesLumpSumCumulative" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="GrantTaxAtSourceCode" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="WorkDaysCumulativeCH" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DaysPerYearType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lastWorkplaceIDRef" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}WorkplaceIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceRecapitulationType", propOrder = {
    "period",
    "lastTax",
    "taxableEarningCumulative",
    "taxAtSourceCumulative",
    "churchTaxCumulative",
    "terminationPayCumulative",
    "sporadicBenefitsCumulative",
    "ownershipRightCumulative",
    "boardOfDirectorsRemunerationCumulative",
    "familyIncomeCumulative",
    "chargesEffectiveCumulative",
    "chargesLumpSumCumulative",
    "grantTaxAtSourceCode",
    "workDaysCumulativeCH"
})
public class TaxAtSourceRecapitulationType {

    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
    @XmlElement(name = "LastTax", required = true)
    protected BigDecimal lastTax;
    @XmlElement(name = "TaxableEarningCumulative", required = true)
    protected BigDecimal taxableEarningCumulative;
    @XmlElement(name = "TaxAtSourceCumulative", required = true)
    protected BigDecimal taxAtSourceCumulative;
    @XmlElement(name = "ChurchTaxCumulative")
    protected BigDecimal churchTaxCumulative;
    @XmlElement(name = "TerminationPayCumulative")
    protected BigDecimal terminationPayCumulative;
    @XmlElement(name = "SporadicBenefitsCumulative")
    protected BigDecimal sporadicBenefitsCumulative;
    @XmlElement(name = "OwnershipRightCumulative")
    protected BigDecimal ownershipRightCumulative;
    @XmlElement(name = "BoardOfDirectorsRemunerationCumulative")
    protected BigDecimal boardOfDirectorsRemunerationCumulative;
    @XmlElement(name = "FamilyIncomeCumulative")
    protected BigDecimal familyIncomeCumulative;
    @XmlElement(name = "ChargesEffectiveCumulative")
    protected BigDecimal chargesEffectiveCumulative;
    @XmlElement(name = "ChargesLumpSumCumulative")
    protected BigDecimal chargesLumpSumCumulative;
    @XmlElement(name = "GrantTaxAtSourceCode")
    protected EmptyType grantTaxAtSourceCode;
    @XmlElement(name = "WorkDaysCumulativeCH")
    @XmlSchemaType(name = "integer")
    protected Integer workDaysCumulativeCH;
    @XmlAttribute(name = "lastWorkplaceIDRef", required = true)
    protected String lastWorkplaceIDRef;

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
     * Recupera il valore della proprietà lastTax.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastTax() {
        return lastTax;
    }

    /**
     * Imposta il valore della proprietà lastTax.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastTax(BigDecimal value) {
        this.lastTax = value;
    }

    /**
     * Recupera il valore della proprietà taxableEarningCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableEarningCumulative() {
        return taxableEarningCumulative;
    }

    /**
     * Imposta il valore della proprietà taxableEarningCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableEarningCumulative(BigDecimal value) {
        this.taxableEarningCumulative = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAtSourceCumulative() {
        return taxAtSourceCumulative;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAtSourceCumulative(BigDecimal value) {
        this.taxAtSourceCumulative = value;
    }

    /**
     * Recupera il valore della proprietà churchTaxCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChurchTaxCumulative() {
        return churchTaxCumulative;
    }

    /**
     * Imposta il valore della proprietà churchTaxCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChurchTaxCumulative(BigDecimal value) {
        this.churchTaxCumulative = value;
    }

    /**
     * Recupera il valore della proprietà terminationPayCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTerminationPayCumulative() {
        return terminationPayCumulative;
    }

    /**
     * Imposta il valore della proprietà terminationPayCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTerminationPayCumulative(BigDecimal value) {
        this.terminationPayCumulative = value;
    }

    /**
     * Recupera il valore della proprietà sporadicBenefitsCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSporadicBenefitsCumulative() {
        return sporadicBenefitsCumulative;
    }

    /**
     * Imposta il valore della proprietà sporadicBenefitsCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSporadicBenefitsCumulative(BigDecimal value) {
        this.sporadicBenefitsCumulative = value;
    }

    /**
     * Recupera il valore della proprietà ownershipRightCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnershipRightCumulative() {
        return ownershipRightCumulative;
    }

    /**
     * Imposta il valore della proprietà ownershipRightCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnershipRightCumulative(BigDecimal value) {
        this.ownershipRightCumulative = value;
    }

    /**
     * Recupera il valore della proprietà boardOfDirectorsRemunerationCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoardOfDirectorsRemunerationCumulative() {
        return boardOfDirectorsRemunerationCumulative;
    }

    /**
     * Imposta il valore della proprietà boardOfDirectorsRemunerationCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoardOfDirectorsRemunerationCumulative(BigDecimal value) {
        this.boardOfDirectorsRemunerationCumulative = value;
    }

    /**
     * Recupera il valore della proprietà familyIncomeCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFamilyIncomeCumulative() {
        return familyIncomeCumulative;
    }

    /**
     * Imposta il valore della proprietà familyIncomeCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFamilyIncomeCumulative(BigDecimal value) {
        this.familyIncomeCumulative = value;
    }

    /**
     * Recupera il valore della proprietà chargesEffectiveCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargesEffectiveCumulative() {
        return chargesEffectiveCumulative;
    }

    /**
     * Imposta il valore della proprietà chargesEffectiveCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargesEffectiveCumulative(BigDecimal value) {
        this.chargesEffectiveCumulative = value;
    }

    /**
     * Recupera il valore della proprietà chargesLumpSumCumulative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargesLumpSumCumulative() {
        return chargesLumpSumCumulative;
    }

    /**
     * Imposta il valore della proprietà chargesLumpSumCumulative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargesLumpSumCumulative(BigDecimal value) {
        this.chargesLumpSumCumulative = value;
    }

    /**
     * Recupera il valore della proprietà grantTaxAtSourceCode.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getGrantTaxAtSourceCode() {
        return grantTaxAtSourceCode;
    }

    /**
     * Imposta il valore della proprietà grantTaxAtSourceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setGrantTaxAtSourceCode(EmptyType value) {
        this.grantTaxAtSourceCode = value;
    }

    /**
     * Recupera il valore della proprietà workDaysCumulativeCH.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkDaysCumulativeCH() {
        return workDaysCumulativeCH;
    }

    /**
     * Imposta il valore della proprietà workDaysCumulativeCH.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkDaysCumulativeCH(Integer value) {
        this.workDaysCumulativeCH = value;
    }

    /**
     * Recupera il valore della proprietà lastWorkplaceIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastWorkplaceIDRef() {
        return lastWorkplaceIDRef;
    }

    /**
     * Imposta il valore della proprietà lastWorkplaceIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastWorkplaceIDRef(String value) {
        this.lastWorkplaceIDRef = value;
    }

}
