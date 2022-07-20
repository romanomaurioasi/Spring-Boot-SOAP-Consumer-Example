
package ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.swissdec.schema.common._20180901.common.AddressType;
import ch.swissdec.schema.common._20180901.common.CompanyNameType;
import ch.swissdec.schema.common._20180901.common.DelegateType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.ContactPersonType;


/**
 * <p>Classe Java per ConsumerSuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumerSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyName" type="{http://www.swissdec.ch/schema/common/20180901/Common}CompanyNameType"/&gt;
 *         &lt;element name="CompanyAddress" type="{http://www.swissdec.ch/schema/common/20180901/Common}AddressType"/&gt;
 *         &lt;element name="CompanyUID-BFS" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}UID-BFSType"/&gt;
 *         &lt;element name="QualityLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InstitutionContactPerson" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}ContactPersonType"/&gt;
 *         &lt;element name="Delegate" type="{http://www.swissdec.ch/schema/common/20180901/Common}DelegateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerSuccessType", propOrder = {
    "companyName",
    "companyAddress",
    "companyUIDBFS",
    "qualityLevel",
    "institutionContactPerson",
    "delegate"
})
public class ConsumerSuccessType {

    @XmlElement(name = "CompanyName", required = true)
    protected CompanyNameType companyName;
    @XmlElement(name = "CompanyAddress", required = true)
    protected AddressType companyAddress;
    @XmlElement(name = "CompanyUID-BFS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String companyUIDBFS;
    @XmlElement(name = "QualityLevel")
    protected int qualityLevel;
    @XmlElement(name = "InstitutionContactPerson", required = true)
    protected ContactPersonType institutionContactPerson;
    @XmlElement(name = "Delegate")
    protected List<DelegateType> delegate;

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
     * Recupera il valore della proprietà companyAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Imposta il valore della proprietà companyAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setCompanyAddress(AddressType value) {
        this.companyAddress = value;
    }

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
     * Recupera il valore della proprietà qualityLevel.
     * 
     */
    public int getQualityLevel() {
        return qualityLevel;
    }

    /**
     * Imposta il valore della proprietà qualityLevel.
     * 
     */
    public void setQualityLevel(int value) {
        this.qualityLevel = value;
    }

    /**
     * Recupera il valore della proprietà institutionContactPerson.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getInstitutionContactPerson() {
        return institutionContactPerson;
    }

    /**
     * Imposta il valore della proprietà institutionContactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setInstitutionContactPerson(ContactPersonType value) {
        this.institutionContactPerson = value;
    }

    /**
     * Gets the value of the delegate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delegate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelegate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelegateType }
     * 
     * 
     */
    public List<DelegateType> getDelegate() {
        if (delegate == null) {
            delegate = new ArrayList<DelegateType>();
        }
        return this.delegate;
    }

}
