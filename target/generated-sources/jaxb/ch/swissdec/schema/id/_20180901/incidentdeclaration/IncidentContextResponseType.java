
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.EmptyType;
import ch.swissdec.schema.common._20180901.common.IncidentCaseIDType;


/**
 * <p>Classe Java per IncidentContextResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentContextResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncidentContextGroup"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryNotificationResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryNotificationResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryNotificationResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentContextResponseType", propOrder = {
    "companyCaseID",
    "insuranceCaseID",
    "incidentCaseID",
    "receivedStoryIDs",
    "testCase",
    "info",
    "warning",
    "error"
})
public class IncidentContextResponseType {

    @XmlElement(name = "CompanyCaseID", required = true)
    protected String companyCaseID;
    @XmlElement(name = "InsuranceCaseID", required = true)
    protected String insuranceCaseID;
    @XmlElement(name = "IncidentCaseID", required = true)
    protected IncidentCaseIDType incidentCaseID;
    @XmlElement(name = "ReceivedStoryIDs", required = true)
    protected ReceivedStoriesType receivedStoryIDs;
    @XmlElement(name = "TestCase")
    protected EmptyType testCase;
    @XmlElement(name = "Info")
    protected List<StoryNotificationResponseType> info;
    @XmlElement(name = "Warning")
    protected List<StoryNotificationResponseType> warning;
    @XmlElement(name = "Error")
    protected List<StoryNotificationResponseType> error;

    /**
     * Recupera il valore della proprietà companyCaseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCaseID() {
        return companyCaseID;
    }

    /**
     * Imposta il valore della proprietà companyCaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCaseID(String value) {
        this.companyCaseID = value;
    }

    /**
     * Recupera il valore della proprietà insuranceCaseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCaseID() {
        return insuranceCaseID;
    }

    /**
     * Imposta il valore della proprietà insuranceCaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCaseID(String value) {
        this.insuranceCaseID = value;
    }

    /**
     * Recupera il valore della proprietà incidentCaseID.
     * 
     * @return
     *     possible object is
     *     {@link IncidentCaseIDType }
     *     
     */
    public IncidentCaseIDType getIncidentCaseID() {
        return incidentCaseID;
    }

    /**
     * Imposta il valore della proprietà incidentCaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentCaseIDType }
     *     
     */
    public void setIncidentCaseID(IncidentCaseIDType value) {
        this.incidentCaseID = value;
    }

    /**
     * Recupera il valore della proprietà receivedStoryIDs.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedStoriesType }
     *     
     */
    public ReceivedStoriesType getReceivedStoryIDs() {
        return receivedStoryIDs;
    }

    /**
     * Imposta il valore della proprietà receivedStoryIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedStoriesType }
     *     
     */
    public void setReceivedStoryIDs(ReceivedStoriesType value) {
        this.receivedStoryIDs = value;
    }

    /**
     * Recupera il valore della proprietà testCase.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getTestCase() {
        return testCase;
    }

    /**
     * Imposta il valore della proprietà testCase.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setTestCase(EmptyType value) {
        this.testCase = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoryNotificationResponseType }
     * 
     * 
     */
    public List<StoryNotificationResponseType> getInfo() {
        if (info == null) {
            info = new ArrayList<StoryNotificationResponseType>();
        }
        return this.info;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoryNotificationResponseType }
     * 
     * 
     */
    public List<StoryNotificationResponseType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<StoryNotificationResponseType>();
        }
        return this.warning;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoryNotificationResponseType }
     * 
     * 
     */
    public List<StoryNotificationResponseType> getError() {
        if (error == null) {
            error = new ArrayList<StoryNotificationResponseType>();
        }
        return this.error;
    }

}
