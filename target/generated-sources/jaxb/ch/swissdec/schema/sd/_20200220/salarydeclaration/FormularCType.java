
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FormularCType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FormularCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}HeaderFormCType"/&gt;
 *         &lt;element name="TableCIncome" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableCIncomeType"/&gt;
 *         &lt;element name="TableCOwnershipRightPortfolio" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableCOwnershipRightPortfolioType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormularCType", propOrder = {
    "header",
    "tableCIncome",
    "tableCOwnershipRightPortfolio"
})
public class FormularCType {

    @XmlElement(name = "Header", required = true)
    protected HeaderFormCType header;
    @XmlElement(name = "TableCIncome", required = true)
    protected TableCIncomeType tableCIncome;
    @XmlElement(name = "TableCOwnershipRightPortfolio")
    protected TableCOwnershipRightPortfolioType tableCOwnershipRightPortfolio;

    /**
     * Recupera il valore della proprietà header.
     * 
     * @return
     *     possible object is
     *     {@link HeaderFormCType }
     *     
     */
    public HeaderFormCType getHeader() {
        return header;
    }

    /**
     * Imposta il valore della proprietà header.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderFormCType }
     *     
     */
    public void setHeader(HeaderFormCType value) {
        this.header = value;
    }

    /**
     * Recupera il valore della proprietà tableCIncome.
     * 
     * @return
     *     possible object is
     *     {@link TableCIncomeType }
     *     
     */
    public TableCIncomeType getTableCIncome() {
        return tableCIncome;
    }

    /**
     * Imposta il valore della proprietà tableCIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link TableCIncomeType }
     *     
     */
    public void setTableCIncome(TableCIncomeType value) {
        this.tableCIncome = value;
    }

    /**
     * Recupera il valore della proprietà tableCOwnershipRightPortfolio.
     * 
     * @return
     *     possible object is
     *     {@link TableCOwnershipRightPortfolioType }
     *     
     */
    public TableCOwnershipRightPortfolioType getTableCOwnershipRightPortfolio() {
        return tableCOwnershipRightPortfolio;
    }

    /**
     * Imposta il valore della proprietà tableCOwnershipRightPortfolio.
     * 
     * @param value
     *     allowed object is
     *     {@link TableCOwnershipRightPortfolioType }
     *     
     */
    public void setTableCOwnershipRightPortfolio(TableCOwnershipRightPortfolioType value) {
        this.tableCOwnershipRightPortfolio = value;
    }

}
