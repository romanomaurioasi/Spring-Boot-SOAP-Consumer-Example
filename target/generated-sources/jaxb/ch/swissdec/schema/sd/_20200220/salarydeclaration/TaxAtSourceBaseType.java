
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.EmptyType;
import ch.swissdec.schema.common._20200220.common.TaxAtSourceCategoryType;


/**
 * <p>Classe Java per TaxAtSourceBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxAtSourceCategory" type="{http://www.swissdec.ch/schema/common/20200220/Common}TaxAtSourceCategoryType"/&gt;
 *         &lt;element name="TaxableEarning" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="AscertainedTaxableEarning" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="SporadicBenefits" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="GrantTaxAtSourceCode" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceBaseType", propOrder = {
    "taxAtSourceCategory",
    "taxableEarning",
    "ascertainedTaxableEarning",
    "taxAtSource",
    "sporadicBenefits",
    "grantTaxAtSourceCode"
})
@XmlSeeAlso({
    TaxAtSourceCurrentType.class,
    TaxAtSourceCorrectionNewType.class
})
public class TaxAtSourceBaseType {

    @XmlElement(name = "TaxAtSourceCategory", required = true)
    protected TaxAtSourceCategoryType taxAtSourceCategory;
    @XmlElement(name = "TaxableEarning", required = true)
    protected BigDecimal taxableEarning;
    @XmlElement(name = "AscertainedTaxableEarning", required = true)
    protected BigDecimal ascertainedTaxableEarning;
    @XmlElement(name = "TaxAtSource", required = true)
    protected BigDecimal taxAtSource;
    @XmlElement(name = "SporadicBenefits")
    protected BigDecimal sporadicBenefits;
    @XmlElement(name = "GrantTaxAtSourceCode")
    protected EmptyType grantTaxAtSourceCode;

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

    /**
     * Recupera il valore della proprietà sporadicBenefits.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSporadicBenefits() {
        return sporadicBenefits;
    }

    /**
     * Imposta il valore della proprietà sporadicBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSporadicBenefits(BigDecimal value) {
        this.sporadicBenefits = value;
    }

    /**
     * Recupera il valore della proprietà grantTaxAtSourceCode.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getGrantTaxAtSourceCode() {
        return grantTaxAtSourceCode;
    }

    /**
     * Imposta il valore della proprietà grantTaxAtSourceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setGrantTaxAtSourceCode(EmptyType value) {
        this.grantTaxAtSourceCode = value;
    }

}
