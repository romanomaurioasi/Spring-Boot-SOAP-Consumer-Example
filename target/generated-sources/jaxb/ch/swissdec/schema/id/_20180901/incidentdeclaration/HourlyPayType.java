
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per HourlyPayType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HourlyPayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HourlySalary" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *         &lt;element name="Earnings13th" type="{http://www.swissdec.ch/schema/common/20180901/Common}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="VacationAndPublicHolidayCompensation" type="{http://www.swissdec.ch/schema/common/20180901/Common}PercentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourlyPayType", propOrder = {
    "hourlySalary",
    "earnings13Th",
    "vacationAndPublicHolidayCompensation"
})
public class HourlyPayType {

    @XmlElement(name = "HourlySalary", required = true)
    protected BigDecimal hourlySalary;
    @XmlElement(name = "Earnings13th")
    protected BigDecimal earnings13Th;
    @XmlElement(name = "VacationAndPublicHolidayCompensation")
    protected BigDecimal vacationAndPublicHolidayCompensation;

    /**
     * Recupera il valore della proprietà hourlySalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHourlySalary() {
        return hourlySalary;
    }

    /**
     * Imposta il valore della proprietà hourlySalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHourlySalary(BigDecimal value) {
        this.hourlySalary = value;
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
     * Recupera il valore della proprietà vacationAndPublicHolidayCompensation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVacationAndPublicHolidayCompensation() {
        return vacationAndPublicHolidayCompensation;
    }

    /**
     * Imposta il valore della proprietà vacationAndPublicHolidayCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVacationAndPublicHolidayCompensation(BigDecimal value) {
        this.vacationAndPublicHolidayCompensation = value;
    }

}
