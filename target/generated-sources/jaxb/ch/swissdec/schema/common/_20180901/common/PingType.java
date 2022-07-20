
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserAgent" type="{http://www.swissdec.ch/schema/common/20180901/Common}UserAgentType"/&gt;
 *         &lt;element name="SystemDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MonitoringID" type="{http://www.swissdec.ch/schema/common/20180901/Common}MonitoringIDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PingType", propOrder = {
    "userAgent",
    "systemDateTime",
    "monitoringID"
})
public class PingType {

    @XmlElement(name = "UserAgent", required = true)
    protected UserAgentType userAgent;
    @XmlElement(name = "SystemDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemDateTime;
    @XmlElement(name = "MonitoringID")
    protected String monitoringID;

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
     * Recupera il valore della proprietà systemDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemDateTime() {
        return systemDateTime;
    }

    /**
     * Imposta il valore della proprietà systemDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemDateTime(XMLGregorianCalendar value) {
        this.systemDateTime = value;
    }

    /**
     * Recupera il valore della proprietà monitoringID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoringID() {
        return monitoringID;
    }

    /**
     * Imposta il valore della proprietà monitoringID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoringID(String value) {
        this.monitoringID = value;
    }

}
