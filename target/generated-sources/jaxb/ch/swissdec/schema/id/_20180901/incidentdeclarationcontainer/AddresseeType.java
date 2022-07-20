
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AddresseeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddresseeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ControlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ControlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KU-AC" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ControlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ControlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddresseeType", propOrder = {
    "uvglaa",
    "uvgzlaac",
    "kuac",
    "ktgamc"
})
public class AddresseeType {

    @XmlElement(name = "UVG-LAA")
    protected List<ControlsType> uvglaa;
    @XmlElement(name = "UVGZ-LAAC")
    protected List<ControlsType> uvgzlaac;
    @XmlElement(name = "KU-AC")
    protected List<ControlsType> kuac;
    @XmlElement(name = "KTG-AMC")
    protected List<ControlsType> ktgamc;

    /**
     * Gets the value of the uvglaa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvglaa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGLAA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsType }
     * 
     * 
     */
    public List<ControlsType> getUVGLAA() {
        if (uvglaa == null) {
            uvglaa = new ArrayList<ControlsType>();
        }
        return this.uvglaa;
    }

    /**
     * Gets the value of the uvgzlaac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvgzlaac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGZLAAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsType }
     * 
     * 
     */
    public List<ControlsType> getUVGZLAAC() {
        if (uvgzlaac == null) {
            uvgzlaac = new ArrayList<ControlsType>();
        }
        return this.uvgzlaac;
    }

    /**
     * Gets the value of the kuac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kuac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKUAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsType }
     * 
     * 
     */
    public List<ControlsType> getKUAC() {
        if (kuac == null) {
            kuac = new ArrayList<ControlsType>();
        }
        return this.kuac;
    }

    /**
     * Gets the value of the ktgamc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ktgamc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKTGAMC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsType }
     * 
     * 
     */
    public List<ControlsType> getKTGAMC() {
        if (ktgamc == null) {
            ktgamc = new ArrayList<ControlsType>();
        }
        return this.ktgamc;
    }

}
