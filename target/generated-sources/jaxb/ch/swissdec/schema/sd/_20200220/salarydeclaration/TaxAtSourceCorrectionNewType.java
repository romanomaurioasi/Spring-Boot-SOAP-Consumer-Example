
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceCorrectionNewType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceCorrectionNewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationCategory" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceCorrectionNewType", propOrder = {
    "declarationCategory"
})
public class TaxAtSourceCorrectionNewType
    extends TaxAtSourceBaseType
{

    @XmlElement(name = "DeclarationCategory")
    protected DeclarationCategoryType declarationCategory;

    /**
     * Recupera il valore della proprietà declarationCategory.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryType }
     *     
     */
    public DeclarationCategoryType getDeclarationCategory() {
        return declarationCategory;
    }

    /**
     * Imposta il valore della proprietà declarationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryType }
     *     
     */
    public void setDeclarationCategory(DeclarationCategoryType value) {
        this.declarationCategory = value;
    }

}
