
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ParagraphAnswerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParagraphAnswerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="String" type="{http://www.swissdec.ch/schema/common/20200220/Common}AnswerStringType"/&gt;
 *           &lt;element name="Integer" type="{http://www.swissdec.ch/schema/common/20200220/Common}AnswerIntegerType"/&gt;
 *           &lt;element name="Double" type="{http://www.swissdec.ch/schema/common/20200220/Common}AnswerDoubleType"/&gt;
 *           &lt;element name="Boolean" type="{http://www.swissdec.ch/schema/common/20200220/Common}AnswerBooleanType"/&gt;
 *           &lt;element name="Date" type="{http://www.swissdec.ch/schema/common/20200220/Common}AnswerDateType"/&gt;
 *           &lt;element name="DateTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}AnswerDateTimeType"/&gt;
 *           &lt;element name="YesNoUnknown" type="{http://www.swissdec.ch/schema/common/20200220/Common}AnswerYesNoUnknownType"/&gt;
 *           &lt;element name="Amount" type="{http://www.swissdec.ch/schema/common/20200220/Common}AnswerAmountType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Problem" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="optional" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphAnswerType", propOrder = {
    "string",
    "integer",
    "_double",
    "_boolean",
    "date",
    "dateTime",
    "yesNoUnknown",
    "amount",
    "problem"
})
public class ParagraphAnswerType {

    @XmlElement(name = "String")
    protected AnswerStringType string;
    @XmlElement(name = "Integer")
    protected AnswerIntegerType integer;
    @XmlElement(name = "Double")
    protected AnswerDoubleType _double;
    @XmlElement(name = "Boolean")
    protected AnswerBooleanType _boolean;
    @XmlElement(name = "Date")
    protected AnswerDateType date;
    @XmlElement(name = "DateTime")
    protected AnswerDateTimeType dateTime;
    @XmlElement(name = "YesNoUnknown")
    protected AnswerYesNoUnknownType yesNoUnknown;
    @XmlElement(name = "Amount")
    protected AnswerAmountType amount;
    @XmlElement(name = "Problem")
    protected String problem;
    @XmlAttribute(name = "optional")
    protected String optional;

    /**
     * Recupera il valore della proprietà string.
     * 
     * @return
     *     possible object is
     *     {@link AnswerStringType }
     *     
     */
    public AnswerStringType getString() {
        return string;
    }

    /**
     * Imposta il valore della proprietà string.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerStringType }
     *     
     */
    public void setString(AnswerStringType value) {
        this.string = value;
    }

    /**
     * Recupera il valore della proprietà integer.
     * 
     * @return
     *     possible object is
     *     {@link AnswerIntegerType }
     *     
     */
    public AnswerIntegerType getInteger() {
        return integer;
    }

    /**
     * Imposta il valore della proprietà integer.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerIntegerType }
     *     
     */
    public void setInteger(AnswerIntegerType value) {
        this.integer = value;
    }

    /**
     * Recupera il valore della proprietà double.
     * 
     * @return
     *     possible object is
     *     {@link AnswerDoubleType }
     *     
     */
    public AnswerDoubleType getDouble() {
        return _double;
    }

    /**
     * Imposta il valore della proprietà double.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerDoubleType }
     *     
     */
    public void setDouble(AnswerDoubleType value) {
        this._double = value;
    }

    /**
     * Recupera il valore della proprietà boolean.
     * 
     * @return
     *     possible object is
     *     {@link AnswerBooleanType }
     *     
     */
    public AnswerBooleanType getBoolean() {
        return _boolean;
    }

    /**
     * Imposta il valore della proprietà boolean.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerBooleanType }
     *     
     */
    public void setBoolean(AnswerBooleanType value) {
        this._boolean = value;
    }

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link AnswerDateType }
     *     
     */
    public AnswerDateType getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerDateType }
     *     
     */
    public void setDate(AnswerDateType value) {
        this.date = value;
    }

    /**
     * Recupera il valore della proprietà dateTime.
     * 
     * @return
     *     possible object is
     *     {@link AnswerDateTimeType }
     *     
     */
    public AnswerDateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Imposta il valore della proprietà dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerDateTimeType }
     *     
     */
    public void setDateTime(AnswerDateTimeType value) {
        this.dateTime = value;
    }

    /**
     * Recupera il valore della proprietà yesNoUnknown.
     * 
     * @return
     *     possible object is
     *     {@link AnswerYesNoUnknownType }
     *     
     */
    public AnswerYesNoUnknownType getYesNoUnknown() {
        return yesNoUnknown;
    }

    /**
     * Imposta il valore della proprietà yesNoUnknown.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerYesNoUnknownType }
     *     
     */
    public void setYesNoUnknown(AnswerYesNoUnknownType value) {
        this.yesNoUnknown = value;
    }

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link AnswerAmountType }
     *     
     */
    public AnswerAmountType getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerAmountType }
     *     
     */
    public void setAmount(AnswerAmountType value) {
        this.amount = value;
    }

    /**
     * Recupera il valore della proprietà problem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblem() {
        return problem;
    }

    /**
     * Imposta il valore della proprietà problem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblem(String value) {
        this.problem = value;
    }

    /**
     * Recupera il valore della proprietà optional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptional() {
        return optional;
    }

    /**
     * Imposta il valore della proprietà optional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptional(String value) {
        this.optional = value;
    }

}
