
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IndemnificationCorrectionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IndemnificationCorrectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkToOldIndemnification" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}LinkToOldIndemnificationType" minOccurs="0"/&gt;
 *         &lt;element name="Old" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IndemnificationType"/&gt;
 *         &lt;element name="New" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IndemnificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndemnificationCorrectionType", propOrder = {
    "linkToOldIndemnification",
    "old",
    "_new"
})
public class IndemnificationCorrectionType {

    @XmlElement(name = "LinkToOldIndemnification")
    protected LinkToOldIndemnificationType linkToOldIndemnification;
    @XmlElement(name = "Old", required = true)
    protected IndemnificationType old;
    @XmlElement(name = "New")
    protected IndemnificationType _new;

    /**
     * Recupera il valore della proprietà linkToOldIndemnification.
     * 
     * @return
     *     possible object is
     *     {@link LinkToOldIndemnificationType }
     *     
     */
    public LinkToOldIndemnificationType getLinkToOldIndemnification() {
        return linkToOldIndemnification;
    }

    /**
     * Imposta il valore della proprietà linkToOldIndemnification.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkToOldIndemnificationType }
     *     
     */
    public void setLinkToOldIndemnification(LinkToOldIndemnificationType value) {
        this.linkToOldIndemnification = value;
    }

    /**
     * Recupera il valore della proprietà old.
     * 
     * @return
     *     possible object is
     *     {@link IndemnificationType }
     *     
     */
    public IndemnificationType getOld() {
        return old;
    }

    /**
     * Imposta il valore della proprietà old.
     * 
     * @param value
     *     allowed object is
     *     {@link IndemnificationType }
     *     
     */
    public void setOld(IndemnificationType value) {
        this.old = value;
    }

    /**
     * Recupera il valore della proprietà new.
     * 
     * @return
     *     possible object is
     *     {@link IndemnificationType }
     *     
     */
    public IndemnificationType getNew() {
        return _new;
    }

    /**
     * Imposta il valore della proprietà new.
     * 
     * @param value
     *     allowed object is
     *     {@link IndemnificationType }
     *     
     */
    public void setNew(IndemnificationType value) {
        this._new = value;
    }

}
