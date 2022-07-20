
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AddresseeDeclareMonthTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddresseeDeclareMonthTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddresseeDeclareMonthTotalType", propOrder = {
    "ahvavs",
    "fakcaf"
})
public class AddresseeDeclareMonthTotalType {

    @XmlElement(name = "AHV-AVS")
    protected List<ControlsMultiType> ahvavs;
    @XmlElement(name = "FAK-CAF")
    protected List<ControlsMultiType> fakcaf;

    /**
     * Gets the value of the ahvavs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ahvavs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAHVAVS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getAHVAVS() {
        if (ahvavs == null) {
            ahvavs = new ArrayList<ControlsMultiType>();
        }
        return this.ahvavs;
    }

    /**
     * Gets the value of the fakcaf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fakcaf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFAKCAF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getFAKCAF() {
        if (fakcaf == null) {
            fakcaf = new ArrayList<ControlsMultiType>();
        }
        return this.fakcaf;
    }

}
