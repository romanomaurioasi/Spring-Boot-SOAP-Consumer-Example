
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SuccessResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SuccessResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddresseeContext" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AddresseeContextType"/&gt;
 *         &lt;element name="ResponseState" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ResponseStateType"/&gt;
 *         &lt;group ref="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ProcessFlowGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuccessResponseType", propOrder = {
    "addresseeContext",
    "responseState",
    "completionAndResult",
    "result"
})
public class SuccessResponseType {

    @XmlElement(name = "AddresseeContext", required = true)
    protected AddresseeContextType addresseeContext;
    @XmlElement(name = "ResponseState", required = true)
    protected ResponseStateType responseState;
    @XmlElement(name = "CompletionAndResult")
    protected CompletionAndResultType completionAndResult;
    @XmlElement(name = "Result")
    protected ResultType result;

    /**
     * Recupera il valore della proprietà addresseeContext.
     * 
     * @return
     *     possible object is
     *     {@link AddresseeContextType }
     *     
     */
    public AddresseeContextType getAddresseeContext() {
        return addresseeContext;
    }

    /**
     * Imposta il valore della proprietà addresseeContext.
     * 
     * @param value
     *     allowed object is
     *     {@link AddresseeContextType }
     *     
     */
    public void setAddresseeContext(AddresseeContextType value) {
        this.addresseeContext = value;
    }

    /**
     * Recupera il valore della proprietà responseState.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStateType }
     *     
     */
    public ResponseStateType getResponseState() {
        return responseState;
    }

    /**
     * Imposta il valore della proprietà responseState.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStateType }
     *     
     */
    public void setResponseState(ResponseStateType value) {
        this.responseState = value;
    }

    /**
     * Recupera il valore della proprietà completionAndResult.
     * 
     * @return
     *     possible object is
     *     {@link CompletionAndResultType }
     *     
     */
    public CompletionAndResultType getCompletionAndResult() {
        return completionAndResult;
    }

    /**
     * Imposta il valore della proprietà completionAndResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionAndResultType }
     *     
     */
    public void setCompletionAndResult(CompletionAndResultType value) {
        this.completionAndResult = value;
    }

    /**
     * Recupera il valore della proprietà result.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

}
