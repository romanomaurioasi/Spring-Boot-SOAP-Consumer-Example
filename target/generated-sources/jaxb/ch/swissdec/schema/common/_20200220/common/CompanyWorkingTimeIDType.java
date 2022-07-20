
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompanyWorkingTimeIDType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyWorkingTimeIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="WeeklyHours" type="{http://www.swissdec.ch/schema/common/20200220/Common}WeeklyHoursIDType"/&gt;
 *         &lt;element name="WeeklyLessons" type="{http://www.swissdec.ch/schema/common/20200220/Common}WeeklyLessonsIDType"/&gt;
 *         &lt;element name="WeeklyHoursAndLessons" type="{http://www.swissdec.ch/schema/common/20200220/Common}WeeklyHoursAndLessonsIDType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyWorkingTimeIDType", propOrder = {
    "weeklyHours",
    "weeklyLessons",
    "weeklyHoursAndLessons"
})
public class CompanyWorkingTimeIDType {

    @XmlElement(name = "WeeklyHours")
    protected WeeklyHoursIDType weeklyHours;
    @XmlElement(name = "WeeklyLessons")
    protected WeeklyLessonsIDType weeklyLessons;
    @XmlElement(name = "WeeklyHoursAndLessons")
    protected WeeklyHoursAndLessonsIDType weeklyHoursAndLessons;

    /**
     * Recupera il valore della proprietà weeklyHours.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyHoursIDType }
     *     
     */
    public WeeklyHoursIDType getWeeklyHours() {
        return weeklyHours;
    }

    /**
     * Imposta il valore della proprietà weeklyHours.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyHoursIDType }
     *     
     */
    public void setWeeklyHours(WeeklyHoursIDType value) {
        this.weeklyHours = value;
    }

    /**
     * Recupera il valore della proprietà weeklyLessons.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyLessonsIDType }
     *     
     */
    public WeeklyLessonsIDType getWeeklyLessons() {
        return weeklyLessons;
    }

    /**
     * Imposta il valore della proprietà weeklyLessons.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyLessonsIDType }
     *     
     */
    public void setWeeklyLessons(WeeklyLessonsIDType value) {
        this.weeklyLessons = value;
    }

    /**
     * Recupera il valore della proprietà weeklyHoursAndLessons.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyHoursAndLessonsIDType }
     *     
     */
    public WeeklyHoursAndLessonsIDType getWeeklyHoursAndLessons() {
        return weeklyHoursAndLessons;
    }

    /**
     * Imposta il valore della proprietà weeklyHoursAndLessons.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyHoursAndLessonsIDType }
     *     
     */
    public void setWeeklyHoursAndLessons(WeeklyHoursAndLessonsIDType value) {
        this.weeklyHoursAndLessons = value;
    }

}
