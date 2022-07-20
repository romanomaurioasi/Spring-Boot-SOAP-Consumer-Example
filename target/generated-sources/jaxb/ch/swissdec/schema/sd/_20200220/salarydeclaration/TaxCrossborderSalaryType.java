
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.CantonAddressType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per TaxCrossborderSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxCrossborderSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="TaxAtSourceCanton" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAddressType"/&gt;
 *         &lt;element name="ResidenceAbroadCountry" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}CountryISOType"/&gt;
 *         &lt;element name="PlaceOfBirth" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="TaxID" type="{http://www.swissdec.ch/schema/common/20200220/Common}IDType" minOccurs="0"/&gt;
 *         &lt;element name="CrossborderValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TaxableEarning" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="DeductionAtSource" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="AHV-ALV-NBUV-AVS-AC-AANP-Contribution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-ContributionRegular" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "TaxCrossborderSalaryType", propOrder = {
    "period",
    "taxAtSourceCanton",
    "residenceAbroadCountry",
    "placeOfBirth",
    "taxID",
    "crossborderValidAsOf",
    "taxableEarning",
    "deductionAtSource",
    "ahvalvnbuvavsacaanpContribution",
    "bvglppContributionRegular"
})
public class TaxCrossborderSalaryType {

    @XmlElement(name = "Period", required = true)
    protected TimePeriodType period;
    @XmlElement(name = "TaxAtSourceCanton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType taxAtSourceCanton;
    @XmlElement(name = "ResidenceAbroadCountry", required = true)
    protected String residenceAbroadCountry;
    @XmlElement(name = "PlaceOfBirth")
    protected String placeOfBirth;
    @XmlElement(name = "TaxID")
    protected String taxID;
    @XmlElement(name = "CrossborderValidAsOf")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crossborderValidAsOf;
    @XmlElement(name = "TaxableEarning", required = true)
    protected BigDecimal taxableEarning;
    @XmlElement(name = "DeductionAtSource")
    protected BigDecimal deductionAtSource;
    @XmlElement(name = "AHV-ALV-NBUV-AVS-AC-AANP-Contribution")
    protected BigDecimal ahvalvnbuvavsacaanpContribution;
    @XmlElement(name = "BVG-LPP-ContributionRegular")
    protected BigDecimal bvglppContributionRegular;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setPeriod(TimePeriodType value) {
        this.period = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceCanton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getTaxAtSourceCanton() {
        return taxAtSourceCanton;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setTaxAtSourceCanton(CantonAddressType value) {
        this.taxAtSourceCanton = value;
    }

    /**
     * Recupera il valore della proprietà residenceAbroadCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceAbroadCountry() {
        return residenceAbroadCountry;
    }

    /**
     * Imposta il valore della proprietà residenceAbroadCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceAbroadCountry(String value) {
        this.residenceAbroadCountry = value;
    }

    /**
     * Recupera il valore della proprietà placeOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Imposta il valore della proprietà placeOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Recupera il valore della proprietà taxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * Imposta il valore della proprietà taxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * Recupera il valore della proprietà crossborderValidAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrossborderValidAsOf() {
        return crossborderValidAsOf;
    }

    /**
     * Imposta il valore della proprietà crossborderValidAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCrossborderValidAsOf(XMLGregorianCalendar value) {
        this.crossborderValidAsOf = value;
    }

    /**
     * Recupera il valore della proprietà taxableEarning.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableEarning() {
        return taxableEarning;
    }

    /**
     * Imposta il valore della proprietà taxableEarning.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableEarning(BigDecimal value) {
        this.taxableEarning = value;
    }

    /**
     * Recupera il valore della proprietà deductionAtSource.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductionAtSource() {
        return deductionAtSource;
    }

    /**
     * Imposta il valore della proprietà deductionAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductionAtSource(BigDecimal value) {
        this.deductionAtSource = value;
    }

    /**
     * Recupera il valore della proprietà ahvalvnbuvavsacaanpContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAHVALVNBUVAVSACAANPContribution() {
        return ahvalvnbuvavsacaanpContribution;
    }

    /**
     * Imposta il valore della proprietà ahvalvnbuvavsacaanpContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAHVALVNBUVAVSACAANPContribution(BigDecimal value) {
        this.ahvalvnbuvavsacaanpContribution = value;
    }

    /**
     * Recupera il valore della proprietà bvglppContributionRegular.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPContributionRegular() {
        return bvglppContributionRegular;
    }

    /**
     * Imposta il valore della proprietà bvglppContributionRegular.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPContributionRegular(BigDecimal value) {
        this.bvglppContributionRegular = value;
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
