
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.CompanyDescriptionBaseType;


/**
 * <p>Classe Java per CompanyMonthTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyMonthTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyDescription" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyDescriptionBaseType"/&gt;
 *         &lt;element name="Institutions" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}InstitutionsMonthTotalType"/&gt;
 *         &lt;element name="MonthTotals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}MonthTotalsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyMonthTotalType", propOrder = {
    "companyDescription",
    "institutions",
    "monthTotals"
})
public class CompanyMonthTotalType {

    @XmlElement(name = "CompanyDescription", required = true)
    protected CompanyDescriptionBaseType companyDescription;
    @XmlElement(name = "Institutions", required = true)
    protected InstitutionsMonthTotalType institutions;
    @XmlElement(name = "MonthTotals", required = true)
    protected MonthTotalsType monthTotals;

    /**
     * Recupera il valore della proprietà companyDescription.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDescriptionBaseType }
     *     
     */
    public CompanyDescriptionBaseType getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Imposta il valore della proprietà companyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDescriptionBaseType }
     *     
     */
    public void setCompanyDescription(CompanyDescriptionBaseType value) {
        this.companyDescription = value;
    }

    /**
     * Recupera il valore della proprietà institutions.
     * 
     * @return
     *     possible object is
     *     {@link InstitutionsMonthTotalType }
     *     
     */
    public InstitutionsMonthTotalType getInstitutions() {
        return institutions;
    }

    /**
     * Imposta il valore della proprietà institutions.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitutionsMonthTotalType }
     *     
     */
    public void setInstitutions(InstitutionsMonthTotalType value) {
        this.institutions = value;
    }

    /**
     * Recupera il valore della proprietà monthTotals.
     * 
     * @return
     *     possible object is
     *     {@link MonthTotalsType }
     *     
     */
    public MonthTotalsType getMonthTotals() {
        return monthTotals;
    }

    /**
     * Imposta il valore della proprietà monthTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthTotalsType }
     *     
     */
    public void setMonthTotals(MonthTotalsType value) {
        this.monthTotals = value;
    }

}
