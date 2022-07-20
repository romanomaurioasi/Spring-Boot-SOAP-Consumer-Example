
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaidByHour" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="PaidByLesson" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryType", propOrder = {
    "paidByHour",
    "paidByLesson"
})
public class SalaryType {

    @XmlElement(name = "PaidByHour", required = true)
    protected BigDecimal paidByHour;
    @XmlElement(name = "PaidByLesson", required = true)
    protected BigDecimal paidByLesson;

    /**
     * Recupera il valore della proprietà paidByHour.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidByHour() {
        return paidByHour;
    }

    /**
     * Imposta il valore della proprietà paidByHour.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaidByHour(BigDecimal value) {
        this.paidByHour = value;
    }

    /**
     * Recupera il valore della proprietà paidByLesson.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidByLesson() {
        return paidByLesson;
    }

    /**
     * Imposta il valore della proprietà paidByLesson.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaidByLesson(BigDecimal value) {
        this.paidByLesson = value;
    }

}
