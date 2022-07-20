
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
 * <p>Classe Java per TableAWealthLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableAWealthLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FormularRowBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcquisitionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ExpiryDateBlockingPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DurationOfRemainingBlockingPeriod" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="ReductionAssetPercentage" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}ThreeDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOwnershipsAcquired" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DurationObligationToReturn" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOwnershipsAtEndOfPeriod" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="MarketValueAtEndOfPeriod" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *           &lt;element name="MarketValueFormula" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DiscountedMarketValue" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalValueExpected" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="CurrencyRate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType"/&gt;
 *         &lt;element name="TaxableWealthInCH" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableAWealthLineType", propOrder = {
    "acquisitionDate",
    "expiryDateBlockingPeriod",
    "durationOfRemainingBlockingPeriod",
    "reductionAssetPercentage",
    "numberOfOwnershipsAcquired",
    "durationObligationToReturn",
    "numberOfOwnershipsAtEndOfPeriod",
    "marketValueAtEndOfPeriod",
    "marketValueFormula",
    "discountedMarketValue",
    "totalValueExpected",
    "currencyRate",
    "taxableWealthInCH"
})
public class TableAWealthLineType
    extends FormularRowBaseType
{

    @XmlElement(name = "AcquisitionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acquisitionDate;
    @XmlElement(name = "ExpiryDateBlockingPeriod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDateBlockingPeriod;
    @XmlElement(name = "DurationOfRemainingBlockingPeriod")
    protected BigDecimal durationOfRemainingBlockingPeriod;
    @XmlElement(name = "ReductionAssetPercentage")
    protected BigDecimal reductionAssetPercentage;
    @XmlElement(name = "NumberOfOwnershipsAcquired")
    protected BigInteger numberOfOwnershipsAcquired;
    @XmlElement(name = "DurationObligationToReturn")
    protected BigDecimal durationObligationToReturn;
    @XmlElement(name = "NumberOfOwnershipsAtEndOfPeriod", required = true)
    protected BigInteger numberOfOwnershipsAtEndOfPeriod;
    @XmlElement(name = "MarketValueAtEndOfPeriod")
    protected BigDecimal marketValueAtEndOfPeriod;
    @XmlElement(name = "MarketValueFormula")
    protected BigDecimal marketValueFormula;
    @XmlElement(name = "DiscountedMarketValue")
    protected BigDecimal discountedMarketValue;
    @XmlElement(name = "TotalValueExpected", required = true)
    protected BigDecimal totalValueExpected;
    @XmlElement(name = "CurrencyRate", required = true)
    protected BigDecimal currencyRate;
    @XmlElement(name = "TaxableWealthInCH", required = true)
    protected BigDecimal taxableWealthInCH;

    /**
     * Recupera il valore della proprietà acquisitionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquisitionDate() {
        return acquisitionDate;
    }

    /**
     * Imposta il valore della proprietà acquisitionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquisitionDate(XMLGregorianCalendar value) {
        this.acquisitionDate = value;
    }

    /**
     * Recupera il valore della proprietà expiryDateBlockingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateBlockingPeriod() {
        return expiryDateBlockingPeriod;
    }

    /**
     * Imposta il valore della proprietà expiryDateBlockingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateBlockingPeriod(XMLGregorianCalendar value) {
        this.expiryDateBlockingPeriod = value;
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
     * Recupera il valore della proprietà numberOfOwnershipsAcquired.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOwnershipsAcquired() {
        return numberOfOwnershipsAcquired;
    }

    /**
     * Imposta il valore della proprietà numberOfOwnershipsAcquired.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOwnershipsAcquired(BigInteger value) {
        this.numberOfOwnershipsAcquired = value;
    }

    /**
     * Recupera il valore della proprietà durationObligationToReturn.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDurationObligationToReturn() {
        return durationObligationToReturn;
    }

    /**
     * Imposta il valore della proprietà durationObligationToReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDurationObligationToReturn(BigDecimal value) {
        this.durationObligationToReturn = value;
    }

    /**
     * Recupera il valore della proprietà numberOfOwnershipsAtEndOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOwnershipsAtEndOfPeriod() {
        return numberOfOwnershipsAtEndOfPeriod;
    }

    /**
     * Imposta il valore della proprietà numberOfOwnershipsAtEndOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOwnershipsAtEndOfPeriod(BigInteger value) {
        this.numberOfOwnershipsAtEndOfPeriod = value;
    }

    /**
     * Recupera il valore della proprietà marketValueAtEndOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketValueAtEndOfPeriod() {
        return marketValueAtEndOfPeriod;
    }

    /**
     * Imposta il valore della proprietà marketValueAtEndOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketValueAtEndOfPeriod(BigDecimal value) {
        this.marketValueAtEndOfPeriod = value;
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
     * Recupera il valore della proprietà discountedMarketValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountedMarketValue() {
        return discountedMarketValue;
    }

    /**
     * Imposta il valore della proprietà discountedMarketValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountedMarketValue(BigDecimal value) {
        this.discountedMarketValue = value;
    }

    /**
     * Recupera il valore della proprietà totalValueExpected.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValueExpected() {
        return totalValueExpected;
    }

    /**
     * Imposta il valore della proprietà totalValueExpected.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValueExpected(BigDecimal value) {
        this.totalValueExpected = value;
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
     * Recupera il valore della proprietà taxableWealthInCH.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableWealthInCH() {
        return taxableWealthInCH;
    }

    /**
     * Imposta il valore della proprietà taxableWealthInCH.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableWealthInCH(BigDecimal value) {
        this.taxableWealthInCH = value;
    }

}
