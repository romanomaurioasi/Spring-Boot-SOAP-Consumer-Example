
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per IncapacityToWorkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncapacityToWorkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Percentage" type="{http://www.swissdec.ch/schema/common/20180901/Common}PercentType"/&gt;
 *         &lt;element name="EffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Valid" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ValidToType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncapacityToWorkType", propOrder = {
    "percentage",
    "effectiveFrom",
    "valid"
})
public class IncapacityToWorkType {

    @XmlElement(name = "Percentage", required = true)
    protected BigDecimal percentage;
    @XmlElement(name = "EffectiveFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveFrom;
    @XmlElement(name = "Valid", required = true)
    protected ValidToType valid;

    /**
     * Recupera il valore della proprietà percentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Imposta il valore della proprietà percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Recupera il valore della proprietà effectiveFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Imposta il valore della proprietà effectiveFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveFrom(XMLGregorianCalendar value) {
        this.effectiveFrom = value;
    }

    /**
     * Recupera il valore della proprietà valid.
     * 
     * @return
     *     possible object is
     *     {@link ValidToType }
     *     
     */
    public ValidToType getValid() {
        return valid;
    }

    /**
     * Imposta il valore della proprietà valid.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidToType }
     *     
     */
    public void setValid(ValidToType value) {
        this.valid = value;
    }

}
