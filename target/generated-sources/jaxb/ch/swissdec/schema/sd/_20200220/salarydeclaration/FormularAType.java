
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FormularAType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FormularAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}HeaderCommonType"/&gt;
 *         &lt;element name="TableAIncome" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableAIncomeType"/&gt;
 *         &lt;element name="TableAWealth" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TableAWealthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormularAType", propOrder = {
    "header",
    "tableAIncome",
    "tableAWealth"
})
public class FormularAType {

    @XmlElement(name = "Header", required = true)
    protected HeaderCommonType header;
    @XmlElement(name = "TableAIncome", required = true)
    protected TableAIncomeType tableAIncome;
    @XmlElement(name = "TableAWealth")
    protected TableAWealthType tableAWealth;

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
     * Recupera il valore della proprietà tableAIncome.
     * 
     * @return
     *     possible object is
     *     {@link TableAIncomeType }
     *     
     */
    public TableAIncomeType getTableAIncome() {
        return tableAIncome;
    }

    /**
     * Imposta il valore della proprietà tableAIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link TableAIncomeType }
     *     
     */
    public void setTableAIncome(TableAIncomeType value) {
        this.tableAIncome = value;
    }

    /**
     * Recupera il valore della proprietà tableAWealth.
     * 
     * @return
     *     possible object is
     *     {@link TableAWealthType }
     *     
     */
    public TableAWealthType getTableAWealth() {
        return tableAWealth;
    }

    /**
     * Imposta il valore della proprietà tableAWealth.
     * 
     * @param value
     *     allowed object is
     *     {@link TableAWealthType }
     *     
     */
    public void setTableAWealth(TableAWealthType value) {
        this.tableAWealth = value;
    }

}
