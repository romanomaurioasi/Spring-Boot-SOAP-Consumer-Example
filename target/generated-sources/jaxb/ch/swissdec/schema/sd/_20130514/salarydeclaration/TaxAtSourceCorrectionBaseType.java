
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceCorrectionBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceCorrectionBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationCategory" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DeclarationCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSourceCategory" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="TaxableEarning" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="AscertainedTaxableEarning" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceCorrectionBaseType", propOrder = {
    "declarationCategory",
    "taxAtSourceCategory",
    "taxableEarning",
    "ascertainedTaxableEarning",
    "taxAtSource"
})
@XmlSeeAlso({
    TaxAtSourceCorrectionOldType.class,
    TaxAtSourceCorrectionDifferenceType.class,
    TaxAtSourceCorrectionNewType.class,
    TaxAtSourceOldNewResultType.class
})
public class TaxAtSourceCorrectionBaseType {

    @XmlElement(name = "DeclarationCategory")
    protected DeclarationCategoryType declarationCategory;
    @XmlElement(name = "TaxAtSourceCategory")
    protected TaxAtSourceCategoryType taxAtSourceCategory;
    @XmlElement(name = "TaxableEarning")
    protected BigDecimal taxableEarning;
    @XmlElement(name = "AscertainedTaxableEarning")
    protected BigDecimal ascertainedTaxableEarning;
    @XmlElement(name = "TaxAtSource")
    protected BigDecimal taxAtSource;

    /**
     * Recupera il valore della proprietà declarationCategory.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryType }
     *     
     */
    public DeclarationCategoryType getDeclarationCategory() {
        return declarationCategory;
    }

    /**
     * Imposta il valore della proprietà declarationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryType }
     *     
     */
    public void setDeclarationCategory(DeclarationCategoryType value) {
        this.declarationCategory = value;
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

    /**
     * Recupera il valore della proprietà taxableEarning.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableEarning() {
        return taxableEarning;
    }

    /**
     * Imposta il valore della proprietà taxableEarning.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableEarning(BigDecimal value) {
        this.taxableEarning = value;
    }

    /**
     * Recupera il valore della proprietà ascertainedTaxableEarning.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAscertainedTaxableEarning() {
        return ascertainedTaxableEarning;
    }

    /**
     * Imposta il valore della proprietà ascertainedTaxableEarning.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAscertainedTaxableEarning(BigDecimal value) {
        this.ascertainedTaxableEarning = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSource.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAtSource() {
        return taxAtSource;
    }

    /**
     * Imposta il valore della proprietà taxAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAtSource(BigDecimal value) {
        this.taxAtSource = value;
    }

}
