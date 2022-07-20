
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetResultFromDeclareSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetResultFromDeclareSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}RequestContextType"/&gt;
 *         &lt;element name="Domain" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}DomainIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResultFromDeclareSalaryType", propOrder = {
    "requestContext",
    "domain"
})
public class GetResultFromDeclareSalaryType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "Domain", required = true)
    protected DomainIdentificationType domain;

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
     * Recupera il valore della proprietà domain.
     * 
     * @return
     *     possible object is
     *     {@link DomainIdentificationType }
     *     
     */
    public DomainIdentificationType getDomain() {
        return domain;
    }

    /**
     * Imposta il valore della proprietà domain.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainIdentificationType }
     *     
     */
    public void setDomain(DomainIdentificationType value) {
        this.domain = value;
    }

}
