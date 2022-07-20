
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.NotificationsType;
import ch.swissdec.schema.id._20180901.incidentdeclaration.IncidentStoriesResponseType;
import ch.swissdec.schema.id._20180901.incidentdeclaration.StoriesWithoutDeclarationType;


/**
 * <p>Classe Java per SynchronizeIncidentConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SynchronizeIncidentConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddresseeContext" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ContextConsumerBaseType"/&gt;
 *         &lt;element name="Institution" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}InstitutionIdentificationType"/&gt;
 *         &lt;element name="DigitalizationScope" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}DigitalizationScopeType"/&gt;
 *         &lt;element name="IncidentStories" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncidentStoriesResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StoriesWithoutDeclaration" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoriesWithoutDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="Available" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IncidentCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizeIncidentConsumerType", propOrder = {
    "addresseeContext",
    "institution",
    "digitalizationScope",
    "incidentStories",
    "storiesWithoutDeclaration",
    "available",
    "info",
    "warning"
})
public class SynchronizeIncidentConsumerType {

    @XmlElement(name = "AddresseeContext", required = true)
    protected ContextConsumerBaseType addresseeContext;
    @XmlElement(name = "Institution", required = true)
    protected InstitutionIdentificationType institution;
    @XmlElement(name = "DigitalizationScope", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected DigitalizationScopeType digitalizationScope;
    @XmlElement(name = "IncidentStories")
    protected List<IncidentStoriesResponseType> incidentStories;
    @XmlElement(name = "StoriesWithoutDeclaration")
    protected StoriesWithoutDeclarationType storiesWithoutDeclaration;
    @XmlElement(name = "Available")
    protected SynchronizeIncidentConsumerType.Available available;
    @XmlElement(name = "Info")
    protected NotificationsType info;
    @XmlElement(name = "Warning")
    protected NotificationsType warning;

    /**
     * Recupera il valore della proprietà addresseeContext.
     * 
     * @return
     *     possible object is
     *     {@link ContextConsumerBaseType }
     *     
     */
    public ContextConsumerBaseType getAddresseeContext() {
        return addresseeContext;
    }

    /**
     * Imposta il valore della proprietà addresseeContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextConsumerBaseType }
     *     
     */
    public void setAddresseeContext(ContextConsumerBaseType value) {
        this.addresseeContext = value;
    }

    /**
     * Recupera il valore della proprietà institution.
     * 
     * @return
     *     possible object is
     *     {@link InstitutionIdentificationType }
     *     
     */
    public InstitutionIdentificationType getInstitution() {
        return institution;
    }

    /**
     * Imposta il valore della proprietà institution.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitutionIdentificationType }
     *     
     */
    public void setInstitution(InstitutionIdentificationType value) {
        this.institution = value;
    }

    /**
     * Recupera il valore della proprietà digitalizationScope.
     * 
     * @return
     *     possible object is
     *     {@link DigitalizationScopeType }
     *     
     */
    public DigitalizationScopeType getDigitalizationScope() {
        return digitalizationScope;
    }

    /**
     * Imposta il valore della proprietà digitalizationScope.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalizationScopeType }
     *     
     */
    public void setDigitalizationScope(DigitalizationScopeType value) {
        this.digitalizationScope = value;
    }

    /**
     * Gets the value of the incidentStories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incidentStories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncidentStories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncidentStoriesResponseType }
     * 
     * 
     */
    public List<IncidentStoriesResponseType> getIncidentStories() {
        if (incidentStories == null) {
            incidentStories = new ArrayList<IncidentStoriesResponseType>();
        }
        return this.incidentStories;
    }

    /**
     * Recupera il valore della proprietà storiesWithoutDeclaration.
     * 
     * @return
     *     possible object is
     *     {@link StoriesWithoutDeclarationType }
     *     
     */
    public StoriesWithoutDeclarationType getStoriesWithoutDeclaration() {
        return storiesWithoutDeclaration;
    }

    /**
     * Imposta il valore della proprietà storiesWithoutDeclaration.
     * 
     * @param value
     *     allowed object is
     *     {@link StoriesWithoutDeclarationType }
     *     
     */
    public void setStoriesWithoutDeclaration(StoriesWithoutDeclarationType value) {
        this.storiesWithoutDeclaration = value;
    }

    /**
     * Recupera il valore della proprietà available.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizeIncidentConsumerType.Available }
     *     
     */
    public SynchronizeIncidentConsumerType.Available getAvailable() {
        return available;
    }

    /**
     * Imposta il valore della proprietà available.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizeIncidentConsumerType.Available }
     *     
     */
    public void setAvailable(SynchronizeIncidentConsumerType.Available value) {
        this.available = value;
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
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IncidentCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "incidentCaseID"
    })
    public static class Available {

        @XmlElement(name = "IncidentCaseID", required = true)
        protected List<String> incidentCaseID;

        /**
         * Gets the value of the incidentCaseID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incidentCaseID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncidentCaseID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncidentCaseID() {
            if (incidentCaseID == null) {
                incidentCaseID = new ArrayList<String>();
            }
            return this.incidentCaseID;
        }

    }

}
