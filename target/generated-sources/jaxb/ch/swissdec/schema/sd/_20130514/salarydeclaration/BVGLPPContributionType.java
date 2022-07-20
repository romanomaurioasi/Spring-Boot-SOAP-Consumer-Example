
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per BVG-LPP-ContributionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-ContributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BVG-LPP-Code" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeDiffType" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="ValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *             &lt;element name="EmployeeContribution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *             &lt;element name="EmployerContribution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *             &lt;element name="ThirdPartyContribution" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;choice&gt;
 *             &lt;element name="Unknown" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType"/&gt;
 *             &lt;element name="Missing" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType"/&gt;
 *             &lt;element name="NoContributionsAvailable" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-ContributionType", propOrder = {
    "bvglppCode",
    "validAsOf",
    "employeeContribution",
    "employerContribution",
    "thirdPartyContribution",
    "unknown",
    "missing",
    "noContributionsAvailable"
})
public class BVGLPPContributionType {

    @XmlElement(name = "BVG-LPP-Code")
    protected BVGLPPAssuranceCategoryCodeDiffType bvglppCode;
    @XmlElement(name = "ValidAsOf")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validAsOf;
    @XmlElement(name = "EmployeeContribution")
    protected BigDecimal employeeContribution;
    @XmlElement(name = "EmployerContribution")
    protected BigDecimal employerContribution;
    @XmlElement(name = "ThirdPartyContribution")
    protected BigDecimal thirdPartyContribution;
    @XmlElement(name = "Unknown")
    protected EmptyType unknown;
    @XmlElement(name = "Missing")
    protected EmptyType missing;
    @XmlElement(name = "NoContributionsAvailable")
    protected EmptyType noContributionsAvailable;

    /**
     * Recupera il valore della proprietà bvglppCode.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPAssuranceCategoryCodeDiffType }
     *     
     */
    public BVGLPPAssuranceCategoryCodeDiffType getBVGLPPCode() {
        return bvglppCode;
    }

    /**
     * Imposta il valore della proprietà bvglppCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPAssuranceCategoryCodeDiffType }
     *     
     */
    public void setBVGLPPCode(BVGLPPAssuranceCategoryCodeDiffType value) {
        this.bvglppCode = value;
    }

    /**
     * Recupera il valore della proprietà validAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidAsOf() {
        return validAsOf;
    }

    /**
     * Imposta il valore della proprietà validAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidAsOf(XMLGregorianCalendar value) {
        this.validAsOf = value;
    }

    /**
     * Recupera il valore della proprietà employeeContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeContribution() {
        return employeeContribution;
    }

    /**
     * Imposta il valore della proprietà employeeContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeContribution(BigDecimal value) {
        this.employeeContribution = value;
    }

    /**
     * Recupera il valore della proprietà employerContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployerContribution() {
        return employerContribution;
    }

    /**
     * Imposta il valore della proprietà employerContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployerContribution(BigDecimal value) {
        this.employerContribution = value;
    }

    /**
     * Recupera il valore della proprietà thirdPartyContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThirdPartyContribution() {
        return thirdPartyContribution;
    }

    /**
     * Imposta il valore della proprietà thirdPartyContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThirdPartyContribution(BigDecimal value) {
        this.thirdPartyContribution = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getUnknown() {
        return unknown;
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setUnknown(EmptyType value) {
        this.unknown = value;
    }

    /**
     * Recupera il valore della proprietà missing.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getMissing() {
        return missing;
    }

    /**
     * Imposta il valore della proprietà missing.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setMissing(EmptyType value) {
        this.missing = value;
    }

    /**
     * Recupera il valore della proprietà noContributionsAvailable.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNoContributionsAvailable() {
        return noContributionsAvailable;
    }

    /**
     * Imposta il valore della proprietà noContributionsAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNoContributionsAvailable(EmptyType value) {
        this.noContributionsAvailable = value;
    }

}
