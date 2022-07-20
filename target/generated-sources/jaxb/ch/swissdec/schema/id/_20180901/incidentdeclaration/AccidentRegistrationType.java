
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.swissdec.schema.common._20180901.common.EmptyType;
import ch.swissdec.schema.common._20180901.common.LanguageCodeType;


/**
 * <p>Classe Java per AccidentRegistrationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccidentRegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Incident" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncidentAccidentRegistrationType"/&gt;
 *           &lt;element name="Relapse" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}RelapseAccidentRegistrationType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CaseOfIncapacitiesToWork" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="InsuranceCode" type="{http://www.swissdec.ch/schema/common/20180901/Common}AssuranceCategoryCodeType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="WithoutContract" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="HRLanguageCode" type="{http://www.swissdec.ch/schema/common/20180901/Common}LanguageCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TestCase" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="incidentCaseIDMapRef" use="required" type="{http://www.swissdec.ch/schema/common/20180901/Common}InstanceRefIDType" /&gt;
 *       &lt;attribute name="institutionIDRef" use="required" type="{http://www.swissdec.ch/schema/common/20180901/Common}InstanceRefIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccidentRegistrationType", propOrder = {
    "companyCaseID",
    "incident",
    "relapse",
    "caseOfIncapacitiesToWork",
    "insuranceCode",
    "withoutContract",
    "hrLanguageCode",
    "testCase"
})
public class AccidentRegistrationType {

    @XmlElement(name = "CompanyCaseID", required = true)
    protected String companyCaseID;
    @XmlElement(name = "Incident")
    protected IncidentAccidentRegistrationType incident;
    @XmlElement(name = "Relapse")
    protected RelapseAccidentRegistrationType relapse;
    @XmlElement(name = "CaseOfIncapacitiesToWork")
    protected EmptyType caseOfIncapacitiesToWork;
    @XmlElement(name = "InsuranceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> insuranceCode;
    @XmlElement(name = "WithoutContract")
    protected EmptyType withoutContract;
    @XmlElement(name = "HRLanguageCode")
    @XmlSchemaType(name = "NMTOKEN")
    protected LanguageCodeType hrLanguageCode;
    @XmlElement(name = "TestCase")
    protected EmptyType testCase;
    @XmlAttribute(name = "incidentCaseIDMapRef", required = true)
    protected String incidentCaseIDMapRef;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

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
     * Recupera il valore della proprietà incident.
     * 
     * @return
     *     possible object is
     *     {@link IncidentAccidentRegistrationType }
     *     
     */
    public IncidentAccidentRegistrationType getIncident() {
        return incident;
    }

    /**
     * Imposta il valore della proprietà incident.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentAccidentRegistrationType }
     *     
     */
    public void setIncident(IncidentAccidentRegistrationType value) {
        this.incident = value;
    }

    /**
     * Recupera il valore della proprietà relapse.
     * 
     * @return
     *     possible object is
     *     {@link RelapseAccidentRegistrationType }
     *     
     */
    public RelapseAccidentRegistrationType getRelapse() {
        return relapse;
    }

    /**
     * Imposta il valore della proprietà relapse.
     * 
     * @param value
     *     allowed object is
     *     {@link RelapseAccidentRegistrationType }
     *     
     */
    public void setRelapse(RelapseAccidentRegistrationType value) {
        this.relapse = value;
    }

    /**
     * Recupera il valore della proprietà caseOfIncapacitiesToWork.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getCaseOfIncapacitiesToWork() {
        return caseOfIncapacitiesToWork;
    }

    /**
     * Imposta il valore della proprietà caseOfIncapacitiesToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setCaseOfIncapacitiesToWork(EmptyType value) {
        this.caseOfIncapacitiesToWork = value;
    }

    /**
     * Gets the value of the insuranceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInsuranceCode() {
        if (insuranceCode == null) {
            insuranceCode = new ArrayList<String>();
        }
        return this.insuranceCode;
    }

    /**
     * Recupera il valore della proprietà withoutContract.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getWithoutContract() {
        return withoutContract;
    }

    /**
     * Imposta il valore della proprietà withoutContract.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setWithoutContract(EmptyType value) {
        this.withoutContract = value;
    }

    /**
     * Recupera il valore della proprietà hrLanguageCode.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getHRLanguageCode() {
        return hrLanguageCode;
    }

    /**
     * Imposta il valore della proprietà hrLanguageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setHRLanguageCode(LanguageCodeType value) {
        this.hrLanguageCode = value;
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
     * Recupera il valore della proprietà incidentCaseIDMapRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCaseIDMapRef() {
        return incidentCaseIDMapRef;
    }

    /**
     * Imposta il valore della proprietà incidentCaseIDMapRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCaseIDMapRef(String value) {
        this.incidentCaseIDMapRef = value;
    }

    /**
     * Recupera il valore della proprietà institutionIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionIDRef() {
        return institutionIDRef;
    }

    /**
     * Imposta il valore della proprietà institutionIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionIDRef(String value) {
        this.institutionIDRef = value;
    }

}
