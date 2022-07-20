
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OtherCustomerIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OtherCustomerIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SwissdecStandard" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="SwissdecDomainName" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="SwissdecInstitution" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}GenericInstitutionIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCustomerIdentificationType", propOrder = {
    "swissdecStandard",
    "swissdecDomainName",
    "swissdecInstitution"
})
public class OtherCustomerIdentificationType {

    @XmlElement(name = "SwissdecStandard", required = true)
    protected String swissdecStandard;
    @XmlElement(name = "SwissdecDomainName", required = true)
    protected String swissdecDomainName;
    @XmlElement(name = "SwissdecInstitution", required = true)
    protected GenericInstitutionIdentificationType swissdecInstitution;

    /**
     * Recupera il valore della proprietà swissdecStandard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwissdecStandard() {
        return swissdecStandard;
    }

    /**
     * Imposta il valore della proprietà swissdecStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwissdecStandard(String value) {
        this.swissdecStandard = value;
    }

    /**
     * Recupera il valore della proprietà swissdecDomainName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwissdecDomainName() {
        return swissdecDomainName;
    }

    /**
     * Imposta il valore della proprietà swissdecDomainName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwissdecDomainName(String value) {
        this.swissdecDomainName = value;
    }

    /**
     * Recupera il valore della proprietà swissdecInstitution.
     * 
     * @return
     *     possible object is
     *     {@link GenericInstitutionIdentificationType }
     *     
     */
    public GenericInstitutionIdentificationType getSwissdecInstitution() {
        return swissdecInstitution;
    }

    /**
     * Imposta il valore della proprietà swissdecInstitution.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericInstitutionIdentificationType }
     *     
     */
    public void setSwissdecInstitution(GenericInstitutionIdentificationType value) {
        this.swissdecInstitution = value;
    }

}
