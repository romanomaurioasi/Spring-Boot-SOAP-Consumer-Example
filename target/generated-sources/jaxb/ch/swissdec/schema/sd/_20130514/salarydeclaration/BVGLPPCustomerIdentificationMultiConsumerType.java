
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per BVG-LPP-CustomerIdentificationMultiConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-CustomerIdentificationMultiConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BaseCustomerIdentificationMultiConsumerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayrollUnit" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="GeneralValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-CustomerIdentificationMultiConsumerType", propOrder = {
    "payrollUnit",
    "generalValidAsOf"
})
public class BVGLPPCustomerIdentificationMultiConsumerType
    extends BaseCustomerIdentificationMultiConsumerType
{

    @XmlElement(name = "PayrollUnit")
    protected String payrollUnit;
    @XmlElement(name = "GeneralValidAsOf", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar generalValidAsOf;

    /**
     * Recupera il valore della proprietà payrollUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollUnit() {
        return payrollUnit;
    }

    /**
     * Imposta il valore della proprietà payrollUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollUnit(String value) {
        this.payrollUnit = value;
    }

    /**
     * Recupera il valore della proprietà generalValidAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneralValidAsOf() {
        return generalValidAsOf;
    }

    /**
     * Imposta il valore della proprietà generalValidAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneralValidAsOf(XMLGregorianCalendar value) {
        this.generalValidAsOf = value;
    }

}
