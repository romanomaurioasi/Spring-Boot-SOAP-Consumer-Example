
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceCustomerIdentificationBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceCustomerIdentificationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CantonID" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}CantonAddressType"/&gt;
 *         &lt;element name="CustomerIdentity" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceCustomerIdentificationBaseType", propOrder = {
    "cantonID",
    "customerIdentity"
})
public class TaxAtSourceCustomerIdentificationBaseType {

    @XmlElement(name = "CantonID", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType cantonID;
    @XmlElement(name = "CustomerIdentity", required = true)
    protected String customerIdentity;

    /**
     * Recupera il valore della proprietà cantonID.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getCantonID() {
        return cantonID;
    }

    /**
     * Imposta il valore della proprietà cantonID.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setCantonID(CantonAddressType value) {
        this.cantonID = value;
    }

    /**
     * Recupera il valore della proprietà customerIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentity() {
        return customerIdentity;
    }

    /**
     * Imposta il valore della proprietà customerIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentity(String value) {
        this.customerIdentity = value;
    }

}
