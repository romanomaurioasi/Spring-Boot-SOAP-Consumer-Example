
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.swissdec.schema.common._20180901.common.CompanyNameType;


/**
 * <p>Classe Java per OrganizationRegistrationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationRegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}OrganizationRegistrationBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyUID-BFS" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}UID-BFSType"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.swissdec.ch/schema/common/20180901/Common}CompanyNameType"/&gt;
 *         &lt;element name="CompanyContactPerson" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}ContactPersonType"/&gt;
 *         &lt;element name="AuthorizedFor" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}AuthorizedForCompanyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationRegistrationType", propOrder = {
    "companyUIDBFS",
    "companyName",
    "companyContactPerson",
    "authorizedFor"
})
public class OrganizationRegistrationType
    extends OrganizationRegistrationBaseType
{

    @XmlElement(name = "CompanyUID-BFS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String companyUIDBFS;
    @XmlElement(name = "CompanyName", required = true)
    protected CompanyNameType companyName;
    @XmlElement(name = "CompanyContactPerson", required = true)
    protected ContactPersonType companyContactPerson;
    @XmlElement(name = "AuthorizedFor")
    protected AuthorizedForCompanyType authorizedFor;

    /**
     * Recupera il valore della proprietà companyUIDBFS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyUIDBFS() {
        return companyUIDBFS;
    }

    /**
     * Imposta il valore della proprietà companyUIDBFS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyUIDBFS(String value) {
        this.companyUIDBFS = value;
    }

    /**
     * Recupera il valore della proprietà companyName.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getCompanyName() {
        return companyName;
    }

    /**
     * Imposta il valore della proprietà companyName.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setCompanyName(CompanyNameType value) {
        this.companyName = value;
    }

    /**
     * Recupera il valore della proprietà companyContactPerson.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getCompanyContactPerson() {
        return companyContactPerson;
    }

    /**
     * Imposta il valore della proprietà companyContactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setCompanyContactPerson(ContactPersonType value) {
        this.companyContactPerson = value;
    }

    /**
     * Recupera il valore della proprietà authorizedFor.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedForCompanyType }
     *     
     */
    public AuthorizedForCompanyType getAuthorizedFor() {
        return authorizedFor;
    }

    /**
     * Imposta il valore della proprietà authorizedFor.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedForCompanyType }
     *     
     */
    public void setAuthorizedFor(AuthorizedForCompanyType value) {
        this.authorizedFor = value;
    }

}
