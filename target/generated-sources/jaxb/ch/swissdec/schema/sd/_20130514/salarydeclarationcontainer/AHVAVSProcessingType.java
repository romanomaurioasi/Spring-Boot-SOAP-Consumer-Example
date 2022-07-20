
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Dans le traitement&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;La préparation des cotisations est traitée&lt;/short&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per AHV-AVS-ProcessingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-ProcessingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AHV-AVS-MinimalResultStateType"&gt;
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
