
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per OwnershipRightDetailType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OwnershipRightDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeOfOwnership" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TypeOfOwnershipType"/&gt;
 *         &lt;element name="ShareName" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="SharePlanDescription" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="Ruling" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GrantType" minOccurs="0"/&gt;
 *         &lt;element name="MoveToCH" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MoveFromCH" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EntryConcern" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="WithdrawalConcern" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EntrySubcompany" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="WithdrawalSubcompany" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfDestinationWorkplace" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfDestinationResidence" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="AppropriationBuyEmission" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Expiry" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryVestingPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ReductionIncomePercentage" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="ReductionAssetPercentage" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryBeforeReleaseVestingPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DurationVestingPeriod" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="DurationObligationToReturn" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="Return" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Realization" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="StartVestingPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EndVestingPeriod" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RemarkVestingPeriod" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="NumberToCalculateIncome" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfOwnerships" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CurrencyType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyRate" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="MarketValue" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="MarketValueFormula" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Formula" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="ReducedMarketValue" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="MonetaryValuesServicesPerShare" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="MonetaryValuesServicesTotal" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ReductionCosts" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Workplace" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="WorkingDaysInCH-Emission-Vesting" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DaysEmission-Vesting" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PartInCH-Percentage" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FourDecimalPlacesType" minOccurs="0"/&gt;
 *         &lt;element name="PartIncomeAbroad" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="PartIncomeCH" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceTimeOfRealisation" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}Location3Type" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceTimeOfRealisation" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}Location2Type" minOccurs="0"/&gt;
 *         &lt;element name="DiverseDeduction" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Operation" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}OperationOwnershipRightType" minOccurs="0"/&gt;
 *         &lt;element name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationCompany" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationConcern" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnershipRightDetailType", propOrder = {
    "typeOfOwnership",
    "shareName",
    "sharePlanDescription",
    "ruling",
    "moveToCH",
    "moveFromCH",
    "entryConcern",
    "withdrawalConcern",
    "entrySubcompany",
    "withdrawalSubcompany",
    "countryOfDestinationWorkplace",
    "countryOfDestinationResidence",
    "appropriationBuyEmission",
    "expiry",
    "duration",
    "expiryVestingPeriod",
    "reductionIncomePercentage",
    "reductionAssetPercentage",
    "expiryBeforeReleaseVestingPeriod",
    "durationVestingPeriod",
    "durationObligationToReturn",
    "_return",
    "realization",
    "startVestingPeriod",
    "endVestingPeriod",
    "remarkVestingPeriod",
    "numberToCalculateIncome",
    "numberOfOwnerships",
    "currency",
    "currencyRate",
    "marketValue",
    "marketValueFormula",
    "formula",
    "reducedMarketValue",
    "price",
    "monetaryValuesServicesPerShare",
    "monetaryValuesServicesTotal",
    "reductionCosts",
    "workplace",
    "workingDaysInCHEmissionVesting",
    "daysEmissionVesting",
    "partInCHPercentage",
    "partIncomeAbroad",
    "partIncomeCH",
    "workplaceTimeOfRealisation",
    "residenceTimeOfRealisation",
    "diverseDeduction",
    "operation",
    "confirmation",
    "company",
    "confirmationCompany",
    "confirmationConcern",
    "contact",
    "phone",
    "email",
    "comment"
})
public class OwnershipRightDetailType {

