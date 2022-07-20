
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.ContactInstitutionType;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per RegistrationResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RegistrationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseState" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ResponseStateType"/&gt;
 *         &lt;element name="CompanyCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="InsuranceCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="IncidentCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="ContactInsurance" type="{http://www.swissdec.ch/schema/common/20180901/Common}ContactInstitutionType" minOccurs="0"/&gt;
 *         &lt;element name="TestCase" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="incidentCaseIDMapRef" use="required" type="{http://www.swissdec.ch/schema/common/20180901/Common}InstanceRefIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationResponseType", propOrder = {
    "responseState",
    "companyCaseID",
    "insuranceCaseID",
    "incidentCaseID",
    "contactInsurance",
    "testCase"
})
@XmlSeeAlso({
    AccidentRegistrationResponseType.class
})
public class RegistrationResponseType {

    @XmlElement(name = "ResponseState", required = true)
    protected ResponseStateType responseState;
    @XmlElement(name = "CompanyCaseID", required = true)
    protected String companyCaseID;
    @XmlElement(name = "InsuranceCaseID", required = true)
    protected String insuranceCaseID;
    @XmlElement(name = "IncidentCaseID", required = true)
    protected String incidentCaseID;
    @XmlElement(name = "ContactInsurance")
    protected ContactInstitutionType contactInsurance;
    @XmlElement(name = "TestCase")
    protected EmptyType testCase;
    @XmlAttribute(name = "incidentCaseIDMapRef", required = true)
    protected String incidentCaseIDMapRef;

    /**
     * Recupera il valore della proprietà responseState.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStateType }
     *     
     */
    public ResponseStateType getResponseState() {
        return responseState;
    }

    /**
     * Imposta il valore della proprietà responseState.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStateType }
     *     
     */
    public void setResponseState(ResponseStateType value) {
        this.responseState = value;
    }

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
     *     {@link String }
     *     
     */
    public String getIncidentCaseID() {
        return incidentCaseID;
    }

    /**
     * Imposta il valore della proprietà incidentCaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCaseID(String value) {
        this.incidentCaseID = value;
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

}
