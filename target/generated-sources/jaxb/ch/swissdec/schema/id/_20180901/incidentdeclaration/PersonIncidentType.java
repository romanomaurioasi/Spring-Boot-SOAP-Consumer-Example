
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PersonIncidentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonIncidentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PersonType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVG-LAA-Registration" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AccidentRegistrationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVGZ-LAAC-Registration" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AccidentRegistrationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KU-AC-Registration" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AccidentRegistrationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KTG-AMC-Registration" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IllnessRegistrationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIncidentType", propOrder = {
    "uvglaaRegistration",
    "uvgzlaacRegistration",
    "kuacRegistration",
    "ktgamcRegistration"
})
public class PersonIncidentType
    extends PersonType
{

    @XmlElement(name = "UVG-LAA-Registration")
    protected List<AccidentRegistrationType> uvglaaRegistration;
    @XmlElement(name = "UVGZ-LAAC-Registration")
    protected List<AccidentRegistrationType> uvgzlaacRegistration;
    @XmlElement(name = "KU-AC-Registration")
    protected List<AccidentRegistrationType> kuacRegistration;
    @XmlElement(name = "KTG-AMC-Registration")
    protected List<IllnessRegistrationType> ktgamcRegistration;

    /**
     * Gets the value of the uvglaaRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvglaaRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGLAARegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccidentRegistrationType }
     * 
     * 
     */
    public List<AccidentRegistrationType> getUVGLAARegistration() {
        if (uvglaaRegistration == null) {
            uvglaaRegistration = new ArrayList<AccidentRegistrationType>();
        }
        return this.uvglaaRegistration;
    }

    /**
     * Gets the value of the uvgzlaacRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvgzlaacRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGZLAACRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccidentRegistrationType }
     * 
     * 
     */
    public List<AccidentRegistrationType> getUVGZLAACRegistration() {
        if (uvgzlaacRegistration == null) {
            uvgzlaacRegistration = new ArrayList<AccidentRegistrationType>();
        }
        return this.uvgzlaacRegistration;
    }

    /**
     * Gets the value of the kuacRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kuacRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKUACRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccidentRegistrationType }
     * 
     * 
     */
    public List<AccidentRegistrationType> getKUACRegistration() {
        if (kuacRegistration == null) {
            kuacRegistration = new ArrayList<AccidentRegistrationType>();
        }
        return this.kuacRegistration;
    }

    /**
     * Gets the value of the ktgamcRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ktgamcRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKTGAMCRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IllnessRegistrationType }
     * 
     * 
     */
    public List<IllnessRegistrationType> getKTGAMCRegistration() {
        if (ktgamcRegistration == null) {
            ktgamcRegistration = new ArrayList<IllnessRegistrationType>();
        }
        return this.ktgamcRegistration;
    }

}
