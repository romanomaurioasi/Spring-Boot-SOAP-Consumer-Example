
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ClassOfInsuranceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ClassOfInsuranceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AccidentAtWork" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AccidentAtWorkType"/&gt;
 *         &lt;element name="AccidentAtLeisure" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}AccidentAtLeisureType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassOfInsuranceType", propOrder = {
    "accidentAtWork",
    "accidentAtLeisure"
})
public class ClassOfInsuranceType {

    @XmlElement(name = "AccidentAtWork")
    protected AccidentAtWorkType accidentAtWork;
    @XmlElement(name = "AccidentAtLeisure")
    protected AccidentAtLeisureType accidentAtLeisure;

    /**
     * Recupera il valore della proprietà accidentAtWork.
     * 
     * @return
     *     possible object is
     *     {@link AccidentAtWorkType }
     *     
     */
    public AccidentAtWorkType getAccidentAtWork() {
        return accidentAtWork;
    }

    /**
     * Imposta il valore della proprietà accidentAtWork.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentAtWorkType }
     *     
     */
    public void setAccidentAtWork(AccidentAtWorkType value) {
        this.accidentAtWork = value;
    }

    /**
     * Recupera il valore della proprietà accidentAtLeisure.
     * 
     * @return
     *     possible object is
     *     {@link AccidentAtLeisureType }
     *     
     */
    public AccidentAtLeisureType getAccidentAtLeisure() {
        return accidentAtLeisure;
    }

    /**
     * Imposta il valore della proprietà accidentAtLeisure.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentAtLeisureType }
     *     
     */
    public void setAccidentAtLeisure(AccidentAtLeisureType value) {
        this.accidentAtLeisure = value;
    }

}
