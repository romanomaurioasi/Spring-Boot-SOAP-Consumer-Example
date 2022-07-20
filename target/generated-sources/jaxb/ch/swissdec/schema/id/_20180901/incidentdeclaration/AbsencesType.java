
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AbsencesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbsencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Absence" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AbsenceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsencesType", propOrder = {
    "absence"
})
public class AbsencesType
    extends StoryBaseType
{

    @XmlElement(name = "Absence", required = true)
    protected List<AbsenceType> absence;

    /**
     * Gets the value of the absence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbsenceType }
     * 
     * 
     */
    public List<AbsenceType> getAbsence() {
        if (absence == null) {
            absence = new ArrayList<AbsenceType>();
        }
        return this.absence;
    }

}
