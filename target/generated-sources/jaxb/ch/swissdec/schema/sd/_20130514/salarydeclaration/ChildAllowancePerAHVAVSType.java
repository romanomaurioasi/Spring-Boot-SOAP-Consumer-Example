
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ChildAllowancePerAHV-AVSType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ChildAllowancePerAHV-AVSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FamilyIncome" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildAllowancePerAHV-AVSType", propOrder = {
    "familyIncome"
})
public class ChildAllowancePerAHVAVSType {

    @XmlElement(name = "FamilyIncome")
    protected BigDecimal familyIncome;

    /**
     * Recupera il valore della proprietà familyIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFamilyIncome() {
        return familyIncome;
    }

    /**
     * Imposta il valore della proprietà familyIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFamilyIncome(BigDecimal value) {
        this.familyIncome = value;
    }

}
