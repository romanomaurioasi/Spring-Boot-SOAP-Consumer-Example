
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per AnnualValuesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AnnualValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="Overtime" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="Earnings13th" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="SporadicBenefits" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="FringeBenefits" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="CapitalPayment" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="OtherBenefits" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnualValuesType", propOrder = {
    "period",
    "overtime",
    "earnings13Th",
    "sporadicBenefits",
    "fringeBenefits",
    "capitalPayment",
    "otherBenefits"
})
public class AnnualValuesType {

    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
    @XmlElement(name = "Overtime", required = true)
    protected BigDecimal overtime;
    @XmlElement(name = "Earnings13th", required = true)
    protected BigDecimal earnings13Th;
    @XmlElement(name = "SporadicBenefits", required = true)
    protected BigDecimal sporadicBenefits;
    @XmlElement(name = "FringeBenefits", required = true)
    protected BigDecimal fringeBenefits;
    @XmlElement(name = "CapitalPayment", required = true)
    protected BigDecimal capitalPayment;
    @XmlElement(name = "OtherBenefits", required = true)
    protected BigDecimal otherBenefits;

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

}
