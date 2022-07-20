
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per TableCOwnershipRightPortfolioLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableCOwnershipRightPortfolioLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FormularRowBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrantDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="WorkplaceAtTimeOfGrantedParticipations" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberOfOwnershipsGranted" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="VestingDateSpecifiedInPlan" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ExpiryDateOfPossibleBlockingPeriodOfSharesHeld" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PotentialExercisePrice" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VestingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceAtVestingDate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}Location2Type" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOwnershipsRealizedSinceGrant" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NumberCancelled" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WorkingDaysInCH-Emission-Vesting" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DaysEmission-Vesting" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PartRealizedInCH-Percentage" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOwnershipsAtEndOfPeriod" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableCOwnershipRightPortfolioLineType", propOrder = {
    "grantDate",
    "workplaceAtTimeOfGrantedParticipations",
    "numberOfOwnershipsGranted",
    "vestingDateSpecifiedInPlan",
    "expiryDateOfPossibleBlockingPeriodOfSharesHeld",
    "potentialExercisePrice",
    "expiryDate",
    "vestingDate",
    "workplaceAtVestingDate",
    "numberOfOwnershipsRealizedSinceGrant",
    "numberCancelled",
    "workingDaysInCHEmissionVesting",
    "daysEmissionVesting",
    "partRealizedInCHPercentage",
    "numberOfOwnershipsAtEndOfPeriod"
})
public class TableCOwnershipRightPortfolioLineType
    extends FormularRowBaseType
{

    @XmlElement(name = "GrantDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar grantDate;
    @XmlElement(name = "WorkplaceAtTimeOfGrantedParticipations", required = true)
    protected String workplaceAtTimeOfGrantedParticipations;
    @XmlElement(name = "NumberOfOwnershipsGranted", required = true)
    protected BigInteger numberOfOwnershipsGranted;
    @XmlElement(name = "VestingDateSpecifiedInPlan", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vestingDateSpecifiedInPlan;
    @XmlElement(name = "ExpiryDateOfPossibleBlockingPeriodOfSharesHeld")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDateOfPossibleBlockingPeriodOfSharesHeld;
    @XmlElement(name = "PotentialExercisePrice", required = true)
    protected BigDecimal potentialExercisePrice;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "VestingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vestingDate;
    @XmlElement(name = "WorkplaceAtVestingDate")
    @XmlSchemaType(name = "NMTOKEN")
    protected Location2Type workplaceAtVestingDate;
    @XmlElement(name = "NumberOfOwnershipsRealizedSinceGrant")
    protected BigInteger numberOfOwnershipsRealizedSinceGrant;
    @XmlElement(name = "NumberCancelled")
    protected BigInteger numberCancelled;
    @XmlElement(name = "WorkingDaysInCH-Emission-Vesting")
    protected BigInteger workingDaysInCHEmissionVesting;
    @XmlElement(name = "DaysEmission-Vesting")
    protected BigInteger daysEmissionVesting;
    @XmlElement(name = "PartRealizedInCH-Percentage")
    protected BigDecimal partRealizedInCHPercentage;
    @XmlElement(name = "NumberOfOwnershipsAtEndOfPeriod", required = true)
    protected BigInteger numberOfOwnershipsAtEndOfPeriod;

    /**
     * Recupera il valore della proprietà grantDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGrantDate() {
        return grantDate;
    }

    /**
     * Imposta il valore della proprietà grantDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGrantDate(XMLGregorianCalendar value) {
        this.grantDate = value;
    }

    /**
     * Recupera il valore della proprietà workplaceAtTimeOfGrantedParticipations.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceAtTimeOfGrantedParticipations() {
        return workplaceAtTimeOfGrantedParticipations;
    }

    /**
     * Imposta il valore della proprietà workplaceAtTimeOfGrantedParticipations.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceAtTimeOfGrantedParticipations(String value) {
        this.workplaceAtTimeOfGrantedParticipations = value;
    }

    /**
     * Recupera il valore della proprietà numberOfOwnershipsGranted.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOwnershipsGranted() {
        return numberOfOwnershipsGranted;
    }

    /**
     * Imposta il valore della proprietà numberOfOwnershipsGranted.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOwnershipsGranted(BigInteger value) {
        this.numberOfOwnershipsGranted = value;
    }

    /**
     * Recupera il valore della proprietà vestingDateSpecifiedInPlan.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVestingDateSpecifiedInPlan() {
        return vestingDateSpecifiedInPlan;
    }

    /**
     * Imposta il valore della proprietà vestingDateSpecifiedInPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVestingDateSpecifiedInPlan(XMLGregorianCalendar value) {
        this.vestingDateSpecifiedInPlan = value;
    }

    /**
     * Recupera il valore della proprietà expiryDateOfPossibleBlockingPeriodOfSharesHeld.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateOfPossibleBlockingPeriodOfSharesHeld() {
        return expiryDateOfPossibleBlockingPeriodOfSharesHeld;
    }

    /**
     * Imposta il valore della proprietà expiryDateOfPossibleBlockingPeriodOfSharesHeld.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateOfPossibleBlockingPeriodOfSharesHeld(XMLGregorianCalendar value) {
        this.expiryDateOfPossibleBlockingPeriodOfSharesHeld = value;
    }

    /**
     * Recupera il valore della proprietà potentialExercisePrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPotentialExercisePrice() {
        return potentialExercisePrice;
    }

    /**
     * Imposta il valore della proprietà potentialExercisePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPotentialExercisePrice(BigDecimal value) {
        this.potentialExercisePrice = value;
    }

    /**
     * Recupera il valore della proprietà expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Imposta il valore della proprietà expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Recupera il valore della proprietà vestingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVestingDate() {
        return vestingDate;
    }

    /**
     * Imposta il valore della proprietà vestingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVestingDate(XMLGregorianCalendar value) {
        this.vestingDate = value;
    }

    /**
     * Recupera il valore della proprietà workplaceAtVestingDate.
     * 
     * @return
     *     possible object is
     *     {@link Location2Type }
     *     
     */
    public Location2Type getWorkplaceAtVestingDate() {
        return workplaceAtVestingDate;
    }

    /**
     * Imposta il valore della proprietà workplaceAtVestingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Location2Type }
     *     
     */
    public void setWorkplaceAtVestingDate(Location2Type value) {
        this.workplaceAtVestingDate = value;
    }

    /**
     * Recupera il valore della proprietà numberOfOwnershipsRealizedSinceGrant.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOwnershipsRealizedSinceGrant() {
        return numberOfOwnershipsRealizedSinceGrant;
    }

    /**
     * Imposta il valore della proprietà numberOfOwnershipsRealizedSinceGrant.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOwnershipsRealizedSinceGrant(BigInteger value) {
        this.numberOfOwnershipsRealizedSinceGrant = value;
    }

    /**
     * Recupera il valore della proprietà numberCancelled.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberCancelled() {
        return numberCancelled;
    }

    /**
     * Imposta il valore della proprietà numberCancelled.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberCancelled(BigInteger value) {
        this.numberCancelled = value;
    }

    /**
     * Recupera il valore della proprietà workingDaysInCHEmissionVesting.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkingDaysInCHEmissionVesting() {
        return workingDaysInCHEmissionVesting;
    }

    /**
     * Imposta il valore della proprietà workingDaysInCHEmissionVesting.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkingDaysInCHEmissionVesting(BigInteger value) {
        this.workingDaysInCHEmissionVesting = value;
    }

    /**
     * Recupera il valore della proprietà daysEmissionVesting.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysEmissionVesting() {
        return daysEmissionVesting;
    }

    /**
     * Imposta il valore della proprietà daysEmissionVesting.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysEmissionVesting(BigInteger value) {
        this.daysEmissionVesting = value;
    }

    /**
     * Recupera il valore della proprietà partRealizedInCHPercentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartRealizedInCHPercentage() {
        return partRealizedInCHPercentage;
    }

    /**
     * Imposta il valore della proprietà partRealizedInCHPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartRealizedInCHPercentage(BigDecimal value) {
        this.partRealizedInCHPercentage = value;
    }

    /**
     * Recupera il valore della proprietà numberOfOwnershipsAtEndOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOwnershipsAtEndOfPeriod() {
        return numberOfOwnershipsAtEndOfPeriod;
    }

    /**
     * Imposta il valore della proprietà numberOfOwnershipsAtEndOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOwnershipsAtEndOfPeriod(BigInteger value) {
        this.numberOfOwnershipsAtEndOfPeriod = value;
    }

}
