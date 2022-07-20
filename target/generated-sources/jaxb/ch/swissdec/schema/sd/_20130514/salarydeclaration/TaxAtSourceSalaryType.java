
package ch.swissdec.schema.sd._20130514.salarydeclaration;

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
 * <p>Classe Java per TaxAtSourceSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalParticulars" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AdditionalParticularsType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSourceCanton" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CantonAddressType"/&gt;
 *         &lt;element name="TaxAtSourceMunicipalityID" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}MunicipalityIDType"/&gt;
 *         &lt;element name="CurrentMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="Current" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCurrentType" minOccurs="0"/&gt;
 *         &lt;element name="Correction" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCorrectionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CorrectionConfirmed" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CorrectionConfirmedType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="History" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceHistoryType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Recapitulation" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceRecapitulationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="institutionIDRef" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}InstitutionIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceSalaryType", propOrder = {
    "additionalParticulars",
    "taxAtSourceCanton",
    "taxAtSourceMunicipalityID",
    "currentMonth",
    "current",
    "correction",
    "correctionConfirmed",
    "history",
    "recapitulation"
})
public class TaxAtSourceSalaryType {

    @XmlElement(name = "AdditionalParticulars")
    protected AdditionalParticularsType additionalParticulars;
    @XmlElement(name = "TaxAtSourceCanton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType taxAtSourceCanton;
    @XmlElement(name = "TaxAtSourceMunicipalityID")
    protected int taxAtSourceMunicipalityID;
    @XmlElement(name = "CurrentMonth", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar currentMonth;
    @XmlElement(name = "Current")
    protected TaxAtSourceCurrentType current;
    @XmlElement(name = "Correction")
    protected List<TaxAtSourceCorrectionType> correction;
    @XmlElement(name = "CorrectionConfirmed")
    protected List<CorrectionConfirmedType> correctionConfirmed;
    @XmlElement(name = "History", required = true)
    protected List<TaxAtSourceHistoryType> history;
    @XmlElement(name = "Recapitulation", required = true)
    protected List<TaxAtSourceRecapitulationType> recapitulation;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà additionalParticulars.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalParticularsType }
     *     
     */
    public AdditionalParticularsType getAdditionalParticulars() {
        return additionalParticulars;
    }

    /**
     * Imposta il valore della proprietà additionalParticulars.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalParticularsType }
     *     
     */
    public void setAdditionalParticulars(AdditionalParticularsType value) {
        this.additionalParticulars = value;
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
     * Recupera il valore della proprietà taxAtSourceMunicipalityID.
     * 
     */
    public int getTaxAtSourceMunicipalityID() {
        return taxAtSourceMunicipalityID;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceMunicipalityID.
     * 
     */
    public void setTaxAtSourceMunicipalityID(int value) {
        this.taxAtSourceMunicipalityID = value;
    }

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
     * Recupera il valore della proprietà current.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCurrentType }
     *     
     */
    public TaxAtSourceCurrentType getCurrent() {
        return current;
    }

    /**
     * Imposta il valore della proprietà current.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCurrentType }
     *     
     */
    public void setCurrent(TaxAtSourceCurrentType value) {
        this.current = value;
    }

    /**
     * Gets the value of the correction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAtSourceCorrectionType }
     * 
     * 
     */
    public List<TaxAtSourceCorrectionType> getCorrection() {
        if (correction == null) {
            correction = new ArrayList<TaxAtSourceCorrectionType>();
        }
        return this.correction;
    }

    /**
     * Gets the value of the correctionConfirmed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctionConfirmed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectionConfirmed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectionConfirmedType }
     * 
     * 
     */
    public List<CorrectionConfirmedType> getCorrectionConfirmed() {
        if (correctionConfirmed == null) {
            correctionConfirmed = new ArrayList<CorrectionConfirmedType>();
        }
        return this.correctionConfirmed;
    }

    /**
     * Gets the value of the history property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the history property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAtSourceHistoryType }
     * 
     * 
     */
    public List<TaxAtSourceHistoryType> getHistory() {
        if (history == null) {
            history = new ArrayList<TaxAtSourceHistoryType>();
        }
        return this.history;
    }

    /**
     * Gets the value of the recapitulation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recapitulation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecapitulation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAtSourceRecapitulationType }
     * 
     * 
     */
    public List<TaxAtSourceRecapitulationType> getRecapitulation() {
        if (recapitulation == null) {
            recapitulation = new ArrayList<TaxAtSourceRecapitulationType>();
        }
        return this.recapitulation;
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
