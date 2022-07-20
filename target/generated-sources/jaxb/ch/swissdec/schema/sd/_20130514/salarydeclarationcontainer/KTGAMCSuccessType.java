
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.KTGAMCTotalsConsumerType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;succès&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per KTG-AMC-SuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KTG-AMC-SuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}KTG-AMC-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KTG-AMC-QuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}KTG-AMC-TotalsConsumerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KTG-AMC-SuccessType", propOrder = {
    "ktgamcQuittanceWithoutCompletion"
})
public class KTGAMCSuccessType
    extends KTGAMCMinimalResultStateType
{

    @XmlElement(name = "KTG-AMC-QuittanceWithoutCompletion")
    protected KTGAMCTotalsConsumerType ktgamcQuittanceWithoutCompletion;

    /**
     * Recupera il valore della proprietà ktgamcQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCTotalsConsumerType }
     *     
     */
    public KTGAMCTotalsConsumerType getKTGAMCQuittanceWithoutCompletion() {
        return ktgamcQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà ktgamcQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCTotalsConsumerType }
     *     
     */
    public void setKTGAMCQuittanceWithoutCompletion(KTGAMCTotalsConsumerType value) {
        this.ktgamcQuittanceWithoutCompletion = value;
    }

}
