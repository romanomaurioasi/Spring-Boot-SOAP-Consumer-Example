
package ch.swissdec.schema.common._20200220.common;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ParagraphValueType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParagraphValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Integer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Double" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Boolean" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="YesNoUnknown" type="{http://www.swissdec.ch/schema/common/20200220/Common}YesNoUnknownType"/&gt;
 *         &lt;element name="Amount" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphValueType", propOrder = {
    "string",
    "integer",
    "_double",
    "_boolean",
    "date",
    "dateTime",
    "yesNoUnknown",
    "amount"
})
public class ParagraphValueType {

    @XmlElement(name = "String")
    protected String string;
    @XmlElement(name = "Integer")
    protected BigInteger integer;
    @XmlElement(name = "Double")
    protected Double _double;
    @XmlElement(name = "Boolean")
    protected Boolean _boolean;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "YesNoUnknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected YesNoUnknownType yesNoUnknown;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;

    /**
     * Recupera il valore della proprietà string.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Imposta il valore della proprietà string.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Recupera il valore della proprietà integer.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInteger() {
        return integer;
    }

    /**
     * Imposta il valore della proprietà integer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInteger(BigInteger value) {
        this.integer = value;
    }

    /**
     * Recupera il valore della proprietà double.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDouble() {
        return _double;
    }

    /**
     * Imposta il valore della proprietà double.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDouble(Double value) {
        this._double = value;
    }

    /**
     * Recupera il valore della proprietà boolean.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoolean() {
        return _boolean;
    }

    /**
     * Imposta il valore della proprietà boolean.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoolean(Boolean value) {
        this._boolean = value;
    }

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Recupera il valore della proprietà dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Imposta il valore della proprietà dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Recupera il valore della proprietà yesNoUnknown.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownType }
     *     
     */
    public YesNoUnknownType getYesNoUnknown() {
        return yesNoUnknown;
    }

    /**
     * Imposta il valore della proprietà yesNoUnknown.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownType }
     *     
     */
    public void setYesNoUnknown(YesNoUnknownType value) {
        this.yesNoUnknown = value;
    }

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
