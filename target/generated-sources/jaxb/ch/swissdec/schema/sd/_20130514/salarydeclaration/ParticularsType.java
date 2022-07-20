
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ParticularsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParticularsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Social-InsuranceIdentification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}Social-InsuranceIdentificationType"/&gt;
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sex" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SexType"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Nationality" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NationalityType"/&gt;
 *         &lt;element name="CivilStatus" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CivilStatusAndDateType"/&gt;
 *         &lt;element name="SingleParent" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AddressType"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCanton" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CantonAndEXType"/&gt;
 *         &lt;element name="MunicipalityID" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}MunicipalityIDType" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCategory" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ResidenceCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="DegreeOfRelationship" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DegreeOfRelationshipType" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}LanguageCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticularsType", propOrder = {
    "socialInsuranceIdentification",
    "employeeNumber",
    "lastname",
    "firstname",
    "sex",
    "dateOfBirth",
    "nationality",
    "civilStatus",
    "singleParent",
    "address",
    "emailAddress",
    "phoneNumber",
    "residenceCanton",
    "municipalityID",
    "residenceCategory",
    "degreeOfRelationship",
    "languageCode"
})
public class ParticularsType {

    @XmlElement(name = "Social-InsuranceIdentification", required = true)
    protected SocialInsuranceIdentificationType socialInsuranceIdentification;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "Lastname", required = true)
    protected String lastname;
    @XmlElement(name = "Firstname", required = true)
    protected String firstname;
    @XmlElement(name = "Sex", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SexType sex;
    @XmlElement(name = "DateOfBirth", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Nationality", required = true)
    protected String nationality;
    @XmlElement(name = "CivilStatus", required = true)
    protected CivilStatusAndDateType civilStatus;
    @XmlElement(name = "SingleParent")
    protected EmptyType singleParent;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "ResidenceCanton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAndEXType residenceCanton;
    @XmlElement(name = "MunicipalityID")
    protected Integer municipalityID;
    @XmlElement(name = "ResidenceCategory")
    @XmlSchemaType(name = "NMTOKEN")
    protected ResidenceCategoryType residenceCategory;
    @XmlElement(name = "DegreeOfRelationship")
    @XmlSchemaType(name = "NMTOKEN")
    protected DegreeOfRelationshipType degreeOfRelationship;
    @XmlElement(name = "LanguageCode")
    @XmlSchemaType(name = "NMTOKEN")
    protected LanguageCodeType languageCode;

    /**
     * Recupera il valore della proprietà socialInsuranceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link SocialInsuranceIdentificationType }
     *     
     */
    public SocialInsuranceIdentificationType getSocialInsuranceIdentification() {
        return socialInsuranceIdentification;
    }

    /**
     * Imposta il valore della proprietà socialInsuranceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialInsuranceIdentificationType }
     *     
     */
    public void setSocialInsuranceIdentification(SocialInsuranceIdentificationType value) {
        this.socialInsuranceIdentification = value;
    }

    /**
     * Recupera il valore della proprietà employeeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Imposta il valore della proprietà employeeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Recupera il valore della proprietà lastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Imposta il valore della proprietà lastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Recupera il valore della proprietà firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Imposta il valore della proprietà firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Recupera il valore della proprietà sex.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * Imposta il valore della proprietà sex.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSex(SexType value) {
        this.sex = value;
    }

    /**
     * Recupera il valore della proprietà dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Imposta il valore della proprietà dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Recupera il valore della proprietà nationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Imposta il valore della proprietà nationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Recupera il valore della proprietà civilStatus.
     * 
     * @return
     *     possible object is
     *     {@link CivilStatusAndDateType }
     *     
     */
    public CivilStatusAndDateType getCivilStatus() {
        return civilStatus;
    }

    /**
     * Imposta il valore della proprietà civilStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CivilStatusAndDateType }
     *     
     */
    public void setCivilStatus(CivilStatusAndDateType value) {
        this.civilStatus = value;
    }

    /**
     * Recupera il valore della proprietà singleParent.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getSingleParent() {
        return singleParent;
    }

    /**
     * Imposta il valore della proprietà singleParent.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setSingleParent(EmptyType value) {
        this.singleParent = value;
    }

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Recupera il valore della proprietà emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Imposta il valore della proprietà emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Recupera il valore della proprietà phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Imposta il valore della proprietà phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Recupera il valore della proprietà residenceCanton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAndEXType }
     *     
     */
    public CantonAndEXType getResidenceCanton() {
        return residenceCanton;
    }

    /**
     * Imposta il valore della proprietà residenceCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAndEXType }
     *     
     */
    public void setResidenceCanton(CantonAndEXType value) {
        this.residenceCanton = value;
    }

    /**
     * Recupera il valore della proprietà municipalityID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipalityID() {
        return municipalityID;
    }

    /**
     * Imposta il valore della proprietà municipalityID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipalityID(Integer value) {
        this.municipalityID = value;
    }

    /**
     * Recupera il valore della proprietà residenceCategory.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceCategoryType }
     *     
     */
    public ResidenceCategoryType getResidenceCategory() {
        return residenceCategory;
    }

    /**
     * Imposta il valore della proprietà residenceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceCategoryType }
     *     
     */
    public void setResidenceCategory(ResidenceCategoryType value) {
        this.residenceCategory = value;
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
     * Recupera il valore della proprietà languageCode.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Imposta il valore della proprietà languageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

}
