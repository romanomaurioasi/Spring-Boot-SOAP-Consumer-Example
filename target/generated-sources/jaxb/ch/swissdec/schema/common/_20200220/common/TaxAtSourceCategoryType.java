
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per TaxAtSourceCategoryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TaxAtSourceCode" type="{http://www.swissdec.ch/schema/common/20200220/Common}TaxAtSourceCodeType"/&gt;
 *         &lt;element name="CategoryPredefined" type="{http://www.swissdec.ch/schema/common/20200220/Common}CategoryPredefinedType"/&gt;
 *         &lt;element name="CategoryOpen" type="{http://www.swissdec.ch/schema/common/20200220/Common}IDType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceCategoryType", propOrder = {
    "taxAtSourceCode",
    "categoryPredefined",
    "categoryOpen"
})
public class TaxAtSourceCategoryType {

    @XmlElement(name = "TaxAtSourceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String taxAtSourceCode;
    @XmlElement(name = "CategoryPredefined")
    @XmlSchemaType(name = "NMTOKEN")
    protected CategoryPredefinedType categoryPredefined;
    @XmlElement(name = "CategoryOpen")
    protected String categoryOpen;

    /**
     * Recupera il valore della proprietà taxAtSourceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAtSourceCode() {
        return taxAtSourceCode;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAtSourceCode(String value) {
        this.taxAtSourceCode = value;
    }

    /**
     * Recupera il valore della proprietà categoryPredefined.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPredefinedType }
     *     
     */
    public CategoryPredefinedType getCategoryPredefined() {
        return categoryPredefined;
    }

    /**
     * Imposta il valore della proprietà categoryPredefined.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPredefinedType }
     *     
     */
    public void setCategoryPredefined(CategoryPredefinedType value) {
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
