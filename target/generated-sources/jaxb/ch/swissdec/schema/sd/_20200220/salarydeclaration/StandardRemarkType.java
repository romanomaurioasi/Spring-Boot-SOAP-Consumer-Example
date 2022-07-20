
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.EmptyType;


/**
 * <p>Classe Java per StandardRemarkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StandardRemarkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildAllowancePerAHV-AVS" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="RelocationCosts" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="StaffShareMarketValue" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}GrantType" minOccurs="0"/&gt;
 *         &lt;element name="StaffShareWithoutTaxableIncome" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}ReasonType" minOccurs="0"/&gt;
 *         &lt;element name="CompanyCarClarify" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="MinimalEmployeeCarPartPercentage" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="PercentageExternalWork" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}PercentageExternalWorkType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSourcePeriodForObjection" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="ContinuedProvisionOfSalary" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}ContinuedProvisionOfSalaryType" minOccurs="0"/&gt;
 *         &lt;element name="ExpatriateRuling" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}GrantType" minOccurs="0"/&gt;
 *         &lt;element name="ActivityRate" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfSalaryCertificate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Rectificate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}RectificateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardRemarkType", propOrder = {
    "childAllowancePerAHVAVS",
    "relocationCosts",
    "staffShareMarketValue",
    "staffShareWithoutTaxableIncome",
    "companyCarClarify",
    "minimalEmployeeCarPartPercentage",
    "percentageExternalWork",
    "taxAtSourcePeriodForObjection",
    "continuedProvisionOfSalary",
    "expatriateRuling",
    "activityRate",
    "numberOfSalaryCertificate",
    "rectificate"
})
public class StandardRemarkType {

    @XmlElement(name = "ChildAllowancePerAHV-AVS")
    protected EmptyType childAllowancePerAHVAVS;
    @XmlElement(name = "RelocationCosts")
    protected BigDecimal relocationCosts;
    @XmlElement(name = "StaffShareMarketValue")
    protected GrantType staffShareMarketValue;
    @XmlElement(name = "StaffShareWithoutTaxableIncome")
    protected ReasonType staffShareWithoutTaxableIncome;
    @XmlElement(name = "CompanyCarClarify")
    protected EmptyType companyCarClarify;
    @XmlElement(name = "MinimalEmployeeCarPartPercentage")
    protected EmptyType minimalEmployeeCarPartPercentage;
    @XmlElement(name = "PercentageExternalWork")
    protected PercentageExternalWorkType percentageExternalWork;
    @XmlElement(name = "TaxAtSourcePeriodForObjection")
    protected EmptyType taxAtSourcePeriodForObjection;
    @XmlElement(name = "ContinuedProvisionOfSalary")
    protected ContinuedProvisionOfSalaryType continuedProvisionOfSalary;
    @XmlElement(name = "ExpatriateRuling")
    protected GrantType expatriateRuling;
    @XmlElement(name = "ActivityRate")
    protected BigDecimal activityRate;
    @XmlElement(name = "NumberOfSalaryCertificate")
    protected BigInteger numberOfSalaryCertificate;
    @XmlElement(name = "Rectificate")
    protected RectificateType rectificate;

    /**
     * Recupera il valore della proprietà childAllowancePerAHVAVS.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getChildAllowancePerAHVAVS() {
        return childAllowancePerAHVAVS;
    }

    /**
     * Imposta il valore della proprietà childAllowancePerAHVAVS.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setChildAllowancePerAHVAVS(EmptyType value) {
        this.childAllowancePerAHVAVS = value;
    }

    /**
     * Recupera il valore della proprietà relocationCosts.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelocationCosts() {
        return relocationCosts;
    }

    /**
     * Imposta il valore della proprietà relocationCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelocationCosts(BigDecimal value) {
        this.relocationCosts = value;
    }

    /**
     * Recupera il valore della proprietà staffShareMarketValue.
     * 
     * @return
     *     possible object is
     *     {@link GrantType }
     *     
     */
    public GrantType getStaffShareMarketValue() {
        return staffShareMarketValue;
    }

    /**
     * Imposta il valore della proprietà staffShareMarketValue.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantType }
     *     
     */
    public void setStaffShareMarketValue(GrantType value) {
        this.staffShareMarketValue = value;
    }

    /**
     * Recupera il valore della proprietà staffShareWithoutTaxableIncome.
     * 
     * @return
     *     possible object is
     *     {@link ReasonType }
     *     
     */
    public ReasonType getStaffShareWithoutTaxableIncome() {
        return staffShareWithoutTaxableIncome;
    }

    /**
     * Imposta il valore della proprietà staffShareWithoutTaxableIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonType }
     *     
     */
    public void setStaffShareWithoutTaxableIncome(ReasonType value) {
        this.staffShareWithoutTaxableIncome = value;
    }

    /**
     * Recupera il valore della proprietà companyCarClarify.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getCompanyCarClarify() {
        return companyCarClarify;
    }

    /**
     * Imposta il valore della proprietà companyCarClarify.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setCompanyCarClarify(EmptyType value) {
        this.companyCarClarify = value;
    }

    /**
     * Recupera il valore della proprietà minimalEmployeeCarPartPercentage.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getMinimalEmployeeCarPartPercentage() {
        return minimalEmployeeCarPartPercentage;
    }

    /**
     * Imposta il valore della proprietà minimalEmployeeCarPartPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setMinimalEmployeeCarPartPercentage(EmptyType value) {
        this.minimalEmployeeCarPartPercentage = value;
    }

    /**
     * Recupera il valore della proprietà percentageExternalWork.
     * 
     * @return
     *     possible object is
     *     {@link PercentageExternalWorkType }
     *     
     */
    public PercentageExternalWorkType getPercentageExternalWork() {
        return percentageExternalWork;
    }

    /**
     * Imposta il valore della proprietà percentageExternalWork.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageExternalWorkType }
     *     
     */
    public void setPercentageExternalWork(PercentageExternalWorkType value) {
        this.percentageExternalWork = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourcePeriodForObjection.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getTaxAtSourcePeriodForObjection() {
        return taxAtSourcePeriodForObjection;
    }

    /**
     * Imposta il valore della proprietà taxAtSourcePeriodForObjection.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setTaxAtSourcePeriodForObjection(EmptyType value) {
        this.taxAtSourcePeriodForObjection = value;
    }

    /**
     * Recupera il valore della proprietà continuedProvisionOfSalary.
     * 
     * @return
     *     possible object is
     *     {@link ContinuedProvisionOfSalaryType }
     *     
     */
    public ContinuedProvisionOfSalaryType getContinuedProvisionOfSalary() {
        return continuedProvisionOfSalary;
    }

    /**
     * Imposta il valore della proprietà continuedProvisionOfSalary.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuedProvisionOfSalaryType }
     *     
     */
    public void setContinuedProvisionOfSalary(ContinuedProvisionOfSalaryType value) {
        this.continuedProvisionOfSalary = value;
    }

    /**
     * Recupera il valore della proprietà expatriateRuling.
     * 
     * @return
     *     possible object is
     *     {@link GrantType }
     *     
     */
    public GrantType getExpatriateRuling() {
        return expatriateRuling;
    }

    /**
     * Imposta il valore della proprietà expatriateRuling.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantType }
     *     
     */
    public void setExpatriateRuling(GrantType value) {
        this.expatriateRuling = value;
    }

    /**
     * Recupera il valore della proprietà activityRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivityRate() {
        return activityRate;
    }

    /**
     * Imposta il valore della proprietà activityRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivityRate(BigDecimal value) {
        this.activityRate = value;
    }

    /**
     * Recupera il valore della proprietà numberOfSalaryCertificate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSalaryCertificate() {
        return numberOfSalaryCertificate;
    }

    /**
     * Imposta il valore della proprietà numberOfSalaryCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSalaryCertificate(BigInteger value) {
        this.numberOfSalaryCertificate = value;
    }

    /**
     * Recupera il valore della proprietà rectificate.
     * 
     * @return
     *     possible object is
     *     {@link RectificateType }
     *     
     */
    public RectificateType getRectificate() {
        return rectificate;
    }

    /**
     * Imposta il valore della proprietà rectificate.
     * 
     * @param value
     *     allowed object is
     *     {@link RectificateType }
     *     
     */
    public void setRectificate(RectificateType value) {
        this.rectificate = value;
    }

}
