
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceTotalsBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceTotalsBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalTaxableEarning" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="TotalTaxAtSource" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="TotalCommission" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceTotalsBaseType", propOrder = {
    "totalTaxableEarning",
    "totalTaxAtSource",
    "totalCommission"
})
@XmlSeeAlso({
    TaxAtSourceTotalsMonthType.class,
    TaxAtSourceTotalsCorrectionMonthType.class
})
public class TaxAtSourceTotalsBaseType {

    @XmlElement(name = "TotalTaxableEarning", required = true)
    protected BigDecimal totalTaxableEarning;
    @XmlElement(name = "TotalTaxAtSource", required = true)
    protected BigDecimal totalTaxAtSource;
    @XmlElement(name = "TotalCommission", required = true)
    protected BigDecimal totalCommission;

    /**
     * Recupera il valore della proprietà totalTaxableEarning.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxableEarning() {
        return totalTaxableEarning;
    }

    /**
     * Imposta il valore della proprietà totalTaxableEarning.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxableEarning(BigDecimal value) {
        this.totalTaxableEarning = value;
    }

    /**
     * Recupera il valore della proprietà totalTaxAtSource.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxAtSource() {
        return totalTaxAtSource;
    }

    /**
     * Imposta il valore della proprietà totalTaxAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxAtSource(BigDecimal value) {
        this.totalTaxAtSource = value;
    }

    /**
     * Recupera il valore della proprietà totalCommission.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    /**
     * Imposta il valore della proprietà totalCommission.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCommission(BigDecimal value) {
        this.totalCommission = value;
    }

}
