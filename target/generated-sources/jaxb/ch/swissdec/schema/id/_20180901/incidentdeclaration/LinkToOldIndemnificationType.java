
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LinkToOldIndemnificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LinkToOldIndemnificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SettlementID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="IndemnificationID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkToOldIndemnificationType", propOrder = {
    "settlementID",
    "indemnificationID"
})
public class LinkToOldIndemnificationType {

    @XmlElement(name = "SettlementID", required = true)
    protected String settlementID;
    @XmlElement(name = "IndemnificationID", required = true)
    protected String indemnificationID;

    /**
     * Recupera il valore della proprietà settlementID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementID() {
        return settlementID;
    }

    /**
     * Imposta il valore della proprietà settlementID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementID(String value) {
        this.settlementID = value;
    }

    /**
     * Recupera il valore della proprietà indemnificationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndemnificationID() {
        return indemnificationID;
    }

    /**
     * Imposta il valore della proprietà indemnificationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndemnificationID(String value) {
        this.indemnificationID = value;
    }

}
