
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per InsuredSalaryPastType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsuredSalaryPastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="KindOfSalaries" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}KindOfSalariesPastType"/&gt;
 *         &lt;element name="Total" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *         &lt;element name="HoursPerMonth" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}HoursAndIndustryMinutesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuredSalaryPastType", propOrder = {
    "month",
    "kindOfSalaries",
    "total",
    "hoursPerMonth"
})
public class InsuredSalaryPastType {

    @XmlElement(name = "Month", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar month;
    @XmlElement(name = "KindOfSalaries", required = true)
    protected KindOfSalariesPastType kindOfSalaries;
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    @XmlElement(name = "HoursPerMonth")
    protected BigDecimal hoursPerMonth;

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
     * Recupera il valore della proprietà kindOfSalaries.
     * 
     * @return
     *     possible object is
     *     {@link KindOfSalariesPastType }
     *     
     */
    public KindOfSalariesPastType getKindOfSalaries() {
        return kindOfSalaries;
    }

    /**
     * Imposta il valore della proprietà kindOfSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link KindOfSalariesPastType }
     *     
     */
    public void setKindOfSalaries(KindOfSalariesPastType value) {
        this.kindOfSalaries = value;
    }

    /**
     * Recupera il valore della proprietà total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Imposta il valore della proprietà total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Recupera il valore della proprietà hoursPerMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoursPerMonth() {
        return hoursPerMonth;
    }

    /**
     * Imposta il valore della proprietà hoursPerMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoursPerMonth(BigDecimal value) {
        this.hoursPerMonth = value;
    }

}
