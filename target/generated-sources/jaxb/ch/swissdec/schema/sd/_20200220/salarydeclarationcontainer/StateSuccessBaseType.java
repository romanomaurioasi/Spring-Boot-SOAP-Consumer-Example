
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StateSuccessBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StateSuccessBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddresseeContext" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AddresseeContextType"/&gt;
 *         &lt;element name="ResponseState" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResponseStateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateSuccessBaseType", propOrder = {
    "addresseeContext",
    "responseState"
})
@XmlSeeAlso({
    TaxStateSuccessType.class
})
public class StateSuccessBaseType {

    @XmlElement(name = "AddresseeContext", required = true)
    protected AddresseeContextType addresseeContext;
    @XmlElement(name = "ResponseState", required = true)
    protected ResponseStateType responseState;

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

}
