
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ContractualHourlyWageType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContractualHourlyWageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Salary" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Vacation" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType"/&gt;
 *         &lt;element name="PublicHolidayCompensation" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType"/&gt;
 *         &lt;element name="Contractual13th" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractualHourlyWageType", propOrder = {
    "salary",
    "vacation",
    "publicHolidayCompensation",
    "contractual13Th"
})
public class ContractualHourlyWageType {

    @XmlElement(name = "Salary", required = true)
    protected List<SalaryType> salary;
    @XmlElement(name = "Vacation", required = true)
    protected BigDecimal vacation;
    @XmlElement(name = "PublicHolidayCompensation", required = true)
    protected BigDecimal publicHolidayCompensation;
    @XmlElement(name = "Contractual13th", required = true)
    protected List<BigDecimal> contractual13Th;

    /**
     * Gets the value of the salary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalaryType }
     * 
     * 
     */
    public List<SalaryType> getSalary() {
        if (salary == null) {
            salary = new ArrayList<SalaryType>();
        }
        return this.salary;
    }

    /**
     * Recupera il valore della proprietà vacation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVacation() {
        return vacation;
    }

    /**
     * Imposta il valore della proprietà vacation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVacation(BigDecimal value) {
        this.vacation = value;
    }

    /**
     * Recupera il valore della proprietà publicHolidayCompensation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPublicHolidayCompensation() {
        return publicHolidayCompensation;
    }

    /**
     * Imposta il valore della proprietà publicHolidayCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPublicHolidayCompensation(BigDecimal value) {
        this.publicHolidayCompensation = value;
    }

    /**
     * Gets the value of the contractual13Th property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractual13Th property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractual13Th().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getContractual13Th() {
        if (contractual13Th == null) {
            contractual13Th = new ArrayList<BigDecimal>();
        }
        return this.contractual13Th;
    }

}
