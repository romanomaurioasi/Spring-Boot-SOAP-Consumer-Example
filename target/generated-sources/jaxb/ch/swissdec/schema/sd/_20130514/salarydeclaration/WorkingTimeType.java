
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per WorkingTimeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WorkingTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="WeeklyHours" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}WeeklyHoursType"/&gt;
 *         &lt;element name="WeeklyLessons" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}WeeklyLessonsType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkingTimeType", propOrder = {
    "weeklyHours",
    "weeklyLessons"
})
public class WorkingTimeType {

    @XmlElement(name = "WeeklyHours")
    protected BigDecimal weeklyHours;
    @XmlElement(name = "WeeklyLessons")
    @XmlSchemaType(name = "integer")
    protected Integer weeklyLessons;

    /**
     * Recupera il valore della proprietà weeklyHours.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeeklyHours() {
        return weeklyHours;
    }

    /**
     * Imposta il valore della proprietà weeklyHours.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeeklyHours(BigDecimal value) {
        this.weeklyHours = value;
    }

    /**
     * Recupera il valore della proprietà weeklyLessons.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeeklyLessons() {
        return weeklyLessons;
    }

    /**
     * Imposta il valore della proprietà weeklyLessons.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeeklyLessons(Integer value) {
        this.weeklyLessons = value;
    }

}
