
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per IncapacitiesToWorkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncapacitiesToWorkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="IncapacityToWork" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncapacityToWorkType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NoIncapacityToWork" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncapacitiesToWorkType", propOrder = {
    "incapacityToWork",
    "noIncapacityToWork"
})
public class IncapacitiesToWorkType
    extends StoryBaseType
{

    @XmlElement(name = "IncapacityToWork")
    protected List<IncapacityToWorkType> incapacityToWork;
    @XmlElement(name = "NoIncapacityToWork")
    protected EmptyType noIncapacityToWork;

    /**
     * Gets the value of the incapacityToWork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incapacityToWork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncapacityToWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncapacityToWorkType }
     * 
     * 
     */
    public List<IncapacityToWorkType> getIncapacityToWork() {
        if (incapacityToWork == null) {
            incapacityToWork = new ArrayList<IncapacityToWorkType>();
        }
        return this.incapacityToWork;
    }

    /**
     * Recupera il valore della proprietà noIncapacityToWork.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNoIncapacityToWork() {
        return noIncapacityToWork;
    }

    /**
     * Imposta il valore della proprietà noIncapacityToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNoIncapacityToWork(EmptyType value) {
        this.noIncapacityToWork = value;
    }

}
