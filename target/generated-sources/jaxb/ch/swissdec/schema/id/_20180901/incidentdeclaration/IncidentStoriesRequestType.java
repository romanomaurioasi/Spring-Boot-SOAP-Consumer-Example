
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IncidentStoriesRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentStoriesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncidentContext" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncidentContextRequestType"/&gt;
 *         &lt;element name="IncapacitiesToWork" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncapacitiesToWorkType" minOccurs="0"/&gt;
 *         &lt;element name="TakeWorkUpFully" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}TakeWorkUpFullyType" minOccurs="0"/&gt;
 *         &lt;element name="Treatments" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}TreatmentsType" minOccurs="0"/&gt;
 *         &lt;element name="Agreement" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AgreementType" minOccurs="0"/&gt;
 *         &lt;element name="AnnualSalary" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AnnualSalaryType" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PaymentType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionsPerson" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AdditionsPersonType" minOccurs="0"/&gt;
 *         &lt;element name="Absences" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AbsencesType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialCode" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SpecialCodeType" minOccurs="0"/&gt;
 *         &lt;element name="AccidentDescription" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AccidentDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="SalaryRaise" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SalaryRaiseType" minOccurs="0"/&gt;
 *         &lt;element name="PersonMutated" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PersonMutatedType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialCoverage" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SpecialCoverageType" minOccurs="0"/&gt;
 *         &lt;element name="OtherEmployers" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}BooleanStoryType" minOccurs="0"/&gt;
 *         &lt;element name="ShortTimeWork" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}BooleanStoryType" minOccurs="0"/&gt;
 *         &lt;element name="DialogMessage" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}DialogMessageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Attachment" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AttachmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProcessCtrl" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ProcessCtrlRequestType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentStoriesRequestType", propOrder = {
    "incidentContext",
    "incapacitiesToWork",
    "takeWorkUpFully",
    "treatments",
    "agreement",
    "annualSalary",
    "payment",
    "additionsPerson",
    "absences",
    "specialCode",
    "accidentDescription",
    "salaryRaise",
    "personMutated",
    "specialCoverage",
    "otherEmployers",
    "shortTimeWork",
    "dialogMessage",
    "attachment",
    "processCtrl"
})
public class IncidentStoriesRequestType {

    @XmlElement(name = "IncidentContext", required = true)
    protected IncidentContextRequestType incidentContext;
    @XmlElement(name = "IncapacitiesToWork")
    protected IncapacitiesToWorkType incapacitiesToWork;
    @XmlElement(name = "TakeWorkUpFully")
    protected TakeWorkUpFullyType takeWorkUpFully;
    @XmlElement(name = "Treatments")
    protected TreatmentsType treatments;
    @XmlElement(name = "Agreement")
    protected AgreementType agreement;
    @XmlElement(name = "AnnualSalary")
    protected AnnualSalaryType annualSalary;
    @XmlElement(name = "Payment")
    protected PaymentType payment;
    @XmlElement(name = "AdditionsPerson")
    protected AdditionsPersonType additionsPerson;
    @XmlElement(name = "Absences")
    protected AbsencesType absences;
    @XmlElement(name = "SpecialCode")
    protected SpecialCodeType specialCode;
    @XmlElement(name = "AccidentDescription")
    protected AccidentDescriptionType accidentDescription;
    @XmlElement(name = "SalaryRaise")
    protected SalaryRaiseType salaryRaise;
    @XmlElement(name = "PersonMutated")
    protected PersonMutatedType personMutated;
    @XmlElement(name = "SpecialCoverage")
    protected SpecialCoverageType specialCoverage;
    @XmlElement(name = "OtherEmployers")
    protected BooleanStoryType otherEmployers;
    @XmlElement(name = "ShortTimeWork")
    protected BooleanStoryType shortTimeWork;
    @XmlElement(name = "DialogMessage")
    protected List<DialogMessageType> dialogMessage;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    @XmlElement(name = "ProcessCtrl")
    protected ProcessCtrlRequestType processCtrl;

    /**
     * Recupera il valore della proprietà incidentContext.
     * 
     * @return
     *     possible object is
     *     {@link IncidentContextRequestType }
     *     
     */
    public IncidentContextRequestType getIncidentContext() {
        return incidentContext;
    }

    /**
     * Imposta il valore della proprietà incidentContext.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentContextRequestType }
     *     
     */
    public void setIncidentContext(IncidentContextRequestType value) {
        this.incidentContext = value;
    }

    /**
     * Recupera il valore della proprietà incapacitiesToWork.
     * 
     * @return
     *     possible object is
     *     {@link IncapacitiesToWorkType }
     *     
     */
    public IncapacitiesToWorkType getIncapacitiesToWork() {
        return incapacitiesToWork;
    }

    /**
     * Imposta il valore della proprietà incapacitiesToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link IncapacitiesToWorkType }
     *     
     */
    public void setIncapacitiesToWork(IncapacitiesToWorkType value) {
        this.incapacitiesToWork = value;
    }

    /**
     * Recupera il valore della proprietà takeWorkUpFully.
     * 
     * @return
     *     possible object is
     *     {@link TakeWorkUpFullyType }
     *     
     */
    public TakeWorkUpFullyType getTakeWorkUpFully() {
        return takeWorkUpFully;
    }

    /**
     * Imposta il valore della proprietà takeWorkUpFully.
     * 
     * @param value
     *     allowed object is
     *     {@link TakeWorkUpFullyType }
     *     
     */
    public void setTakeWorkUpFully(TakeWorkUpFullyType value) {
        this.takeWorkUpFully = value;
    }

