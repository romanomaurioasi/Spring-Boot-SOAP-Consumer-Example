
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ChangeIdentitiesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ChangeIdentitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidAsOf" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CompanyIdentitiesType" minOccurs="0"/&gt;
 *         &lt;element name="Institution" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}InstitutionIdentitiesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeIdentitiesType", propOrder = {
    "validAsOf",
    "company",
    "institution"
})
public class ChangeIdentitiesType {

    @XmlElement(name = "ValidAsOf", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validAsOf;
    @XmlElement(name = "Company")
    protected CompanyIdentitiesType company;
    @XmlElement(name = "Institution")
    protected InstitutionIdentitiesType institution;

    /**
     * Recupera il valore della proprietà validAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidAsOf() {
        return validAsOf;
    }

    /**
     * Imposta il valore della proprietà validAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidAsOf(XMLGregorianCalendar value) {
        this.validAsOf = value;
    }

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentitiesType }
     *     
     */
    public CompanyIdentitiesType getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentitiesType }
     *     
     */
    public void setCompany(CompanyIdentitiesType value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà institution.
     * 
     * @return
     *     possible object is
     *     {@link InstitutionIdentitiesType }
     *     
     */
    public InstitutionIdentitiesType getInstitution() {
        return institution;
    }

    /**
     * Imposta il valore della proprietà institution.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitutionIdentitiesType }
     *     
     */
    public void setInstitution(InstitutionIdentitiesType value) {
        this.institution = value;
    }

}
