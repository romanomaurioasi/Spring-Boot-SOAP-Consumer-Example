
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ESRType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ESRType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ESRBalance" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *         &lt;element name="ESRReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESRAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESRLine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESRType", propOrder = {
    "esrBalance",
    "esrReference",
    "esrAccountNumber",
    "esrLine"
})
public class ESRType {

    @XmlElement(name = "ESRBalance", required = true)
    protected BigDecimal esrBalance;
    @XmlElement(name = "ESRReference", required = true)
    protected String esrReference;
    @XmlElement(name = "ESRAccountNumber", required = true)
    protected String esrAccountNumber;
    @XmlElement(name = "ESRLine", required = true)
    protected String esrLine;

    /**
     * Recupera il valore della proprietà esrBalance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESRBalance() {
        return esrBalance;
    }

    /**
     * Imposta il valore della proprietà esrBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESRBalance(BigDecimal value) {
        this.esrBalance = value;
    }

    /**
     * Recupera il valore della proprietà esrReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESRReference() {
        return esrReference;
    }

    /**
     * Imposta il valore della proprietà esrReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESRReference(String value) {
        this.esrReference = value;
    }

    /**
     * Recupera il valore della proprietà esrAccountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESRAccountNumber() {
        return esrAccountNumber;
    }

    /**
     * Imposta il valore della proprietà esrAccountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESRAccountNumber(String value) {
        this.esrAccountNumber = value;
    }

    /**
     * Recupera il valore della proprietà esrLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESRLine() {
        return esrLine;
    }

    /**
     * Imposta il valore della proprietà esrLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESRLine(String value) {
        this.esrLine = value;
    }

}
