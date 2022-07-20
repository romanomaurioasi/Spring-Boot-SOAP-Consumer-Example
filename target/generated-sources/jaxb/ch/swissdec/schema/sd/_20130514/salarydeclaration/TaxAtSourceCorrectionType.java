
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per TaxAtSourceCorrectionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceCorrectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Old" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCorrectionOldType"/&gt;
 *           &lt;element name="Difference" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCorrectionDifferenceType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="New" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCorrectionNewType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceCorrectionType", propOrder = {
    "month",
    "old",
    "difference",
    "_new"
})
public class TaxAtSourceCorrectionType {

    @XmlElement(name = "Month", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar month;
    @XmlElement(name = "Old")
    protected TaxAtSourceCorrectionOldType old;
    @XmlElement(name = "Difference")
    protected TaxAtSourceCorrectionDifferenceType difference;
    @XmlElement(name = "New", required = true)
    protected TaxAtSourceCorrectionNewType _new;

    /**
     * Recupera il valore della proprietà month.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonth() {
        return month;
    }

    /**
     * Imposta il valore della proprietà month.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonth(XMLGregorianCalendar value) {
        this.month = value;
    }

    /**
     * Recupera il valore della proprietà old.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCorrectionOldType }
     *     
     */
    public TaxAtSourceCorrectionOldType getOld() {
        return old;
    }

    /**
     * Imposta il valore della proprietà old.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCorrectionOldType }
     *     
     */
    public void setOld(TaxAtSourceCorrectionOldType value) {
        this.old = value;
    }

    /**
     * Recupera il valore della proprietà difference.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCorrectionDifferenceType }
     *     
     */
    public TaxAtSourceCorrectionDifferenceType getDifference() {
        return difference;
    }

    /**
     * Imposta il valore della proprietà difference.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCorrectionDifferenceType }
     *     
     */
    public void setDifference(TaxAtSourceCorrectionDifferenceType value) {
        this.difference = value;
    }

    /**
     * Recupera il valore della proprietà new.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCorrectionNewType }
     *     
     */
    public TaxAtSourceCorrectionNewType getNew() {
        return _new;
    }

    /**
     * Imposta il valore della proprietà new.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCorrectionNewType }
     *     
     */
    public void setNew(TaxAtSourceCorrectionNewType value) {
        this._new = value;
    }

}
