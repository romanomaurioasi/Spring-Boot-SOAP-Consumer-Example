
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PartOfBodyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartOfBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="UnassignedPart" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}BodyPartType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Part" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}BodyOrientedPartType"/&gt;
 *           &lt;element name="Position" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PositionPartType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartOfBodyType", propOrder = {
    "unassignedPart",
    "part",
    "position"
})
public class PartOfBodyType {

    @XmlElement(name = "UnassignedPart")
    @XmlSchemaType(name = "NMTOKEN")
    protected BodyPartType unassignedPart;
    @XmlElement(name = "Part")
    @XmlSchemaType(name = "NMTOKEN")
    protected BodyOrientedPartType part;
    @XmlElement(name = "Position")
    @XmlSchemaType(name = "NMTOKEN")
    protected PositionPartType position;

    /**
     * Recupera il valore della proprietà unassignedPart.
     * 
     * @return
     *     possible object is
     *     {@link BodyPartType }
     *     
     */
    public BodyPartType getUnassignedPart() {
        return unassignedPart;
    }

    /**
     * Imposta il valore della proprietà unassignedPart.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyPartType }
     *     
     */
    public void setUnassignedPart(BodyPartType value) {
        this.unassignedPart = value;
    }

    /**
     * Recupera il valore della proprietà part.
     * 
     * @return
     *     possible object is
     *     {@link BodyOrientedPartType }
     *     
     */
    public BodyOrientedPartType getPart() {
        return part;
    }

    /**
     * Imposta il valore della proprietà part.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyOrientedPartType }
     *     
     */
    public void setPart(BodyOrientedPartType value) {
        this.part = value;
    }

    /**
     * Recupera il valore della proprietà position.
     * 
     * @return
     *     possible object is
     *     {@link PositionPartType }
     *     
     */
    public PositionPartType getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionPartType }
     *     
     */
    public void setPosition(PositionPartType value) {
        this.position = value;
    }

}
