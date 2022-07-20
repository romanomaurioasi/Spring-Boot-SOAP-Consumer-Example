
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AnswerYesNoUnknownType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AnswerYesNoUnknownType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Default" type="{http://www.swissdec.ch/schema/common/20200220/Common}YesNoUnknownType" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.swissdec.ch/schema/common/20200220/Common}YesNoUnknownType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerYesNoUnknownType", propOrder = {
    "_default",
    "value"
})
public class AnswerYesNoUnknownType {

    @XmlElement(name = "Default")
    @XmlSchemaType(name = "NMTOKEN")
    protected YesNoUnknownType _default;
    @XmlElement(name = "Value")
    @XmlSchemaType(name = "NMTOKEN")
    protected YesNoUnknownType value;

    /**
     * Recupera il valore della proprietà default.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownType }
     *     
     */
    public YesNoUnknownType getDefault() {
        return _default;
    }

    /**
     * Imposta il valore della proprietà default.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownType }
     *     
     */
    public void setDefault(YesNoUnknownType value) {
        this._default = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownType }
     *     
     */
    public YesNoUnknownType getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownType }
     *     
     */
    public void setValue(YesNoUnknownType value) {
        this.value = value;
    }

}
