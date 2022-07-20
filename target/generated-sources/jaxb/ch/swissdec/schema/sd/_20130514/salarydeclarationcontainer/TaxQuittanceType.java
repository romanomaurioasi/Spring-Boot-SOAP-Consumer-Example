
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxQuittanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxQuittanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOf-TaxAnnuity-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="NumberOf-TaxSalary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxQuittanceType", propOrder = {
    "numberOfTaxAnnuityTags",
    "numberOfTaxSalaryTags"
})
public class TaxQuittanceType {

    @XmlElement(name = "NumberOf-TaxAnnuity-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfTaxAnnuityTags;
    @XmlElement(name = "NumberOf-TaxSalary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfTaxSalaryTags;

    /**
     * Recupera il valore della proprietà numberOfTaxAnnuityTags.
     * 
     */
    public long getNumberOfTaxAnnuityTags() {
        return numberOfTaxAnnuityTags;
    }

    /**
     * Imposta il valore della proprietà numberOfTaxAnnuityTags.
     * 
     */
    public void setNumberOfTaxAnnuityTags(long value) {
        this.numberOfTaxAnnuityTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfTaxSalaryTags.
     * 
     */
    public long getNumberOfTaxSalaryTags() {
        return numberOfTaxSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfTaxSalaryTags.
     * 
     */
    public void setNumberOfTaxSalaryTags(long value) {
        this.numberOfTaxSalaryTags = value;
    }

}
