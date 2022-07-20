
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.TimePeriodType;


/**
 * <p>Classe Java per ReductionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReductionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReasonPartialRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReasonReduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReasonOnCompensation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReasonHospitalAliment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Percentage" type="{http://www.swissdec.ch/schema/common/20180901/Common}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="CoveringDays" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}DaysType" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOfDays" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/common/20180901/Common}TimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="ReductionAllowance" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType" minOccurs="0"/&gt;
 *         &lt;element name="ReductionAmountFavourInstitution" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType" minOccurs="0"/&gt;
 *         &lt;element name="AmountBeforeReductionFavourCompany" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReductionType", propOrder = {
    "reasonPartialRelease",
    "reasonReduction",
    "reasonOnCompensation",
    "reasonHospitalAliment",
    "percentage",
    "coveringDays",
    "quantityOfDays",
    "period",
    "reductionAllowance",
    "reductionAmountFavourInstitution",
    "amountBeforeReductionFavourCompany"
})
public class ReductionType {

    @XmlElement(name = "ReasonPartialRelease")
    protected String reasonPartialRelease;
    @XmlElement(name = "ReasonReduction")
    protected String reasonReduction;
    @XmlElement(name = "ReasonOnCompensation")
    protected String reasonOnCompensation;
    @XmlElement(name = "ReasonHospitalAliment")
    protected String reasonHospitalAliment;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;
    @XmlElement(name = "CoveringDays")
    protected BigDecimal coveringDays;
    @XmlElement(name = "QuantityOfDays")
    protected Short quantityOfDays;
    @XmlElement(name = "Period")
    protected TimePeriodType period;
    @XmlElement(name = "ReductionAllowance")
    protected BigDecimal reductionAllowance;
    @XmlElement(name = "ReductionAmountFavourInstitution")
    protected BigDecimal reductionAmountFavourInstitution;
    @XmlElement(name = "AmountBeforeReductionFavourCompany")
    protected BigDecimal amountBeforeReductionFavourCompany;

    /**
     * Recupera il valore della proprietà reasonPartialRelease.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonPartialRelease() {
        return reasonPartialRelease;
    }

    /**
     * Imposta il valore della proprietà reasonPartialRelease.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonPartialRelease(String value) {
        this.reasonPartialRelease = value;
    }

    /**
     * Recupera il valore della proprietà reasonReduction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonReduction() {
        return reasonReduction;
    }

    /**
     * Imposta il valore della proprietà reasonReduction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonReduction(String value) {
        this.reasonReduction = value;
    }

    /**
     * Recupera il valore della proprietà reasonOnCompensation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonOnCompensation() {
        return reasonOnCompensation;
    }

    /**
     * Imposta il valore della proprietà reasonOnCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonOnCompensation(String value) {
        this.reasonOnCompensation = value;
    }

    /**
     * Recupera il valore della proprietà reasonHospitalAliment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonHospitalAliment() {
        return reasonHospitalAliment;
    }

    /**
     * Imposta il valore della proprietà reasonHospitalAliment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonHospitalAliment(String value) {
        this.reasonHospitalAliment = value;
    }

    /**
     * Recupera il valore della proprietà percentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Imposta il valore della proprietà percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
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
     * Recupera il valore della proprietà reductionAllowance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReductionAllowance() {
        return reductionAllowance;
    }

    /**
     * Imposta il valore della proprietà reductionAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReductionAllowance(BigDecimal value) {
        this.reductionAllowance = value;
    }

    /**
     * Recupera il valore della proprietà reductionAmountFavourInstitution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReductionAmountFavourInstitution() {
        return reductionAmountFavourInstitution;
    }

    /**
     * Imposta il valore della proprietà reductionAmountFavourInstitution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReductionAmountFavourInstitution(BigDecimal value) {
        this.reductionAmountFavourInstitution = value;
    }

    /**
     * Recupera il valore della proprietà amountBeforeReductionFavourCompany.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountBeforeReductionFavourCompany() {
        return amountBeforeReductionFavourCompany;
    }

    /**
     * Imposta il valore della proprietà amountBeforeReductionFavourCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountBeforeReductionFavourCompany(BigDecimal value) {
        this.amountBeforeReductionFavourCompany = value;
    }

}
