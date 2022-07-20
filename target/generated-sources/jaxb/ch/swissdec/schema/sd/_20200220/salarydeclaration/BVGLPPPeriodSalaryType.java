
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per BVG-LPP-PeriodSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-PeriodSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationCategory" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-DeclarationCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="AccountingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="BVG-LPP-Code" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="BVG-LPP-PeriodBasis" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="BVG-LPP-PeriodContributorySalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *             &lt;element name="EmployeePeriodContribution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *             &lt;element name="EmployerPeriodContribution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *             &lt;element name="ThirdPartyPeriodContribution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="institutionIDRef" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-PeriodSalaryType", propOrder = {
    "declarationCategory",
    "accountingTime",
    "bvglppCode",
    "bvglppPeriodBasis",
    "bvglppPeriodContributorySalary",
    "employeePeriodContribution",
    "employerPeriodContribution",
    "thirdPartyPeriodContribution"
})
public class BVGLPPPeriodSalaryType {

    @XmlElement(name = "DeclarationCategory")
    protected BVGLPPDeclarationCategoryType declarationCategory;
    @XmlElement(name = "AccountingTime", required = true)
    protected TimePeriodType accountingTime;
    @XmlElement(name = "BVG-LPP-Code")
    protected String bvglppCode;
    @XmlElement(name = "BVG-LPP-PeriodBasis")
    protected BigDecimal bvglppPeriodBasis;
    @XmlElement(name = "BVG-LPP-PeriodContributorySalary")
    protected BigDecimal bvglppPeriodContributorySalary;
    @XmlElement(name = "EmployeePeriodContribution")
    protected BigDecimal employeePeriodContribution;
    @XmlElement(name = "EmployerPeriodContribution")
    protected BigDecimal employerPeriodContribution;
    @XmlElement(name = "ThirdPartyPeriodContribution")
    protected BigDecimal thirdPartyPeriodContribution;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà declarationCategory.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPDeclarationCategoryType }
     *     
     */
    public BVGLPPDeclarationCategoryType getDeclarationCategory() {
        return declarationCategory;
    }

    /**
     * Imposta il valore della proprietà declarationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPDeclarationCategoryType }
     *     
     */
    public void setDeclarationCategory(BVGLPPDeclarationCategoryType value) {
        this.declarationCategory = value;
    }

    /**
     * Recupera il valore della proprietà accountingTime.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getAccountingTime() {
        return accountingTime;
    }

    /**
     * Imposta il valore della proprietà accountingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setAccountingTime(TimePeriodType value) {
        this.accountingTime = value;
    }

    /**
     * Recupera il valore della proprietà bvglppCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVGLPPCode() {
        return bvglppCode;
    }

    /**
     * Imposta il valore della proprietà bvglppCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVGLPPCode(String value) {
        this.bvglppCode = value;
    }

    /**
     * Recupera il valore della proprietà bvglppPeriodBasis.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPPeriodBasis() {
        return bvglppPeriodBasis;
    }

    /**
     * Imposta il valore della proprietà bvglppPeriodBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPPeriodBasis(BigDecimal value) {
        this.bvglppPeriodBasis = value;
    }

    /**
     * Recupera il valore della proprietà bvglppPeriodContributorySalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPPeriodContributorySalary() {
        return bvglppPeriodContributorySalary;
    }

    /**
     * Imposta il valore della proprietà bvglppPeriodContributorySalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPPeriodContributorySalary(BigDecimal value) {
        this.bvglppPeriodContributorySalary = value;
    }

    /**
     * Recupera il valore della proprietà employeePeriodContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeePeriodContribution() {
        return employeePeriodContribution;
    }

    /**
     * Imposta il valore della proprietà employeePeriodContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeePeriodContribution(BigDecimal value) {
        this.employeePeriodContribution = value;
    }

    /**
     * Recupera il valore della proprietà employerPeriodContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployerPeriodContribution() {
        return employerPeriodContribution;
    }

    /**
     * Imposta il valore della proprietà employerPeriodContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployerPeriodContribution(BigDecimal value) {
        this.employerPeriodContribution = value;
    }

    /**
     * Recupera il valore della proprietà thirdPartyPeriodContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThirdPartyPeriodContribution() {
        return thirdPartyPeriodContribution;
    }

    /**
     * Imposta il valore della proprietà thirdPartyPeriodContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThirdPartyPeriodContribution(BigDecimal value) {
        this.thirdPartyPeriodContribution = value;
    }

    /**
     * Recupera il valore della proprietà institutionIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionIDRef() {
        return institutionIDRef;
    }

    /**
     * Imposta il valore della proprietà institutionIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionIDRef(String value) {
        this.institutionIDRef = value;
    }

}
