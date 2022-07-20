
package ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per CheckInteroperabilityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CheckInteroperabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UmlautString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstOperand" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="SecondOperand" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="SystemDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MonitoringID" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInteroperabilityType", propOrder = {
    "umlautString",
    "firstOperand",
    "secondOperand",
    "systemDateTime",
    "monitoringID"
})
public class CheckInteroperabilityType {

    @XmlElement(name = "UmlautString", required = true)
    protected String umlautString;
    @XmlElement(name = "FirstOperand", required = true)
    protected BigDecimal firstOperand;
    @XmlElement(name = "SecondOperand", required = true)
    protected BigDecimal secondOperand;
    @XmlElement(name = "SystemDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemDateTime;
    @XmlElement(name = "MonitoringID")
    protected String monitoringID;

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
     * Recupera il valore della proprietà firstOperand.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    /**
     * Imposta il valore della proprietà firstOperand.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstOperand(BigDecimal value) {
        this.firstOperand = value;
    }

    /**
     * Recupera il valore della proprietà secondOperand.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    /**
     * Imposta il valore della proprietà secondOperand.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondOperand(BigDecimal value) {
        this.secondOperand = value;
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

}
