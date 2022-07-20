
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetStatusFromDeclareSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetStatusFromDeclareSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}RequestContextType"/&gt;
 *         &lt;element name="JobKey" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}JobKeyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStatusFromDeclareSalaryType", propOrder = {
    "requestContext",
    "jobKey"
})
public class GetStatusFromDeclareSalaryType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "JobKey", required = true)
    protected String jobKey;

    /**
     * Recupera il valore della proprietà requestContext.
     * 
     * @return
     *     possible object is
     *     {@link RequestContextType }
     *     
     */
    public RequestContextType getRequestContext() {
        return requestContext;
    }

    /**
     * Imposta il valore della proprietà requestContext.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestContextType }
     *     
     */
    public void setRequestContext(RequestContextType value) {
        this.requestContext = value;
    }

    /**
     * Recupera il valore della proprietà jobKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobKey() {
        return jobKey;
    }

    /**
     * Imposta il valore della proprietà jobKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobKey(String value) {
        this.jobKey = value;
    }

}
