
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.SexType;
import ch.swissdec.schema.common._20200220.common.TimePeriodType;


/**
 * <p>Classe Java per FamilyIncomePerChildType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FamilyIncomePerChildType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FamilyIncomePerChildPeriod" type="{http://www.swissdec.ch/schema/common/20200220/Common}TimePeriodType"/&gt;
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sex" type="{http://www.swissdec.ch/schema/common/20200220/Common}SexType" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SV-AS-Number" type="{http://www.swissdec.ch/schema/common/20200220/Common}SV-AS-NumberType" minOccurs="0"/&gt;
 *         &lt;element name="FamilyIncome" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="FamilyIncomeSupplementSingular" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyIncomePerChildType", propOrder = {
    "familyIncomePerChildPeriod",
    "lastname",
    "firstname",
    "sex",
    "dateOfBirth",
    "svasNumber",
    "familyIncome",
    "familyIncomeSupplementSingular"
})
public class FamilyIncomePerChildType {

    @XmlElement(name = "FamilyIncomePerChildPeriod", required = true)
    protected TimePeriodType familyIncomePerChildPeriod;
    @XmlElement(name = "Lastname")
    protected String lastname;
    @XmlElement(name = "Firstname", required = true)
    protected String firstname;
    @XmlElement(name = "Sex")
    @XmlSchemaType(name = "NMTOKEN")
    protected SexType sex;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "SV-AS-Number")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String svasNumber;
    @XmlElement(name = "FamilyIncome", required = true)
    protected BigDecimal familyIncome;
    @XmlElement(name = "FamilyIncomeSupplementSingular")
    protected BigDecimal familyIncomeSupplementSingular;

    /**
     * Recupera il valore della proprietà familyIncomePerChildPeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getFamilyIncomePerChildPeriod() {
        return familyIncomePerChildPeriod;
    }

    /**
     * Imposta il valore della proprietà familyIncomePerChildPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setFamilyIncomePerChildPeriod(TimePeriodType value) {
        this.familyIncomePerChildPeriod = value;
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
     * Recupera il valore della proprietà svasNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVASNumber() {
        return svasNumber;
    }

    /**
     * Imposta il valore della proprietà svasNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVASNumber(String value) {
        this.svasNumber = value;
    }

    /**
     * Recupera il valore della proprietà familyIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFamilyIncome() {
        return familyIncome;
    }

    /**
     * Imposta il valore della proprietà familyIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFamilyIncome(BigDecimal value) {
        this.familyIncome = value;
    }

    /**
     * Recupera il valore della proprietà familyIncomeSupplementSingular.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFamilyIncomeSupplementSingular() {
        return familyIncomeSupplementSingular;
    }

    /**
     * Imposta il valore della proprietà familyIncomeSupplementSingular.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFamilyIncomeSupplementSingular(BigDecimal value) {
        this.familyIncomeSupplementSingular = value;
    }

}
