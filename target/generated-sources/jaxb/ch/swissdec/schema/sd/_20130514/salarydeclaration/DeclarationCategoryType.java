
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclarationCategoryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entry" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DeclarationCategoryDetailEntryType" minOccurs="0"/&gt;
 *         &lt;element name="Mutation" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DeclarationCategoryDetailMutationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Withdrawal" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DeclarationCategoryDetailWithdrawalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationCategoryType", propOrder = {
    "entry",
    "mutation",
    "withdrawal"
})
public class DeclarationCategoryType {

    @XmlElement(name = "Entry")
    protected DeclarationCategoryDetailEntryType entry;
    @XmlElement(name = "Mutation")
    protected List<DeclarationCategoryDetailMutationType> mutation;
    @XmlElement(name = "Withdrawal")
    protected DeclarationCategoryDetailWithdrawalType withdrawal;

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
     * Gets the value of the mutation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mutation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMutation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclarationCategoryDetailMutationType }
     * 
     * 
     */
    public List<DeclarationCategoryDetailMutationType> getMutation() {
        if (mutation == null) {
            mutation = new ArrayList<DeclarationCategoryDetailMutationType>();
        }
        return this.mutation;
    }

    /**
     * Recupera il valore della proprietà withdrawal.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryDetailWithdrawalType }
     *     
     */
    public DeclarationCategoryDetailWithdrawalType getWithdrawal() {
        return withdrawal;
    }

    /**
     * Imposta il valore della proprietà withdrawal.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryDetailWithdrawalType }
     *     
     */
    public void setWithdrawal(DeclarationCategoryDetailWithdrawalType value) {
        this.withdrawal = value;
    }

}
