
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ControlsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ControlsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessByDistributor" type="{http://www.swissdec.ch/schema/common/20200220/Common}SimpleBooleanType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlsType", propOrder = {
    "processByDistributor"
})
@XmlSeeAlso({
    ControlsMultiType.class
})
public class ControlsType {

    @XmlElement(name = "ProcessByDistributor")
    protected boolean processByDistributor;

    /**
     * Recupera il valore della proprietà processByDistributor.
     * 
     */
    public boolean isProcessByDistributor() {
        return processByDistributor;
    }

    /**
     * Imposta il valore della proprietà processByDistributor.
     * 
     */
    public void setProcessByDistributor(boolean value) {
        this.processByDistributor = value;
    }

}
