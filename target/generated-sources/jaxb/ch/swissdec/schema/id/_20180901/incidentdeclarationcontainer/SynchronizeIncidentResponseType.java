
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SynchronizeIncidentResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SynchronizeIncidentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseContext" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ContextBaseType"/&gt;
 *         &lt;element name="SynchronizeIncidentConsumer" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}SynchronizeIncidentConsumerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizeIncidentResponseType", propOrder = {
    "responseContext",
    "synchronizeIncidentConsumer"
})
public class SynchronizeIncidentResponseType {

    @XmlElement(name = "ResponseContext", required = true)
    protected ContextBaseType responseContext;
    @XmlElement(name = "SynchronizeIncidentConsumer", required = true)
    protected SynchronizeIncidentConsumerType synchronizeIncidentConsumer;

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
     * Recupera il valore della proprietà synchronizeIncidentConsumer.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizeIncidentConsumerType }
     *     
     */
    public SynchronizeIncidentConsumerType getSynchronizeIncidentConsumer() {
        return synchronizeIncidentConsumer;
    }

    /**
     * Imposta il valore della proprietà synchronizeIncidentConsumer.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizeIncidentConsumerType }
     *     
     */
    public void setSynchronizeIncidentConsumer(SynchronizeIncidentConsumerType value) {
        this.synchronizeIncidentConsumer = value;
    }

}
