
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.NotificationsType;


/**
 * <p>Classe Java per ProcessCtrlRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProcessCtrlRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncidentForCompanyClosed" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncidentForCompanyClosedType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeIdentities" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ChangeIdentitiesType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessCtrlRequestType", propOrder = {
    "incidentForCompanyClosed",
    "changeIdentities",
    "comment"
})
public class ProcessCtrlRequestType
    extends StoryBaseType
{

    @XmlElement(name = "IncidentForCompanyClosed")
    protected IncidentForCompanyClosedType incidentForCompanyClosed;
    @XmlElement(name = "ChangeIdentities")
    protected ChangeIdentitiesType changeIdentities;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà incidentForCompanyClosed.
     * 
     * @return
     *     possible object is
     *     {@link IncidentForCompanyClosedType }
     *     
     */
    public IncidentForCompanyClosedType getIncidentForCompanyClosed() {
        return incidentForCompanyClosed;
    }

    /**
     * Imposta il valore della proprietà incidentForCompanyClosed.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentForCompanyClosedType }
     *     
     */
    public void setIncidentForCompanyClosed(IncidentForCompanyClosedType value) {
        this.incidentForCompanyClosed = value;
    }

    /**
     * Recupera il valore della proprietà changeIdentities.
     * 
     * @return
     *     possible object is
     *     {@link ChangeIdentitiesType }
     *     
     */
    public ChangeIdentitiesType getChangeIdentities() {
        return changeIdentities;
    }

    /**
     * Imposta il valore della proprietà changeIdentities.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeIdentitiesType }
     *     
     */
    public void setChangeIdentities(ChangeIdentitiesType value) {
        this.changeIdentities = value;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setComment(NotificationsType value) {
        this.comment = value;
    }

}
