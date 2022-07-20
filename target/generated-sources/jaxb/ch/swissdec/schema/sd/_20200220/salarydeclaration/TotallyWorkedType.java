
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.HoursRefType;
import ch.swissdec.schema.common._20200220.common.LessonsRefType;


/**
 * <p>Classe Java per TotallyWorkedType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TotallyWorkedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TotalHoursOfWork" type="{http://www.swissdec.ch/schema/common/20200220/Common}HoursRefType"/&gt;
 *         &lt;element name="TotalLessonsOfWork" type="{http://www.swissdec.ch/schema/common/20200220/Common}LessonsRefType"/&gt;
 *         &lt;element name="TotalHoursAndLessonsOfWork" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TotalHoursAndLessonsOfWorkRefType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotallyWorkedType", propOrder = {
    "totalHoursOfWork",
    "totalLessonsOfWork",
    "totalHoursAndLessonsOfWork"
})
public class TotallyWorkedType {

    @XmlElement(name = "TotalHoursOfWork")
    protected HoursRefType totalHoursOfWork;
    @XmlElement(name = "TotalLessonsOfWork")
    protected LessonsRefType totalLessonsOfWork;
    @XmlElement(name = "TotalHoursAndLessonsOfWork")
    protected TotalHoursAndLessonsOfWorkRefType totalHoursAndLessonsOfWork;

    /**
     * Recupera il valore della proprietà totalHoursOfWork.
     * 
     * @return
     *     possible object is
     *     {@link HoursRefType }
     *     
     */
    public HoursRefType getTotalHoursOfWork() {
        return totalHoursOfWork;
    }

    /**
     * Imposta il valore della proprietà totalHoursOfWork.
     * 
     * @param value
     *     allowed object is
     *     {@link HoursRefType }
     *     
     */
    public void setTotalHoursOfWork(HoursRefType value) {
        this.totalHoursOfWork = value;
    }

    /**
     * Recupera il valore della proprietà totalLessonsOfWork.
     * 
     * @return
     *     possible object is
     *     {@link LessonsRefType }
     *     
     */
    public LessonsRefType getTotalLessonsOfWork() {
        return totalLessonsOfWork;
    }

    /**
     * Imposta il valore della proprietà totalLessonsOfWork.
     * 
     * @param value
     *     allowed object is
     *     {@link LessonsRefType }
     *     
     */
    public void setTotalLessonsOfWork(LessonsRefType value) {
        this.totalLessonsOfWork = value;
    }

    /**
     * Recupera il valore della proprietà totalHoursAndLessonsOfWork.
     * 
     * @return
     *     possible object is
     *     {@link TotalHoursAndLessonsOfWorkRefType }
     *     
     */
    public TotalHoursAndLessonsOfWorkRefType getTotalHoursAndLessonsOfWork() {
        return totalHoursAndLessonsOfWork;
    }

    /**
     * Imposta il valore della proprietà totalHoursAndLessonsOfWork.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalHoursAndLessonsOfWorkRefType }
     *     
     */
    public void setTotalHoursAndLessonsOfWork(TotalHoursAndLessonsOfWorkRefType value) {
        this.totalHoursAndLessonsOfWork = value;
    }

}
