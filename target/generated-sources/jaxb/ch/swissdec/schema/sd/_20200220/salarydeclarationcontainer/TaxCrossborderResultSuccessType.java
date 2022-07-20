
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.TaxCrossborderTotalsConsumerType;


/**
 * <p>Classe Java per TaxCrossborderResultSuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxCrossborderResultSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxAtSourceMinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxCrossborderQuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxCrossborderTotalsConsumerType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCrossborderResultSuccessType", propOrder = {
    "taxCrossborderQuittanceWithoutCompletion"
})
public class TaxCrossborderResultSuccessType
    extends TaxAtSourceMinimalResultStateType
{

    @XmlElement(name = "TaxCrossborderQuittanceWithoutCompletion", required = true)
    protected TaxCrossborderTotalsConsumerType taxCrossborderQuittanceWithoutCompletion;

    /**
     * Recupera il valore della proprietà taxCrossborderQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link TaxCrossborderTotalsConsumerType }
     *     
     */
    public TaxCrossborderTotalsConsumerType getTaxCrossborderQuittanceWithoutCompletion() {
        return taxCrossborderQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà taxCrossborderQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCrossborderTotalsConsumerType }
     *     
     */
    public void setTaxCrossborderQuittanceWithoutCompletion(TaxCrossborderTotalsConsumerType value) {
        this.taxCrossborderQuittanceWithoutCompletion = value;
    }

}
