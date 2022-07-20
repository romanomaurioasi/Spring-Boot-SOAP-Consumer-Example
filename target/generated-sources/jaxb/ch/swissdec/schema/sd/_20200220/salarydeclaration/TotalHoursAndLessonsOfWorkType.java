
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TotalHoursAndLessonsOfWorkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TotalHoursAndLessonsOfWorkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalHoursOfWork" type="{http://www.swissdec.ch/schema/common/20200220/Common}HoursOrLessonsType"/&gt;
 *         &lt;element name="TotalLessonsOfWork" type="{http://www.swissdec.ch/schema/common/20200220/Common}HoursOrLessonsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalHoursAndLessonsOfWorkType", propOrder = {
    "totalHoursOfWork",
    "totalLessonsOfWork"
})
@XmlSeeAlso({
    TotalHoursAndLessonsOfWorkRefType.class
})
public class TotalHoursAndLessonsOfWorkType {

    @XmlElement(name = "TotalHoursOfWork", required = true)
    protected BigDecimal totalHoursOfWork;
    @XmlElement(name = "TotalLessonsOfWork", required = true)
    protected BigDecimal totalLessonsOfWork;

    /**
     * Recupera il valore della proprietà totalHoursOfWork.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalHoursOfWork() {
        return totalHoursOfWork;
    }

    /**
     * Imposta il valore della proprietà totalHoursOfWork.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalHoursOfWork(BigDecimal value) {
        this.totalHoursOfWork = value;
    }

    /**
     * Recupera il valore della proprietà totalLessonsOfWork.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLessonsOfWork() {
        return totalLessonsOfWork;
    }

    /**
     * Imposta il valore della proprietà totalLessonsOfWork.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLessonsOfWork(BigDecimal value) {
        this.totalLessonsOfWork = value;
    }

}
