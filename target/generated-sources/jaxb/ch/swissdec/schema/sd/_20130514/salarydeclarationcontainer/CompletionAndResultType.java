
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompletionAndResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompletionAndResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ResultType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Completion" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AccessInformationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletionAndResultType", propOrder = {
    "completion"
})
public class CompletionAndResultType
    extends ResultType
{

    @XmlElement(name = "Completion", required = true)
    protected AccessInformationType completion;

    /**
     * Recupera il valore della proprietà completion.
     * 
     * @return
     *     possible object is
     *     {@link AccessInformationType }
     *     
     */
    public AccessInformationType getCompletion() {
        return completion;
    }

    /**
     * Imposta il valore della proprietà completion.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessInformationType }
     *     
     */
    public void setCompletion(AccessInformationType value) {
        this.completion = value;
    }

}
