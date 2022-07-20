
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="StaffShareThirdCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChildAllowancePerAHV-AVS" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ChildAllowancePerAHV-AVSType" minOccurs="0"/&gt;
 *         &lt;element name="RelocationCosts" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="StaffShareMarketValue" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GrantType" minOccurs="0"/&gt;
 *         &lt;element name="StaffShareWithoutTaxableIncome" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ReasonType" minOccurs="0"/&gt;
 *         &lt;element name="PrivatePartCompanyCar" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GrantType" minOccurs="0"/&gt;
 *         &lt;element name="CompanyCarClarify" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="MinimalEmployeeCarPartPercentage" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSourcePeriodForObjection" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
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
    "staffShareThirdCompany",
    "childAllowancePerAHVAVS",
    "relocationCosts",
    "staffShareMarketValue",
    "staffShareWithoutTaxableIncome",
    "privatePartCompanyCar",
    "companyCarClarify",
    "minimalEmployeeCarPartPercentage",
    "taxAtSourcePeriodForObjection"
})
public class StandardRemarkType {

    @XmlElement(name = "StaffShareThirdCompany")
    protected String staffShareThirdCompany;
    @XmlElement(name = "ChildAllowancePerAHV-AVS")
    protected ChildAllowancePerAHVAVSType childAllowancePerAHVAVS;
    @XmlElement(name = "RelocationCosts")
    protected BigDecimal relocationCosts;
    @XmlElement(name = "StaffShareMarketValue")
    protected GrantType staffShareMarketValue;
    @XmlElement(name = "StaffShareWithoutTaxableIncome")
    protected String staffShareWithoutTaxableIncome;
    @XmlElement(name = "PrivatePartCompanyCar")
    protected GrantType privatePartCompanyCar;
    @XmlElement(name = "CompanyCarClarify")
    protected EmptyType companyCarClarify;
    @XmlElement(name = "MinimalEmployeeCarPartPercentage")
    protected EmptyType minimalEmployeeCarPartPercentage;
    @XmlElement(name = "TaxAtSourcePeriodForObjection")
    protected EmptyType taxAtSourcePeriodForObjection;

    /**
     * Recupera il valore della proprietà staffShareThirdCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffShareThirdCompany() {
        return staffShareThirdCompany;
    }

    /**
     * Imposta il valore della proprietà staffShareThirdCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffShareThirdCompany(String value) {
        this.staffShareThirdCompany = value;
    }

    /**
     * Recupera il valore della proprietà childAllowancePerAHVAVS.
     * 
     * @return
     *     possible object is
     *     {@link ChildAllowancePerAHVAVSType }
     *     
     */
    public ChildAllowancePerAHVAVSType getChildAllowancePerAHVAVS() {
        return childAllowancePerAHVAVS;
    }

    /**
     * Imposta il valore della proprietà childAllowancePerAHVAVS.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildAllowancePerAHVAVSType }
     *     
     */
    public void setChildAllowancePerAHVAVS(ChildAllowancePerAHVAVSType value) {
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
     *     {@link String }
     *     
     */
    public String getStaffShareWithoutTaxableIncome() {
        return staffShareWithoutTaxableIncome;
    }

    /**
     * Imposta il valore della proprietà staffShareWithoutTaxableIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffShareWithoutTaxableIncome(String value) {
        this.staffShareWithoutTaxableIncome = value;
    }

    /**
     * Recupera il valore della proprietà privatePartCompanyCar.
     * 
     * @return
     *     possible object is
     *     {@link GrantType }
     *     
     */
    public GrantType getPrivatePartCompanyCar() {
        return privatePartCompanyCar;
    }

    /**
     * Imposta il valore della proprietà privatePartCompanyCar.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantType }
     *     
     */
    public void setPrivatePartCompanyCar(GrantType value) {
        this.privatePartCompanyCar = value;
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

}
