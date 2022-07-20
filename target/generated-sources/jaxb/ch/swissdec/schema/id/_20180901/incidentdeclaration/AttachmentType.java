
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AttachmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filename" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="ContentType" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ContentTypeType"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "filename",
    "contentType",
    "data"
})
public class AttachmentType
    extends StoryBaseType
{

    @XmlElement(name = "Filename", required = true)
    protected String filename;
    @XmlElement(name = "ContentType", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ContentTypeType contentType;
    @XmlElement(name = "Data", required = true)
    protected byte[] data;

    /**
     * Recupera il valore della proprietà filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Imposta il valore della proprietà filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Recupera il valore della proprietà contentType.
     * 
     * @return
     *     possible object is
     *     {@link ContentTypeType }
     *     
     */
    public ContentTypeType getContentType() {
        return contentType;
    }

    /**
     * Imposta il valore della proprietà contentType.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTypeType }
     *     
     */
    public void setContentType(ContentTypeType value) {
        this.contentType = value;
    }

    /**
     * Recupera il valore della proprietà data.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Imposta il valore della proprietà data.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

}
