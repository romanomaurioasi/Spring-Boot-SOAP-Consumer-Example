
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TypeOfOwnershipType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TypeOfOwnershipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CategoryPredefined" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CategoryPredefinedTaxType"/&gt;
 *         &lt;element name="CategoryOpen" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}IDType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfOwnershipType", propOrder = {
    "categoryPredefined",
    "categoryOpen"
})
public class TypeOfOwnershipType {

    @XmlElement(name = "CategoryPredefined")
    @XmlSchemaType(name = "NMTOKEN")
    protected CategoryPredefinedTaxType categoryPredefined;
    @XmlElement(name = "CategoryOpen")
    protected String categoryOpen;

    /**
     * Recupera il valore della proprietà categoryPredefined.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPredefinedTaxType }
     *     
     */
    public CategoryPredefinedTaxType getCategoryPredefined() {
        return categoryPredefined;
    }

    /**
     * Imposta il valore della proprietà categoryPredefined.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPredefinedTaxType }
     *     
     */
    public void setCategoryPredefined(CategoryPredefinedTaxType value) {
        this.categoryPredefined = value;
    }

    /**
     * Recupera il valore della proprietà categoryOpen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOpen() {
        return categoryOpen;
    }

    /**
     * Imposta il valore della proprietà categoryOpen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOpen(String value) {
        this.categoryOpen = value;
    }

}
