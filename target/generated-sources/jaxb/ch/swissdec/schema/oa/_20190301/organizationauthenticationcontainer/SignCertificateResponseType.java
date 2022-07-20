
package ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.CertificateSignResponseType;


/**
 * <p>Classe Java per SignCertificateResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignCertificateResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseContext" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}ResponseContextType"/&gt;
 *         &lt;element name="CertificateRequest-ID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="Certificate" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}CertificateSignResponseType"/&gt;
 *         &lt;element name="RevokePassword" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignCertificateResponseType", propOrder = {
    "responseContext",
    "certificateRequestID",
    "certificate",
    "revokePassword"
})
public class SignCertificateResponseType {

    @XmlElement(name = "ResponseContext", required = true)
    protected ResponseContextType responseContext;
    @XmlElement(name = "CertificateRequest-ID", required = true)
    protected String certificateRequestID;
    @XmlElement(name = "Certificate", required = true)
    protected CertificateSignResponseType certificate;
    @XmlElement(name = "RevokePassword")
    protected String revokePassword;

    /**
     * Recupera il valore della proprietà responseContext.
     * 
     * @return
     *     possible object is
     *     {@link ResponseContextType }
     *     
     */
    public ResponseContextType getResponseContext() {
        return responseContext;
    }

    /**
     * Imposta il valore della proprietà responseContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseContextType }
     *     
     */
    public void setResponseContext(ResponseContextType value) {
        this.responseContext = value;
    }

    /**
     * Recupera il valore della proprietà certificateRequestID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateRequestID() {
        return certificateRequestID;
    }

    /**
     * Imposta il valore della proprietà certificateRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateRequestID(String value) {
        this.certificateRequestID = value;
    }

    /**
     * Recupera il valore della proprietà certificate.
     * 
     * @return
     *     possible object is
     *     {@link CertificateSignResponseType }
     *     
     */
    public CertificateSignResponseType getCertificate() {
        return certificate;
    }

    /**
     * Imposta il valore della proprietà certificate.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateSignResponseType }
     *     
     */
    public void setCertificate(CertificateSignResponseType value) {
        this.certificate = value;
    }

    /**
     * Recupera il valore della proprietà revokePassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevokePassword() {
        return revokePassword;
    }

    /**
     * Imposta il valore della proprietà revokePassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevokePassword(String value) {
        this.revokePassword = value;
    }

}
