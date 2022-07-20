
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SalaryDeclarationStatusResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryDeclarationStatusResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseContext" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ResponseContextType"/&gt;
 *         &lt;element name="PlausibilityState" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}PlausibilityStateType"/&gt;
 *         &lt;element name="JobFinished" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SimpleBooleanType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryDeclarationStatusResponseType", propOrder = {
    "responseContext",
    "plausibilityState",
    "jobFinished"
})
public class SalaryDeclarationStatusResponseType {

    @XmlElement(name = "ResponseContext", required = true)
    protected ResponseContextType responseContext;
    @XmlElement(name = "PlausibilityState", required = true)
    protected PlausibilityStateType plausibilityState;
    @XmlElement(name = "JobFinished")
    protected boolean jobFinished;

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
     * Recupera il valore della proprietà plausibilityState.
     * 
     * @return
     *     possible object is
     *     {@link PlausibilityStateType }
     *     
     */
    public PlausibilityStateType getPlausibilityState() {
        return plausibilityState;
    }

    /**
     * Imposta il valore della proprietà plausibilityState.
     * 
     * @param value
     *     allowed object is
     *     {@link PlausibilityStateType }
     *     
     */
    public void setPlausibilityState(PlausibilityStateType value) {
        this.plausibilityState = value;
    }

    /**
     * Recupera il valore della proprietà jobFinished.
     * 
     */
    public boolean isJobFinished() {
        return jobFinished;
    }

    /**
     * Imposta il valore della proprietà jobFinished.
     * 
     */
    public void setJobFinished(boolean value) {
        this.jobFinished = value;
    }

}
