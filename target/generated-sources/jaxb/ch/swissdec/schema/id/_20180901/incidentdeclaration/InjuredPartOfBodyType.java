
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InjuredPartOfBodyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InjuredPartOfBodyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartOfBody" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PartOfBodyType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TypeOfInjury" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}TypeOfInjuryType"/&gt;
 *           &lt;element name="OtherTypeOfInjury" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InjuredPartOfBodyType", propOrder = {
    "partOfBody",
    "typeOfInjury",
    "otherTypeOfInjury"
})
public class InjuredPartOfBodyType {

    @XmlElement(name = "PartOfBody", required = true)
    protected PartOfBodyType partOfBody;
    @XmlElement(name = "TypeOfInjury")
    @XmlSchemaType(name = "NMTOKEN")
    protected TypeOfInjuryType typeOfInjury;
    @XmlElement(name = "OtherTypeOfInjury")
    protected String otherTypeOfInjury;

    /**
     * Recupera il valore della proprietà partOfBody.
     * 
     * @return
     *     possible object is
     *     {@link PartOfBodyType }
     *     
     */
    public PartOfBodyType getPartOfBody() {
        return partOfBody;
    }

    /**
     * Imposta il valore della proprietà partOfBody.
     * 
     * @param value
     *     allowed object is
     *     {@link PartOfBodyType }
     *     
     */
    public void setPartOfBody(PartOfBodyType value) {
        this.partOfBody = value;
    }

    /**
     * Recupera il valore della proprietà typeOfInjury.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfInjuryType }
     *     
     */
    public TypeOfInjuryType getTypeOfInjury() {
        return typeOfInjury;
    }

    /**
     * Imposta il valore della proprietà typeOfInjury.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfInjuryType }
     *     
     */
    public void setTypeOfInjury(TypeOfInjuryType value) {
        this.typeOfInjury = value;
    }

    /**
     * Recupera il valore della proprietà otherTypeOfInjury.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTypeOfInjury() {
        return otherTypeOfInjury;
    }

    /**
     * Imposta il valore della proprietà otherTypeOfInjury.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTypeOfInjury(String value) {
        this.otherTypeOfInjury = value;
    }

}
