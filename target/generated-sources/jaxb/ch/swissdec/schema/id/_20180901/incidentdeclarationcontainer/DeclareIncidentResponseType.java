
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclareIncidentResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclareIncidentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseContext" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ContextBaseType"/&gt;
 *         &lt;element name="Plausible" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}PlausibleNotificationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclareIncidentResponseType", propOrder = {
    "responseContext",
    "plausible"
})
public class DeclareIncidentResponseType {

    @XmlElement(name = "ResponseContext", required = true)
    protected ContextBaseType responseContext;
    @XmlElement(name = "Plausible", required = true)
    protected PlausibleNotificationsType plausible;

    /**
     * Recupera il valore della proprietà responseContext.
     * 
     * @return
     *     possible object is
     *     {@link ContextBaseType }
     *     
     */
    public ContextBaseType getResponseContext() {
        return responseContext;
    }

    /**
     * Imposta il valore della proprietà responseContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextBaseType }
     *     
     */
    public void setResponseContext(ContextBaseType value) {
        this.responseContext = value;
    }

    /**
     * Recupera il valore della proprietà plausible.
     * 
     * @return
     *     possible object is
     *     {@link PlausibleNotificationsType }
     *     
     */
    public PlausibleNotificationsType getPlausible() {
        return plausible;
    }

    /**
     * Imposta il valore della proprietà plausible.
     * 
     * @param value
     *     allowed object is
     *     {@link PlausibleNotificationsType }
     *     
     */
    public void setPlausible(PlausibleNotificationsType value) {
        this.plausible = value;
    }

}
