
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per KindOfSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KindOfSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KindOfSalary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amount" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *         &lt;element name="StatisticCode" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SalaryBaseCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KindOfSalaryType", propOrder = {
    "kindOfSalary",
    "amount",
    "statisticCode"
})
@XmlSeeAlso({
    KindOfSalaryTimedType.class
})
public class KindOfSalaryType {

    @XmlElement(name = "KindOfSalary", required = true)
    protected String kindOfSalary;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "StatisticCode", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected SalaryBaseCodeType statisticCode;

    /**
     * Recupera il valore della proprietà kindOfSalary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindOfSalary() {
        return kindOfSalary;
    }

    /**
     * Imposta il valore della proprietà kindOfSalary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindOfSalary(String value) {
        this.kindOfSalary = value;
    }

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Recupera il valore della proprietà statisticCode.
     * 
     * @return
     *     possible object is
     *     {@link SalaryBaseCodeType }
     *     
     */
    public SalaryBaseCodeType getStatisticCode() {
        return statisticCode;
    }

    /**
     * Imposta il valore della proprietà statisticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryBaseCodeType }
     *     
     */
    public void setStatisticCode(SalaryBaseCodeType value) {
        this.statisticCode = value;
    }

}
