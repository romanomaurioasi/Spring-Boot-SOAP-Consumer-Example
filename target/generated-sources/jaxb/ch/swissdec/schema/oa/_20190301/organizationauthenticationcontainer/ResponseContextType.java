
package ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.EmptyType;
import ch.swissdec.schema.common._20180901.common.UserAgentType;


/**
 * <p>Classe Java per ResponseContextType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResponseContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserAgent" type="{http://www.swissdec.ch/schema/common/20180901/Common}UserAgentType"/&gt;
 *         &lt;element name="InstitutionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ResponseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="RequestID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="TestCase" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseContextType", propOrder = {
    "userAgent",
    "institutionName",
    "transmissionDate",
    "responseID",
    "requestID",
    "testCase"
})
public class ResponseContextType {

    @XmlElement(name = "UserAgent", required = true)
    protected UserAgentType userAgent;
    @XmlElement(name = "InstitutionName", required = true)
    protected String institutionName;
    @XmlElement(name = "TransmissionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transmissionDate;
    @XmlElement(name = "ResponseID", required = true)
    protected String responseID;
    @XmlElement(name = "RequestID", required = true)
    protected String requestID;
    @XmlElement(name = "TestCase")
    protected EmptyType testCase;

    /**
     * Recupera il valore della proprietà userAgent.
     * 
     * @return
     *     possible object is
     *     {@link UserAgentType }
     *     
     */
    public UserAgentType getUserAgent() {
        return userAgent;
    }

    /**
     * Imposta il valore della proprietà userAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAgentType }
     *     
     */
    public void setUserAgent(UserAgentType value) {
        this.userAgent = value;
    }

    /**
     * Recupera il valore della proprietà institutionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Imposta il valore della proprietà institutionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
    }

    /**
     * Recupera il valore della proprietà transmissionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransmissionDate() {
        return transmissionDate;
    }

    /**
     * Imposta il valore della proprietà transmissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransmissionDate(XMLGregorianCalendar value) {
        this.transmissionDate = value;
    }

    /**
     * Recupera il valore della proprietà responseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseID() {
        return responseID;
    }

    /**
     * Imposta il valore della proprietà responseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseID(String value) {
        this.responseID = value;
    }

    /**
     * Recupera il valore della proprietà requestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Imposta il valore della proprietà requestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
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

}
