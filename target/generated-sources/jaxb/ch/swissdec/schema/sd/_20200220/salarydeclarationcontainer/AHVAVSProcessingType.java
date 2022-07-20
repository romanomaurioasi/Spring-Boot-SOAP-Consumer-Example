
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AHV-AVS-ProcessingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-ProcessingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AHV-AVS-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpectedAvailability" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-ProcessingType", propOrder = {
    "expectedAvailability"
})
public class AHVAVSProcessingType
    extends AHVAVSMinimalResultStateType
{

    @XmlElement(name = "ExpectedAvailability")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedAvailability;

    /**
     * Recupera il valore della proprietà expectedAvailability.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedAvailability() {
        return expectedAvailability;
    }

    /**
     * Imposta il valore della proprietà expectedAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedAvailability(XMLGregorianCalendar value) {
        this.expectedAvailability = value;
    }

}
