
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceTotalsConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceTotalsConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalMonth" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceTotalsMonthType"/&gt;
 *         &lt;element name="CorrectionMonth" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceTotalsCorrectionMonthType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceTotalsConsumerType", propOrder = {
    "totalMonth",
    "correctionMonth"
})
@XmlSeeAlso({
    TaxAtSourceTotalsType.class
})
public class TaxAtSourceTotalsConsumerType {

    @XmlElement(name = "TotalMonth", required = true)
    protected TaxAtSourceTotalsMonthType totalMonth;
    @XmlElement(name = "CorrectionMonth")
    protected List<TaxAtSourceTotalsCorrectionMonthType> correctionMonth;

    /**
     * Recupera il valore della proprietà totalMonth.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceTotalsMonthType }
     *     
     */
    public TaxAtSourceTotalsMonthType getTotalMonth() {
        return totalMonth;
    }

    /**
     * Imposta il valore della proprietà totalMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceTotalsMonthType }
     *     
     */
    public void setTotalMonth(TaxAtSourceTotalsMonthType value) {
        this.totalMonth = value;
    }

    /**
     * Gets the value of the correctionMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctionMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectionMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAtSourceTotalsCorrectionMonthType }
     * 
     * 
     */
    public List<TaxAtSourceTotalsCorrectionMonthType> getCorrectionMonth() {
        if (correctionMonth == null) {
            correctionMonth = new ArrayList<TaxAtSourceTotalsCorrectionMonthType>();
        }
        return this.correctionMonth;
    }

}
