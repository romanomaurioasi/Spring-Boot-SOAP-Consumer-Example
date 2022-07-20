
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per TaxAtSourceTotalsBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceTotalsBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="TotalTaxableEarning" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="TotalTaxAtSource" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="TotalCommission" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceTotalsBaseType", propOrder = {
    "currentMonth",
    "month",
    "period",
    "totalTaxableEarning",
    "totalTaxAtSource",
    "totalCommission"
})
@XmlSeeAlso({
    TaxAtSourceTotalsMonthType.class,
    TaxAtSourceTotalsCorrectionMonthType.class,
    TaxAtSourceTotalsPeriodType.class
})
public class TaxAtSourceTotalsBaseType {

    @XmlElement(name = "CurrentMonth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar currentMonth;
    @XmlElement(name = "Month")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar month;
    @XmlElement(name = "Period")
    protected TimePeriodType period;
    @XmlElement(name = "TotalTaxableEarning", required = true)
    protected BigDecimal totalTaxableEarning;
    @XmlElement(name = "TotalTaxAtSource", required = true)
    protected BigDecimal totalTaxAtSource;
    @XmlElement(name = "TotalCommission", required = true)
    protected BigDecimal totalCommission;

    /**
     * Recupera il valore della proprietà currentMonth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentMonth() {
        return currentMonth;
    }

    /**
     * Imposta il valore della proprietà currentMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentMonth(XMLGregorianCalendar value) {
        this.currentMonth = value;
    }

    /**
     * Recupera il valore della proprietà month.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonth() {
        return month;
    }

    /**
     * Imposta il valore della proprietà month.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonth(XMLGregorianCalendar value) {
        this.month = value;
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
     * Recupera il valore della proprietà totalTaxableEarning.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxableEarning() {
        return totalTaxableEarning;
    }

    /**
     * Imposta il valore della proprietà totalTaxableEarning.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxableEarning(BigDecimal value) {
        this.totalTaxableEarning = value;
    }

    /**
     * Recupera il valore della proprietà totalTaxAtSource.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxAtSource() {
        return totalTaxAtSource;
    }

    /**
     * Imposta il valore della proprietà totalTaxAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxAtSource(BigDecimal value) {
        this.totalTaxAtSource = value;
    }

    /**
     * Recupera il valore della proprietà totalCommission.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    /**
     * Imposta il valore della proprietà totalCommission.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCommission(BigDecimal value) {
        this.totalCommission = value;
    }

}
