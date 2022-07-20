
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.CompanyNameType;
import ch.swissdec.schema.common._20200220.common.EmptyType;
import ch.swissdec.schema.common._20200220.common.LanguageCodeType;
import ch.swissdec.schema.common._20200220.common.UserAgentType;


/**
 * <p>Classe Java per RequestContextType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RequestContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.swissdec.ch/schema/common/20200220/Common}RequestContextBaseGroup"/&gt;
 *         &lt;element name="TestCase" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestContextType", propOrder = {
    "userAgent",
    "companyName",
    "transmissionDate",
    "requestID",
    "languageCode",
    "monitoringID",
    "testCase"
})
public class RequestContextType {

    @XmlElement(name = "UserAgent", namespace = "http://www.swissdec.ch/schema/common/20200220/Common", required = true)
    protected UserAgentType userAgent;
    @XmlElement(name = "CompanyName", namespace = "http://www.swissdec.ch/schema/common/20200220/Common", required = true)
    protected CompanyNameType companyName;
    @XmlElement(name = "TransmissionDate", namespace = "http://www.swissdec.ch/schema/common/20200220/Common", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transmissionDate;
    @XmlElement(name = "RequestID", namespace = "http://www.swissdec.ch/schema/common/20200220/Common", required = true)
    protected String requestID;
    @XmlElement(name = "LanguageCode", namespace = "http://www.swissdec.ch/schema/common/20200220/Common", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected LanguageCodeType languageCode;
    @XmlElement(name = "MonitoringID", namespace = "http://www.swissdec.ch/schema/common/20200220/Common")
    protected String monitoringID;
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
     * Recupera il valore della proprietà companyName.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getCompanyName() {
        return companyName;
    }

    /**
     * Imposta il valore della proprietà companyName.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setCompanyName(CompanyNameType value) {
        this.companyName = value;
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
     * Recupera il valore della proprietà languageCode.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Imposta il valore della proprietà languageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

    /**
     * Recupera il valore della proprietà monitoringID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoringID() {
        return monitoringID;
    }

    /**
     * Imposta il valore della proprietà monitoringID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoringID(String value) {
        this.monitoringID = value;
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
