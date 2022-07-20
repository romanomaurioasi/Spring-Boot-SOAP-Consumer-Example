
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetStatusFromDeclareMonthTotalResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetStatusFromDeclareMonthTotalResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseContext" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResponseContextType"/&gt;
 *         &lt;element name="PlausibilityStateMonthTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}DeclareMonthTotalPlausibilityStateType"/&gt;
 *         &lt;element name="JobFinished" type="{http://www.swissdec.ch/schema/common/20200220/Common}SimpleBooleanType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStatusFromDeclareMonthTotalResponseType", propOrder = {
    "responseContext",
    "plausibilityStateMonthTotal",
    "jobFinished"
})
public class GetStatusFromDeclareMonthTotalResponseType {

    @XmlElement(name = "ResponseContext", required = true)
    protected ResponseContextType responseContext;
    @XmlElement(name = "PlausibilityStateMonthTotal", required = true)
    protected DeclareMonthTotalPlausibilityStateType plausibilityStateMonthTotal;
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
     * Recupera il valore della proprietà plausibilityStateMonthTotal.
     * 
     * @return
     *     possible object is
     *     {@link DeclareMonthTotalPlausibilityStateType }
     *     
     */
    public DeclareMonthTotalPlausibilityStateType getPlausibilityStateMonthTotal() {
        return plausibilityStateMonthTotal;
    }

    /**
     * Imposta il valore della proprietà plausibilityStateMonthTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclareMonthTotalPlausibilityStateType }
     *     
     */
    public void setPlausibilityStateMonthTotal(DeclareMonthTotalPlausibilityStateType value) {
        this.plausibilityStateMonthTotal = value;
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
