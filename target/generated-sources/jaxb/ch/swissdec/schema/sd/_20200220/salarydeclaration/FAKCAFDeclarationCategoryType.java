
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FAK-CAF-DeclarationCategoryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-DeclarationCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entry" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryDetailEntryType" minOccurs="0"/&gt;
 *         &lt;element name="Withdrawal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-DeclarationCategoryDetailWithdrawalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-DeclarationCategoryType", propOrder = {
    "entry",
    "withdrawal"
})
public class FAKCAFDeclarationCategoryType {

    @XmlElement(name = "Entry")
    protected DeclarationCategoryDetailEntryType entry;
    @XmlElement(name = "Withdrawal")
    protected FAKCAFDeclarationCategoryDetailWithdrawalType withdrawal;

    /**
     * Recupera il valore della proprietà entry.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryDetailEntryType }
     *     
     */
    public DeclarationCategoryDetailEntryType getEntry() {
        return entry;
    }

    /**
     * Imposta il valore della proprietà entry.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryDetailEntryType }
     *     
     */
    public void setEntry(DeclarationCategoryDetailEntryType value) {
        this.entry = value;
    }

    /**
     * Recupera il valore della proprietà withdrawal.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFDeclarationCategoryDetailWithdrawalType }
     *     
     */
    public FAKCAFDeclarationCategoryDetailWithdrawalType getWithdrawal() {
        return withdrawal;
    }

    /**
     * Imposta il valore della proprietà withdrawal.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFDeclarationCategoryDetailWithdrawalType }
     *     
     */
    public void setWithdrawal(FAKCAFDeclarationCategoryDetailWithdrawalType value) {
        this.withdrawal = value;
    }

}
