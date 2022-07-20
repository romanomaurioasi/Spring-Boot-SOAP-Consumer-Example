
package ch.swissdec.schema.common._20180901.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="WeeklyHours" type="{http://www.swissdec.ch/schema/common/20180901/Common}WeeklyHoursType"/&gt;
 *         &lt;element name="WeeklyLessons" type="{http://www.swissdec.ch/schema/common/20180901/Common}WeeklyLessonsType"/&gt;
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
public class WeeklyHoursAndLessonsType {

    @XmlElement(name = "WeeklyHours", required = true)
    protected BigDecimal weeklyHours;
    @XmlElement(name = "WeeklyLessons")
    @XmlSchemaType(name = "integer")
    protected int weeklyLessons;

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
     */
    public int getWeeklyLessons() {
        return weeklyLessons;
    }

    /**
     * Imposta il valore della proprietà weeklyLessons.
     * 
     */
    public void setWeeklyLessons(int value) {
        this.weeklyLessons = value;
    }

}
