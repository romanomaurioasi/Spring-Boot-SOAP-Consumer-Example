
package ch.swissdec.schema.common._20200220.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per WeeklyHoursAndLessonsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WeeklyHoursAndLessonsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WeeklyHours" type="{http://www.swissdec.ch/schema/common/20200220/Common}HoursOrLessonsType"/&gt;
 *         &lt;element name="WeeklyLessons" type="{http://www.swissdec.ch/schema/common/20200220/Common}HoursOrLessonsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyHoursAndLessonsType", propOrder = {
    "weeklyHours",
    "weeklyLessons"
})
@XmlSeeAlso({
    WeeklyHoursAndLessonsIDType.class
})
public class WeeklyHoursAndLessonsType {

    @XmlElement(name = "WeeklyHours", required = true)
    protected BigDecimal weeklyHours;
    @XmlElement(name = "WeeklyLessons", required = true)
    protected BigDecimal weeklyLessons;

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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeeklyLessons() {
        return weeklyLessons;
    }

    /**
     * Imposta il valore della proprietà weeklyLessons.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeeklyLessons(BigDecimal value) {
        this.weeklyLessons = value;
    }

}
