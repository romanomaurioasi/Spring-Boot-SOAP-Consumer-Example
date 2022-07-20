
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ChargesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ChargesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Effective" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EffectiveType" minOccurs="0"/&gt;
 *         &lt;element name="LumpSum" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}LumpSumType" minOccurs="0"/&gt;
 *         &lt;element name="Education" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesType", propOrder = {
    "effective",
    "lumpSum",
    "education"
})
public class ChargesType {

    @XmlElement(name = "Effective")
    protected EffectiveType effective;
    @XmlElement(name = "LumpSum")
    protected LumpSumType lumpSum;
    @XmlElement(name = "Education")
    protected BigDecimal education;

    /**
     * Recupera il valore della proprietà effective.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveType }
     *     
     */
    public EffectiveType getEffective() {
        return effective;
    }

    /**
     * Imposta il valore della proprietà effective.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveType }
     *     
     */
    public void setEffective(EffectiveType value) {
        this.effective = value;
    }

    /**
     * Recupera il valore della proprietà lumpSum.
     * 
     * @return
     *     possible object is
     *     {@link LumpSumType }
     *     
     */
    public LumpSumType getLumpSum() {
        return lumpSum;
    }

    /**
     * Imposta il valore della proprietà lumpSum.
     * 
     * @param value
     *     allowed object is
     *     {@link LumpSumType }
     *     
     */
    public void setLumpSum(LumpSumType value) {
        this.lumpSum = value;
    }

    /**
     * Recupera il valore della proprietà education.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEducation() {
        return education;
    }

    /**
     * Imposta il valore della proprietà education.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEducation(BigDecimal value) {
        this.education = value;
    }

}
