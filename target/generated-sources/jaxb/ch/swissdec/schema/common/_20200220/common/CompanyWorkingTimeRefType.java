
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompanyWorkingTimeRefType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyWorkingTimeRefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="WeeklyHours" type="{http://www.swissdec.ch/schema/common/20200220/Common}HoursRefType"/&gt;
 *         &lt;element name="WeeklyLessons" type="{http://www.swissdec.ch/schema/common/20200220/Common}LessonsRefType"/&gt;
 *         &lt;element name="WeeklyHoursAndLessons" type="{http://www.swissdec.ch/schema/common/20200220/Common}WeeklyHoursAndLessonsRefType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyWorkingTimeRefType", propOrder = {
    "weeklyHours",
    "weeklyLessons",
    "weeklyHoursAndLessons"
})
public class CompanyWorkingTimeRefType {

    @XmlElement(name = "WeeklyHours")
    protected HoursRefType weeklyHours;
    @XmlElement(name = "WeeklyLessons")
    protected LessonsRefType weeklyLessons;
    @XmlElement(name = "WeeklyHoursAndLessons")
    protected WeeklyHoursAndLessonsRefType weeklyHoursAndLessons;

    /**
     * Recupera il valore della proprietà weeklyHours.
     * 
     * @return
     *     possible object is
     *     {@link HoursRefType }
     *     
     */
    public HoursRefType getWeeklyHours() {
        return weeklyHours;
    }

    /**
     * Imposta il valore della proprietà weeklyHours.
     * 
     * @param value
     *     allowed object is
     *     {@link HoursRefType }
     *     
     */
    public void setWeeklyHours(HoursRefType value) {
        this.weeklyHours = value;
    }

    /**
     * Recupera il valore della proprietà weeklyLessons.
     * 
     * @return
     *     possible object is
     *     {@link LessonsRefType }
     *     
     */
    public LessonsRefType getWeeklyLessons() {
        return weeklyLessons;
    }

    /**
     * Imposta il valore della proprietà weeklyLessons.
     * 
     * @param value
     *     allowed object is
     *     {@link LessonsRefType }
     *     
     */
    public void setWeeklyLessons(LessonsRefType value) {
        this.weeklyLessons = value;
    }

    /**
     * Recupera il valore della proprietà weeklyHoursAndLessons.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyHoursAndLessonsRefType }
     *     
     */
    public WeeklyHoursAndLessonsRefType getWeeklyHoursAndLessons() {
        return weeklyHoursAndLessons;
    }

    /**
     * Imposta il valore della proprietà weeklyHoursAndLessons.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyHoursAndLessonsRefType }
     *     
     */
    public void setWeeklyHoursAndLessons(WeeklyHoursAndLessonsRefType value) {
        this.weeklyHoursAndLessons = value;
    }

}
