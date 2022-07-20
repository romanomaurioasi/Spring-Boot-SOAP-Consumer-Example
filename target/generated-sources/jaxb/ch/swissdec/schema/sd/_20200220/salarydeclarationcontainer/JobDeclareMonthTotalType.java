
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per JobDeclareMonthTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="JobDeclareMonthTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Addressees" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AddresseeDeclareMonthTotalType"/&gt;
 *         &lt;element name="EndUserNotification" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}UserNotificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobDeclareMonthTotalType", propOrder = {
    "addressees",
    "endUserNotification"
})
public class JobDeclareMonthTotalType {

    @XmlElement(name = "Addressees", required = true)
    protected AddresseeDeclareMonthTotalType addressees;
    @XmlElement(name = "EndUserNotification")
    protected UserNotificationType endUserNotification;

    /**
     * Recupera il valore della proprietà addressees.
     * 
     * @return
     *     possible object is
     *     {@link AddresseeDeclareMonthTotalType }
     *     
     */
    public AddresseeDeclareMonthTotalType getAddressees() {
        return addressees;
    }

    /**
     * Imposta il valore della proprietà addressees.
     * 
     * @param value
     *     allowed object is
     *     {@link AddresseeDeclareMonthTotalType }
     *     
     */
    public void setAddressees(AddresseeDeclareMonthTotalType value) {
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
