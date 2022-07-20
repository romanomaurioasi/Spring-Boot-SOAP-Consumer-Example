
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per KindOfWagePaymentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KindOfWagePaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Monthly" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticMonthlyType"/&gt;
 *         &lt;element name="Hourly" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticHourlyType"/&gt;
 *         &lt;element name="NoTimeConstraint" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}NoTimeConstraintType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KindOfWagePaymentType", propOrder = {
    "monthly",
    "hourly",
    "noTimeConstraint"
})
public class KindOfWagePaymentType {

    @XmlElement(name = "Monthly")
    protected StatisticMonthlyType monthly;
    @XmlElement(name = "Hourly")
    protected StatisticHourlyType hourly;
    @XmlElement(name = "NoTimeConstraint")
    protected NoTimeConstraintType noTimeConstraint;

    /**
     * Recupera il valore della proprietà monthly.
     * 
     * @return
     *     possible object is
     *     {@link StatisticMonthlyType }
     *     
     */
    public StatisticMonthlyType getMonthly() {
        return monthly;
    }

    /**
     * Imposta il valore della proprietà monthly.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticMonthlyType }
     *     
     */
    public void setMonthly(StatisticMonthlyType value) {
        this.monthly = value;
    }

    /**
     * Recupera il valore della proprietà hourly.
     * 
     * @return
     *     possible object is
     *     {@link StatisticHourlyType }
     *     
     */
    public StatisticHourlyType getHourly() {
        return hourly;
    }

    /**
     * Imposta il valore della proprietà hourly.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticHourlyType }
     *     
     */
    public void setHourly(StatisticHourlyType value) {
        this.hourly = value;
    }

    /**
     * Recupera il valore della proprietà noTimeConstraint.
     * 
     * @return
     *     possible object is
     *     {@link NoTimeConstraintType }
     *     
     */
    public NoTimeConstraintType getNoTimeConstraint() {
        return noTimeConstraint;
    }

    /**
     * Imposta il valore della proprietà noTimeConstraint.
     * 
     * @param value
     *     allowed object is
     *     {@link NoTimeConstraintType }
     *     
     */
    public void setNoTimeConstraint(NoTimeConstraintType value) {
        this.noTimeConstraint = value;
    }

}
