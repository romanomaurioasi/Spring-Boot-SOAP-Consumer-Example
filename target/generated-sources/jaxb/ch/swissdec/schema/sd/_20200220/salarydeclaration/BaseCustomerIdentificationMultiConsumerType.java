
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BaseCustomerIdentificationMultiConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BaseCustomerIdentificationMultiConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsuranceID" type="{http://www.swissdec.ch/schema/common/20200220/Common}IDType"/&gt;
 *         &lt;element name="InsuranceCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerIdentity" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="ContractIdentity" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCustomerIdentificationMultiConsumerType", propOrder = {
    "insuranceID",
    "insuranceCompanyName",
    "customerIdentity",
    "contractIdentity"
})
@XmlSeeAlso({
    BVGLPPCustomerIdentificationMultiConsumerType.class
})
public class BaseCustomerIdentificationMultiConsumerType {

    @XmlElement(name = "InsuranceID", required = true)
    protected String insuranceID;
    @XmlElement(name = "InsuranceCompanyName", required = true)
    protected String insuranceCompanyName;
    @XmlElement(name = "CustomerIdentity", required = true)
    protected String customerIdentity;
    @XmlElement(name = "ContractIdentity", required = true)
    protected String contractIdentity;

    /**
     * Recupera il valore della proprietà insuranceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceID() {
        return insuranceID;
    }

    /**
     * Imposta il valore della proprietà insuranceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceID(String value) {
        this.insuranceID = value;
    }

    /**
     * Recupera il valore della proprietà insuranceCompanyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    /**
     * Imposta il valore della proprietà insuranceCompanyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompanyName(String value) {
        this.insuranceCompanyName = value;
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
