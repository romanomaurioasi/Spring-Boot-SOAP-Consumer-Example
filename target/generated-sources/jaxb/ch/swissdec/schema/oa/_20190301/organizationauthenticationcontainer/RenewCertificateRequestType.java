
package ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.CertificateSignRequestBaseType;


/**
 * <p>Classe Java per RenewCertificateRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RenewCertificateRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}RequestContextType"/&gt;
 *         &lt;element name="CertificateRequest-ID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="CertificateSignRequest" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}CertificateSignRequestBaseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenewCertificateRequestType", propOrder = {
    "requestContext",
    "certificateRequestID",
    "certificateSignRequest"
})
public class RenewCertificateRequestType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "CertificateRequest-ID", required = true)
    protected String certificateRequestID;
    @XmlElement(name = "CertificateSignRequest", required = true)
    protected CertificateSignRequestBaseType certificateSignRequest;

    /**
     * Recupera il valore della proprietà requestContext.
     * 
     * @return
     *     possible object is
     *     {@link RequestContextType }
     *     
     */
    public RequestContextType getRequestContext() {
        return requestContext;
    }

    /**
     * Imposta il valore della proprietà requestContext.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestContextType }
     *     
     */
    public void setRequestContext(RequestContextType value) {
        this.requestContext = value;
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
     * Recupera il valore della proprietà certificateSignRequest.
     * 
     * @return
     *     possible object is
     *     {@link CertificateSignRequestBaseType }
     *     
     */
    public CertificateSignRequestBaseType getCertificateSignRequest() {
        return certificateSignRequest;
    }

    /**
     * Imposta il valore della proprietà certificateSignRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateSignRequestBaseType }
     *     
     */
    public void setCertificateSignRequest(CertificateSignRequestBaseType value) {
        this.certificateSignRequest = value;
    }

}
