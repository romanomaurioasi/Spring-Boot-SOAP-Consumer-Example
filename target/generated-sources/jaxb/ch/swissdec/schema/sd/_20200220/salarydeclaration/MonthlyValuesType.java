
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MonthlyValuesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonthlyValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrossBaseSalaryAndRegularAllowance" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="Allowances" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="FamilyIncomeSupplement" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="PaymentsByThird" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="SocialContributions" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="BVG-LPP-RegularContribution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyValuesType", propOrder = {
    "grossBaseSalaryAndRegularAllowance",
    "allowances",
    "familyIncomeSupplement",
    "paymentsByThird",
    "socialContributions",
    "bvglppRegularContribution"
})
public class MonthlyValuesType {

    @XmlElement(name = "GrossBaseSalaryAndRegularAllowance", required = true)
    protected BigDecimal grossBaseSalaryAndRegularAllowance;
    @XmlElement(name = "Allowances", required = true)
    protected BigDecimal allowances;
    @XmlElement(name = "FamilyIncomeSupplement", required = true)
    protected BigDecimal familyIncomeSupplement;
    @XmlElement(name = "PaymentsByThird", required = true)
    protected BigDecimal paymentsByThird;
    @XmlElement(name = "SocialContributions", required = true)
    protected BigDecimal socialContributions;
    @XmlElement(name = "BVG-LPP-RegularContribution", required = true)
    protected BigDecimal bvglppRegularContribution;

    /**
     * Recupera il valore della proprietà grossBaseSalaryAndRegularAllowance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossBaseSalaryAndRegularAllowance() {
        return grossBaseSalaryAndRegularAllowance;
    }

    /**
     * Imposta il valore della proprietà grossBaseSalaryAndRegularAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossBaseSalaryAndRegularAllowance(BigDecimal value) {
        this.grossBaseSalaryAndRegularAllowance = value;
    }

    /**
     * Recupera il valore della proprietà allowances.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllowances() {
        return allowances;
    }

    /**
     * Imposta il valore della proprietà allowances.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllowances(BigDecimal value) {
        this.allowances = value;
    }

    /**
     * Recupera il valore della proprietà familyIncomeSupplement.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFamilyIncomeSupplement() {
        return familyIncomeSupplement;
    }

    /**
     * Imposta il valore della proprietà familyIncomeSupplement.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFamilyIncomeSupplement(BigDecimal value) {
        this.familyIncomeSupplement = value;
    }

    /**
     * Recupera il valore della proprietà paymentsByThird.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentsByThird() {
        return paymentsByThird;
    }

    /**
     * Imposta il valore della proprietà paymentsByThird.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentsByThird(BigDecimal value) {
        this.paymentsByThird = value;
    }

    /**
     * Recupera il valore della proprietà socialContributions.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSocialContributions() {
        return socialContributions;
    }

    /**
     * Imposta il valore della proprietà socialContributions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSocialContributions(BigDecimal value) {
        this.socialContributions = value;
    }

    /**
     * Recupera il valore della proprietà bvglppRegularContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPRegularContribution() {
        return bvglppRegularContribution;
    }

    /**
     * Imposta il valore della proprietà bvglppRegularContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPRegularContribution(BigDecimal value) {
        this.bvglppRegularContribution = value;
    }

}
