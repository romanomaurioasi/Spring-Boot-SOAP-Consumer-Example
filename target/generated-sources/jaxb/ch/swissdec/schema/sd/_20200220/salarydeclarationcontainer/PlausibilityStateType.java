
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.EmptyType;


/**
 * <p>Classe Java per PlausibilityStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PlausibilityStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ValidityPlausibilityChecking" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType"/&gt;
 *         &lt;element name="Plausible" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}PlausibleNotificationsType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlausibilityStateType", propOrder = {
    "validityPlausibilityChecking",
    "plausible"
})
public class PlausibilityStateType {

    @XmlElement(name = "ValidityPlausibilityChecking")
    protected EmptyType validityPlausibilityChecking;
    @XmlElement(name = "Plausible")
    protected PlausibleNotificationsType plausible;

    /**
     * Recupera il valore della proprietà validityPlausibilityChecking.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getValidityPlausibilityChecking() {
        return validityPlausibilityChecking;
    }

    /**
     * Imposta il valore della proprietà validityPlausibilityChecking.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setValidityPlausibilityChecking(EmptyType value) {
        this.validityPlausibilityChecking = value;
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
