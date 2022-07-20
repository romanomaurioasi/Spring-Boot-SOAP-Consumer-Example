
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AHV-AVS-IncomeSplitsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-IncomeSplitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AdditionalDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Splits" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SplitsTypes"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-IncomeSplitsType", propOrder = {
    "additionalDeliveryDate",
    "splits"
})
public class AHVAVSIncomeSplitsType {

    @XmlElement(name = "AdditionalDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar additionalDeliveryDate;
    @XmlElement(name = "Splits")
    protected SplitsTypes splits;

    /**
     * Recupera il valore della proprietà additionalDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdditionalDeliveryDate() {
        return additionalDeliveryDate;
    }

    /**
     * Imposta il valore della proprietà additionalDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdditionalDeliveryDate(XMLGregorianCalendar value) {
        this.additionalDeliveryDate = value;
    }

    /**
     * Recupera il valore della proprietà splits.
     * 
     * @return
     *     possible object is
     *     {@link SplitsTypes }
     *     
     */
    public SplitsTypes getSplits() {
        return splits;
    }

    /**
     * Imposta il valore della proprietà splits.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitsTypes }
     *     
     */
    public void setSplits(SplitsTypes value) {
        this.splits = value;
    }

}
