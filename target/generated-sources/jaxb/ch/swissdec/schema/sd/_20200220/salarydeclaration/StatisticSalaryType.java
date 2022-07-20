
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per StatisticSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="AdditionalParticulars" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticAdditionalParticularsType"/&gt;
 *         &lt;element name="KindOfWagePayment" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}KindOfWagePaymentType"/&gt;
 *         &lt;element name="MonthlyValues" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}MonthlyValuesType"/&gt;
 *         &lt;element name="AnnualValues" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AnnualValuesType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="workplaceIDRef" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *       &lt;attribute name="institutionIDRef" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticSalaryType", propOrder = {
    "currentMonth",
    "additionalParticulars",
    "kindOfWagePayment",
    "monthlyValues",
    "annualValues"
})
public class StatisticSalaryType {

    @XmlElement(name = "CurrentMonth", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar currentMonth;
    @XmlElement(name = "AdditionalParticulars", required = true)
    protected StatisticAdditionalParticularsType additionalParticulars;
    @XmlElement(name = "KindOfWagePayment", required = true)
    protected KindOfWagePaymentType kindOfWagePayment;
    @XmlElement(name = "MonthlyValues", required = true)
    protected MonthlyValuesType monthlyValues;
    @XmlElement(name = "AnnualValues", required = true)
    protected List<AnnualValuesType> annualValues;
    @XmlAttribute(name = "workplaceIDRef", required = true)
    protected String workplaceIDRef;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà currentMonth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentMonth() {
        return currentMonth;
    }

    /**
     * Imposta il valore della proprietà currentMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentMonth(XMLGregorianCalendar value) {
        this.currentMonth = value;
    }

    /**
     * Recupera il valore della proprietà additionalParticulars.
     * 
     * @return
     *     possible object is
     *     {@link StatisticAdditionalParticularsType }
     *     
     */
    public StatisticAdditionalParticularsType getAdditionalParticulars() {
        return additionalParticulars;
    }

    /**
     * Imposta il valore della proprietà additionalParticulars.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticAdditionalParticularsType }
     *     
     */
    public void setAdditionalParticulars(StatisticAdditionalParticularsType value) {
        this.additionalParticulars = value;
    }

    /**
     * Recupera il valore della proprietà kindOfWagePayment.
     * 
     * @return
     *     possible object is
     *     {@link KindOfWagePaymentType }
     *     
     */
    public KindOfWagePaymentType getKindOfWagePayment() {
        return kindOfWagePayment;
    }

    /**
     * Imposta il valore della proprietà kindOfWagePayment.
     * 
     * @param value
     *     allowed object is
     *     {@link KindOfWagePaymentType }
     *     
     */
    public void setKindOfWagePayment(KindOfWagePaymentType value) {
        this.kindOfWagePayment = value;
    }

    /**
     * Recupera il valore della proprietà monthlyValues.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyValuesType }
     *     
     */
    public MonthlyValuesType getMonthlyValues() {
        return monthlyValues;
    }

    /**
     * Imposta il valore della proprietà monthlyValues.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyValuesType }
     *     
     */
    public void setMonthlyValues(MonthlyValuesType value) {
        this.monthlyValues = value;
    }

    /**
     * Gets the value of the annualValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annualValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnualValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnualValuesType }
     * 
     * 
     */
    public List<AnnualValuesType> getAnnualValues() {
        if (annualValues == null) {
            annualValues = new ArrayList<AnnualValuesType>();
        }
        return this.annualValues;
    }

    /**
     * Recupera il valore della proprietà workplaceIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceIDRef() {
        return workplaceIDRef;
    }

    /**
     * Imposta il valore della proprietà workplaceIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceIDRef(String value) {
        this.workplaceIDRef = value;
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
