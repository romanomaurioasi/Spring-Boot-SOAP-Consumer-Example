
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
 * <p>Classe Java per KTG-AMC-SalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KTG-AMC-SalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="KTG-AMC-Code" type="{http://www.swissdec.ch/schema/common/20200220/Common}AssuranceCategoryCodeType"/&gt;
 *         &lt;element name="Reference-AHV-AVS-Salary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="KTG-AMC-ContributorySalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
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
@XmlType(name = "KTG-AMC-SalaryType", propOrder = {
    "accountingTime",
    "ktgamcCode",
    "referenceAHVAVSSalary",
    "ktgamcContributorySalary"
})
public class KTGAMCSalaryType {

    @XmlElement(name = "AccountingTime", required = true)
    protected TimePeriodType accountingTime;
    @XmlElement(name = "KTG-AMC-Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String ktgamcCode;
    @XmlElement(name = "Reference-AHV-AVS-Salary", required = true)
    protected BigDecimal referenceAHVAVSSalary;
    @XmlElement(name = "KTG-AMC-ContributorySalary", required = true)
    protected BigDecimal ktgamcContributorySalary;
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
     * Recupera il valore della proprietà ktgamcCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKTGAMCCode() {
        return ktgamcCode;
    }

    /**
     * Imposta il valore della proprietà ktgamcCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKTGAMCCode(String value) {
        this.ktgamcCode = value;
    }

    /**
     * Recupera il valore della proprietà referenceAHVAVSSalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReferenceAHVAVSSalary() {
        return referenceAHVAVSSalary;
    }

    /**
     * Imposta il valore della proprietà referenceAHVAVSSalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReferenceAHVAVSSalary(BigDecimal value) {
        this.referenceAHVAVSSalary = value;
    }

    /**
     * Recupera il valore della proprietà ktgamcContributorySalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKTGAMCContributorySalary() {
        return ktgamcContributorySalary;
    }

    /**
     * Imposta il valore della proprietà ktgamcContributorySalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKTGAMCContributorySalary(BigDecimal value) {
        this.ktgamcContributorySalary = value;
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
