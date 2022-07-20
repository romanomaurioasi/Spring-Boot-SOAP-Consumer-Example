
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
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.EmptyType;
import ch.swissdec.schema.common._20180901.common.LanguageCodeType;


/**
 * <p>Classe Java per IllnessRegistrationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IllnessRegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="BeginIncapacitiesToWork" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="InsuranceCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType" minOccurs="0"/&gt;
 *         &lt;element name="InsuranceCode" type="{http://www.swissdec.ch/schema/common/20180901/Common}AssuranceCategoryCodeType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "IllnessRegistrationType", propOrder = {
    "companyCaseID",
    "beginIncapacitiesToWork",
    "dateOfBirth",
    "insuranceCaseID",
    "insuranceCode",
    "hrLanguageCode",
    "testCase"
})
public class IllnessRegistrationType {

    @XmlElement(name = "CompanyCaseID", required = true)
    protected String companyCaseID;
    @XmlElement(name = "BeginIncapacitiesToWork")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginIncapacitiesToWork;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "InsuranceCaseID")
    protected String insuranceCaseID;
    @XmlElement(name = "InsuranceCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> insuranceCode;
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
     * Recupera il valore della proprietà beginIncapacitiesToWork.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginIncapacitiesToWork() {
        return beginIncapacitiesToWork;
    }

    /**
     * Imposta il valore della proprietà beginIncapacitiesToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginIncapacitiesToWork(XMLGregorianCalendar value) {
        this.beginIncapacitiesToWork = value;
    }

    /**
     * Recupera il valore della proprietà dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Imposta il valore della proprietà dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
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
