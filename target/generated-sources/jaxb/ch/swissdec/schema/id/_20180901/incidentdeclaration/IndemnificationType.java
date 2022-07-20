
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.BalanceType;
import ch.swissdec.schema.common._20180901.common.NotificationsType;
import ch.swissdec.schema.common._20180901.common.TimePeriodType;


/**
 * <p>Classe Java per IndemnificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IndemnificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndemnificationID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="ProductCategory" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="WaitingDays" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}DaysType" minOccurs="0"/&gt;
 *         &lt;element name="CoveringDays" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}DaysType" minOccurs="0"/&gt;
 *         &lt;element name="IncapacityToWork" type="{http://www.swissdec.ch/schema/common/20180901/Common}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOfDays" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/common/20180901/Common}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDailyAllowance" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Reduction" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ReductionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://www.swissdec.ch/schema/common/20180901/Common}BalanceType"/&gt;
 *         &lt;element name="Contract" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ContractIndemnificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndemnificationType", propOrder = {
    "indemnificationID",
    "productCategory",
    "waitingDays",
    "coveringDays",
    "incapacityToWork",
    "quantityOfDays",
    "period",
    "effectiveDailyAllowance",
    "reduction",
    "balance",
    "contract",
    "comment"
})
public class IndemnificationType {

    @XmlElement(name = "IndemnificationID", required = true)
    protected String indemnificationID;
    @XmlElement(name = "ProductCategory")
    protected String productCategory;
    @XmlElement(name = "WaitingDays")
    protected BigDecimal waitingDays;
    @XmlElement(name = "CoveringDays")
    protected BigDecimal coveringDays;
    @XmlElement(name = "IncapacityToWork")
    protected BigDecimal incapacityToWork;
    @XmlElement(name = "QuantityOfDays")
    protected Short quantityOfDays;
    @XmlElement(name = "Period")
    protected TimePeriodType period;
    @XmlElement(name = "EffectiveDailyAllowance")
    protected BigDecimal effectiveDailyAllowance;
    @XmlElement(name = "Reduction")
    protected List<ReductionType> reduction;
    @XmlElement(name = "Balance", required = true)
    protected BalanceType balance;
    @XmlElement(name = "Contract")
    protected List<ContractIndemnificationType> contract;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà indemnificationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndemnificationID() {
        return indemnificationID;
    }

    /**
     * Imposta il valore della proprietà indemnificationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndemnificationID(String value) {
        this.indemnificationID = value;
    }

    /**
     * Recupera il valore della proprietà productCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Imposta il valore della proprietà productCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Recupera il valore della proprietà waitingDays.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWaitingDays() {
        return waitingDays;
    }

    /**
     * Imposta il valore della proprietà waitingDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWaitingDays(BigDecimal value) {
        this.waitingDays = value;
    }

    /**
     * Recupera il valore della proprietà coveringDays.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveringDays() {
        return coveringDays;
    }

    /**
     * Imposta il valore della proprietà coveringDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveringDays(BigDecimal value) {
        this.coveringDays = value;
    }

    /**
     * Recupera il valore della proprietà incapacityToWork.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncapacityToWork() {
        return incapacityToWork;
    }

    /**
     * Imposta il valore della proprietà incapacityToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncapacityToWork(BigDecimal value) {
        this.incapacityToWork = value;
    }

    /**
     * Recupera il valore della proprietà quantityOfDays.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQuantityOfDays() {
        return quantityOfDays;
    }

    /**
     * Imposta il valore della proprietà quantityOfDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQuantityOfDays(Short value) {
        this.quantityOfDays = value;
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
     * Recupera il valore della proprietà effectiveDailyAllowance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEffectiveDailyAllowance() {
        return effectiveDailyAllowance;
    }

    /**
     * Imposta il valore della proprietà effectiveDailyAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEffectiveDailyAllowance(BigDecimal value) {
        this.effectiveDailyAllowance = value;
    }

    /**
     * Gets the value of the reduction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reduction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReduction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReductionType }
     * 
     * 
     */
    public List<ReductionType> getReduction() {
        if (reduction == null) {
            reduction = new ArrayList<ReductionType>();
        }
        return this.reduction;
    }

    /**
     * Recupera il valore della proprietà balance.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType }
     *     
     */
    public BalanceType getBalance() {
        return balance;
    }

    /**
     * Imposta il valore della proprietà balance.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType }
     *     
     */
    public void setBalance(BalanceType value) {
        this.balance = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractIndemnificationType }
     * 
     * 
     */
    public List<ContractIndemnificationType> getContract() {
        if (contract == null) {
            contract = new ArrayList<ContractIndemnificationType>();
        }
        return this.contract;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setComment(NotificationsType value) {
        this.comment = value;
    }

}
