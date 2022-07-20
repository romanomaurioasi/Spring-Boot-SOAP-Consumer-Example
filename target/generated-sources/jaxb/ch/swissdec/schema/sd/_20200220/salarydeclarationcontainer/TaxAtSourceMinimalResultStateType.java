
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.TaxAtSourceCustomerIdentificationConsumerType;


/**
 * <p>Classe Java per TaxAtSourceMinimalResultStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceMinimalResultStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResultStateBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Institution" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceCustomerIdentificationConsumerType"/&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResultCompanyNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceMinimalResultStateType", propOrder = {
    "institution",
    "company"
})
@XmlSeeAlso({
    TaxAtSourceProcessingType.class,
    TaxAtSourceResultSuccessType.class,
    TaxCrossborderResultSuccessType.class,
    TaxAtSourceSuccessDialogType.class
})
public class TaxAtSourceMinimalResultStateType
    extends ResultStateBaseType
{

    @XmlElement(name = "Institution", required = true)
    protected TaxAtSourceCustomerIdentificationConsumerType institution;
    @XmlElement(name = "Company")
    protected ResultCompanyNameType company;

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

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link ResultCompanyNameType }
     *     
     */
    public ResultCompanyNameType getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultCompanyNameType }
     *     
     */
    public void setCompany(ResultCompanyNameType value) {
        this.company = value;
    }

}
