
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.NameAndAddressType;


/**
 * <p>Classe Java per PaymentAddressBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentAddressBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountOwner" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountOwnerSpecialAddress" type="{http://www.swissdec.ch/schema/common/20180901/Common}NameAndAddressType" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IBANType"/&gt;
 *         &lt;element name="FinancialInstitution" type="{http://www.swissdec.ch/schema/common/20180901/Common}NameAndAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAddressBaseType", propOrder = {
    "accountOwner",
    "accountOwnerSpecialAddress",
    "iban",
    "financialInstitution"
})
@XmlSeeAlso({
    PaymentAddressType.class
})
public class PaymentAddressBaseType {

    @XmlElement(name = "AccountOwner", required = true)
    protected String accountOwner;
    @XmlElement(name = "AccountOwnerSpecialAddress")
    protected NameAndAddressType accountOwnerSpecialAddress;
    @XmlElement(name = "IBAN", required = true)
    protected String iban;
    @XmlElement(name = "FinancialInstitution")
    protected NameAndAddressType financialInstitution;

    /**
     * Recupera il valore della proprietà accountOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOwner() {
        return accountOwner;
    }

    /**
     * Imposta il valore della proprietà accountOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOwner(String value) {
        this.accountOwner = value;
    }

    /**
     * Recupera il valore della proprietà accountOwnerSpecialAddress.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressType }
     *     
     */
    public NameAndAddressType getAccountOwnerSpecialAddress() {
        return accountOwnerSpecialAddress;
    }

    /**
     * Imposta il valore della proprietà accountOwnerSpecialAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressType }
     *     
     */
    public void setAccountOwnerSpecialAddress(NameAndAddressType value) {
        this.accountOwnerSpecialAddress = value;
    }

    /**
     * Recupera il valore della proprietà iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Imposta il valore della proprietà iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Recupera il valore della proprietà financialInstitution.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressType }
     *     
     */
    public NameAndAddressType getFinancialInstitution() {
        return financialInstitution;
    }

    /**
     * Imposta il valore della proprietà financialInstitution.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressType }
     *     
     */
    public void setFinancialInstitution(NameAndAddressType value) {
        this.financialInstitution = value;
    }

}
