
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TableAIncomeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableAIncomeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Line" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableAIncomeLineType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TotalIncomeDeclaredInSalaryCertificate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SalaryAmountNoFractionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableAIncomeType", propOrder = {
    "line",
    "totalIncomeDeclaredInSalaryCertificate"
})
public class TableAIncomeType {

    @XmlElement(name = "Line", required = true)
    protected List<TableAIncomeLineType> line;
    @XmlElement(name = "TotalIncomeDeclaredInSalaryCertificate", required = true)
    protected BigDecimal totalIncomeDeclaredInSalaryCertificate;

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
     * {@link TableAIncomeLineType }
     * 
     * 
     */
    public List<TableAIncomeLineType> getLine() {
        if (line == null) {
            line = new ArrayList<TableAIncomeLineType>();
        }
        return this.line;
    }

    /**
     * Recupera il valore della proprietà totalIncomeDeclaredInSalaryCertificate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalIncomeDeclaredInSalaryCertificate() {
        return totalIncomeDeclaredInSalaryCertificate;
    }

    /**
     * Imposta il valore della proprietà totalIncomeDeclaredInSalaryCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalIncomeDeclaredInSalaryCertificate(BigDecimal value) {
        this.totalIncomeDeclaredInSalaryCertificate = value;
    }

}
