
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclarationCategoryDetailMutationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationCategoryDetailMutationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryDetailBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reason" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryReasonMutationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationCategoryDetailMutationType", propOrder = {
    "reason"
})
public class DeclarationCategoryDetailMutationType
    extends DeclarationCategoryDetailBaseType
{

    @XmlElement(name = "Reason", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected DeclarationCategoryReasonMutationType reason;

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryReasonMutationType }
     *     
     */
    public DeclarationCategoryReasonMutationType getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryReasonMutationType }
     *     
     */
    public void setReason(DeclarationCategoryReasonMutationType value) {
        this.reason = value;
    }

}
