
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.CantonAddressType;
import ch.swissdec.schema.common._20200220.common.EmptyType;


/**
 * <p>Classe Java per TaxAtSourceSalaryConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceSalaryConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxAtSourceCanton" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAddressType"/&gt;
 *         &lt;element name="TaxAtSourceMunicipalityID" type="{http://www.swissdec.ch/schema/common/20200220/Common}MunicipalityIDType"/&gt;
 *         &lt;element name="CurrentMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="CurrentConfirmed" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="Correction" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}CorrectionResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceSalaryConsumerType", propOrder = {
    "taxAtSourceCanton",
    "taxAtSourceMunicipalityID",
    "currentMonth",
    "currentConfirmed",
    "correction"
})
public class TaxAtSourceSalaryConsumerType {

    @XmlElement(name = "TaxAtSourceCanton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType taxAtSourceCanton;
    @XmlElement(name = "TaxAtSourceMunicipalityID")
    protected int taxAtSourceMunicipalityID;
    @XmlElement(name = "CurrentMonth", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar currentMonth;
    @XmlElement(name = "CurrentConfirmed")
    protected EmptyType currentConfirmed;
    @XmlElement(name = "Correction")
    protected List<CorrectionResultType> correction;

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
     * Recupera il valore della proprietà currentConfirmed.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getCurrentConfirmed() {
        return currentConfirmed;
    }

    /**
     * Imposta il valore della proprietà currentConfirmed.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setCurrentConfirmed(EmptyType value) {
        this.currentConfirmed = value;
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
     * {@link CorrectionResultType }
     * 
     * 
     */
    public List<CorrectionResultType> getCorrection() {
        if (correction == null) {
            correction = new ArrayList<CorrectionResultType>();
        }
        return this.correction;
    }

}
