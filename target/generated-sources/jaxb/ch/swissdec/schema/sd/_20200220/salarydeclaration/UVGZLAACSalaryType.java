
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
 * <p>Classe Java per UVGZ-LAAC-SalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVGZ-LAAC-SalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="UVGZ-LAAC-Code" type="{http://www.swissdec.ch/schema/common/20200220/Common}AssuranceCategoryCodeType"/&gt;
 *         &lt;element name="UVGZ-LAAC-BaseSalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="UVGZ-LAAC-ContributorySalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
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
@XmlType(name = "UVGZ-LAAC-SalaryType", propOrder = {
    "accountingTime",
    "uvgzlaacCode",
    "uvgzlaacBaseSalary",
    "uvgzlaacContributorySalary"
})
public class UVGZLAACSalaryType {

    @XmlElement(name = "AccountingTime", required = true)
    protected TimePeriodType accountingTime;
    @XmlElement(name = "UVGZ-LAAC-Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String uvgzlaacCode;
    @XmlElement(name = "UVGZ-LAAC-BaseSalary", required = true)
    protected BigDecimal uvgzlaacBaseSalary;
    @XmlElement(name = "UVGZ-LAAC-ContributorySalary", required = true)
    protected BigDecimal uvgzlaacContributorySalary;
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
     * Recupera il valore della proprietà uvgzlaacCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVGZLAACCode() {
        return uvgzlaacCode;
    }

    /**
     * Imposta il valore della proprietà uvgzlaacCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVGZLAACCode(String value) {
        this.uvgzlaacCode = value;
    }

    /**
     * Recupera il valore della proprietà uvgzlaacBaseSalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUVGZLAACBaseSalary() {
        return uvgzlaacBaseSalary;
    }

    /**
     * Imposta il valore della proprietà uvgzlaacBaseSalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUVGZLAACBaseSalary(BigDecimal value) {
        this.uvgzlaacBaseSalary = value;
    }

    /**
     * Recupera il valore della proprietà uvgzlaacContributorySalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUVGZLAACContributorySalary() {
        return uvgzlaacContributorySalary;
    }

    /**
     * Imposta il valore della proprietà uvgzlaacContributorySalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUVGZLAACContributorySalary(BigDecimal value) {
        this.uvgzlaacContributorySalary = value;
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
