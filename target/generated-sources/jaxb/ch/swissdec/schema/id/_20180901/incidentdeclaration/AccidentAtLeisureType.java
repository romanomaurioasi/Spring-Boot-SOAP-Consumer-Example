
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AccidentAtLeisureType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccidentAtLeisureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastWorkingDay" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ActivityAtTimeOfAccident" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ActivityAtTimeOfAccidentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccidentAtLeisureType", propOrder = {
    "lastWorkingDay",
    "activityAtTimeOfAccident"
})
public class AccidentAtLeisureType {

    @XmlElement(name = "LastWorkingDay", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastWorkingDay;
    @XmlElement(name = "ActivityAtTimeOfAccident", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ActivityAtTimeOfAccidentType activityAtTimeOfAccident;

    /**
     * Recupera il valore della proprietà lastWorkingDay.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastWorkingDay() {
        return lastWorkingDay;
    }

    /**
     * Imposta il valore della proprietà lastWorkingDay.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastWorkingDay(XMLGregorianCalendar value) {
        this.lastWorkingDay = value;
    }

    /**
     * Recupera il valore della proprietà activityAtTimeOfAccident.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAtTimeOfAccidentType }
     *     
     */
    public ActivityAtTimeOfAccidentType getActivityAtTimeOfAccident() {
        return activityAtTimeOfAccident;
    }

    /**
     * Imposta il valore della proprietà activityAtTimeOfAccident.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAtTimeOfAccidentType }
     *     
     */
    public void setActivityAtTimeOfAccident(ActivityAtTimeOfAccidentType value) {
        this.activityAtTimeOfAccident = value;
    }

}
