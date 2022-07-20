
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.DelegateType;


/**
 * <p>Classe Java per AuthorizedForCompanyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AuthorizedForCompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/common/20180901/Common}DelegateType"/&gt;
 *         &lt;element name="ContactPerson" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}ContactPersonType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizedForCompanyType", propOrder = {
    "company",
    "contactPerson"
})
public class AuthorizedForCompanyType {

    @XmlElement(name = "Company", required = true)
    protected DelegateType company;
    @XmlElement(name = "ContactPerson", required = true)
    protected ContactPersonType contactPerson;

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link DelegateType }
     *     
     */
    public DelegateType getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegateType }
     *     
     */
    public void setCompany(DelegateType value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getContactPerson() {
        return contactPerson;
    }

    /**
     * Imposta il valore della proprietà contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setContactPerson(ContactPersonType value) {
        this.contactPerson = value;
    }

}
