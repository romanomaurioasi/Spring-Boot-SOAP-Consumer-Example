
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per RegistrationIncidentDateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RegistrationIncidentDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Exact" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Approximate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Clarification" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationIncidentDateType", propOrder = {
    "exact",
    "approximate",
    "clarification"
})
public class RegistrationIncidentDateType {

    @XmlElement(name = "Exact")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exact;
    @XmlElement(name = "Approximate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approximate;
    @XmlElement(name = "Clarification")
    protected EmptyType clarification;

    /**
     * Recupera il valore della proprietà exact.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExact() {
        return exact;
    }

    /**
     * Imposta il valore della proprietà exact.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExact(XMLGregorianCalendar value) {
        this.exact = value;
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

    /**
     * Recupera il valore della proprietà clarification.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getClarification() {
        return clarification;
    }

    /**
     * Imposta il valore della proprietà clarification.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setClarification(EmptyType value) {
        this.clarification = value;
    }

}
