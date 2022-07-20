
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompanyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyDescription" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CompanyDescriptionType"/&gt;
 *         &lt;element name="Staff" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}PersonsType"/&gt;
 *         &lt;element name="Institutions" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CustomerIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="SalaryTotals" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryTotalsType" minOccurs="0"/&gt;
 *         &lt;element name="SalaryCounters" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryCountersType"/&gt;
 *         &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}StatisticType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyType", propOrder = {
    "companyDescription",
    "staff",
    "institutions",
    "salaryTotals",
    "salaryCounters",
    "statistic"
})
public class CompanyType {

    @XmlElement(name = "CompanyDescription", required = true)
    protected CompanyDescriptionType companyDescription;
    @XmlElement(name = "Staff", required = true)
    protected PersonsType staff;
    @XmlElement(name = "Institutions")
    protected CustomerIdentificationType institutions;
    @XmlElement(name = "SalaryTotals")
    protected SalaryTotalsType salaryTotals;
    @XmlElement(name = "SalaryCounters", required = true)
    protected SalaryCountersType salaryCounters;
    @XmlElement(name = "Statistic")
    protected StatisticType statistic;

    /**
     * Recupera il valore della proprietà companyDescription.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDescriptionType }
     *     
     */
    public CompanyDescriptionType getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Imposta il valore della proprietà companyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDescriptionType }
     *     
     */
    public void setCompanyDescription(CompanyDescriptionType value) {
        this.companyDescription = value;
    }

    /**
     * Recupera il valore della proprietà staff.
     * 
     * @return
     *     possible object is
     *     {@link PersonsType }
     *     
     */
    public PersonsType getStaff() {
        return staff;
    }

    /**
     * Imposta il valore della proprietà staff.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonsType }
     *     
     */
    public void setStaff(PersonsType value) {
        this.staff = value;
    }

    /**
     * Recupera il valore della proprietà institutions.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public CustomerIdentificationType getInstitutions() {
        return institutions;
    }

    /**
     * Imposta il valore della proprietà institutions.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public void setInstitutions(CustomerIdentificationType value) {
        this.institutions = value;
    }

    /**
     * Recupera il valore della proprietà salaryTotals.
     * 
     * @return
     *     possible object is
     *     {@link SalaryTotalsType }
     *     
     */
    public SalaryTotalsType getSalaryTotals() {
        return salaryTotals;
    }

    /**
     * Imposta il valore della proprietà salaryTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryTotalsType }
     *     
     */
    public void setSalaryTotals(SalaryTotalsType value) {
        this.salaryTotals = value;
    }

    /**
     * Recupera il valore della proprietà salaryCounters.
     * 
     * @return
     *     possible object is
     *     {@link SalaryCountersType }
     *     
     */
    public SalaryCountersType getSalaryCounters() {
        return salaryCounters;
    }

    /**
     * Imposta il valore della proprietà salaryCounters.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryCountersType }
     *     
     */
    public void setSalaryCounters(SalaryCountersType value) {
        this.salaryCounters = value;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link StatisticType }
     *     
     */
    public StatisticType getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticType }
     *     
     */
    public void setStatistic(StatisticType value) {
        this.statistic = value;
    }

}
