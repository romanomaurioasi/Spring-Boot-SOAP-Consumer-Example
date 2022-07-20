
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FormularBType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FormularBType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}HeaderCommonType"/&gt;
 *         &lt;element name="Line" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableBLineType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TotalFiscaleDeduction" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *         &lt;element name="TotalTaxableIncome" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormularBType", propOrder = {
    "header",
    "line",
    "totalFiscaleDeduction",
    "totalTaxableIncome"
})
public class FormularBType {

    @XmlElement(name = "Header", required = true)
    protected HeaderCommonType header;
    @XmlElement(name = "Line", required = true)
    protected List<TableBLineType> line;
    @XmlElement(name = "TotalFiscaleDeduction", required = true)
    protected BigDecimal totalFiscaleDeduction;
    @XmlElement(name = "TotalTaxableIncome", required = true)
    protected BigDecimal totalTaxableIncome;

    /**
     * Recupera il valore della proprietà header.
     * 
     * @return
     *     possible object is
     *     {@link HeaderCommonType }
     *     
     */
    public HeaderCommonType getHeader() {
        return header;
    }

    /**
     * Imposta il valore della proprietà header.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderCommonType }
     *     
     */
    public void setHeader(HeaderCommonType value) {
        this.header = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableBLineType }
     * 
     * 
     */
    public List<TableBLineType> getLine() {
        if (line == null) {
            line = new ArrayList<TableBLineType>();
        }
        return this.line;
    }

    /**
     * Recupera il valore della proprietà totalFiscaleDeduction.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFiscaleDeduction() {
        return totalFiscaleDeduction;
    }

    /**
     * Imposta il valore della proprietà totalFiscaleDeduction.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFiscaleDeduction(BigDecimal value) {
        this.totalFiscaleDeduction = value;
    }

    /**
     * Recupera il valore della proprietà totalTaxableIncome.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxableIncome() {
        return totalTaxableIncome;
    }

    /**
     * Imposta il valore della proprietà totalTaxableIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxableIncome(BigDecimal value) {
        this.totalTaxableIncome = value;
    }

}
