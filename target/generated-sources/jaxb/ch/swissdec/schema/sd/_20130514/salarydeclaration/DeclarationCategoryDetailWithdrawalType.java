
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclarationCategoryDetailWithdrawalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationCategoryDetailWithdrawalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DeclarationCategoryDetailBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reason" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DeclarationCategoryReasonWithdrawalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationCategoryDetailWithdrawalType", propOrder = {
    "reason"
})
public class DeclarationCategoryDetailWithdrawalType
    extends DeclarationCategoryDetailBaseType
{

    @XmlElement(name = "Reason", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected DeclarationCategoryReasonWithdrawalType reason;

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryReasonWithdrawalType }
     *     
     */
    public DeclarationCategoryReasonWithdrawalType getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryReasonWithdrawalType }
     *     
     */
    public void setReason(DeclarationCategoryReasonWithdrawalType value) {
        this.reason = value;
    }

}
