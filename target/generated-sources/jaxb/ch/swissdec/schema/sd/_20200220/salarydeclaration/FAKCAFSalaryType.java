
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.CantonAddressType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per FAK-CAF-SalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-SalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationCategory" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-DeclarationCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF-Period" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="FAK-CAF-ContributorySalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="FAK-CAF-FamilyIncomeSupplement" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-FamilyIncomeSupplementType" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF-WorkplaceCanton" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAddressType"/&gt;
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
@XmlType(name = "FAK-CAF-SalaryType", propOrder = {
    "declarationCategory",
    "fakcafPeriod",
    "fakcafContributorySalary",
    "fakcafFamilyIncomeSupplement",
    "fakcafWorkplaceCanton"
})
public class FAKCAFSalaryType {

    @XmlElement(name = "DeclarationCategory")
    protected FAKCAFDeclarationCategoryType declarationCategory;
    @XmlElement(name = "FAK-CAF-Period", required = true)
    protected TimePeriodType fakcafPeriod;
    @XmlElement(name = "FAK-CAF-ContributorySalary", required = true)
    protected BigDecimal fakcafContributorySalary;
    @XmlElement(name = "FAK-CAF-FamilyIncomeSupplement")
    protected FAKCAFFamilyIncomeSupplementType fakcafFamilyIncomeSupplement;
    @XmlElement(name = "FAK-CAF-WorkplaceCanton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType fakcafWorkplaceCanton;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà declarationCategory.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFDeclarationCategoryType }
     *     
     */
    public FAKCAFDeclarationCategoryType getDeclarationCategory() {
        return declarationCategory;
    }

    /**
     * Imposta il valore della proprietà declarationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFDeclarationCategoryType }
     *     
     */
    public void setDeclarationCategory(FAKCAFDeclarationCategoryType value) {
        this.declarationCategory = value;
    }

    /**
     * Recupera il valore della proprietà fakcafPeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getFAKCAFPeriod() {
        return fakcafPeriod;
    }

    /**
     * Imposta il valore della proprietà fakcafPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setFAKCAFPeriod(TimePeriodType value) {
        this.fakcafPeriod = value;
    }

    /**
     * Recupera il valore della proprietà fakcafContributorySalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFAKCAFContributorySalary() {
        return fakcafContributorySalary;
    }

    /**
     * Imposta il valore della proprietà fakcafContributorySalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFAKCAFContributorySalary(BigDecimal value) {
        this.fakcafContributorySalary = value;
    }

    /**
     * Recupera il valore della proprietà fakcafFamilyIncomeSupplement.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFFamilyIncomeSupplementType }
     *     
     */
    public FAKCAFFamilyIncomeSupplementType getFAKCAFFamilyIncomeSupplement() {
        return fakcafFamilyIncomeSupplement;
    }

    /**
     * Imposta il valore della proprietà fakcafFamilyIncomeSupplement.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFFamilyIncomeSupplementType }
     *     
     */
    public void setFAKCAFFamilyIncomeSupplement(FAKCAFFamilyIncomeSupplementType value) {
        this.fakcafFamilyIncomeSupplement = value;
    }

    /**
     * Recupera il valore della proprietà fakcafWorkplaceCanton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getFAKCAFWorkplaceCanton() {
        return fakcafWorkplaceCanton;
    }

    /**
     * Imposta il valore della proprietà fakcafWorkplaceCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setFAKCAFWorkplaceCanton(CantonAddressType value) {
        this.fakcafWorkplaceCanton = value;
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
