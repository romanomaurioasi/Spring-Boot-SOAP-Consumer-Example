
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per TableCIncomeLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableCIncomeLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FormularRowBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RealizationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="NumberOfOwnershipsRealizedDuringPeriod" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="GrantDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="VestingDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PotentialExercisePrice" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="MarketValueAtTimeOfRealization" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *           &lt;element name="MarketValueFormula" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ExpiryDateOfPossibleBlockingPeriodOfSharesHeld" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DurationBlockingPeriod" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="ReductionIncomePercentage" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="IncomeTimeOfRealisation" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="CurrencyRateAtRealization" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType"/&gt;
 *         &lt;element name="TotalIncomeAtRealization" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *         &lt;element name="PartInCH-Percentage" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType"/&gt;
 *         &lt;element name="PartIncomeCH" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *         &lt;element name="PartIncomeAbroad" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableCIncomeLineType", propOrder = {
    "realizationDate",
    "numberOfOwnershipsRealizedDuringPeriod",
    "grantDate",
    "vestingDate",
    "potentialExercisePrice",
    "marketValueAtTimeOfRealization",
    "marketValueFormula",
    "expiryDateOfPossibleBlockingPeriodOfSharesHeld",
    "durationBlockingPeriod",
    "reductionIncomePercentage",
    "incomeTimeOfRealisation",
    "currencyRateAtRealization",
    "totalIncomeAtRealization",
    "partInCHPercentage",
    "partIncomeCH",
    "partIncomeAbroad"
})
public class TableCIncomeLineType
    extends FormularRowBaseType
{

    @XmlElement(name = "RealizationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar realizationDate;
    @XmlElement(name = "NumberOfOwnershipsRealizedDuringPeriod", required = true)
    protected BigInteger numberOfOwnershipsRealizedDuringPeriod;
    @XmlElement(name = "GrantDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar grantDate;
    @XmlElement(name = "VestingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vestingDate;
    @XmlElement(name = "PotentialExercisePrice", required = true)
    protected BigDecimal potentialExercisePrice;
    @XmlElement(name = "MarketValueAtTimeOfRealization")
    protected BigDecimal marketValueAtTimeOfRealization;
    @XmlElement(name = "MarketValueFormula")
    protected BigDecimal marketValueFormula;
    @XmlElement(name = "ExpiryDateOfPossibleBlockingPeriodOfSharesHeld")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDateOfPossibleBlockingPeriodOfSharesHeld;
    @XmlElement(name = "DurationBlockingPeriod")
    protected BigDecimal durationBlockingPeriod;
    @XmlElement(name = "ReductionIncomePercentage")
    protected BigDecimal reductionIncomePercentage;
    @XmlElement(name = "IncomeTimeOfRealisation", required = true)
    protected BigDecimal incomeTimeOfRealisation;
    @XmlElement(name = "CurrencyRateAtRealization", required = true)
    protected BigDecimal currencyRateAtRealization;
    @XmlElement(name = "TotalIncomeAtRealization", required = true)
    protected BigDecimal totalIncomeAtRealization;
    @XmlElement(name = "PartInCH-Percentage", required = true)
    protected BigDecimal partInCHPercentage;
    @XmlElement(name = "PartIncomeCH", required = true)
    protected BigDecimal partIncomeCH;
    @XmlElement(name = "PartIncomeAbroad", required = true)
    protected BigDecimal partIncomeAbroad;

    /**
     * Recupera il valore della proprietà realizationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealizationDate() {
        return realizationDate;
    }

    /**
     * Imposta il valore della proprietà realizationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealizationDate(XMLGregorianCalendar value) {
        this.realizationDate = value;
    }

    /**
     * Recupera il valore della proprietà numberOfOwnershipsRealizedDuringPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOwnershipsRealizedDuringPeriod() {
        return numberOfOwnershipsRealizedDuringPeriod;
    }

    /**
     * Imposta il valore della proprietà numberOfOwnershipsRealizedDuringPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOwnershipsRealizedDuringPeriod(BigInteger value) {
        this.numberOfOwnershipsRealizedDuringPeriod = value;
    }

    /**
     * Recupera il valore della proprietà grantDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGrantDate() {
        return grantDate;
    }

    /**
     * Imposta il valore della proprietà grantDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGrantDate(XMLGregorianCalendar value) {
        this.grantDate = value;
    }

    /**
     * Recupera il valore della proprietà vestingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVestingDate() {
        return vestingDate;
    }

    /**
     * Imposta il valore della proprietà vestingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVestingDate(XMLGregorianCalendar value) {
        this.vestingDate = value;
    }

    /**
     * Recupera il valore della proprietà potentialExercisePrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPotentialExercisePrice() {
        return potentialExercisePrice;
    }

    /**
     * Imposta il valore della proprietà potentialExercisePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPotentialExercisePrice(BigDecimal value) {
        this.potentialExercisePrice = value;
    }

    /**
     * Recupera il valore della proprietà marketValueAtTimeOfRealization.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketValueAtTimeOfRealization() {
        return marketValueAtTimeOfRealization;
    }

    /**
     * Imposta il valore della proprietà marketValueAtTimeOfRealization.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketValueAtTimeOfRealization(BigDecimal value) {
        this.marketValueAtTimeOfRealization = value;
    }

    /**
     * Recupera il valore della proprietà marketValueFormula.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketValueFormula() {
        return marketValueFormula;
    }

    /**
     * Imposta il valore della proprietà marketValueFormula.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketValueFormula(BigDecimal value) {
        this.marketValueFormula = value;
    }

    /**
     * Recupera il valore della proprietà expiryDateOfPossibleBlockingPeriodOfSharesHeld.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateOfPossibleBlockingPeriodOfSharesHeld() {
        return expiryDateOfPossibleBlockingPeriodOfSharesHeld;
    }

    /**
     * Imposta il valore della proprietà expiryDateOfPossibleBlockingPeriodOfSharesHeld.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateOfPossibleBlockingPeriodOfSharesHeld(XMLGregorianCalendar value) {
        this.expiryDateOfPossibleBlockingPeriodOfSharesHeld = value;
    }

    /**
     * Recupera il valore della proprietà durationBlockingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDurationBlockingPeriod() {
        return durationBlockingPeriod;
    }

    /**
     * Imposta il valore della proprietà durationBlockingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDurationBlockingPeriod(BigDecimal value) {
        this.durationBlockingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà reductionIncomePercentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReductionIncomePercentage() {
        return reductionIncomePercentage;
    }

    /**
     * Imposta il valore della proprietà reductionIncomePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReductionIncomePercentage(BigDecimal value) {
        this.reductionIncomePercentage = value;
    }

    /**
     * Recupera il valore della proprietà incomeTimeOfRealisation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncomeTimeOfRealisation() {
        return incomeTimeOfRealisation;
    }

    /**
     * Imposta il valore della proprietà incomeTimeOfRealisation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncomeTimeOfRealisation(BigDecimal value) {
        this.incomeTimeOfRealisation = value;
    }

    /**
     * Recupera il valore della proprietà currencyRateAtRealization.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRateAtRealization() {
        return currencyRateAtRealization;
    }

    /**
     * Imposta il valore della proprietà currencyRateAtRealization.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRateAtRealization(BigDecimal value) {
        this.currencyRateAtRealization = value;
    }

    /**
     * Recupera il valore della proprietà totalIncomeAtRealization.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalIncomeAtRealization() {
        return totalIncomeAtRealization;
    }

    /**
     * Imposta il valore della proprietà totalIncomeAtRealization.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalIncomeAtRealization(BigDecimal value) {
        this.totalIncomeAtRealization = value;
    }

    /**
     * Recupera il valore della proprietà partInCHPercentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartInCHPercentage() {
        return partInCHPercentage;
    }

    /**
     * Imposta il valore della proprietà partInCHPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartInCHPercentage(BigDecimal value) {
        this.partInCHPercentage = value;
    }

    /**
     * Recupera il valore della proprietà partIncomeCH.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartIncomeCH() {
        return partIncomeCH;
    }

    /**
     * Imposta il valore della proprietà partIncomeCH.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartIncomeCH(BigDecimal value) {
        this.partIncomeCH = value;
    }

    /**
     * Recupera il valore della proprietà partIncomeAbroad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartIncomeAbroad() {
        return partIncomeAbroad;
    }

    /**
     * Imposta il valore della proprietà partIncomeAbroad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartIncomeAbroad(BigDecimal value) {
        this.partIncomeAbroad = value;
    }

}
