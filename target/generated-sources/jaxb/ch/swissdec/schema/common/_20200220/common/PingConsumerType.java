
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PingConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PingConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserAgent" type="{http://www.swissdec.ch/schema/common/20200220/Common}UserAgentType"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NextCheck" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RegisteredMaintenance" type="{http://www.swissdec.ch/schema/common/20200220/Common}RegisteredMaintenanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PingConsumerType", propOrder = {
    "userAgent",
    "timestamp",
    "nextCheck",
    "registeredMaintenance"
})
public class PingConsumerType {

    @XmlElement(name = "UserAgent", required = true)
    protected UserAgentType userAgent;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "NextCheck", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextCheck;
    @XmlElement(name = "RegisteredMaintenance")
    protected RegisteredMaintenanceType registeredMaintenance;

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
     * Recupera il valore della proprietà nextCheck.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextCheck() {
        return nextCheck;
    }

    /**
     * Imposta il valore della proprietà nextCheck.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextCheck(XMLGregorianCalendar value) {
        this.nextCheck = value;
    }

    /**
     * Recupera il valore della proprietà registeredMaintenance.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredMaintenanceType }
     *     
     */
    public RegisteredMaintenanceType getRegisteredMaintenance() {
        return registeredMaintenance;
    }

    /**
     * Imposta il valore della proprietà registeredMaintenance.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredMaintenanceType }
     *     
     */
    public void setRegisteredMaintenance(RegisteredMaintenanceType value) {
        this.registeredMaintenance = value;
    }

}
