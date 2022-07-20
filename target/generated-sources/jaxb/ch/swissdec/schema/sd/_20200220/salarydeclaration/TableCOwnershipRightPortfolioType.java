
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TableCOwnershipRightPortfolioType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TableCOwnershipRightPortfolioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Line" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableCOwnershipRightPortfolioLineType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TotalNumberOfOwnershipsAtEndOfPeriod" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableCOwnershipRightPortfolioType", propOrder = {
    "line",
    "totalNumberOfOwnershipsAtEndOfPeriod"
})
public class TableCOwnershipRightPortfolioType {

    @XmlElement(name = "Line", required = true)
    protected List<TableCOwnershipRightPortfolioLineType> line;
    @XmlElement(name = "TotalNumberOfOwnershipsAtEndOfPeriod", required = true)
    protected BigInteger totalNumberOfOwnershipsAtEndOfPeriod;

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
     * {@link TableCOwnershipRightPortfolioLineType }
     * 
     * 
     */
    public List<TableCOwnershipRightPortfolioLineType> getLine() {
        if (line == null) {
            line = new ArrayList<TableCOwnershipRightPortfolioLineType>();
        }
        return this.line;
    }

    /**
     * Recupera il valore della proprietà totalNumberOfOwnershipsAtEndOfPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfOwnershipsAtEndOfPeriod() {
        return totalNumberOfOwnershipsAtEndOfPeriod;
    }

    /**
     * Imposta il valore della proprietà totalNumberOfOwnershipsAtEndOfPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfOwnershipsAtEndOfPeriod(BigInteger value) {
        this.totalNumberOfOwnershipsAtEndOfPeriod = value;
    }

}
