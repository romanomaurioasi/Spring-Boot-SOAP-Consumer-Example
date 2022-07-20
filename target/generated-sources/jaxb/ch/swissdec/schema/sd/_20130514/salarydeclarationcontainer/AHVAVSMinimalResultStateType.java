
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.AHVAVSCustomerIdentificationConsumerType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Informations concernant l'état&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per AHV-AVS-MinimalResultStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-MinimalResultStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ResultStateBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Institution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AHV-AVS-CustomerIdentificationConsumerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-MinimalResultStateType", propOrder = {
    "institution"
})
@XmlSeeAlso({
    AHVAVSProcessingType.class,
    AHVAVSSuccessType.class
})
public class AHVAVSMinimalResultStateType
    extends ResultStateBaseType
{

    @XmlElement(name = "Institution", required = true)
    protected AHVAVSCustomerIdentificationConsumerType institution;

    /**
     * Recupera il valore della proprietà institution.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSCustomerIdentificationConsumerType }
     *     
     */
    public AHVAVSCustomerIdentificationConsumerType getInstitution() {
        return institution;
    }

    /**
     * Imposta il valore della proprietà institution.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSCustomerIdentificationConsumerType }
     *     
     */
    public void setInstitution(AHVAVSCustomerIdentificationConsumerType value) {
        this.institution = value;
    }

}
