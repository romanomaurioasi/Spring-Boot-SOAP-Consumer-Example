
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetResultFromDeclareSalaryResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetResultFromDeclareSalaryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseContext" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ResponseContextType"/&gt;
 *         &lt;element name="SalaryResult" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}SalaryResultType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResultFromDeclareSalaryResponseType", propOrder = {
    "responseContext",
    "salaryResult"
})
public class GetResultFromDeclareSalaryResponseType {

    @XmlElement(name = "ResponseContext", required = true)
    protected ResponseContextType responseContext;
    @XmlElement(name = "SalaryResult", required = true)
    protected SalaryResultType salaryResult;

    /**
     * Recupera il valore della proprietà responseContext.
     * 
     * @return
     *     possible object is
     *     {@link ResponseContextType }
     *     
     */
    public ResponseContextType getResponseContext() {
        return responseContext;
    }

    /**
     * Imposta il valore della proprietà responseContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseContextType }
     *     
     */
    public void setResponseContext(ResponseContextType value) {
        this.responseContext = value;
    }

    /**
     * Recupera il valore della proprietà salaryResult.
     * 
     * @return
     *     possible object is
     *     {@link SalaryResultType }
     *     
     */
    public SalaryResultType getSalaryResult() {
        return salaryResult;
    }

    /**
     * Imposta il valore della proprietà salaryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryResultType }
     *     
     */
    public void setSalaryResult(SalaryResultType value) {
        this.salaryResult = value;
    }

}
