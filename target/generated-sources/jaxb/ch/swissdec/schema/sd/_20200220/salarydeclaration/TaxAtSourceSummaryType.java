
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceSummaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOf-TaxAtSourceSalary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceSummaryType", propOrder = {
    "numberOfTaxAtSourceSalaryTags"
})
public class TaxAtSourceSummaryType {

    @XmlElement(name = "NumberOf-TaxAtSourceSalary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfTaxAtSourceSalaryTags;

    /**
     * Recupera il valore della proprietà numberOfTaxAtSourceSalaryTags.
     * 
     */
    public long getNumberOfTaxAtSourceSalaryTags() {
        return numberOfTaxAtSourceSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfTaxAtSourceSalaryTags.
     * 
     */
    public void setNumberOfTaxAtSourceSalaryTags(long value) {
        this.numberOfTaxAtSourceSalaryTags = value;
    }

}
