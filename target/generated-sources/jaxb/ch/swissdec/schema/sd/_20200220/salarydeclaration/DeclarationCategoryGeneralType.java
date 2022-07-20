
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclarationCategoryGeneralType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclarationCategoryGeneralType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entry" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryDetailBaseType" minOccurs="0"/&gt;
 *         &lt;element name="Mutation" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryDetailBaseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Withdrawal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryDetailBaseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationCategoryGeneralType", propOrder = {
    "entry",
    "mutation",
    "withdrawal"
})
@XmlSeeAlso({
    AHVAVSDeclarationCategoryType.class
})
public class DeclarationCategoryGeneralType {

    @XmlElement(name = "Entry")
    protected DeclarationCategoryDetailBaseType entry;
    @XmlElement(name = "Mutation")
    protected List<DeclarationCategoryDetailBaseType> mutation;
    @XmlElement(name = "Withdrawal")
    protected DeclarationCategoryDetailBaseType withdrawal;

    /**
     * Recupera il valore della proprietà entry.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryDetailBaseType }
     *     
     */
    public DeclarationCategoryDetailBaseType getEntry() {
        return entry;
    }

    /**
     * Imposta il valore della proprietà entry.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryDetailBaseType }
     *     
     */
    public void setEntry(DeclarationCategoryDetailBaseType value) {
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
     * {@link DeclarationCategoryDetailBaseType }
     * 
     * 
     */
    public List<DeclarationCategoryDetailBaseType> getMutation() {
        if (mutation == null) {
            mutation = new ArrayList<DeclarationCategoryDetailBaseType>();
        }
        return this.mutation;
    }

    /**
     * Recupera il valore della proprietà withdrawal.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryDetailBaseType }
     *     
     */
    public DeclarationCategoryDetailBaseType getWithdrawal() {
        return withdrawal;
    }

    /**
     * Imposta il valore della proprietà withdrawal.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryDetailBaseType }
     *     
     */
    public void setWithdrawal(DeclarationCategoryDetailBaseType value) {
        this.withdrawal = value;
    }

}
