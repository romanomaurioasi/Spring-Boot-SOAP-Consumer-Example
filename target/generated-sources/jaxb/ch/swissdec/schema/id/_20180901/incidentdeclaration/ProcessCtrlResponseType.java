
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.ContactInstitutionType;
import ch.swissdec.schema.common._20180901.common.NameAndAddressType;
import ch.swissdec.schema.common._20180901.common.NotificationsType;


/**
 * <p>Classe Java per ProcessCtrlResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProcessCtrlResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeInsuranceCaseID" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}OldNewIDType" minOccurs="0"/&gt;
 *         &lt;element name="InstitutionAddress" type="{http://www.swissdec.ch/schema/common/20180901/Common}NameAndAddressType" minOccurs="0"/&gt;
 *         &lt;element name="ContactInsurance" type="{http://www.swissdec.ch/schema/common/20180901/Common}ContactInstitutionType" minOccurs="0"/&gt;
 *         &lt;element name="AwaitStory" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AwaitPartType" minOccurs="0"/&gt;
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
@XmlType(name = "ProcessCtrlResponseType", propOrder = {
    "changeInsuranceCaseID",
    "institutionAddress",
    "contactInsurance",
    "awaitStory",
    "comment"
})
public class ProcessCtrlResponseType
    extends StoryBaseType
{

    @XmlElement(name = "ChangeInsuranceCaseID")
    protected OldNewIDType changeInsuranceCaseID;
    @XmlElement(name = "InstitutionAddress")
    protected NameAndAddressType institutionAddress;
    @XmlElement(name = "ContactInsurance")
    protected ContactInstitutionType contactInsurance;
    @XmlElement(name = "AwaitStory")
    protected AwaitPartType awaitStory;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà changeInsuranceCaseID.
     * 
     * @return
     *     possible object is
     *     {@link OldNewIDType }
     *     
     */
    public OldNewIDType getChangeInsuranceCaseID() {
        return changeInsuranceCaseID;
    }

    /**
     * Imposta il valore della proprietà changeInsuranceCaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link OldNewIDType }
     *     
     */
    public void setChangeInsuranceCaseID(OldNewIDType value) {
        this.changeInsuranceCaseID = value;
    }

    /**
     * Recupera il valore della proprietà institutionAddress.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressType }
     *     
     */
    public NameAndAddressType getInstitutionAddress() {
        return institutionAddress;
    }

    /**
     * Imposta il valore della proprietà institutionAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressType }
     *     
     */
    public void setInstitutionAddress(NameAndAddressType value) {
        this.institutionAddress = value;
    }

    /**
     * Recupera il valore della proprietà contactInsurance.
     * 
     * @return
     *     possible object is
     *     {@link ContactInstitutionType }
     *     
     */
    public ContactInstitutionType getContactInsurance() {
        return contactInsurance;
    }

    /**
     * Imposta il valore della proprietà contactInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInstitutionType }
     *     
     */
    public void setContactInsurance(ContactInstitutionType value) {
        this.contactInsurance = value;
    }

    /**
     * Recupera il valore della proprietà awaitStory.
     * 
     * @return
     *     possible object is
     *     {@link AwaitPartType }
     *     
     */
    public AwaitPartType getAwaitStory() {
        return awaitStory;
    }

    /**
     * Imposta il valore della proprietà awaitStory.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitPartType }
     *     
     */
    public void setAwaitStory(AwaitPartType value) {
        this.awaitStory = value;
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
