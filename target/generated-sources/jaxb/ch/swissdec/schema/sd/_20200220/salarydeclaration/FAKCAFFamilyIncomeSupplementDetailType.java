
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FAK-CAF-FamilyIncomeSupplementDetailType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-FamilyIncomeSupplementDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FamilyIncomeSupplementRepetitive" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FamilyIncomePerChildren" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FamilyIncomePerChildrenType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-FamilyIncomeSupplementDetailType", propOrder = {
    "familyIncomeSupplementRepetitive",
    "familyIncomePerChildren"
})
public class FAKCAFFamilyIncomeSupplementDetailType {

    @XmlElement(name = "FamilyIncomeSupplementRepetitive")
    protected BigDecimal familyIncomeSupplementRepetitive;
    @XmlElement(name = "FamilyIncomePerChildren")
    protected FamilyIncomePerChildrenType familyIncomePerChildren;

    /**
     * Recupera il valore della proprietà familyIncomeSupplementRepetitive.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFamilyIncomeSupplementRepetitive() {
        return familyIncomeSupplementRepetitive;
    }

    /**
     * Imposta il valore della proprietà familyIncomeSupplementRepetitive.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFamilyIncomeSupplementRepetitive(BigDecimal value) {
        this.familyIncomeSupplementRepetitive = value;
    }

    /**
     * Recupera il valore della proprietà familyIncomePerChildren.
     * 
     * @return
     *     possible object is
     *     {@link FamilyIncomePerChildrenType }
     *     
     */
    public FamilyIncomePerChildrenType getFamilyIncomePerChildren() {
        return familyIncomePerChildren;
    }

    /**
     * Imposta il valore della proprietà familyIncomePerChildren.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyIncomePerChildrenType }
     *     
     */
    public void setFamilyIncomePerChildren(FamilyIncomePerChildrenType value) {
        this.familyIncomePerChildren = value;
    }

}
