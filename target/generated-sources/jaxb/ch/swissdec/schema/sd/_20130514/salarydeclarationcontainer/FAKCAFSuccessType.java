
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.FAKCAFTotalsConsumerType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;succès&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per FAK-CAF-SuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-SuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}FAK-CAF-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FAK-CAF-QuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FAK-CAF-TotalsConsumerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-SuccessType", propOrder = {
    "fakcafQuittanceWithoutCompletion"
})
public class FAKCAFSuccessType
    extends FAKCAFMinimalResultStateType
{

    @XmlElement(name = "FAK-CAF-QuittanceWithoutCompletion")
    protected FAKCAFTotalsConsumerType fakcafQuittanceWithoutCompletion;

    /**
     * Recupera il valore della proprietà fakcafQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFTotalsConsumerType }
     *     
     */
    public FAKCAFTotalsConsumerType getFAKCAFQuittanceWithoutCompletion() {
        return fakcafQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà fakcafQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFTotalsConsumerType }
     *     
     */
    public void setFAKCAFQuittanceWithoutCompletion(FAKCAFTotalsConsumerType value) {
        this.fakcafQuittanceWithoutCompletion = value;
    }

}
