
package ch.swissdec.schema.common._20200220.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DialogMessagesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DialogMessagesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DialogMessage" type="{http://www.swissdec.ch/schema/common/20200220/Common}DialogMessageType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogMessagesType", propOrder = {
    "dialogMessage"
})
public class DialogMessagesType {

    @XmlElement(name = "DialogMessage", required = true)
    protected List<DialogMessageType> dialogMessage;

    /**
     * Gets the value of the dialogMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialogMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialogMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialogMessageType }
     * 
     * 
     */
    public List<DialogMessageType> getDialogMessage() {
        if (dialogMessage == null) {
            dialogMessage = new ArrayList<DialogMessageType>();
        }
        return this.dialogMessage;
    }

}
