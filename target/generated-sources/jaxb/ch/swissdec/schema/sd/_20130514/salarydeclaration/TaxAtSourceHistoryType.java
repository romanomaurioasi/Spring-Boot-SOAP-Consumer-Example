
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceHistoryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceHistoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TimePeriodType"/&gt;
 *         &lt;element name="TaxAtSourceCategory" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCategoryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceHistoryType", propOrder = {
    "period",
    "taxAtSourceCategory"
})
public class TaxAtSourceHistoryType {

    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
    @XmlElement(name = "TaxAtSourceCategory", required = true)
    protected TaxAtSourceCategoryType taxAtSourceCategory;

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setPeriod(TimePeriodType value) {
        this.period = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceCategory.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCategoryType }
     *     
     */
    public TaxAtSourceCategoryType getTaxAtSourceCategory() {
        return taxAtSourceCategory;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCategoryType }
     *     
     */
    public void setTaxAtSourceCategory(TaxAtSourceCategoryType value) {
        this.taxAtSourceCategory = value;
    }

}
