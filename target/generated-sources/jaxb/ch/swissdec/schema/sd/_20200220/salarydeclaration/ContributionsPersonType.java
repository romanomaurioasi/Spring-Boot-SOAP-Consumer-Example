
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.CivilStatusAndDateType;
import ch.swissdec.schema.common._20200220.common.NotificationsType;
import ch.swissdec.schema.common._20200220.common.SexType;
import ch.swissdec.schema.common._20200220.common.SocialInsuranceIdentificationType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:c="http://www.swissdec.ch/schema/common/20200220/Common" xmlns:sd="http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Contributi per persona&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per ContributionsPersonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContributionsPersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Process" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-ProcessType"/&gt;
 *         &lt;element name="Social-InsuranceIdentification" type="{http://www.swissdec.ch/schema/common/20200220/Common}Social-InsuranceIdentificationType"/&gt;
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sex" type="{http://www.swissdec.ch/schema/common/20200220/Common}SexType"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CivilStatus" type="{http://www.swissdec.ch/schema/common/20200220/Common}CivilStatusAndDateType"/&gt;
 *         &lt;element name="Contributions" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-ContributionsType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContributionsPersonType", propOrder = {
    "process",
    "socialInsuranceIdentification",
    "lastname",
    "firstname",
    "sex",
    "dateOfBirth",
    "civilStatus",
    "contributions",
    "warning",
    "info"
})
public class ContributionsPersonType {

    @XmlElement(name = "Process", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected BVGLPPProcessType process;
    @XmlElement(name = "Social-InsuranceIdentification", required = true)
    protected SocialInsuranceIdentificationType socialInsuranceIdentification;
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
    @XmlElement(name = "CivilStatus", required = true)
    protected CivilStatusAndDateType civilStatus;
    @XmlElement(name = "Contributions")
    protected BVGLPPContributionsType contributions;
    @XmlElement(name = "Warning")
    protected NotificationsType warning;
    @XmlElement(name = "Info")
    protected NotificationsType info;

    /**
     * Recupera il valore della proprietà process.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPProcessType }
     *     
     */
    public BVGLPPProcessType getProcess() {
        return process;
    }

    /**
     * Imposta il valore della proprietà process.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPProcessType }
     *     
     */
    public void setProcess(BVGLPPProcessType value) {
        this.process = value;
    }

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
     * Recupera il valore della proprietà contributions.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPContributionsType }
     *     
     */
    public BVGLPPContributionsType getContributions() {
        return contributions;
    }

    /**
     * Imposta il valore della proprietà contributions.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPContributionsType }
     *     
     */
    public void setContributions(BVGLPPContributionsType value) {
        this.contributions = value;
    }

    /**
     * Recupera il valore della proprietà warning.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getWarning() {
        return warning;
    }

    /**
     * Imposta il valore della proprietà warning.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setWarning(NotificationsType value) {
        this.warning = value;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setInfo(NotificationsType value) {
        this.info = value;
    }

}
