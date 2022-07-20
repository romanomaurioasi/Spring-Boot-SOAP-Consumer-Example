
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per SalaryRaiseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryRaiseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Present" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}KindOfSalariesTimedType"/&gt;
 *         &lt;element name="ManualAdditions" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}KindOfSalaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryRaiseType", propOrder = {
    "validAsOf",
    "present",
    "manualAdditions"
})
public class SalaryRaiseType
    extends StoryBaseType
{

    @XmlElement(name = "ValidAsOf", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validAsOf;
    @XmlElement(name = "Present", required = true)
    protected KindOfSalariesTimedType present;
    @XmlElement(name = "ManualAdditions")
    protected List<KindOfSalaryType> manualAdditions;

    /**
     * Recupera il valore della proprietà validAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidAsOf() {
        return validAsOf;
    }

    /**
     * Imposta il valore della proprietà validAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidAsOf(XMLGregorianCalendar value) {
        this.validAsOf = value;
    }

    /**
     * Recupera il valore della proprietà present.
     * 
     * @return
     *     possible object is
     *     {@link KindOfSalariesTimedType }
     *     
     */
    public KindOfSalariesTimedType getPresent() {
        return present;
    }

    /**
     * Imposta il valore della proprietà present.
     * 
     * @param value
     *     allowed object is
     *     {@link KindOfSalariesTimedType }
     *     
     */
    public void setPresent(KindOfSalariesTimedType value) {
        this.present = value;
    }

    /**
     * Gets the value of the manualAdditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualAdditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualAdditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KindOfSalaryType }
     * 
     * 
     */
    public List<KindOfSalaryType> getManualAdditions() {
        if (manualAdditions == null) {
            manualAdditions = new ArrayList<KindOfSalaryType>();
        }
        return this.manualAdditions;
    }

}
