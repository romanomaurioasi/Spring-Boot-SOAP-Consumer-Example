
package ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ConsumerResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumerResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="AddresseeContext" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}ResponseContextType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Processing" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}ProcessingType"/&gt;
 *           &lt;element name="Success" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}ConsumerSuccessType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerResultType", propOrder = {
    "addresseeContext",
    "processing",
    "success"
})
public class ConsumerResultType {

    @XmlElement(name = "AddresseeContext")
    protected ResponseContextType addresseeContext;
    @XmlElement(name = "Processing")
    protected ProcessingType processing;
    @XmlElement(name = "Success")
    protected ConsumerSuccessType success;

    /**
     * Recupera il valore della proprietà addresseeContext.
     * 
     * @return
     *     possible object is
     *     {@link ResponseContextType }
     *     
     */
    public ResponseContextType getAddresseeContext() {
        return addresseeContext;
    }

    /**
     * Imposta il valore della proprietà addresseeContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseContextType }
     *     
     */
    public void setAddresseeContext(ResponseContextType value) {
        this.addresseeContext = value;
    }

    /**
     * Recupera il valore della proprietà processing.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingType }
     *     
     */
    public ProcessingType getProcessing() {
        return processing;
    }

    /**
     * Imposta il valore della proprietà processing.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingType }
     *     
     */
    public void setProcessing(ProcessingType value) {
        this.processing = value;
    }

    /**
     * Recupera il valore della proprietà success.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerSuccessType }
     *     
     */
    public ConsumerSuccessType getSuccess() {
        return success;
    }

    /**
     * Imposta il valore della proprietà success.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerSuccessType }
     *     
     */
    public void setSuccess(ConsumerSuccessType value) {
        this.success = value;
    }

}
