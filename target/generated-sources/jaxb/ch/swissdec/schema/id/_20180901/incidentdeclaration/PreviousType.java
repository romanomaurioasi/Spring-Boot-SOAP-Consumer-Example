
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PreviousType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PreviousType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RequestStoryID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="ResponseStoryID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousType", propOrder = {
    "requestStoryID",
    "responseStoryID"
})
public class PreviousType {

    @XmlElement(name = "RequestStoryID")
    protected String requestStoryID;
    @XmlElement(name = "ResponseStoryID")
    protected String responseStoryID;

    /**
     * Recupera il valore della proprietà requestStoryID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStoryID() {
        return requestStoryID;
    }

    /**
     * Imposta il valore della proprietà requestStoryID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStoryID(String value) {
        this.requestStoryID = value;
    }

    /**
     * Recupera il valore della proprietà responseStoryID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStoryID() {
        return responseStoryID;
    }

    /**
     * Imposta il valore della proprietà responseStoryID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStoryID(String value) {
        this.responseStoryID = value;
    }

}
