
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SalaryResultConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryResultConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalaryResult" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ReducedSalaryResultType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryResultConsumerType", propOrder = {
    "salaryResult"
})
public class SalaryResultConsumerType {

    @XmlElement(name = "SalaryResult", required = true)
    protected ReducedSalaryResultType salaryResult;

    /**
     * Recupera il valore della proprietà salaryResult.
     * 
     * @return
     *     possible object is
     *     {@link ReducedSalaryResultType }
     *     
     */
    public ReducedSalaryResultType getSalaryResult() {
        return salaryResult;
    }

    /**
     * Imposta il valore della proprietà salaryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ReducedSalaryResultType }
     *     
     */
    public void setSalaryResult(ReducedSalaryResultType value) {
        this.salaryResult = value;
    }

}
