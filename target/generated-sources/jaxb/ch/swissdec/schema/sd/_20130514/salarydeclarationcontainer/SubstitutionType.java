
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SubstitutionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SubstitutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PredecessorDeclarationIDWithAcceptedState" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}IDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstitutionType", propOrder = {
    "predecessorDeclarationIDWithAcceptedState"
})
public class SubstitutionType {

    @XmlElement(name = "PredecessorDeclarationIDWithAcceptedState", required = true)
    protected String predecessorDeclarationIDWithAcceptedState;

    /**
     * Recupera il valore della proprietà predecessorDeclarationIDWithAcceptedState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredecessorDeclarationIDWithAcceptedState() {
        return predecessorDeclarationIDWithAcceptedState;
    }

    /**
     * Imposta il valore della proprietà predecessorDeclarationIDWithAcceptedState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredecessorDeclarationIDWithAcceptedState(String value) {
        this.predecessorDeclarationIDWithAcceptedState = value;
    }

}
