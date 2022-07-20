
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per RectificateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RectificateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="OriginalDocID" type="{http://www.swissdec.ch/schema/common/20200220/Common}IDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RectificateType", propOrder = {
    "originalDate",
    "originalDocID"
})
public class RectificateType {

    @XmlElement(name = "OriginalDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalDate;
    @XmlElement(name = "OriginalDocID", required = true)
    protected String originalDocID;

    /**
     * Recupera il valore della proprietà originalDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalDate() {
        return originalDate;
    }

    /**
     * Imposta il valore della proprietà originalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalDate(XMLGregorianCalendar value) {
        this.originalDate = value;
    }

    /**
     * Recupera il valore della proprietà originalDocID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDocID() {
        return originalDocID;
    }

    /**
     * Imposta il valore della proprietà originalDocID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDocID(String value) {
        this.originalDocID = value;
    }

}
