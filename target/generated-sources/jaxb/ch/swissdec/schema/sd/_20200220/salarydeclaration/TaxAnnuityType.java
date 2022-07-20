
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per TaxAnnuityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAnnuityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocID" type="{http://www.swissdec.ch/schema/common/20200220/Common}IDType"/&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="Income" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FringeBenefits" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SortSumType" minOccurs="0"/&gt;
 *         &lt;element name="SporadicBenefits" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SortSumType" minOccurs="0"/&gt;
 *         &lt;element name="OwnershipRight" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="OtherBenefits" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SortSumType" minOccurs="0"/&gt;
 *         &lt;element name="GrossIncome" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="NetIncome" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="DeductionAtSource" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StandardRemark" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StandardRemarkAnnuityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAnnuityType", propOrder = {
    "docID",
    "period",
    "income",
    "fringeBenefits",
    "sporadicBenefits",
    "ownershipRight",
    "otherBenefits",
    "grossIncome",
    "netIncome",
    "deductionAtSource",
    "remark",
    "standardRemark"
})
public class TaxAnnuityType {

    @XmlElement(name = "DocID", required = true)
    protected String docID;
    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
    @XmlElement(name = "Income")
    protected BigDecimal income;
    @XmlElement(name = "FringeBenefits")
    protected SortSumType fringeBenefits;
    @XmlElement(name = "SporadicBenefits")
    protected SortSumType sporadicBenefits;
    @XmlElement(name = "OwnershipRight")
    protected BigDecimal ownershipRight;
    @XmlElement(name = "OtherBenefits")
    protected SortSumType otherBenefits;
    @XmlElement(name = "GrossIncome", required = true)
    protected BigDecimal grossIncome;
    @XmlElement(name = "NetIncome", required = true)
    protected BigDecimal netIncome;
    @XmlElement(name = "DeductionAtSource")
    protected BigDecimal deductionAtSource;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "StandardRemark")
    protected StandardRemarkAnnuityType standardRemark;

    /**
     * Recupera il valore della proprietà docID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocID() {
        return docID;
    }

    /**
     * Imposta il valore della proprietà docID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocID(String value) {
        this.docID = value;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setPeriod(TimePeriodType value) {
        this.period = value;
    }

    /**
     * Recupera il valore della proprietà income.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncome() {
        return income;
    }

    /**
     * Imposta il valore della proprietà income.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncome(BigDecimal value) {
        this.income = value;
    }

    /**
     * Recupera il valore della proprietà fringeBenefits.
     * 
     * @return
     *     possible object is
     *     {@link SortSumType }
     *     
     */
    public SortSumType getFringeBenefits() {
        return fringeBenefits;
    }

    /**
     * Imposta il valore della proprietà fringeBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumType }
     *     
     */
    public void setFringeBenefits(SortSumType value) {
        this.fringeBenefits = value;
    }

    /**
     * Recupera il valore della proprietà sporadicBenefits.
     * 
     * @return
     *     possible object is
     *     {@link SortSumType }
     *     
     */
    public SortSumType getSporadicBenefits() {
        return sporadicBenefits;
    }

    /**
     * Imposta il valore della proprietà sporadicBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumType }
     *     
     */
    public void setSporadicBenefits(SortSumType value) {
        this.sporadicBenefits = value;
    }

    /**
     * Recupera il valore della proprietà ownershipRight.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnershipRight() {
        return ownershipRight;
    }

    /**
     * Imposta il valore della proprietà ownershipRight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnershipRight(BigDecimal value) {
        this.ownershipRight = value;
    }

    /**
     * Recupera il valore della proprietà otherBenefits.
     * 
     * @return
     *     possible object is
     *     {@link SortSumType }
     *     
     */
    public SortSumType getOtherBenefits() {
        return otherBenefits;
    }

    /**
     * Imposta il valore della proprietà otherBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumType }
     *     
     */
    public void setOtherBenefits(SortSumType value) {
        this.otherBenefits = value;
    }

    /**
     * Recupera il valore della proprietà grossIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossIncome() {
        return grossIncome;
    }

    /**
     * Imposta il valore della proprietà grossIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossIncome(BigDecimal value) {
        this.grossIncome = value;
    }

    /**
     * Recupera il valore della proprietà netIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetIncome() {
        return netIncome;
    }

    /**
     * Imposta il valore della proprietà netIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetIncome(BigDecimal value) {
        this.netIncome = value;
    }

    /**
     * Recupera il valore della proprietà deductionAtSource.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductionAtSource() {
        return deductionAtSource;
    }

    /**
     * Imposta il valore della proprietà deductionAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductionAtSource(BigDecimal value) {
        this.deductionAtSource = value;
    }

    /**
     * Recupera il valore della proprietà remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Imposta il valore della proprietà remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Recupera il valore della proprietà standardRemark.
     * 
     * @return
     *     possible object is
     *     {@link StandardRemarkAnnuityType }
     *     
     */
    public StandardRemarkAnnuityType getStandardRemark() {
        return standardRemark;
    }

    /**
     * Imposta il valore della proprietà standardRemark.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardRemarkAnnuityType }
     *     
     */
    public void setStandardRemark(StandardRemarkAnnuityType value) {
        this.standardRemark = value;
    }

}
