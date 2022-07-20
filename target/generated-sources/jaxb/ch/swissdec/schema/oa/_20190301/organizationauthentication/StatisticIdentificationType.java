
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatisticIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerIdentity" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType"/&gt;
 *         &lt;element name="CustomerIdentity2" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticIdentificationType", propOrder = {
    "customerIdentity",
    "customerIdentity2"
})
public class StatisticIdentificationType {

    @XmlElement(name = "CustomerIdentity", required = true)
    protected String customerIdentity;
    @XmlElement(name = "CustomerIdentity2")
    protected String customerIdentity2;

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

    /**
     * Recupera il valore della proprietà customerIdentity2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentity2() {
        return customerIdentity2;
    }

    /**
     * Imposta il valore della proprietà customerIdentity2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentity2(String value) {
        this.customerIdentity2 = value;
    }

}
