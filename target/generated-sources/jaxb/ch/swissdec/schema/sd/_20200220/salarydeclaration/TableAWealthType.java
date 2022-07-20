
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TableAWealthType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableAWealthType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Line" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableAWealthLineType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TotalTaxableWealthInCH" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableAWealthType", propOrder = {
    "line",
    "totalTaxableWealthInCH"
})
public class TableAWealthType {

    @XmlElement(name = "Line", required = true)
    protected List<TableAWealthLineType> line;
    @XmlElement(name = "TotalTaxableWealthInCH", required = true)
    protected BigDecimal totalTaxableWealthInCH;

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
     * {@link TableAWealthLineType }
     * 
     * 
     */
    public List<TableAWealthLineType> getLine() {
        if (line == null) {
            line = new ArrayList<TableAWealthLineType>();
        }
        return this.line;
    }

    /**
     * Recupera il valore della proprietà totalTaxableWealthInCH.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxableWealthInCH() {
        return totalTaxableWealthInCH;
    }

    /**
     * Imposta il valore della proprietà totalTaxableWealthInCH.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxableWealthInCH(BigDecimal value) {
        this.totalTaxableWealthInCH = value;
    }

}
