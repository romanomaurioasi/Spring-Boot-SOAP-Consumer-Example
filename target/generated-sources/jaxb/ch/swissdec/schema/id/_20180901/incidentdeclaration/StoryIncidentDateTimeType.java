
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per StoryIncidentDateTimeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StoryIncidentDateTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ExactDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Approximate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoryIncidentDateTimeType", propOrder = {
    "exactDateTime",
    "approximate"
})
public class StoryIncidentDateTimeType {

    @XmlElement(name = "ExactDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exactDateTime;
    @XmlElement(name = "Approximate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approximate;

    /**
     * Recupera il valore della proprietà exactDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExactDateTime() {
        return exactDateTime;
    }

    /**
     * Imposta il valore della proprietà exactDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExactDateTime(XMLGregorianCalendar value) {
        this.exactDateTime = value;
    }

    /**
     * Recupera il valore della proprietà approximate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproximate() {
        return approximate;
    }

    /**
     * Imposta il valore della proprietà approximate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproximate(XMLGregorianCalendar value) {
        this.approximate = value;
    }

}