    /**
     * Recupera il valore della proprietà treatments.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentsType }
     *     
     */
    public TreatmentsType getTreatments() {
        return treatments;
    }

    /**
     * Imposta il valore della proprietà treatments.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentsType }
     *     
     */
    public void setTreatments(TreatmentsType value) {
        this.treatments = value;
    }

    /**
     * Recupera il valore della proprietà agreement.
     * 
     * @return
     *     possible object is
     *     {@link AgreementType }
     *     
     */
    public AgreementType getAgreement() {
        return agreement;
    }

    /**
     * Imposta il valore della proprietà agreement.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementType }
     *     
     */
    public void setAgreement(AgreementType value) {
        this.agreement = value;
    }

    /**
     * Recupera il valore della proprietà annualSalary.
     * 
     * @return
     *     possible object is
     *     {@link AnnualSalaryType }
     *     
     */
    public AnnualSalaryType getAnnualSalary() {
        return annualSalary;
    }

    /**
     * Imposta il valore della proprietà annualSalary.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualSalaryType }
     *     
     */
    public void setAnnualSalary(AnnualSalaryType value) {
        this.annualSalary = value;
    }

    /**
     * Recupera il valore della proprietà payment.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPayment() {
        return payment;
    }

    /**
     * Imposta il valore della proprietà payment.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPayment(PaymentType value) {
        this.payment = value;
    }

    /**
     * Recupera il valore della proprietà additionsPerson.
     * 
     * @return
     *     possible object is
     *     {@link AdditionsPersonType }
     *     
     */
    public AdditionsPersonType getAdditionsPerson() {
        return additionsPerson;
    }

    /**
     * Imposta il valore della proprietà additionsPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionsPersonType }
     *     
     */
    public void setAdditionsPerson(AdditionsPersonType value) {
        this.additionsPerson = value;
    }

    /**
     * Recupera il valore della proprietà absences.
     * 
     * @return
     *     possible object is
     *     {@link AbsencesType }
     *     
     */
    public AbsencesType getAbsences() {
        return absences;
    }

    /**
     * Imposta il valore della proprietà absences.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsencesType }
     *     
     */
    public void setAbsences(AbsencesType value) {
        this.absences = value;
    }

    /**
     * Recupera il valore della proprietà specialCode.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCodeType }
     *     
     */
    public SpecialCodeType getSpecialCode() {
        return specialCode;
    }

    /**
     * Imposta il valore della proprietà specialCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCodeType }
     *     
     */
    public void setSpecialCode(SpecialCodeType value) {
        this.specialCode = value;
    }

    /**
     * Recupera il valore della proprietà accidentDescription.
     * 
     * @return
     *     possible object is
     *     {@link AccidentDescriptionType }
     *     
     */
    public AccidentDescriptionType getAccidentDescription() {
        return accidentDescription;
    }

    /**
     * Imposta il valore della proprietà accidentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentDescriptionType }
     *     
     */
    public void setAccidentDescription(AccidentDescriptionType value) {
        this.accidentDescription = value;
    }

    /**
     * Recupera il valore della proprietà salaryRaise.
     * 
     * @return
     *     possible object is
     *     {@link SalaryRaiseType }
     *     
     */
    public SalaryRaiseType getSalaryRaise() {
        return salaryRaise;
    }

    /**
     * Imposta il valore della proprietà salaryRaise.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryRaiseType }
     *     
     */
    public void setSalaryRaise(SalaryRaiseType value) {
        this.salaryRaise = value;
    }

    /**
     * Recupera il valore della proprietà personMutated.
     * 
     * @return
     *     possible object is
     *     {@link PersonMutatedType }
     *     
     */
    public PersonMutatedType getPersonMutated() {
        return personMutated;
    }

    /**
     * Imposta il valore della proprietà personMutated.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonMutatedType }
     *     
     */
    public void setPersonMutated(PersonMutatedType value) {
        this.personMutated = value;
    }

    /**
     * Recupera il valore della proprietà specialCoverage.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCoverageType }
     *     
     */
    public SpecialCoverageType getSpecialCoverage() {
        return specialCoverage;
    }

    /**
     * Imposta il valore della proprietà specialCoverage.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCoverageType }
     *     
     */
    public void setSpecialCoverage(SpecialCoverageType value) {
        this.specialCoverage = value;
    }

    /**
     * Recupera il valore della proprietà otherEmployers.
     * 
     * @return
     *     possible object is
     *     {@link BooleanStoryType }
     *     
     */
    public BooleanStoryType getOtherEmployers() {
        return otherEmployers;
    }

    /**
     * Imposta il valore della proprietà otherEmployers.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanStoryType }
     *     
     */
    public void setOtherEmployers(BooleanStoryType value) {
        this.otherEmployers = value;
    }

    /**
     * Recupera il valore della proprietà shortTimeWork.
     * 
     * @return
     *     possible object is
     *     {@link BooleanStoryType }
     *     
     */
    public BooleanStoryType getShortTimeWork() {
        return shortTimeWork;
    }

    /**
     * Imposta il valore della proprietà shortTimeWork.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanStoryType }
     *     
     */
    public void setShortTimeWork(BooleanStoryType value) {
        this.shortTimeWork = value;
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
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
    }

    /**
     * Recupera il valore della proprietà processCtrl.
     * 
     * @return
     *     possible object is
     *     {@link ProcessCtrlRequestType }
     *     
     */
    public ProcessCtrlRequestType getProcessCtrl() {
        return processCtrl;
    }

    /**
     * Imposta il valore della proprietà processCtrl.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessCtrlRequestType }
     *     
     */
    public void setProcessCtrl(ProcessCtrlRequestType value) {
        this.processCtrl = value;
    }

}
