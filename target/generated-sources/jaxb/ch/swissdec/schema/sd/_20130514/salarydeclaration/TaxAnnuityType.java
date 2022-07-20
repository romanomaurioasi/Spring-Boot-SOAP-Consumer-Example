
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAnnuityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAnnuityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TimePeriodType"/&gt;
 *         &lt;element name="Income" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="GrossIncome" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="NetIncome" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAnnuityType", propOrder = {
    "period",
    "income",
    "grossIncome",
    "netIncome"
})
public class TaxAnnuityType {

    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
    @XmlElement(name = "Income", required = true)
    protected BigDecimal income;
    @XmlElement(name = "GrossIncome", required = true)
    protected BigDecimal grossIncome;
    @XmlElement(name = "NetIncome", required = true)
    protected BigDecimal netIncome;

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

}
