
package ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.OrganizationRegistrationType;


/**
 * <p>Classe Java per RegisterOrganizationRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RegisterOrganizationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}RequestContextType"/&gt;
 *         &lt;element name="OrganizationRegistration" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}OrganizationRegistrationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterOrganizationRequestType", propOrder = {
    "requestContext",
    "organizationRegistration"
})
public class RegisterOrganizationRequestType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "OrganizationRegistration", required = true)
    protected OrganizationRegistrationType organizationRegistration;

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
     * Recupera il valore della proprietà organizationRegistration.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRegistrationType }
     *     
     */
    public OrganizationRegistrationType getOrganizationRegistration() {
        return organizationRegistration;
    }

    /**
     * Imposta il valore della proprietà organizationRegistration.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRegistrationType }
     *     
     */
    public void setOrganizationRegistration(OrganizationRegistrationType value) {
        this.organizationRegistration = value;
    }

}
