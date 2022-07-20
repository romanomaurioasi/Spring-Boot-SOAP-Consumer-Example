
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per SplitsTypes complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SplitsTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SplitCurrentYearIncome" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountAbsoluteType"/&gt;
 *         &lt;element name="SplitPreviousYear" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Period" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *                   &lt;element name="Income" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitsTypes", propOrder = {
    "splitCurrentYearIncome",
    "splitPreviousYear"
})
public class SplitsTypes {

    @XmlElement(name = "SplitCurrentYearIncome", required = true)
    protected BigDecimal splitCurrentYearIncome;
    @XmlElement(name = "SplitPreviousYear", required = true)
    protected List<SplitsTypes.SplitPreviousYear> splitPreviousYear;

    /**
     * Recupera il valore della proprietà splitCurrentYearIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSplitCurrentYearIncome() {
        return splitCurrentYearIncome;
    }

    /**
     * Imposta il valore della proprietà splitCurrentYearIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSplitCurrentYearIncome(BigDecimal value) {
        this.splitCurrentYearIncome = value;
    }

    /**
     * Gets the value of the splitPreviousYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitPreviousYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitPreviousYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitsTypes.SplitPreviousYear }
     * 
     * 
     */
    public List<SplitsTypes.SplitPreviousYear> getSplitPreviousYear() {
        if (splitPreviousYear == null) {
            splitPreviousYear = new ArrayList<SplitsTypes.SplitPreviousYear>();
        }
        return this.splitPreviousYear;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
     *         &lt;element name="Income" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "period",
        "income"
    })
    public static class SplitPreviousYear {

        @XmlElement(name = "Period", required = true)
        protected TimePeriodType period;
        @XmlElement(name = "Income", required = true)
        protected BigDecimal income;

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

    }

}
