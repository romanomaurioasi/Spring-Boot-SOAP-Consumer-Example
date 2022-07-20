
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IndemnificationsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IndemnificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Normal" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IndemnificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Correction" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IndemnificationCorrectionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndemnificationsType", propOrder = {
    "normal",
    "correction"
})
public class IndemnificationsType {

    @XmlElement(name = "Normal")
    protected List<IndemnificationType> normal;
    @XmlElement(name = "Correction")
    protected List<IndemnificationCorrectionType> correction;

    /**
     * Gets the value of the normal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndemnificationType }
     * 
     * 
     */
    public List<IndemnificationType> getNormal() {
        if (normal == null) {
            normal = new ArrayList<IndemnificationType>();
        }
        return this.normal;
    }

    /**
     * Gets the value of the correction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndemnificationCorrectionType }
     * 
     * 
     */
    public List<IndemnificationCorrectionType> getCorrection() {
        if (correction == null) {
            correction = new ArrayList<IndemnificationCorrectionType>();
        }
        return this.correction;
    }

}
