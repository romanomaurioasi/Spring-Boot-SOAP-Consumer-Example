
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FAK-CAF-CustomerIdentificationBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-CustomerIdentificationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FAK-CAF-BranchNumber" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType"/&gt;
 *         &lt;element name="FAK-CAF-CustomerNumber" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType"/&gt;
 *         &lt;element name="FAK-CAF-SubNumber" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-CustomerIdentificationBaseType", propOrder = {
    "fakcafBranchNumber",
    "fakcafCustomerNumber",
    "fakcafSubNumber"
})
public class FAKCAFCustomerIdentificationBaseType {

    @XmlElement(name = "FAK-CAF-BranchNumber", required = true)
    protected String fakcafBranchNumber;
    @XmlElement(name = "FAK-CAF-CustomerNumber", required = true)
    protected String fakcafCustomerNumber;
    @XmlElement(name = "FAK-CAF-SubNumber")
    protected String fakcafSubNumber;

    /**
     * Recupera il valore della proprietà fakcafBranchNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAKCAFBranchNumber() {
        return fakcafBranchNumber;
    }

    /**
     * Imposta il valore della proprietà fakcafBranchNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAKCAFBranchNumber(String value) {
        this.fakcafBranchNumber = value;
    }

    /**
     * Recupera il valore della proprietà fakcafCustomerNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAKCAFCustomerNumber() {
        return fakcafCustomerNumber;
    }

    /**
     * Imposta il valore della proprietà fakcafCustomerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAKCAFCustomerNumber(String value) {
        this.fakcafCustomerNumber = value;
    }

    /**
     * Recupera il valore della proprietà fakcafSubNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAKCAFSubNumber() {
        return fakcafSubNumber;
    }

    /**
     * Imposta il valore della proprietà fakcafSubNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAKCAFSubNumber(String value) {
        this.fakcafSubNumber = value;
    }

}
