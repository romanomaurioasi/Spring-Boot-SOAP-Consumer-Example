
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per KTG-AMC-TotalsConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KTG-AMC-TotalsConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KTG-AMC-CategoryTotals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}KTG-AMC-CategoryTotalsType"/&gt;
 *         &lt;element name="KTG-AMC-MasterTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KTG-AMC-TotalsConsumerType", propOrder = {
    "ktgamcCategoryTotals",
    "ktgamcMasterTotal"
})
@XmlSeeAlso({
    KTGAMCTotalsType.class
})
public class KTGAMCTotalsConsumerType {

    @XmlElement(name = "KTG-AMC-CategoryTotals", required = true)
    protected KTGAMCCategoryTotalsType ktgamcCategoryTotals;
    @XmlElement(name = "KTG-AMC-MasterTotal", required = true)
    protected BigDecimal ktgamcMasterTotal;

    /**
     * Recupera il valore della proprietà ktgamcCategoryTotals.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCCategoryTotalsType }
     *     
     */
    public KTGAMCCategoryTotalsType getKTGAMCCategoryTotals() {
        return ktgamcCategoryTotals;
    }

    /**
     * Imposta il valore della proprietà ktgamcCategoryTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCCategoryTotalsType }
     *     
     */
    public void setKTGAMCCategoryTotals(KTGAMCCategoryTotalsType value) {
        this.ktgamcCategoryTotals = value;
    }

    /**
     * Recupera il valore della proprietà ktgamcMasterTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKTGAMCMasterTotal() {
        return ktgamcMasterTotal;
    }

    /**
     * Imposta il valore della proprietà ktgamcMasterTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKTGAMCMasterTotal(BigDecimal value) {
        this.ktgamcMasterTotal = value;
    }

}