    @XmlElement(name = "TypeOfOwnership", required = true)
    protected TypeOfOwnershipType typeOfOwnership;
    @XmlElement(name = "ShareName")
    protected String shareName;
    @XmlElement(name = "SharePlanDescription")
    protected String sharePlanDescription;
    @XmlElement(name = "Ruling")
    protected GrantType ruling;
    @XmlElement(name = "MoveToCH")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar moveToCH;
    @XmlElement(name = "MoveFromCH")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar moveFromCH;
    @XmlElement(name = "EntryConcern")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryConcern;
    @XmlElement(name = "WithdrawalConcern")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withdrawalConcern;
    @XmlElement(name = "EntrySubcompany")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entrySubcompany;
    @XmlElement(name = "WithdrawalSubcompany")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withdrawalSubcompany;
    @XmlElement(name = "CountryOfDestinationWorkplace")
    protected String countryOfDestinationWorkplace;
    @XmlElement(name = "CountryOfDestinationResidence")
    protected String countryOfDestinationResidence;
    @XmlElement(name = "AppropriationBuyEmission")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appropriationBuyEmission;
    @XmlElement(name = "Expiry")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiry;
    @XmlElement(name = "Duration")
    protected BigDecimal duration;
    @XmlElement(name = "ExpiryVestingPeriod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryVestingPeriod;
    @XmlElement(name = "ReductionIncomePercentage")
    protected BigDecimal reductionIncomePercentage;
    @XmlElement(name = "ReductionAssetPercentage")
    protected BigDecimal reductionAssetPercentage;
    @XmlElement(name = "ExpiryBeforeReleaseVestingPeriod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryBeforeReleaseVestingPeriod;
    @XmlElement(name = "DurationVestingPeriod")
    protected BigDecimal durationVestingPeriod;
    @XmlElement(name = "DurationObligationToReturn")
    protected BigDecimal durationObligationToReturn;
    @XmlElement(name = "Return")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar _return;
    @XmlElement(name = "Realization")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar realization;
    @XmlElement(name = "StartVestingPeriod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startVestingPeriod;
    @XmlElement(name = "EndVestingPeriod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endVestingPeriod;
    @XmlElement(name = "RemarkVestingPeriod")
    protected String remarkVestingPeriod;
    @XmlElement(name = "NumberToCalculateIncome")
    protected BigInteger numberToCalculateIncome;
    @XmlElement(name = "NumberOfOwnerships")
    protected BigInteger numberOfOwnerships;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CurrencyRate")
    protected BigDecimal currencyRate;
    @XmlElement(name = "MarketValue")
    protected BigDecimal marketValue;
    @XmlElement(name = "MarketValueFormula")
    protected BigDecimal marketValueFormula;
    @XmlElement(name = "Formula")
    protected String formula;
    @XmlElement(name = "ReducedMarketValue")
    protected BigDecimal reducedMarketValue;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "MonetaryValuesServicesPerShare")
    protected BigDecimal monetaryValuesServicesPerShare;
    @XmlElement(name = "MonetaryValuesServicesTotal")
    protected BigDecimal monetaryValuesServicesTotal;
    @XmlElement(name = "ReductionCosts")
    protected BigDecimal reductionCosts;
    @XmlElement(name = "Workplace")
    protected String workplace;
    @XmlElement(name = "WorkingDaysInCH-Emission-Vesting")
    protected BigInteger workingDaysInCHEmissionVesting;
    @XmlElement(name = "DaysEmission-Vesting")
    protected BigInteger daysEmissionVesting;
    @XmlElement(name = "PartInCH-Percentage")
    protected BigDecimal partInCHPercentage;
    @XmlElement(name = "PartIncomeAbroad")
    protected BigDecimal partIncomeAbroad;
    @XmlElement(name = "PartIncomeCH")
    protected BigDecimal partIncomeCH;
    @XmlElement(name = "WorkplaceTimeOfRealisation")
    @XmlSchemaType(name = "NMTOKEN")
    protected Location3Type workplaceTimeOfRealisation;
    @XmlElement(name = "ResidenceTimeOfRealisation")
    @XmlSchemaType(name = "NMTOKEN")
    protected Location2Type residenceTimeOfRealisation;
    @XmlElement(name = "DiverseDeduction")
    protected BigDecimal diverseDeduction;
    @XmlElement(name = "Operation")
    @XmlSchemaType(name = "NMTOKEN")
    protected OperationOwnershipRightType operation;
    @XmlElement(name = "Confirmation")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar confirmation;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "ConfirmationCompany")
    protected String confirmationCompany;
    @XmlElement(name = "ConfirmationConcern")
    protected String confirmationConcern;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà typeOfOwnership.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfOwnershipType }
     *     
     */
    public TypeOfOwnershipType getTypeOfOwnership() {
        return typeOfOwnership;
    }

    /**
     * Imposta il valore della proprietà typeOfOwnership.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfOwnershipType }
     *     
     */
    public void setTypeOfOwnership(TypeOfOwnershipType value) {
        this.typeOfOwnership = value;
    }

    /**
     * Recupera il valore della proprietà shareName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareName() {
        return shareName;
    }

    /**
     * Imposta il valore della proprietà shareName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareName(String value) {
        this.shareName = value;
    }

    /**
     * Recupera il valore della proprietà sharePlanDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePlanDescription() {
        return sharePlanDescription;
    }

    /**
     * Imposta il valore della proprietà sharePlanDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePlanDescription(String value) {
        this.sharePlanDescription = value;
    }

    /**
     * Recupera il valore della proprietà ruling.
     * 
     * @return
     *     possible object is
     *     {@link GrantType }
     *     
     */
    public GrantType getRuling() {
        return ruling;
    }

    /**
     * Imposta il valore della proprietà ruling.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantType }
     *     
     */
    public void setRuling(GrantType value) {
        this.ruling = value;
    }

    /**
     * Recupera il valore della proprietà moveToCH.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoveToCH() {
        return moveToCH;
    }

    /**
     * Imposta il valore della proprietà moveToCH.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoveToCH(XMLGregorianCalendar value) {
        this.moveToCH = value;
    }

    /**
     * Recupera il valore della proprietà moveFromCH.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoveFromCH() {
        return moveFromCH;
    }

    /**
     * Imposta il valore della proprietà moveFromCH.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoveFromCH(XMLGregorianCalendar value) {
        this.moveFromCH = value;
    }

    /**
     * Recupera il valore della proprietà entryConcern.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryConcern() {
        return entryConcern;
    }

    /**
     * Imposta il valore della proprietà entryConcern.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryConcern(XMLGregorianCalendar value) {
        this.entryConcern = value;
    }

    /**
     * Recupera il valore della proprietà withdrawalConcern.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalConcern() {
        return withdrawalConcern;
    }

    /**
     * Imposta il valore della proprietà withdrawalConcern.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalConcern(XMLGregorianCalendar value) {
        this.withdrawalConcern = value;
    }

    /**
     * Recupera il valore della proprietà entrySubcompany.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntrySubcompany() {
        return entrySubcompany;
    }

    /**
     * Imposta il valore della proprietà entrySubcompany.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntrySubcompany(XMLGregorianCalendar value) {
        this.entrySubcompany = value;
    }

    /**
     * Recupera il valore della proprietà withdrawalSubcompany.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalSubcompany() {
        return withdrawalSubcompany;
    }

    /**
     * Imposta il valore della proprietà withdrawalSubcompany.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalSubcompany(XMLGregorianCalendar value) {
        this.withdrawalSubcompany = value;
    }

    /**
     * Recupera il valore della proprietà countryOfDestinationWorkplace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfDestinationWorkplace() {
        return countryOfDestinationWorkplace;
    }

    /**
     * Imposta il valore della proprietà countryOfDestinationWorkplace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfDestinationWorkplace(String value) {
        this.countryOfDestinationWorkplace = value;
    }

    /**
     * Recupera il valore della proprietà countryOfDestinationResidence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfDestinationResidence() {
        return countryOfDestinationResidence;
    }

    /**
     * Imposta il valore della proprietà countryOfDestinationResidence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfDestinationResidence(String value) {
        this.countryOfDestinationResidence = value;
    }

    /**
     * Recupera il valore della proprietà appropriationBuyEmission.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppropriationBuyEmission() {
        return appropriationBuyEmission;
    }

    /**
     * Imposta il valore della proprietà appropriationBuyEmission.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppropriationBuyEmission(XMLGregorianCalendar value) {
        this.appropriationBuyEmission = value;
    }

    /**
     * Recupera il valore della proprietà expiry.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiry() {
        return expiry;
    }

    /**
     * Imposta il valore della proprietà expiry.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiry(XMLGregorianCalendar value) {
        this.expiry = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDuration(BigDecimal value) {
        this.duration = value;
    }

    /**
     * Recupera il valore della proprietà expiryVestingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryVestingPeriod() {
        return expiryVestingPeriod;
    }

    /**
     * Imposta il valore della proprietà expiryVestingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryVestingPeriod(XMLGregorianCalendar value) {
        this.expiryVestingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà reductionIncomePercentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReductionIncomePercentage() {
        return reductionIncomePercentage;
    }

    /**
     * Imposta il valore della proprietà reductionIncomePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReductionIncomePercentage(BigDecimal value) {
        this.reductionIncomePercentage = value;
    }

    /**
     * Recupera il valore della proprietà reductionAssetPercentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReductionAssetPercentage() {
        return reductionAssetPercentage;
    }

    /**
     * Imposta il valore della proprietà reductionAssetPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReductionAssetPercentage(BigDecimal value) {
        this.reductionAssetPercentage = value;
    }

    /**
     * Recupera il valore della proprietà expiryBeforeReleaseVestingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryBeforeReleaseVestingPeriod() {
        return expiryBeforeReleaseVestingPeriod;
    }

    /**
     * Imposta il valore della proprietà expiryBeforeReleaseVestingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryBeforeReleaseVestingPeriod(XMLGregorianCalendar value) {
        this.expiryBeforeReleaseVestingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà durationVestingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDurationVestingPeriod() {
        return durationVestingPeriod;
    }

    /**
     * Imposta il valore della proprietà durationVestingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDurationVestingPeriod(BigDecimal value) {
        this.durationVestingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà durationObligationToReturn.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDurationObligationToReturn() {
        return durationObligationToReturn;
    }

    /**
     * Imposta il valore della proprietà durationObligationToReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDurationObligationToReturn(BigDecimal value) {
        this.durationObligationToReturn = value;
    }

    /**
     * Recupera il valore della proprietà return.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della proprietà return.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturn(XMLGregorianCalendar value) {
        this._return = value;
    }

    /**
     * Recupera il valore della proprietà realization.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealization() {
        return realization;
    }

    /**
     * Imposta il valore della proprietà realization.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealization(XMLGregorianCalendar value) {
        this.realization = value;
    }

    /**
     * Recupera il valore della proprietà startVestingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartVestingPeriod() {
        return startVestingPeriod;
    }

    /**
     * Imposta il valore della proprietà startVestingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartVestingPeriod(XMLGregorianCalendar value) {
        this.startVestingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà endVestingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndVestingPeriod() {
        return endVestingPeriod;
    }

    /**
     * Imposta il valore della proprietà endVestingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndVestingPeriod(XMLGregorianCalendar value) {
        this.endVestingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà remarkVestingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkVestingPeriod() {
        return remarkVestingPeriod;
    }

    /**
     * Imposta il valore della proprietà remarkVestingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkVestingPeriod(String value) {
        this.remarkVestingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà numberToCalculateIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberToCalculateIncome() {
        return numberToCalculateIncome;
    }

    /**
     * Imposta il valore della proprietà numberToCalculateIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberToCalculateIncome(BigInteger value) {
        this.numberToCalculateIncome = value;
    }

    /**
     * Recupera il valore della proprietà numberOfOwnerships.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOwnerships() {
        return numberOfOwnerships;
    }

    /**
     * Imposta il valore della proprietà numberOfOwnerships.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOwnerships(BigInteger value) {
        this.numberOfOwnerships = value;
    }

    /**
     * Recupera il valore della proprietà currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Imposta il valore della proprietà currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Recupera il valore della proprietà currencyRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Imposta il valore della proprietà currencyRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRate(BigDecimal value) {
        this.currencyRate = value;
    }

    /**
     * Recupera il valore della proprietà marketValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketValue() {
        return marketValue;
    }

    /**
     * Imposta il valore della proprietà marketValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketValue(BigDecimal value) {
        this.marketValue = value;
    }

    /**
     * Recupera il valore della proprietà marketValueFormula.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketValueFormula() {
        return marketValueFormula;
    }

    /**
     * Imposta il valore della proprietà marketValueFormula.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketValueFormula(BigDecimal value) {
        this.marketValueFormula = value;
    }

    /**
     * Recupera il valore della proprietà formula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Imposta il valore della proprietà formula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Recupera il valore della proprietà reducedMarketValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReducedMarketValue() {
        return reducedMarketValue;
    }

    /**
     * Imposta il valore della proprietà reducedMarketValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReducedMarketValue(BigDecimal value) {
        this.reducedMarketValue = value;
    }

    /**
     * Recupera il valore della proprietà price.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Imposta il valore della proprietà price.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Recupera il valore della proprietà monetaryValuesServicesPerShare.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryValuesServicesPerShare() {
        return monetaryValuesServicesPerShare;
    }

    /**
     * Imposta il valore della proprietà monetaryValuesServicesPerShare.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryValuesServicesPerShare(BigDecimal value) {
        this.monetaryValuesServicesPerShare = value;
    }

    /**
     * Recupera il valore della proprietà monetaryValuesServicesTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryValuesServicesTotal() {
        return monetaryValuesServicesTotal;
    }

    /**
     * Imposta il valore della proprietà monetaryValuesServicesTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryValuesServicesTotal(BigDecimal value) {
        this.monetaryValuesServicesTotal = value;
    }

    /**
     * Recupera il valore della proprietà reductionCosts.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReductionCosts() {
        return reductionCosts;
    }

    /**
     * Imposta il valore della proprietà reductionCosts.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReductionCosts(BigDecimal value) {
        this.reductionCosts = value;
    }

    /**
     * Recupera il valore della proprietà workplace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplace() {
        return workplace;
    }

    /**
     * Imposta il valore della proprietà workplace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplace(String value) {
        this.workplace = value;
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
     * Recupera il valore della proprietà partInCHPercentage.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartInCHPercentage() {
        return partInCHPercentage;
    }

    /**
     * Imposta il valore della proprietà partInCHPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartInCHPercentage(BigDecimal value) {
        this.partInCHPercentage = value;
    }

    /**
     * Recupera il valore della proprietà partIncomeAbroad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartIncomeAbroad() {
        return partIncomeAbroad;
    }

    /**
     * Imposta il valore della proprietà partIncomeAbroad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartIncomeAbroad(BigDecimal value) {
        this.partIncomeAbroad = value;
    }

    /**
     * Recupera il valore della proprietà partIncomeCH.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartIncomeCH() {
        return partIncomeCH;
    }

    /**
     * Imposta il valore della proprietà partIncomeCH.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartIncomeCH(BigDecimal value) {
        this.partIncomeCH = value;
    }

    /**
     * Recupera il valore della proprietà workplaceTimeOfRealisation.
     * 
     * @return
     *     possible object is
     *     {@link Location3Type }
     *     
     */
    public Location3Type getWorkplaceTimeOfRealisation() {
        return workplaceTimeOfRealisation;
    }

    /**
     * Imposta il valore della proprietà workplaceTimeOfRealisation.
     * 
     * @param value
     *     allowed object is
     *     {@link Location3Type }
     *     
     */
    public void setWorkplaceTimeOfRealisation(Location3Type value) {
        this.workplaceTimeOfRealisation = value;
    }

    /**
     * Recupera il valore della proprietà residenceTimeOfRealisation.
     * 
     * @return
     *     possible object is
     *     {@link Location2Type }
     *     
     */
    public Location2Type getResidenceTimeOfRealisation() {
        return residenceTimeOfRealisation;
    }

    /**
     * Imposta il valore della proprietà residenceTimeOfRealisation.
     * 
     * @param value
     *     allowed object is
     *     {@link Location2Type }
     *     
     */
    public void setResidenceTimeOfRealisation(Location2Type value) {
        this.residenceTimeOfRealisation = value;
    }

    /**
     * Recupera il valore della proprietà diverseDeduction.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiverseDeduction() {
        return diverseDeduction;
    }

    /**
     * Imposta il valore della proprietà diverseDeduction.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiverseDeduction(BigDecimal value) {
        this.diverseDeduction = value;
    }

    /**
     * Recupera il valore della proprietà operation.
     * 
     * @return
     *     possible object is
     *     {@link OperationOwnershipRightType }
     *     
     */
    public OperationOwnershipRightType getOperation() {
        return operation;
    }

    /**
     * Imposta il valore della proprietà operation.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationOwnershipRightType }
     *     
     */
    public void setOperation(OperationOwnershipRightType value) {
        this.operation = value;
    }

    /**
     * Recupera il valore della proprietà confirmation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmation() {
        return confirmation;
    }

    /**
     * Imposta il valore della proprietà confirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmation(XMLGregorianCalendar value) {
        this.confirmation = value;
    }

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà confirmationCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationCompany() {
        return confirmationCompany;
    }

    /**
     * Imposta il valore della proprietà confirmationCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationCompany(String value) {
        this.confirmationCompany = value;
    }

    /**
     * Recupera il valore della proprietà confirmationConcern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationConcern() {
        return confirmationConcern;
    }

    /**
     * Imposta il valore della proprietà confirmationConcern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationConcern(String value) {
        this.confirmationConcern = value;
    }

    /**
     * Recupera il valore della proprietà contact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Imposta il valore della proprietà contact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Recupera il valore della proprietà phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Imposta il valore della proprietà phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Recupera il valore della proprietà email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta il valore della proprietà email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setComment(NotificationsType value) {
        this.comment = value;
    }

}
