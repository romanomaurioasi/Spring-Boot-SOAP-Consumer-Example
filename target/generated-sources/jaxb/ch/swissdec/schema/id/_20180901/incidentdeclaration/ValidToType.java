
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per ValidToType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ValidToType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="TakeWorkUpFullyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Unknown" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidToType", propOrder = {
    "to",
    "takeWorkUpFullyDate",
    "unknown"
})
public class ValidToType {

    @XmlElement(name = "To")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar to;
    @XmlElement(name = "TakeWorkUpFullyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar takeWorkUpFullyDate;
    @XmlElement(name = "Unknown")
    protected EmptyType unknown;

    /**
     * Recupera il valore della proprietà to.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTo() {
        return to;
    }

    /**
     * Imposta il valore della proprietà to.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTo(XMLGregorianCalendar value) {
        this.to = value;
    }

    /**
     * Recupera il valore della proprietà takeWorkUpFullyDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTakeWorkUpFullyDate() {
        return takeWorkUpFullyDate;
    }

    /**
     * Imposta il valore della proprietà takeWorkUpFullyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTakeWorkUpFullyDate(XMLGregorianCalendar value) {
        this.takeWorkUpFullyDate = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getUnknown() {
        return unknown;
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setUnknown(EmptyType value) {
        this.unknown = value;
    }

}
