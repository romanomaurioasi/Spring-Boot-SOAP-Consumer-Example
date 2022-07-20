
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TreatmentsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TreatmentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InitialTreatment" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}TreatmentAddressExtensionType"/&gt;
 *         &lt;element name="FurtherTreatment" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}TreatmentAddressExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreatmentsType", propOrder = {
    "initialTreatment",
    "furtherTreatment"
})
public class TreatmentsType
    extends StoryBaseType
{

    @XmlElement(name = "InitialTreatment", required = true)
    protected TreatmentAddressExtensionType initialTreatment;
    @XmlElement(name = "FurtherTreatment")
    protected List<TreatmentAddressExtensionType> furtherTreatment;

    /**
     * Recupera il valore della proprietà initialTreatment.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentAddressExtensionType }
     *     
     */
    public TreatmentAddressExtensionType getInitialTreatment() {
        return initialTreatment;
    }

    /**
     * Imposta il valore della proprietà initialTreatment.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentAddressExtensionType }
     *     
     */
    public void setInitialTreatment(TreatmentAddressExtensionType value) {
        this.initialTreatment = value;
    }

    /**
     * Gets the value of the furtherTreatment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the furtherTreatment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFurtherTreatment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TreatmentAddressExtensionType }
     * 
     * 
     */
    public List<TreatmentAddressExtensionType> getFurtherTreatment() {
        if (furtherTreatment == null) {
            furtherTreatment = new ArrayList<TreatmentAddressExtensionType>();
        }
        return this.furtherTreatment;
    }

}
