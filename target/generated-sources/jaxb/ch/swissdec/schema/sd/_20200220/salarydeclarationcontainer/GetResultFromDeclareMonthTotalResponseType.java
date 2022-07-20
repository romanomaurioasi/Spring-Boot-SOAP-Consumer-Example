
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetResultFromDeclareMonthTotalResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetResultFromDeclareMonthTotalResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseContext" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResponseContextType"/&gt;
 *         &lt;element name="SalaryResultMonthTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}DeclareMonthTotalSalaryResultType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResultFromDeclareMonthTotalResponseType", propOrder = {
    "responseContext",
    "salaryResultMonthTotal"
})
public class GetResultFromDeclareMonthTotalResponseType {

    @XmlElement(name = "ResponseContext", required = true)
    protected ResponseContextType responseContext;
    @XmlElement(name = "SalaryResultMonthTotal", required = true)
    protected DeclareMonthTotalSalaryResultType salaryResultMonthTotal;

    /**
     * Recupera il valore della proprietà responseContext.
     * 
     * @return
     *     possible object is
     *     {@link ResponseContextType }
     *     
     */
    public ResponseContextType getResponseContext() {
        return responseContext;
    }

    /**
     * Imposta il valore della proprietà responseContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseContextType }
     *     
     */
    public void setResponseContext(ResponseContextType value) {
        this.responseContext = value;
    }

    /**
     * Recupera il valore della proprietà salaryResultMonthTotal.
     * 
     * @return
     *     possible object is
     *     {@link DeclareMonthTotalSalaryResultType }
     *     
     */
    public DeclareMonthTotalSalaryResultType getSalaryResultMonthTotal() {
        return salaryResultMonthTotal;
    }

    /**
     * Imposta il valore della proprietà salaryResultMonthTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclareMonthTotalSalaryResultType }
     *     
     */
    public void setSalaryResultMonthTotal(DeclareMonthTotalSalaryResultType value) {
        this.salaryResultMonthTotal = value;
    }

}
