
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GenericInstitutionIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GenericInstitutionIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstitutionID" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}IDType"/&gt;
 *         &lt;element name="InstitutionCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerIdentity" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType"/&gt;
 *         &lt;element name="ContractIdentity" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericInstitutionIdentificationType", propOrder = {
    "institutionID",
    "institutionCompanyName",
    "customerIdentity",
    "contractIdentity"
})
public class GenericInstitutionIdentificationType {

    @XmlElement(name = "InstitutionID", required = true)
    protected String institutionID;
    @XmlElement(name = "InstitutionCompanyName", required = true)
    protected String institutionCompanyName;
    @XmlElement(name = "CustomerIdentity", required = true)
    protected String customerIdentity;
    @XmlElement(name = "ContractIdentity", required = true)
    protected String contractIdentity;

    /**
     * Recupera il valore della proprietà institutionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionID() {
        return institutionID;
    }

    /**
     * Imposta il valore della proprietà institutionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionID(String value) {
        this.institutionID = value;
    }

    /**
     * Recupera il valore della proprietà institutionCompanyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionCompanyName() {
        return institutionCompanyName;
    }

    /**
     * Imposta il valore della proprietà institutionCompanyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionCompanyName(String value) {
        this.institutionCompanyName = value;
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

    /**
     * Recupera il valore della proprietà contractIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractIdentity() {
        return contractIdentity;
    }

    /**
     * Imposta il valore della proprietà contractIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractIdentity(String value) {
        this.contractIdentity = value;
    }

}
