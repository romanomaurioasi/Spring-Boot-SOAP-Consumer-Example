
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.DialogMessagesType;


/**
 * <p>Classe Java per KTG-AMC-SuccessDialogType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KTG-AMC-SuccessDialogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}KTG-AMC-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DialogMessages" type="{http://www.swissdec.ch/schema/common/20200220/Common}DialogMessagesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KTG-AMC-SuccessDialogType", propOrder = {
    "dialogMessages"
})
public class KTGAMCSuccessDialogType
    extends KTGAMCMinimalResultStateType
{

    @XmlElement(name = "DialogMessages")
    protected DialogMessagesType dialogMessages;

    /**
     * Recupera il valore della proprietà dialogMessages.
     * 
     * @return
     *     possible object is
     *     {@link DialogMessagesType }
     *     
     */
    public DialogMessagesType getDialogMessages() {
        return dialogMessages;
    }

    /**
     * Imposta il valore della proprietà dialogMessages.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogMessagesType }
     *     
     */
    public void setDialogMessages(DialogMessagesType value) {
        this.dialogMessages = value;
    }

}
