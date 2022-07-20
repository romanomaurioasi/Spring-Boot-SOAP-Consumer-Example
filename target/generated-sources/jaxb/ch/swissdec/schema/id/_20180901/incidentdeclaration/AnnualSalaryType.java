
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per AnnualSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AnnualSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="IncidentMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *           &lt;element name="ContractValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="Present" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}KindOfSalariesTimedType" minOccurs="0"/&gt;
 *           &lt;element name="Past" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}MonthSalaryType" minOccurs="0"/&gt;
 *           &lt;element name="ManualAdditions" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}KindOfSalaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="AnnualSalaryTotal" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *           &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SalaryBasesType"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="NoIncapacityToWork" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnualSalaryType", propOrder = {
    "incidentMonth",
    "contractValidAsOf",
    "present",
    "past",
    "manualAdditions",
    "annualSalaryTotal",
    "statistic",
    "noIncapacityToWork"
})
public class AnnualSalaryType
    extends StoryBaseType
{

    @XmlElement(name = "IncidentMonth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar incidentMonth;
    @XmlElement(name = "ContractValidAsOf")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractValidAsOf;
    @XmlElement(name = "Present")
    protected KindOfSalariesTimedType present;
    @XmlElement(name = "Past")
    protected MonthSalaryType past;
    @XmlElement(name = "ManualAdditions")
    protected List<KindOfSalaryType> manualAdditions;
    @XmlElement(name = "AnnualSalaryTotal")
    protected BigDecimal annualSalaryTotal;
    @XmlElement(name = "Statistic")
    protected SalaryBasesType statistic;
    @XmlElement(name = "NoIncapacityToWork")
    protected EmptyType noIncapacityToWork;

    /**
     * Recupera il valore della proprietà incidentMonth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncidentMonth() {
        return incidentMonth;
    }

    /**
     * Imposta il valore della proprietà incidentMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncidentMonth(XMLGregorianCalendar value) {
        this.incidentMonth = value;
    }

    /**
     * Recupera il valore della proprietà contractValidAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractValidAsOf() {
        return contractValidAsOf;
    }

    /**
     * Imposta il valore della proprietà contractValidAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractValidAsOf(XMLGregorianCalendar value) {
        this.contractValidAsOf = value;
    }

    /**
     * Recupera il valore della proprietà present.
     * 
     * @return
     *     possible object is
     *     {@link KindOfSalariesTimedType }
     *     
     */
    public KindOfSalariesTimedType getPresent() {
        return present;
    }

    /**
     * Imposta il valore della proprietà present.
     * 
     * @param value
     *     allowed object is
     *     {@link KindOfSalariesTimedType }
     *     
     */
    public void setPresent(KindOfSalariesTimedType value) {
        this.present = value;
    }

    /**
     * Recupera il valore della proprietà past.
     * 
     * @return
     *     possible object is
     *     {@link MonthSalaryType }
     *     
     */
    public MonthSalaryType getPast() {
        return past;
    }

    /**
     * Imposta il valore della proprietà past.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthSalaryType }
     *     
     */
    public void setPast(MonthSalaryType value) {
        this.past = value;
    }

    /**
     * Gets the value of the manualAdditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualAdditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualAdditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KindOfSalaryType }
     * 
     * 
     */
    public List<KindOfSalaryType> getManualAdditions() {
        if (manualAdditions == null) {
            manualAdditions = new ArrayList<KindOfSalaryType>();
        }
        return this.manualAdditions;
    }

    /**
     * Recupera il valore della proprietà annualSalaryTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualSalaryTotal() {
        return annualSalaryTotal;
    }

    /**
     * Imposta il valore della proprietà annualSalaryTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualSalaryTotal(BigDecimal value) {
        this.annualSalaryTotal = value;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link SalaryBasesType }
     *     
     */
    public SalaryBasesType getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryBasesType }
     *     
     */
    public void setStatistic(SalaryBasesType value) {
        this.statistic = value;
    }

    /**
     * Recupera il valore della proprietà noIncapacityToWork.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNoIncapacityToWork() {
        return noIncapacityToWork;
    }

    /**
     * Imposta il valore della proprietà noIncapacityToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNoIncapacityToWork(EmptyType value) {
        this.noIncapacityToWork = value;
    }

}
