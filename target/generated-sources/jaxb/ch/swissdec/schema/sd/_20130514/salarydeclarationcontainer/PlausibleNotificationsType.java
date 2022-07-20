
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PlausibleNotificationsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PlausibleNotificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="JobState" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}JobStateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlausibleNotificationsType", propOrder = {
    "warning",
    "info",
    "jobState"
})
public class PlausibleNotificationsType {

    @XmlElement(name = "Warning")
    protected NotificationsType warning;
    @XmlElement(name = "Info")
    protected NotificationsType info;
    @XmlElement(name = "JobState", required = true)
    protected JobStateType jobState;

    /**
     * Recupera il valore della proprietà warning.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getWarning() {
        return warning;
    }

    /**
     * Imposta il valore della proprietà warning.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setWarning(NotificationsType value) {
        this.warning = value;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setInfo(NotificationsType value) {
        this.info = value;
    }

    /**
     * Recupera il valore della proprietà jobState.
     * 
     * @return
     *     possible object is
     *     {@link JobStateType }
     *     
     */
    public JobStateType getJobState() {
        return jobState;
    }

    /**
     * Imposta il valore della proprietà jobState.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStateType }
     *     
     */
    public void setJobState(JobStateType value) {
        this.jobState = value;
    }

}
