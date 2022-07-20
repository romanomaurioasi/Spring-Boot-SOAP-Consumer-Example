
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxStateSuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxStateSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}StateSuccessBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ProcessFlowGroup"/&gt;
 *         &lt;element name="ProcessFinished" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxQuittanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxStateSuccessType", propOrder = {
    "completionAndResult",
    "dialogAndResult",
    "result",
    "processFinished"
})
public class TaxStateSuccessType
    extends StateSuccessBaseType
{

    @XmlElement(name = "CompletionAndResult")
    protected CompletionAndResultType completionAndResult;
    @XmlElement(name = "DialogAndResult")
    protected ResultType dialogAndResult;
    @XmlElement(name = "Result")
    protected ResultType result;
    @XmlElement(name = "ProcessFinished")
    protected TaxQuittanceType processFinished;

    /**
     * Recupera il valore della proprietà completionAndResult.
     * 
     * @return
     *     possible object is
     *     {@link CompletionAndResultType }
     *     
     */
    public CompletionAndResultType getCompletionAndResult() {
        return completionAndResult;
    }

    /**
     * Imposta il valore della proprietà completionAndResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionAndResultType }
     *     
     */
    public void setCompletionAndResult(CompletionAndResultType value) {
        this.completionAndResult = value;
    }

    /**
     * Recupera il valore della proprietà dialogAndResult.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getDialogAndResult() {
        return dialogAndResult;
    }

    /**
     * Imposta il valore della proprietà dialogAndResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setDialogAndResult(ResultType value) {
        this.dialogAndResult = value;
    }

    /**
     * Recupera il valore della proprietà result.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

    /**
     * Recupera il valore della proprietà processFinished.
     * 
     * @return
     *     possible object is
     *     {@link TaxQuittanceType }
     *     
     */
    public TaxQuittanceType getProcessFinished() {
        return processFinished;
    }

    /**
     * Imposta il valore della proprietà processFinished.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxQuittanceType }
     *     
     */
    public void setProcessFinished(TaxQuittanceType value) {
        this.processFinished = value;
    }

}
