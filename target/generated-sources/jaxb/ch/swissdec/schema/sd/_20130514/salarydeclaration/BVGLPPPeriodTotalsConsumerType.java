
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-PeriodTotalsConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-PeriodTotalsConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BVG-LPP-PeriodCategoryTotals" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-PeriodCategoryTotalsType"/&gt;
 *         &lt;element name="BVG-LPP-PeriodMasterTotal" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-PeriodTotalsConsumerType", propOrder = {
    "bvglppPeriodCategoryTotals",
    "bvglppPeriodMasterTotal"
})
@XmlSeeAlso({
    BVGLPPPeriodTotalsType.class
})
public class BVGLPPPeriodTotalsConsumerType {

    @XmlElement(name = "BVG-LPP-PeriodCategoryTotals", required = true)
    protected BVGLPPPeriodCategoryTotalsType bvglppPeriodCategoryTotals;
    @XmlElement(name = "BVG-LPP-PeriodMasterTotal", required = true)
    protected BigDecimal bvglppPeriodMasterTotal;

    /**
     * Recupera il valore della proprietà bvglppPeriodCategoryTotals.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPPeriodCategoryTotalsType }
     *     
     */
    public BVGLPPPeriodCategoryTotalsType getBVGLPPPeriodCategoryTotals() {
        return bvglppPeriodCategoryTotals;
    }

    /**
     * Imposta il valore della proprietà bvglppPeriodCategoryTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPPeriodCategoryTotalsType }
     *     
     */
    public void setBVGLPPPeriodCategoryTotals(BVGLPPPeriodCategoryTotalsType value) {
        this.bvglppPeriodCategoryTotals = value;
    }

    /**
     * Recupera il valore della proprietà bvglppPeriodMasterTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPPeriodMasterTotal() {
        return bvglppPeriodMasterTotal;
    }

    /**
     * Imposta il valore della proprietà bvglppPeriodMasterTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPPeriodMasterTotal(BigDecimal value) {
        this.bvglppPeriodMasterTotal = value;
    }

}
