
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FAK-CAF-FamilyIncomeSupplementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-FamilyIncomeSupplementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FAK-CAF-FamilyIncomeSupplementPerPerson" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="FAK-CAF-FamilyIncomeSupplementDetail" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FAK-CAF-FamilyIncomeSupplementDetailType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-FamilyIncomeSupplementType", propOrder = {
    "fakcafFamilyIncomeSupplementPerPerson",
    "fakcafFamilyIncomeSupplementDetail"
})
public class FAKCAFFamilyIncomeSupplementType {

    @XmlElement(name = "FAK-CAF-FamilyIncomeSupplementPerPerson")
    protected BigDecimal fakcafFamilyIncomeSupplementPerPerson;
    @XmlElement(name = "FAK-CAF-FamilyIncomeSupplementDetail")
    protected FAKCAFFamilyIncomeSupplementDetailType fakcafFamilyIncomeSupplementDetail;

    /**
     * Recupera il valore della proprietà fakcafFamilyIncomeSupplementPerPerson.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFAKCAFFamilyIncomeSupplementPerPerson() {
        return fakcafFamilyIncomeSupplementPerPerson;
    }

    /**
     * Imposta il valore della proprietà fakcafFamilyIncomeSupplementPerPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFAKCAFFamilyIncomeSupplementPerPerson(BigDecimal value) {
        this.fakcafFamilyIncomeSupplementPerPerson = value;
    }

    /**
     * Recupera il valore della proprietà fakcafFamilyIncomeSupplementDetail.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFFamilyIncomeSupplementDetailType }
     *     
     */
    public FAKCAFFamilyIncomeSupplementDetailType getFAKCAFFamilyIncomeSupplementDetail() {
        return fakcafFamilyIncomeSupplementDetail;
    }

    /**
     * Imposta il valore della proprietà fakcafFamilyIncomeSupplementDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFFamilyIncomeSupplementDetailType }
     *     
     */
    public void setFAKCAFFamilyIncomeSupplementDetail(FAKCAFFamilyIncomeSupplementDetailType value) {
        this.fakcafFamilyIncomeSupplementDetail = value;
    }

}
