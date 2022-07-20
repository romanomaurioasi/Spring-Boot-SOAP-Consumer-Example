
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MonthSalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonthSalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Salary" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}InsuredSalaryPastType" maxOccurs="12"/&gt;
 *         &lt;element name="PastAnnualTotal" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthSalaryType", propOrder = {
    "salary",
    "pastAnnualTotal"
})
public class MonthSalaryType {

    @XmlElement(name = "Salary", required = true)
    protected List<InsuredSalaryPastType> salary;
    @XmlElement(name = "PastAnnualTotal", required = true)
    protected BigDecimal pastAnnualTotal;

    /**
     * Gets the value of the salary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuredSalaryPastType }
     * 
     * 
     */
    public List<InsuredSalaryPastType> getSalary() {
        if (salary == null) {
            salary = new ArrayList<InsuredSalaryPastType>();
        }
        return this.salary;
    }

    /**
     * Recupera il valore della proprietà pastAnnualTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastAnnualTotal() {
        return pastAnnualTotal;
    }

    /**
     * Imposta il valore della proprietà pastAnnualTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastAnnualTotal(BigDecimal value) {
        this.pastAnnualTotal = value;
    }

}
