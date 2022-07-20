
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per CoveredDailyAllowanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CoveredDailyAllowanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Allowance" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *         &lt;element name="ValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveredDailyAllowanceType", propOrder = {
    "allowance",
    "validAsOf",
    "description"
})
public class CoveredDailyAllowanceType
    extends StoryBaseType
{

    @XmlElement(name = "Allowance", required = true)
    protected BigDecimal allowance;
    @XmlElement(name = "ValidAsOf")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validAsOf;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Recupera il valore della proprietà allowance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllowance() {
        return allowance;
    }

    /**
     * Imposta il valore della proprietà allowance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllowance(BigDecimal value) {
        this.allowance = value;
    }

    /**
     * Recupera il valore della proprietà validAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidAsOf() {
        return validAsOf;
    }

    /**
     * Imposta il valore della proprietà validAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidAsOf(XMLGregorianCalendar value) {
        this.validAsOf = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
