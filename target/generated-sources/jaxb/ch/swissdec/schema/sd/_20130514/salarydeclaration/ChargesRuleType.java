
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ChargesRuleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ChargesRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="WithRegulation" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GrantType"/&gt;
 *         &lt;element name="Guidance" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesRuleType", propOrder = {
    "withRegulation",
    "guidance"
})
public class ChargesRuleType {

    @XmlElement(name = "WithRegulation")
    protected GrantType withRegulation;
    @XmlElement(name = "Guidance")
    protected EmptyType guidance;

    /**
     * Recupera il valore della proprietà withRegulation.
     * 
     * @return
     *     possible object is
     *     {@link GrantType }
     *     
     */
    public GrantType getWithRegulation() {
        return withRegulation;
    }

    /**
     * Imposta il valore della proprietà withRegulation.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantType }
     *     
     */
    public void setWithRegulation(GrantType value) {
        this.withRegulation = value;
    }

    /**
     * Recupera il valore della proprietà guidance.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getGuidance() {
        return guidance;
    }

    /**
     * Imposta il valore della proprietà guidance.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setGuidance(EmptyType value) {
        this.guidance = value;
    }

}
