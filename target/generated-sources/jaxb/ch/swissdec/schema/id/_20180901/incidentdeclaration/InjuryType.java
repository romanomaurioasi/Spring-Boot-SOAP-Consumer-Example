
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InjuryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InjuryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InjuredPartOfBody" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}InjuredPartOfBodyType" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InjuryType", propOrder = {
    "injuredPartOfBody"
})
public class InjuryType {

    @XmlElement(name = "InjuredPartOfBody", required = true)
    protected List<InjuredPartOfBodyType> injuredPartOfBody;

    /**
     * Gets the value of the injuredPartOfBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the injuredPartOfBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInjuredPartOfBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InjuredPartOfBodyType }
     * 
     * 
     */
    public List<InjuredPartOfBodyType> getInjuredPartOfBody() {
        if (injuredPartOfBody == null) {
            injuredPartOfBody = new ArrayList<InjuredPartOfBodyType>();
        }
        return this.injuredPartOfBody;
    }

}
