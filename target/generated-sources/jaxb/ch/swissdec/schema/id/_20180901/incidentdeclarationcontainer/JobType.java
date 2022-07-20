
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per JobType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="JobType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Addressees" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}AddresseeType"/&gt;
 *         &lt;element name="EndUserNotification" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}UserNotificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobType", propOrder = {
    "addressees",
    "endUserNotification"
})
public class JobType {

    @XmlElement(name = "Addressees", required = true)
    protected AddresseeType addressees;
    @XmlElement(name = "EndUserNotification")
    protected UserNotificationType endUserNotification;

    /**
     * Recupera il valore della proprietà addressees.
     * 
     * @return
     *     possible object is
     *     {@link AddresseeType }
     *     
     */
    public AddresseeType getAddressees() {
        return addressees;
    }

    /**
     * Imposta il valore della proprietà addressees.
     * 
     * @param value
     *     allowed object is
     *     {@link AddresseeType }
     *     
     */
    public void setAddressees(AddresseeType value) {
        this.addressees = value;
    }

    /**
     * Recupera il valore della proprietà endUserNotification.
     * 
     * @return
     *     possible object is
     *     {@link UserNotificationType }
     *     
     */
    public UserNotificationType getEndUserNotification() {
        return endUserNotification;
    }

    /**
     * Imposta il valore della proprietà endUserNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNotificationType }
     *     
     */
    public void setEndUserNotification(UserNotificationType value) {
        this.endUserNotification = value;
    }

}
