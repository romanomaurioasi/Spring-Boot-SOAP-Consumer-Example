
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
 * <p>Classe Java per TableAIncomeLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableAIncomeLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FormularRowBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcquisitionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ExpiryDateBlockingPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ReductionIncomePercentage" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOwnershipsAcquired" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="MarketValueAtAcquisitionDate" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *           &lt;element name="MarketValueFormula" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DurationObligationToReturn" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="AcquisitionPricePerParticipation" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="MonetaryValuesServicesPerShare" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="MonetaryValuesServicesTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="CurrencyRate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType"/&gt;
 *         &lt;element name="IncomeDeclaredInSalaryCertificate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableAIncomeLineType", propOrder = {
    "acquisitionDate",
    "expiryDateBlockingPeriod",
    "reductionIncomePercentage",
    "numberOfOwnershipsAcquired",
    "marketValueAtAcquisitionDate",
    "marketValueFormula",
    "formula",
    "durationObligationToReturn",
    "acquisitionPricePerParticipation",
    "monetaryValuesServicesPerShare",
    "monetaryValuesServicesTotal",
    "currencyRate",
    "incomeDeclaredInSalaryCertificate"
})
public class TableAIncomeLineType
    extends FormularRowBaseType
{

    @XmlElement(name = "AcquisitionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acquisitionDate;
    @XmlElement(name = "ExpiryDateBlockingPeriod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDateBlockingPeriod;
    @XmlElement(name = "ReductionIncomePercentage")
    protected BigDecimal reductionIncomePercentage;
    @XmlElement(name = "NumberOfOwnershipsAcquired", required = true)
    protected BigInteger numberOfOwnershipsAcquired;
    @XmlElement(name = "MarketValueAtAcquisitionDate")
    protected BigDecimal marketValueAtAcquisitionDate;
    @XmlElement(name = "MarketValueFormula")
    protected BigDecimal marketValueFormula;
    @XmlElement(name = "Formula")
    protected String formula;
    @XmlElement(name = "DurationObligationToReturn")
    protected BigDecimal durationObligationToReturn;
    @XmlElement(name = "AcquisitionPricePerParticipation", required = true)
    protected BigDecimal acquisitionPricePerParticipation;
    @XmlElement(name = "MonetaryValuesServicesPerShare")
    protected BigDecimal monetaryValuesServicesPerShare;
    @XmlElement(name = "MonetaryValuesServicesTotal", required = true)
    protected BigDecimal monetaryValuesServicesTotal;
    @XmlElement(name = "CurrencyRate", required = true)
    protected BigDecimal currencyRate;
    @XmlElement(name = "IncomeDeclaredInSalaryCertificate", required = true)
    protected BigDecimal incomeDeclaredInSalaryCertificate;

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
     * Recupera il valore della proprietà marketValueAtAcquisitionDate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketValueAtAcquisitionDate() {
        return marketValueAtAcquisitionDate;
    }

    /**
     * Imposta il valore della proprietà marketValueAtAcquisitionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketValueAtAcquisitionDate(BigDecimal value) {
        this.marketValueAtAcquisitionDate = value;
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
     * Recupera il valore della proprietà acquisitionPricePerParticipation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquisitionPricePerParticipation() {
        return acquisitionPricePerParticipation;
    }

    /**
     * Imposta il valore della proprietà acquisitionPricePerParticipation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquisitionPricePerParticipation(BigDecimal value) {
        this.acquisitionPricePerParticipation = value;
    }

    /**
     * Recupera il valore della proprietà monetaryValuesServicesPerShare.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryValuesServicesPerShare() {
        return monetaryValuesServicesPerShare;
    }

    /**
     * Imposta il valore della proprietà monetaryValuesServicesPerShare.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryValuesServicesPerShare(BigDecimal value) {
        this.monetaryValuesServicesPerShare = value;
    }

    /**
     * Recupera il valore della proprietà monetaryValuesServicesTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryValuesServicesTotal() {
        return monetaryValuesServicesTotal;
    }

    /**
     * Imposta il valore della proprietà monetaryValuesServicesTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryValuesServicesTotal(BigDecimal value) {
        this.monetaryValuesServicesTotal = value;
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
     * Recupera il valore della proprietà incomeDeclaredInSalaryCertificate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncomeDeclaredInSalaryCertificate() {
        return incomeDeclaredInSalaryCertificate;
    }

    /**
     * Imposta il valore della proprietà incomeDeclaredInSalaryCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncomeDeclaredInSalaryCertificate(BigDecimal value) {
        this.incomeDeclaredInSalaryCertificate = value;
    }

}
