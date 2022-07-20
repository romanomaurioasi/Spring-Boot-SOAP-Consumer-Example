
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per TaxAtSourceTotalsMonthType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceTotalsMonthType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceTotalsBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceTotalsMonthType", propOrder = {
    "currentMonth"
})
public class TaxAtSourceTotalsMonthType
    extends TaxAtSourceTotalsBaseType
{

    @XmlElement(name = "CurrentMonth", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar currentMonth;

    /**
     * Recupera il valore della proprietà currentMonth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentMonth() {
        return currentMonth;
    }

    /**
     * Imposta il valore della proprietà currentMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentMonth(XMLGregorianCalendar value) {
        this.currentMonth = value;
    }

}
