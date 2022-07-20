
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
 * <p>Classe Java per TableBLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableBLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FormularRowBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpiryDateBeforeReleaseBlockingPeriod" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="NumberOfOwnershipsUnlockedOrReturned" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="MarketValueAtTimeOfUnlockingOrRestitution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *           &lt;element name="MarketValueFormula" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestitutionPrice" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="AcquisitionDateOfShare" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OriginalExpiryDateBlockingPeriod" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DurationOfRemainingBlockingPeriod" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="ReductionAssetPercentage" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType"/&gt;
 *         &lt;element name="ReducedMarketValue" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="MonetaryValuesAdvantagesPerShare" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="MonetaryValuesAdvantagesTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="CurrencyRate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType"/&gt;
 *         &lt;element name="TaxableIncomeOrFiscaleDeduction" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableBLineType", propOrder = {
    "expiryDateBeforeReleaseBlockingPeriod",
    "numberOfOwnershipsUnlockedOrReturned",
    "marketValueAtTimeOfUnlockingOrRestitution",
    "marketValueFormula",
    "formula",
    "restitutionPrice",
    "acquisitionDateOfShare",
    "originalExpiryDateBlockingPeriod",
    "durationOfRemainingBlockingPeriod",
    "reductionAssetPercentage",
    "reducedMarketValue",
    "monetaryValuesAdvantagesPerShare",
    "monetaryValuesAdvantagesTotal",
    "currencyRate",
    "taxableIncomeOrFiscaleDeduction"
})
public class TableBLineType
    extends FormularRowBaseType
{

    @XmlElement(name = "ExpiryDateBeforeReleaseBlockingPeriod", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDateBeforeReleaseBlockingPeriod;
    @XmlElement(name = "NumberOfOwnershipsUnlockedOrReturned", required = true)
    protected BigInteger numberOfOwnershipsUnlockedOrReturned;
    @XmlElement(name = "MarketValueAtTimeOfUnlockingOrRestitution")
    protected BigDecimal marketValueAtTimeOfUnlockingOrRestitution;
    @XmlElement(name = "MarketValueFormula")
    protected BigDecimal marketValueFormula;
    @XmlElement(name = "Formula")
    protected String formula;
    @XmlElement(name = "RestitutionPrice", required = true)
    protected BigDecimal restitutionPrice;
    @XmlElement(name = "AcquisitionDateOfShare")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acquisitionDateOfShare;
    @XmlElement(name = "OriginalExpiryDateBlockingPeriod", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalExpiryDateBlockingPeriod;
    @XmlElement(name = "DurationOfRemainingBlockingPeriod")
    protected BigDecimal durationOfRemainingBlockingPeriod;
    @XmlElement(name = "ReductionAssetPercentage", required = true)
    protected BigDecimal reductionAssetPercentage;
    @XmlElement(name = "ReducedMarketValue")
    protected BigDecimal reducedMarketValue;
    @XmlElement(name = "MonetaryValuesAdvantagesPerShare", required = true)
    protected BigDecimal monetaryValuesAdvantagesPerShare;
    @XmlElement(name = "MonetaryValuesAdvantagesTotal", required = true)
    protected BigDecimal monetaryValuesAdvantagesTotal;
    @XmlElement(name = "CurrencyRate", required = true)
    protected BigDecimal currencyRate;
    @XmlElement(name = "TaxableIncomeOrFiscaleDeduction", required = true)
    protected BigDecimal taxableIncomeOrFiscaleDeduction;

    /**
     * Recupera il valore della proprietà expiryDateBeforeReleaseBlockingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateBeforeReleaseBlockingPeriod() {
        return expiryDateBeforeReleaseBlockingPeriod;
    }

    /**
     * Imposta il valore della proprietà expiryDateBeforeReleaseBlockingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateBeforeReleaseBlockingPeriod(XMLGregorianCalendar value) {
        this.expiryDateBeforeReleaseBlockingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà numberOfOwnershipsUnlockedOrReturned.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOwnershipsUnlockedOrReturned() {
        return numberOfOwnershipsUnlockedOrReturned;
    }

    /**
     * Imposta il valore della proprietà numberOfOwnershipsUnlockedOrReturned.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOwnershipsUnlockedOrReturned(BigInteger value) {
        this.numberOfOwnershipsUnlockedOrReturned = value;
    }

    /**
     * Recupera il valore della proprietà marketValueAtTimeOfUnlockingOrRestitution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketValueAtTimeOfUnlockingOrRestitution() {
        return marketValueAtTimeOfUnlockingOrRestitution;
    }

    /**
     * Imposta il valore della proprietà marketValueAtTimeOfUnlockingOrRestitution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketValueAtTimeOfUnlockingOrRestitution(BigDecimal value) {
        this.marketValueAtTimeOfUnlockingOrRestitution = value;
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
     * Recupera il valore della proprietà formula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Imposta il valore della proprietà formula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Recupera il valore della proprietà restitutionPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestitutionPrice() {
        return restitutionPrice;
    }

    /**
     * Imposta il valore della proprietà restitutionPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestitutionPrice(BigDecimal value) {
        this.restitutionPrice = value;
    }

    /**
     * Recupera il valore della proprietà acquisitionDateOfShare.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquisitionDateOfShare() {
        return acquisitionDateOfShare;
    }

    /**
     * Imposta il valore della proprietà acquisitionDateOfShare.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquisitionDateOfShare(XMLGregorianCalendar value) {
        this.acquisitionDateOfShare = value;
    }

    /**
     * Recupera il valore della proprietà originalExpiryDateBlockingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalExpiryDateBlockingPeriod() {
        return originalExpiryDateBlockingPeriod;
    }

    /**
     * Imposta il valore della proprietà originalExpiryDateBlockingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalExpiryDateBlockingPeriod(XMLGregorianCalendar value) {
        this.originalExpiryDateBlockingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà durationOfRemainingBlockingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDurationOfRemainingBlockingPeriod() {
        return durationOfRemainingBlockingPeriod;
    }

    /**
     * Imposta il valore della proprietà durationOfRemainingBlockingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDurationOfRemainingBlockingPeriod(BigDecimal value) {
        this.durationOfRemainingBlockingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà reductionAssetPercentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReductionAssetPercentage() {
        return reductionAssetPercentage;
    }

    /**
     * Imposta il valore della proprietà reductionAssetPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReductionAssetPercentage(BigDecimal value) {
        this.reductionAssetPercentage = value;
    }

    /**
     * Recupera il valore della proprietà reducedMarketValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReducedMarketValue() {
        return reducedMarketValue;
    }

    /**
     * Imposta il valore della proprietà reducedMarketValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReducedMarketValue(BigDecimal value) {
        this.reducedMarketValue = value;
    }

    /**
     * Recupera il valore della proprietà monetaryValuesAdvantagesPerShare.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryValuesAdvantagesPerShare() {
        return monetaryValuesAdvantagesPerShare;
    }

    /**
     * Imposta il valore della proprietà monetaryValuesAdvantagesPerShare.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryValuesAdvantagesPerShare(BigDecimal value) {
        this.monetaryValuesAdvantagesPerShare = value;
    }

    /**
     * Recupera il valore della proprietà monetaryValuesAdvantagesTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryValuesAdvantagesTotal() {
        return monetaryValuesAdvantagesTotal;
    }

    /**
     * Imposta il valore della proprietà monetaryValuesAdvantagesTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryValuesAdvantagesTotal(BigDecimal value) {
        this.monetaryValuesAdvantagesTotal = value;
    }

    /**
     * Recupera il valore della proprietà currencyRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Imposta il valore della proprietà currencyRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRate(BigDecimal value) {
        this.currencyRate = value;
    }

    /**
     * Recupera il valore della proprietà taxableIncomeOrFiscaleDeduction.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableIncomeOrFiscaleDeduction() {
        return taxableIncomeOrFiscaleDeduction;
    }

    /**
     * Imposta il valore della proprietà taxableIncomeOrFiscaleDeduction.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableIncomeOrFiscaleDeduction(BigDecimal value) {
        this.taxableIncomeOrFiscaleDeduction = value;
    }

}
