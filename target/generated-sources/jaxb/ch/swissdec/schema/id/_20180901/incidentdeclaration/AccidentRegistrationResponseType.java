
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AccidentRegistrationResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccidentRegistrationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}RegistrationResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliverCustomerIdentity" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="DeliverContractIdentity" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccidentRegistrationResponseType", propOrder = {
    "deliverCustomerIdentity",
    "deliverContractIdentity"
})
public class AccidentRegistrationResponseType
    extends RegistrationResponseType
{

    @XmlElement(name = "DeliverCustomerIdentity")
    protected String deliverCustomerIdentity;
    @XmlElement(name = "DeliverContractIdentity")
    protected String deliverContractIdentity;

    /**
     * Recupera il valore della proprietà deliverCustomerIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverCustomerIdentity() {
        return deliverCustomerIdentity;
    }

    /**
     * Imposta il valore della proprietà deliverCustomerIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverCustomerIdentity(String value) {
        this.deliverCustomerIdentity = value;
    }

    /**
     * Recupera il valore della proprietà deliverContractIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverContractIdentity() {
        return deliverContractIdentity;
    }

    /**
     * Imposta il valore della proprietà deliverContractIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverContractIdentity(String value) {
        this.deliverContractIdentity = value;
    }

}
