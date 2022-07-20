
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.CompanyDescriptionType;


/**
 * <p>Classe Java per CompanyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyDescription" type="{http://www.swissdec.ch/schema/common/20180901/Common}CompanyDescriptionType"/&gt;
 *         &lt;element name="Staff" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PersonsType"/&gt;
 *         &lt;element name="Institutions" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CustomerIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyType", propOrder = {
    "companyDescription",
    "staff",
    "institutions"
})
public class CompanyType {

    @XmlElement(name = "CompanyDescription", required = true)
    protected CompanyDescriptionType companyDescription;
    @XmlElement(name = "Staff", required = true)
    protected PersonsType staff;
    @XmlElement(name = "Institutions", required = true)
    protected CustomerIdentificationType institutions;

    /**
     * Recupera il valore della proprietà companyDescription.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDescriptionType }
     *     
     */
    public CompanyDescriptionType getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Imposta il valore della proprietà companyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDescriptionType }
     *     
     */
    public void setCompanyDescription(CompanyDescriptionType value) {
        this.companyDescription = value;
    }

    /**
     * Recupera il valore della proprietà staff.
     * 
     * @return
     *     possible object is
     *     {@link PersonsType }
     *     
     */
    public PersonsType getStaff() {
        return staff;
    }

    /**
     * Imposta il valore della proprietà staff.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonsType }
     *     
     */
    public void setStaff(PersonsType value) {
        this.staff = value;
    }

    /**
     * Recupera il valore della proprietà institutions.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public CustomerIdentificationType getInstitutions() {
        return institutions;
    }

    /**
     * Imposta il valore della proprietà institutions.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public void setInstitutions(CustomerIdentificationType value) {
        this.institutions = value;
    }

}
