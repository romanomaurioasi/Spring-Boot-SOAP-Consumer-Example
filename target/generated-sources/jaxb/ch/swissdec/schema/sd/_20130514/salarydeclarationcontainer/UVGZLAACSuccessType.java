
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.UVGZLAACTotalsConsumerType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;succès&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per UVGZ-LAAC-SuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVGZ-LAAC-SuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}UVGZ-LAAC-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVGZ-LAAC-QuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}UVGZ-LAAC-TotalsConsumerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVGZ-LAAC-SuccessType", propOrder = {
    "uvgzlaacQuittanceWithoutCompletion"
})
public class UVGZLAACSuccessType
    extends UVGZLAACMinimalResultStateType
{

    @XmlElement(name = "UVGZ-LAAC-QuittanceWithoutCompletion")
    protected UVGZLAACTotalsConsumerType uvgzlaacQuittanceWithoutCompletion;

    /**
     * Recupera il valore della proprietà uvgzlaacQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link UVGZLAACTotalsConsumerType }
     *     
     */
    public UVGZLAACTotalsConsumerType getUVGZLAACQuittanceWithoutCompletion() {
        return uvgzlaacQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà uvgzlaacQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGZLAACTotalsConsumerType }
     *     
     */
    public void setUVGZLAACQuittanceWithoutCompletion(UVGZLAACTotalsConsumerType value) {
        this.uvgzlaacQuittanceWithoutCompletion = value;
    }

}
