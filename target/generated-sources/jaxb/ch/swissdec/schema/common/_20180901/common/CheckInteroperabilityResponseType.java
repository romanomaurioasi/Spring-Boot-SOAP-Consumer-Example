
package ch.swissdec.schema.common._20180901.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per CheckInteroperabilityResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CheckInteroperabilityResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserAgent" type="{http://www.swissdec.ch/schema/common/20180901/Common}UserAgentType"/&gt;
 *         &lt;element name="UmlautStringIsCorrect" type="{http://www.swissdec.ch/schema/common/20180901/Common}SimpleBooleanType"/&gt;
 *         &lt;element name="FirstOperandIsCorrect" type="{http://www.swissdec.ch/schema/common/20180901/Common}SimpleBooleanType"/&gt;
 *         &lt;element name="UmlautString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdditionResult" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *         &lt;element name="SubtractionResult" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *         &lt;element name="SystemDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInteroperabilityResponseType", propOrder = {
    "userAgent",
    "umlautStringIsCorrect",
    "firstOperandIsCorrect",
    "umlautString",
    "additionResult",
    "subtractionResult",
    "systemDateTime"
})
public class CheckInteroperabilityResponseType {

    @XmlElement(name = "UserAgent", required = true)
    protected UserAgentType userAgent;
    @XmlElement(name = "UmlautStringIsCorrect")
    protected boolean umlautStringIsCorrect;
    @XmlElement(name = "FirstOperandIsCorrect")
    protected boolean firstOperandIsCorrect;
    @XmlElement(name = "UmlautString", required = true)
    protected String umlautString;
    @XmlElement(name = "AdditionResult", required = true)
    protected BigDecimal additionResult;
    @XmlElement(name = "SubtractionResult", required = true)
    protected BigDecimal subtractionResult;
    @XmlElement(name = "SystemDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemDateTime;

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
     * Recupera il valore della proprietà umlautStringIsCorrect.
     * 
     */
    public boolean isUmlautStringIsCorrect() {
        return umlautStringIsCorrect;
    }

    /**
     * Imposta il valore della proprietà umlautStringIsCorrect.
     * 
     */
    public void setUmlautStringIsCorrect(boolean value) {
        this.umlautStringIsCorrect = value;
    }

    /**
     * Recupera il valore della proprietà firstOperandIsCorrect.
     * 
     */
    public boolean isFirstOperandIsCorrect() {
        return firstOperandIsCorrect;
    }

    /**
     * Imposta il valore della proprietà firstOperandIsCorrect.
     * 
     */
    public void setFirstOperandIsCorrect(boolean value) {
        this.firstOperandIsCorrect = value;
    }

    /**
     * Recupera il valore della proprietà umlautString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmlautString() {
        return umlautString;
    }

    /**
     * Imposta il valore della proprietà umlautString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmlautString(String value) {
        this.umlautString = value;
    }

    /**
     * Recupera il valore della proprietà additionResult.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionResult() {
        return additionResult;
    }

    /**
     * Imposta il valore della proprietà additionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionResult(BigDecimal value) {
        this.additionResult = value;
    }

    /**
     * Recupera il valore della proprietà subtractionResult.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubtractionResult() {
        return subtractionResult;
    }

    /**
     * Imposta il valore della proprietà subtractionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubtractionResult(BigDecimal value) {
        this.subtractionResult = value;
    }

    /**
     * Recupera il valore della proprietà systemDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemDateTime() {
        return systemDateTime;
    }

    /**
     * Imposta il valore della proprietà systemDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemDateTime(XMLGregorianCalendar value) {
        this.systemDateTime = value;
    }

}
