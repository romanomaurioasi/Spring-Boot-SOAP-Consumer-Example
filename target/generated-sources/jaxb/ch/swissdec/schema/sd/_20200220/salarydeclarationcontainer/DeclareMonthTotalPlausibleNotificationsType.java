
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.NotificationsType;


/**
 * <p>Classe Java per DeclareMonthTotalPlausibleNotificationsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclareMonthTotalPlausibleNotificationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="JobStateMonthTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}JobStateMonthTotal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclareMonthTotalPlausibleNotificationsType", propOrder = {
    "warning",
    "info",
    "jobStateMonthTotal"
})
public class DeclareMonthTotalPlausibleNotificationsType {

    @XmlElement(name = "Warning")
    protected NotificationsType warning;
    @XmlElement(name = "Info")
    protected NotificationsType info;
    @XmlElement(name = "JobStateMonthTotal", required = true)
    protected JobStateMonthTotal jobStateMonthTotal;

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
     * Recupera il valore della proprietà jobStateMonthTotal.
     * 
     * @return
     *     possible object is
     *     {@link JobStateMonthTotal }
     *     
     */
    public JobStateMonthTotal getJobStateMonthTotal() {
        return jobStateMonthTotal;
    }

    /**
     * Imposta il valore della proprietà jobStateMonthTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStateMonthTotal }
     *     
     */
    public void setJobStateMonthTotal(JobStateMonthTotal value) {
        this.jobStateMonthTotal = value;
    }

}