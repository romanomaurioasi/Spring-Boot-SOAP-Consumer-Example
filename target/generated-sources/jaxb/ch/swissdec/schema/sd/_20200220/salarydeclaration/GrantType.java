
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.CantonAddressType;


/**
 * <p>Classe Java per GrantType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GrantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Allowed" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Canton" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrantType", propOrder = {
    "allowed",
    "canton"
})
public class GrantType {

    @XmlElement(name = "Allowed", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar allowed;
    @XmlElement(name = "Canton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType canton;

    /**
     * Recupera il valore della proprietà allowed.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAllowed() {
        return allowed;
    }

    /**
     * Imposta il valore della proprietà allowed.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAllowed(XMLGregorianCalendar value) {
        this.allowed = value;
    }

    /**
     * Recupera il valore della proprietà canton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getCanton() {
        return canton;
    }

    /**
     * Imposta il valore della proprietà canton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setCanton(CantonAddressType value) {
        this.canton = value;
    }

}
