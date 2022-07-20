
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ReducedGetDialogResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReducedGetDialogResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dialog" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ReducedDialogType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReducedGetDialogResponse", propOrder = {
    "dialog"
})
public class ReducedGetDialogResponse {

    @XmlElement(name = "Dialog", required = true)
    protected ReducedDialogType dialog;

    /**
     * Recupera il valore della proprietà dialog.
     * 
     * @return
     *     possible object is
     *     {@link ReducedDialogType }
     *     
     */
    public ReducedDialogType getDialog() {
        return dialog;
    }

    /**
     * Imposta il valore della proprietà dialog.
     * 
     * @param value
     *     allowed object is
     *     {@link ReducedDialogType }
     *     
     */
    public void setDialog(ReducedDialogType value) {
        this.dialog = value;
    }

}
