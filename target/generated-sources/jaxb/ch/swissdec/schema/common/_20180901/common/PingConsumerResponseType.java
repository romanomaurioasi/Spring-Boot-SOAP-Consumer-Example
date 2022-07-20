
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PingConsumerResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PingConsumerResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserAgent" type="{http://www.swissdec.ch/schema/common/20180901/Common}UserAgentType"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="PlannedMaintenance" type="{http://www.swissdec.ch/schema/common/20180901/Common}PlannedMaintenanceType"/&gt;
 *           &lt;element name="NoPlannedMaintenance" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PingConsumerResponseType", propOrder = {
    "userAgent",
    "timestamp",
    "plannedMaintenance",
    "noPlannedMaintenance"
})
public class PingConsumerResponseType {

    @XmlElement(name = "UserAgent", required = true)
    protected UserAgentType userAgent;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "PlannedMaintenance")
    protected PlannedMaintenanceType plannedMaintenance;
    @XmlElement(name = "NoPlannedMaintenance")
    protected EmptyType noPlannedMaintenance;

    /**
     * Recupera il valore della proprietà userAgent.
     * 
     * @return
     *     possible object is
     *     {@link UserAgentType }
     *     
     */
    public UserAgentType getUserAgent() {
        return userAgent;
    }

    /**
     * Imposta il valore della proprietà userAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAgentType }
     *     
     */
    public void setUserAgent(UserAgentType value) {
        this.userAgent = value;
    }

    /**
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Recupera il valore della proprietà plannedMaintenance.
     * 
     * @return
     *     possible object is
     *     {@link PlannedMaintenanceType }
     *     
     */
    public PlannedMaintenanceType getPlannedMaintenance() {
        return plannedMaintenance;
    }

    /**
     * Imposta il valore della proprietà plannedMaintenance.
     * 
     * @param value
     *     allowed object is
     *     {@link PlannedMaintenanceType }
     *     
     */
    public void setPlannedMaintenance(PlannedMaintenanceType value) {
        this.plannedMaintenance = value;
    }

    /**
     * Recupera il valore della proprietà noPlannedMaintenance.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNoPlannedMaintenance() {
        return noPlannedMaintenance;
    }

    /**
     * Imposta il valore della proprietà noPlannedMaintenance.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNoPlannedMaintenance(EmptyType value) {
        this.noPlannedMaintenance = value;
    }

}
