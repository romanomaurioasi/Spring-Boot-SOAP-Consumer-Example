
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CertificateSignRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateSignRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}CertificateSignRequestBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OneTimePassword" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateSignRequestType", propOrder = {
    "oneTimePassword"
})
public class CertificateSignRequestType
    extends CertificateSignRequestBaseType
{

    @XmlElement(name = "OneTimePassword", required = true)
    protected String oneTimePassword;

    /**
     * Recupera il valore della proprietà oneTimePassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneTimePassword() {
        return oneTimePassword;
    }

    /**
     * Imposta il valore della proprietà oneTimePassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneTimePassword(String value) {
        this.oneTimePassword = value;
    }

}
