
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per AHV-AVS-SalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-SalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationCategory" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-DeclarationCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="AccountingTime" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="AHV-AVS-Income" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="AHV-AVS-IncomeSplits" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-IncomeSplitsType" minOccurs="0"/&gt;
 *         &lt;element name="AHV-AVS-Open" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ALV-AC-Income" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="ALVZ-ACS-Income" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ALV-AC-Open" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="DegreeOfRelationship" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DegreeOfRelationshipType" minOccurs="0"/&gt;
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
@XmlType(name = "AHV-AVS-SalaryType", propOrder = {
    "declarationCategory",
    "accountingTime",
    "ahvavsIncome",
    "ahvavsIncomeSplits",
    "ahvavsOpen",
    "alvacIncome",
    "alvzacsIncome",
    "alvacOpen",
    "degreeOfRelationship"
})
public class AHVAVSSalaryType {

    @XmlElement(name = "DeclarationCategory")
    protected AHVAVSDeclarationCategoryType declarationCategory;
    @XmlElement(name = "AccountingTime", required = true)
    protected TimePeriodType accountingTime;
    @XmlElement(name = "AHV-AVS-Income", required = true)
    protected BigDecimal ahvavsIncome;
    @XmlElement(name = "AHV-AVS-IncomeSplits")
    protected AHVAVSIncomeSplitsType ahvavsIncomeSplits;
    @XmlElement(name = "AHV-AVS-Open")
    protected BigDecimal ahvavsOpen;
    @XmlElement(name = "ALV-AC-Income", required = true)
    protected BigDecimal alvacIncome;
    @XmlElement(name = "ALVZ-ACS-Income")
    protected BigDecimal alvzacsIncome;
    @XmlElement(name = "ALV-AC-Open")
    protected BigDecimal alvacOpen;
    @XmlElement(name = "DegreeOfRelationship")
    @XmlSchemaType(name = "NMTOKEN")
    protected DegreeOfRelationshipType degreeOfRelationship;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà declarationCategory.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSDeclarationCategoryType }
     *     
     */
    public AHVAVSDeclarationCategoryType getDeclarationCategory() {
        return declarationCategory;
    }

    /**
     * Imposta il valore della proprietà declarationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSDeclarationCategoryType }
     *     
     */
    public void setDeclarationCategory(AHVAVSDeclarationCategoryType value) {
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
     * Recupera il valore della proprietà ahvavsIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAHVAVSIncome() {
        return ahvavsIncome;
    }

    /**
     * Imposta il valore della proprietà ahvavsIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAHVAVSIncome(BigDecimal value) {
        this.ahvavsIncome = value;
    }

    /**
     * Recupera il valore della proprietà ahvavsIncomeSplits.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSIncomeSplitsType }
     *     
     */
    public AHVAVSIncomeSplitsType getAHVAVSIncomeSplits() {
        return ahvavsIncomeSplits;
    }

    /**
     * Imposta il valore della proprietà ahvavsIncomeSplits.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSIncomeSplitsType }
     *     
     */
    public void setAHVAVSIncomeSplits(AHVAVSIncomeSplitsType value) {
        this.ahvavsIncomeSplits = value;
    }

    /**
     * Recupera il valore della proprietà ahvavsOpen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAHVAVSOpen() {
        return ahvavsOpen;
    }

    /**
     * Imposta il valore della proprietà ahvavsOpen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAHVAVSOpen(BigDecimal value) {
        this.ahvavsOpen = value;
    }

    /**
     * Recupera il valore della proprietà alvacIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getALVACIncome() {
        return alvacIncome;
    }

    /**
     * Imposta il valore della proprietà alvacIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setALVACIncome(BigDecimal value) {
        this.alvacIncome = value;
    }

    /**
     * Recupera il valore della proprietà alvzacsIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getALVZACSIncome() {
        return alvzacsIncome;
    }

    /**
     * Imposta il valore della proprietà alvzacsIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setALVZACSIncome(BigDecimal value) {
        this.alvzacsIncome = value;
    }

    /**
     * Recupera il valore della proprietà alvacOpen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getALVACOpen() {
        return alvacOpen;
    }

    /**
     * Imposta il valore della proprietà alvacOpen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setALVACOpen(BigDecimal value) {
        this.alvacOpen = value;
    }

    /**
     * Recupera il valore della proprietà degreeOfRelationship.
     * 
     * @return
     *     possible object is
     *     {@link DegreeOfRelationshipType }
     *     
     */
    public DegreeOfRelationshipType getDegreeOfRelationship() {
        return degreeOfRelationship;
    }

    /**
     * Imposta il valore della proprietà degreeOfRelationship.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeOfRelationshipType }
     *     
     */
    public void setDegreeOfRelationship(DegreeOfRelationshipType value) {
        this.degreeOfRelationship = value;
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
