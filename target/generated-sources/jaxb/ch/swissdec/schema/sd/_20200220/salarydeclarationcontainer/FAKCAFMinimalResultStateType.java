
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.FAKCAFCustomerIdentificationConsumerType;


/**
 * <p>Classe Java per FAK-CAF-MinimalResultStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-MinimalResultStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResultStateBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Institution" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-CustomerIdentificationConsumerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-MinimalResultStateType", propOrder = {
    "institution"
})
@XmlSeeAlso({
    FAKCAFProcessingType.class,
    FAKCAFSuccessType.class,
    FAKCAFDeclareMonthTotalSuccessType.class,
    FAKCAFSuccessDialogType.class
})
public class FAKCAFMinimalResultStateType
    extends ResultStateBaseType
{

    @XmlElement(name = "Institution", required = true)
    protected FAKCAFCustomerIdentificationConsumerType institution;

    /**
     * Recupera il valore della proprietà institution.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFCustomerIdentificationConsumerType }
     *     
     */
    public FAKCAFCustomerIdentificationConsumerType getInstitution() {
        return institution;
    }

    /**
     * Imposta il valore della proprietà institution.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFCustomerIdentificationConsumerType }
     *     
     */
    public void setInstitution(FAKCAFCustomerIdentificationConsumerType value) {
        this.institution = value;
    }

}
