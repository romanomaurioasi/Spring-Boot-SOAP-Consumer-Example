
package ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetResultFromOrganizationRegistrationResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetResultFromOrganizationRegistrationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseContext" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}ResponseContextType"/&gt;
 *         &lt;element name="CertificateRequest-ID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="Result" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}ResultType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResultFromOrganizationRegistrationResponseType", propOrder = {
    "responseContext",
    "certificateRequestID",
    "result"
})
public class GetResultFromOrganizationRegistrationResponseType {

    @XmlElement(name = "ResponseContext", required = true)
    protected ResponseContextType responseContext;
    @XmlElement(name = "CertificateRequest-ID", required = true)
    protected String certificateRequestID;
    @XmlElement(name = "Result", required = true)
    protected ResultType result;

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
     * Recupera il valore della proprietà result.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

}
