
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.NotificationsType;
import ch.swissdec.schema.common._20180901.common.ResponseCodeAAwRType;


/**
 * <p>Classe Java per ResponseStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResponseStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.swissdec.ch/schema/common/20180901/Common}ResponseCodeAAwRType"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStateType", propOrder = {
    "code",
    "info",
    "warning",
    "error"
})
public class ResponseStateType {

    @XmlElement(name = "Code", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ResponseCodeAAwRType code;
    @XmlElement(name = "Info")
    protected NotificationsType info;
    @XmlElement(name = "Warning")
    protected NotificationsType warning;
    @XmlElement(name = "Error")
    protected NotificationsType error;

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCodeAAwRType }
     *     
     */
    public ResponseCodeAAwRType getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCodeAAwRType }
     *     
     */
    public void setCode(ResponseCodeAAwRType value) {
        this.code = value;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setInfo(NotificationsType value) {
        this.info = value;
    }

    /**
     * Recupera il valore della proprietà warning.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getWarning() {
        return warning;
    }

    /**
     * Imposta il valore della proprietà warning.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setWarning(NotificationsType value) {
        this.warning = value;
    }

    /**
     * Recupera il valore della proprietà error.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getError() {
        return error;
    }

    /**
     * Imposta il valore della proprietà error.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setError(NotificationsType value) {
        this.error = value;
    }

}
