
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CertificateSignRequestBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateSignRequestBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PEM" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateSignRequestBaseType", propOrder = {
    "pem"
})
@XmlSeeAlso({
    CertificateSignRequestType.class
})
public class CertificateSignRequestBaseType {

    @XmlElement(name = "PEM", required = true)
    protected byte[] pem;

    /**
     * Recupera il valore della proprietà pem.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPEM() {
        return pem;
    }

    /**
     * Imposta il valore della proprietà pem.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPEM(byte[] value) {
        this.pem = value;
    }

}
