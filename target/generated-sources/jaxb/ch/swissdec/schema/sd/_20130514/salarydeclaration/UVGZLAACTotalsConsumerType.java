
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UVGZ-LAAC-TotalsConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVGZ-LAAC-TotalsConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVGZ-LAAC-CategoryTotals" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}UVGZ-LAAC-CategoryTotalsType"/&gt;
 *         &lt;element name="UVGZ-LAAC-MasterTotal" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVGZ-LAAC-TotalsConsumerType", propOrder = {
    "uvgzlaacCategoryTotals",
    "uvgzlaacMasterTotal"
})
@XmlSeeAlso({
    UVGZLAACTotalsType.class
})
public class UVGZLAACTotalsConsumerType {

    @XmlElement(name = "UVGZ-LAAC-CategoryTotals", required = true)
    protected UVGZLAACCategoryTotalsType uvgzlaacCategoryTotals;
    @XmlElement(name = "UVGZ-LAAC-MasterTotal", required = true)
    protected BigDecimal uvgzlaacMasterTotal;

    /**
     * Recupera il valore della proprietà uvgzlaacCategoryTotals.
     * 
     * @return
     *     possible object is
     *     {@link UVGZLAACCategoryTotalsType }
     *     
     */
    public UVGZLAACCategoryTotalsType getUVGZLAACCategoryTotals() {
        return uvgzlaacCategoryTotals;
    }

    /**
     * Imposta il valore della proprietà uvgzlaacCategoryTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGZLAACCategoryTotalsType }
     *     
     */
    public void setUVGZLAACCategoryTotals(UVGZLAACCategoryTotalsType value) {
        this.uvgzlaacCategoryTotals = value;
    }

    /**
     * Recupera il valore della proprietà uvgzlaacMasterTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUVGZLAACMasterTotal() {
        return uvgzlaacMasterTotal;
    }

    /**
     * Imposta il valore della proprietà uvgzlaacMasterTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUVGZLAACMasterTotal(BigDecimal value) {
        this.uvgzlaacMasterTotal = value;
    }

}
