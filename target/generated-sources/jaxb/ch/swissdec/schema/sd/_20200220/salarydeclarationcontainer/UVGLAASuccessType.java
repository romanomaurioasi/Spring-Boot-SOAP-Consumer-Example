
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.UVGLAATotalsConsumerType;


/**
 * <p>Classe Java per UVG-LAA-SuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVG-LAA-SuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}UVG-LAA-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVG-LAA-QuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVG-LAA-TotalsConsumerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVG-LAA-SuccessType", propOrder = {
    "uvglaaQuittanceWithoutCompletion"
})
public class UVGLAASuccessType
    extends UVGLAAMinimalResultStateType
{

    @XmlElement(name = "UVG-LAA-QuittanceWithoutCompletion")
    protected UVGLAATotalsConsumerType uvglaaQuittanceWithoutCompletion;

    /**
     * Recupera il valore della proprietà uvglaaQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link UVGLAATotalsConsumerType }
     *     
     */
    public UVGLAATotalsConsumerType getUVGLAAQuittanceWithoutCompletion() {
        return uvglaaQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà uvglaaQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGLAATotalsConsumerType }
     *     
     */
    public void setUVGLAAQuittanceWithoutCompletion(UVGLAATotalsConsumerType value) {
        this.uvglaaQuittanceWithoutCompletion = value;
    }

}
