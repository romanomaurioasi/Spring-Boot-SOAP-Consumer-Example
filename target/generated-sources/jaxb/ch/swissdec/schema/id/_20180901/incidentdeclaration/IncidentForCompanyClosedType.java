
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per IncidentForCompanyClosedType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentForCompanyClosedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Normal" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *         &lt;element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentForCompanyClosedType", propOrder = {
    "normal",
    "cancel"
})
public class IncidentForCompanyClosedType {

    @XmlElement(name = "Normal")
    protected EmptyType normal;
    @XmlElement(name = "Cancel")
    protected String cancel;

    /**
     * Recupera il valore della proprietà normal.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNormal() {
        return normal;
    }

    /**
     * Imposta il valore della proprietà normal.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNormal(EmptyType value) {
        this.normal = value;
    }

    /**
     * Recupera il valore della proprietà cancel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancel() {
        return cancel;
    }

    /**
     * Imposta il valore della proprietà cancel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancel(String value) {
        this.cancel = value;
    }

}
