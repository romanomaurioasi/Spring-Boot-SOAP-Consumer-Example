
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IncidentStoriesResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentStoriesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncidentContext" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncidentContextResponseType"/&gt;
 *         &lt;element name="State" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StateType"/&gt;
 *         &lt;element name="DialogMessage" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}DialogMessageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Settlement" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SettlementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Repayment" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}RepaymentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CoveredDailyAllowance" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CoveredDailyAllowanceType" minOccurs="0"/&gt;
 *         &lt;element name="CrossChannelLink" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CrossChannelLinkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProcessCtrl" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ProcessCtrlResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentStoriesResponseType", propOrder = {
    "incidentContext",
    "state",
    "dialogMessage",
    "settlement",
    "repayment",
    "coveredDailyAllowance",
    "crossChannelLink",
    "processCtrl"
})
public class IncidentStoriesResponseType {

    @XmlElement(name = "IncidentContext", required = true)
    protected IncidentContextResponseType incidentContext;
    @XmlElement(name = "State", required = true)
    protected StateType state;
    @XmlElement(name = "DialogMessage")
    protected List<DialogMessageType> dialogMessage;
    @XmlElement(name = "Settlement")
    protected List<SettlementType> settlement;
    @XmlElement(name = "Repayment")
    protected List<RepaymentType> repayment;
    @XmlElement(name = "CoveredDailyAllowance")
    protected CoveredDailyAllowanceType coveredDailyAllowance;
    @XmlElement(name = "CrossChannelLink")
    protected List<CrossChannelLinkType> crossChannelLink;
    @XmlElement(name = "ProcessCtrl")
    protected ProcessCtrlResponseType processCtrl;

    /**
     * Recupera il valore della proprietà incidentContext.
     * 
     * @return
     *     possible object is
     *     {@link IncidentContextResponseType }
     *     
     */
    public IncidentContextResponseType getIncidentContext() {
        return incidentContext;
    }

    /**
     * Imposta il valore della proprietà incidentContext.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentContextResponseType }
     *     
     */
    public void setIncidentContext(IncidentContextResponseType value) {
        this.incidentContext = value;
    }

    /**
     * Recupera il valore della proprietà state.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Imposta il valore della proprietà state.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the dialogMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialogMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialogMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialogMessageType }
     * 
     * 
     */
    public List<DialogMessageType> getDialogMessage() {
        if (dialogMessage == null) {
            dialogMessage = new ArrayList<DialogMessageType>();
        }
        return this.dialogMessage;
    }

    /**
     * Gets the value of the settlement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementType }
     * 
     * 
     */
    public List<SettlementType> getSettlement() {
        if (settlement == null) {
            settlement = new ArrayList<SettlementType>();
        }
        return this.settlement;
    }

    /**
     * Gets the value of the repayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentType }
     * 
     * 
     */
    public List<RepaymentType> getRepayment() {
        if (repayment == null) {
            repayment = new ArrayList<RepaymentType>();
        }
        return this.repayment;
    }

    /**
     * Recupera il valore della proprietà coveredDailyAllowance.
     * 
     * @return
     *     possible object is
     *     {@link CoveredDailyAllowanceType }
     *     
     */
    public CoveredDailyAllowanceType getCoveredDailyAllowance() {
        return coveredDailyAllowance;
    }

    /**
     * Imposta il valore della proprietà coveredDailyAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredDailyAllowanceType }
     *     
     */
    public void setCoveredDailyAllowance(CoveredDailyAllowanceType value) {
        this.coveredDailyAllowance = value;
    }

    /**
     * Gets the value of the crossChannelLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossChannelLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossChannelLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossChannelLinkType }
     * 
     * 
     */
    public List<CrossChannelLinkType> getCrossChannelLink() {
        if (crossChannelLink == null) {
            crossChannelLink = new ArrayList<CrossChannelLinkType>();
        }
        return this.crossChannelLink;
    }

    /**
     * Recupera il valore della proprietà processCtrl.
     * 
     * @return
     *     possible object is
     *     {@link ProcessCtrlResponseType }
     *     
     */
    public ProcessCtrlResponseType getProcessCtrl() {
        return processCtrl;
    }

    /**
     * Imposta il valore della proprietà processCtrl.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessCtrlResponseType }
     *     
     */
    public void setProcessCtrl(ProcessCtrlResponseType value) {
        this.processCtrl = value;
    }

}
