
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetResultFromDeclareMonthTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetResultFromDeclareMonthTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}RequestContextType"/&gt;
 *         &lt;element name="DomainMonthTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}DeclareMonthTotalDomainIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResultFromDeclareMonthTotalType", propOrder = {
    "requestContext",
    "domainMonthTotal"
})
public class GetResultFromDeclareMonthTotalType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "DomainMonthTotal", required = true)
    protected DeclareMonthTotalDomainIdentificationType domainMonthTotal;

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
     * Recupera il valore della proprietà domainMonthTotal.
     * 
     * @return
     *     possible object is
     *     {@link DeclareMonthTotalDomainIdentificationType }
     *     
     */
    public DeclareMonthTotalDomainIdentificationType getDomainMonthTotal() {
        return domainMonthTotal;
    }

    /**
     * Imposta il valore della proprietà domainMonthTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclareMonthTotalDomainIdentificationType }
     *     
     */
    public void setDomainMonthTotal(DeclareMonthTotalDomainIdentificationType value) {
        this.domainMonthTotal = value;
    }

}
