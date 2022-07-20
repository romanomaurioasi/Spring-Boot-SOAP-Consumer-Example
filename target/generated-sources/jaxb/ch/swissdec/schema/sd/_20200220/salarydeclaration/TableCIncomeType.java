
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TableCIncomeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableCIncomeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Line" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableCIncomeLineType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="GrandTotalIncomeAtRealization" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *         &lt;element name="TotalPartIncomeCH" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *         &lt;element name="TotalPartIncomeAbroad" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableCIncomeType", propOrder = {
    "line",
    "grandTotalIncomeAtRealization",
    "totalPartIncomeCH",
    "totalPartIncomeAbroad"
})
public class TableCIncomeType {

    @XmlElement(name = "Line", required = true)
    protected List<TableCIncomeLineType> line;
    @XmlElement(name = "GrandTotalIncomeAtRealization", required = true)
    protected BigDecimal grandTotalIncomeAtRealization;
    @XmlElement(name = "TotalPartIncomeCH", required = true)
    protected BigDecimal totalPartIncomeCH;
    @XmlElement(name = "TotalPartIncomeAbroad", required = true)
    protected BigDecimal totalPartIncomeAbroad;

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
     * {@link TableCIncomeLineType }
     * 
     * 
     */
    public List<TableCIncomeLineType> getLine() {
        if (line == null) {
            line = new ArrayList<TableCIncomeLineType>();
        }
        return this.line;
    }

    /**
     * Recupera il valore della proprietà grandTotalIncomeAtRealization.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrandTotalIncomeAtRealization() {
        return grandTotalIncomeAtRealization;
    }

    /**
     * Imposta il valore della proprietà grandTotalIncomeAtRealization.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrandTotalIncomeAtRealization(BigDecimal value) {
        this.grandTotalIncomeAtRealization = value;
    }

    /**
     * Recupera il valore della proprietà totalPartIncomeCH.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPartIncomeCH() {
        return totalPartIncomeCH;
    }

    /**
     * Imposta il valore della proprietà totalPartIncomeCH.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPartIncomeCH(BigDecimal value) {
        this.totalPartIncomeCH = value;
    }

    /**
     * Recupera il valore della proprietà totalPartIncomeAbroad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPartIncomeAbroad() {
        return totalPartIncomeAbroad;
    }

    /**
     * Imposta il valore della proprietà totalPartIncomeAbroad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPartIncomeAbroad(BigDecimal value) {
        this.totalPartIncomeAbroad = value;
    }

}
