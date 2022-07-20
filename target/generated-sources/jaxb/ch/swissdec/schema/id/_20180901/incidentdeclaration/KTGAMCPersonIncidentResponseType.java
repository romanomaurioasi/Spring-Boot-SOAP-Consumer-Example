
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.ParticularsBaseType;


/**
 * <p>Classe Java per KTG-AMC-PersonIncidentResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KTG-AMC-PersonIncidentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParticularsBase" type="{http://www.swissdec.ch/schema/common/20180901/Common}ParticularsBaseType"/&gt;
 *         &lt;element name="Registration" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}RegistrationResponseType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KTG-AMC-PersonIncidentResponseType", propOrder = {
    "particularsBase",
    "registration"
})
public class KTGAMCPersonIncidentResponseType {

    @XmlElement(name = "ParticularsBase", required = true)
    protected ParticularsBaseType particularsBase;
    @XmlElement(name = "Registration", required = true)
    protected List<RegistrationResponseType> registration;

    /**
     * Recupera il valore della proprietà particularsBase.
     * 
     * @return
     *     possible object is
     *     {@link ParticularsBaseType }
     *     
     */
    public ParticularsBaseType getParticularsBase() {
        return particularsBase;
    }

    /**
     * Imposta il valore della proprietà particularsBase.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticularsBaseType }
     *     
     */
    public void setParticularsBase(ParticularsBaseType value) {
        this.particularsBase = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationResponseType }
     * 
     * 
     */
    public List<RegistrationResponseType> getRegistration() {
        if (registration == null) {
            registration = new ArrayList<RegistrationResponseType>();
        }
        return this.registration;
    }

}
