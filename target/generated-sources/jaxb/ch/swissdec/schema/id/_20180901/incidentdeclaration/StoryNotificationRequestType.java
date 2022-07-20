
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.NotificationType;


/**
 * <p>Classe Java per StoryNotificationRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StoryNotificationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseStoryID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoryNotificationRequestType", propOrder = {
    "responseStoryID",
    "notification"
})
public class StoryNotificationRequestType {

    @XmlElement(name = "ResponseStoryID")
    protected String responseStoryID;
    @XmlElement(name = "Notification", namespace = "http://www.swissdec.ch/schema/common/20180901/Common", required = true)
    protected List<NotificationType> notification;

    /**
     * Recupera il valore della proprietà responseStoryID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStoryID() {
        return responseStoryID;
    }

    /**
     * Imposta il valore della proprietà responseStoryID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStoryID(String value) {
        this.responseStoryID = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationType }
     * 
     * 
     */
    public List<NotificationType> getNotification() {
        if (notification == null) {
            notification = new ArrayList<NotificationType>();
        }
        return this.notification;
    }

}
