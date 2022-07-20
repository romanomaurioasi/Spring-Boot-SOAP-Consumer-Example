
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}RequestIdentificationBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Institution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCustomerIdentificationConsumerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceIdentificationType", propOrder = {
    "institution"
})
public class TaxAtSourceIdentificationType
    extends RequestIdentificationBaseType
{

    @XmlElement(name = "Institution", required = true)
    protected TaxAtSourceCustomerIdentificationConsumerType institution;

    /**
     * Recupera il valore della proprietà institution.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCustomerIdentificationConsumerType }
     *     
     */
    public TaxAtSourceCustomerIdentificationConsumerType getInstitution() {
        return institution;
    }

    /**
     * Imposta il valore della proprietà institution.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCustomerIdentificationConsumerType }
     *     
     */
    public void setInstitution(TaxAtSourceCustomerIdentificationConsumerType value) {
        this.institution = value;
    }

}