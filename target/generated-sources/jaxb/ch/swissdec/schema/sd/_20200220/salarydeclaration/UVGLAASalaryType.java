
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per UVG-LAA-SalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVG-LAA-SalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="UVG-LAA-Code" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVG-LAA-CodeType"/&gt;
 *         &lt;element name="UVG-LAA-GrossSalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="UVG-LAA-BaseSalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="UVG-LAA-ContributorySalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
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
@XmlType(name = "UVG-LAA-SalaryType", propOrder = {
    "accountingTime",
    "uvglaaCode",
    "uvglaaGrossSalary",
    "uvglaaBaseSalary",
    "uvglaaContributorySalary"
})
public class UVGLAASalaryType {

    @XmlElement(name = "AccountingTime", required = true)
    protected TimePeriodType accountingTime;
    @XmlElement(name = "UVG-LAA-Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String uvglaaCode;
    @XmlElement(name = "UVG-LAA-GrossSalary", required = true)
    protected BigDecimal uvglaaGrossSalary;
    @XmlElement(name = "UVG-LAA-BaseSalary", required = true)
    protected BigDecimal uvglaaBaseSalary;
    @XmlElement(name = "UVG-LAA-ContributorySalary", required = true)
    protected BigDecimal uvglaaContributorySalary;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

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
     * Recupera il valore della proprietà uvglaaCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVGLAACode() {
        return uvglaaCode;
    }

    /**
     * Imposta il valore della proprietà uvglaaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVGLAACode(String value) {
        this.uvglaaCode = value;
    }

    /**
     * Recupera il valore della proprietà uvglaaGrossSalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUVGLAAGrossSalary() {
        return uvglaaGrossSalary;
    }

    /**
     * Imposta il valore della proprietà uvglaaGrossSalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUVGLAAGrossSalary(BigDecimal value) {
        this.uvglaaGrossSalary = value;
    }

    /**
     * Recupera il valore della proprietà uvglaaBaseSalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUVGLAABaseSalary() {
        return uvglaaBaseSalary;
    }

    /**
     * Imposta il valore della proprietà uvglaaBaseSalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUVGLAABaseSalary(BigDecimal value) {
        this.uvglaaBaseSalary = value;
    }

    /**
     * Recupera il valore della proprietà uvglaaContributorySalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUVGLAAContributorySalary() {
        return uvglaaContributorySalary;
    }

    /**
     * Imposta il valore della proprietà uvglaaContributorySalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUVGLAAContributorySalary(BigDecimal value) {
        this.uvglaaContributorySalary = value;
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
