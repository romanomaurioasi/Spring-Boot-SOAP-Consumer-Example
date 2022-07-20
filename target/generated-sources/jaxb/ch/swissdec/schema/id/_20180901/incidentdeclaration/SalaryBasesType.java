
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SalaryBasesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryBasesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicWages" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FamilyIncomeSupplement" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="VacationAndPublicHolidayCompensation" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="OtherSupplements" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Gratuity" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryBasesType", propOrder = {
    "basicWages",
    "familyIncomeSupplement",
    "vacationAndPublicHolidayCompensation",
    "otherSupplements",
    "gratuity"
})
public class SalaryBasesType {

    @XmlElement(name = "BasicWages")
    protected BigDecimal basicWages;
    @XmlElement(name = "FamilyIncomeSupplement")
    protected BigDecimal familyIncomeSupplement;
    @XmlElement(name = "VacationAndPublicHolidayCompensation")
    protected BigDecimal vacationAndPublicHolidayCompensation;
    @XmlElement(name = "OtherSupplements")
    protected BigDecimal otherSupplements;
    @XmlElement(name = "Gratuity")
    protected BigDecimal gratuity;

    /**
     * Recupera il valore della proprietà basicWages.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasicWages() {
        return basicWages;
    }

    /**
     * Imposta il valore della proprietà basicWages.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasicWages(BigDecimal value) {
        this.basicWages = value;
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
     * Recupera il valore della proprietà vacationAndPublicHolidayCompensation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVacationAndPublicHolidayCompensation() {
        return vacationAndPublicHolidayCompensation;
    }

    /**
     * Imposta il valore della proprietà vacationAndPublicHolidayCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVacationAndPublicHolidayCompensation(BigDecimal value) {
        this.vacationAndPublicHolidayCompensation = value;
    }

    /**
     * Recupera il valore della proprietà otherSupplements.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherSupplements() {
        return otherSupplements;
    }

    /**
     * Imposta il valore della proprietà otherSupplements.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherSupplements(BigDecimal value) {
        this.otherSupplements = value;
    }

    /**
     * Recupera il valore della proprietà gratuity.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGratuity() {
        return gratuity;
    }

    /**
     * Imposta il valore della proprietà gratuity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGratuity(BigDecimal value) {
        this.gratuity = value;
    }

}
