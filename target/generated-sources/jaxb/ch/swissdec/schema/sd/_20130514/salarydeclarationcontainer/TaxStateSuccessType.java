
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

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
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}StateSuccessBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessFinished" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}TaxQuittanceType"/&gt;
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
    "processFinished"
})
public class TaxStateSuccessType
    extends StateSuccessBaseType
{

    @XmlElement(name = "ProcessFinished", required = true)
    protected TaxQuittanceType processFinished;

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
