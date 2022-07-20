
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MonthTotalSalaryResultConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonthTotalSalaryResultConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalaryResultMonthTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ReducedDeclareMonthTotalSalaryResultType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthTotalSalaryResultConsumerType", propOrder = {
    "salaryResultMonthTotal"
})
public class MonthTotalSalaryResultConsumerType {

    @XmlElement(name = "SalaryResultMonthTotal", required = true)
    protected ReducedDeclareMonthTotalSalaryResultType salaryResultMonthTotal;

    /**
     * Recupera il valore della proprietà salaryResultMonthTotal.
     * 
     * @return
     *     possible object is
     *     {@link ReducedDeclareMonthTotalSalaryResultType }
     *     
     */
    public ReducedDeclareMonthTotalSalaryResultType getSalaryResultMonthTotal() {
        return salaryResultMonthTotal;
    }

    /**
     * Imposta il valore della proprietà salaryResultMonthTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link ReducedDeclareMonthTotalSalaryResultType }
     *     
     */
    public void setSalaryResultMonthTotal(ReducedDeclareMonthTotalSalaryResultType value) {
        this.salaryResultMonthTotal = value;
    }

}
