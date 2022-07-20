
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AccidentAtWorkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccidentAtWorkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvolvedObjects" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccidentAtWorkType", propOrder = {
    "involvedObjects"
})
public class AccidentAtWorkType {

    @XmlElement(name = "InvolvedObjects")
    protected String involvedObjects;

    /**
     * Recupera il valore della proprietà involvedObjects.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvedObjects() {
        return involvedObjects;
    }

    /**
     * Imposta il valore della proprietà involvedObjects.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvedObjects(String value) {
        this.involvedObjects = value;
    }

}
