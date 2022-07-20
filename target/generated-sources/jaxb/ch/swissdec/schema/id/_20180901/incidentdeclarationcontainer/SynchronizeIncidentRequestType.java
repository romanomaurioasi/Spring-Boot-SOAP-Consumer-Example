
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.id._20180901.incidentdeclaration.CompanyUIDType;
import ch.swissdec.schema.id._20180901.incidentdeclaration.IncidentStoriesRequestType;
import ch.swissdec.schema.id._20180901.incidentdeclaration.StoriesWithoutDeclarationType;


/**
 * <p>Classe Java per SynchronizeIncidentRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SynchronizeIncidentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestContext" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}RequestContextType"/&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CompanyUIDType"/&gt;
 *         &lt;element name="Institution" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}InstitutionIdentificationType"/&gt;
 *         &lt;element name="IncidentStories" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IncidentStoriesRequestType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StoriesWithoutDeclaration" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoriesWithoutDeclarationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizeIncidentRequestType", propOrder = {
    "requestContext",
    "company",
    "institution",
    "incidentStories",
    "storiesWithoutDeclaration"
})
public class SynchronizeIncidentRequestType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "Company", required = true)
    protected CompanyUIDType company;
    @XmlElement(name = "Institution", required = true)
    protected InstitutionIdentificationType institution;
    @XmlElement(name = "IncidentStories")
    protected List<IncidentStoriesRequestType> incidentStories;
    @XmlElement(name = "StoriesWithoutDeclaration")
    protected StoriesWithoutDeclarationType storiesWithoutDeclaration;

    /**
     * Recupera il valore della proprietà requestContext.
     * 
     * @return
     *     possible object is
     *     {@link RequestContextType }
     *     
     */
    public RequestContextType getRequestContext() {
        return requestContext;
    }

    /**
     * Imposta il valore della proprietà requestContext.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestContextType }
     *     
     */
    public void setRequestContext(RequestContextType value) {
        this.requestContext = value;
    }

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link CompanyUIDType }
     *     
     */
    public CompanyUIDType getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyUIDType }
     *     
     */
    public void setCompany(CompanyUIDType value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà institution.
     * 
     * @return
     *     possible object is
     *     {@link InstitutionIdentificationType }
     *     
     */
    public InstitutionIdentificationType getInstitution() {
        return institution;
    }

    /**
     * Imposta il valore della proprietà institution.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitutionIdentificationType }
     *     
     */
    public void setInstitution(InstitutionIdentificationType value) {
        this.institution = value;
    }

    /**
     * Gets the value of the incidentStories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incidentStories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncidentStories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncidentStoriesRequestType }
     * 
     * 
     */
    public List<IncidentStoriesRequestType> getIncidentStories() {
        if (incidentStories == null) {
            incidentStories = new ArrayList<IncidentStoriesRequestType>();
        }
        return this.incidentStories;
    }

    /**
     * Recupera il valore della proprietà storiesWithoutDeclaration.
     * 
     * @return
     *     possible object is
     *     {@link StoriesWithoutDeclarationType }
     *     
     */
    public StoriesWithoutDeclarationType getStoriesWithoutDeclaration() {
        return storiesWithoutDeclaration;
    }

    /**
     * Imposta il valore della proprietà storiesWithoutDeclaration.
     * 
     * @param value
     *     allowed object is
     *     {@link StoriesWithoutDeclarationType }
     *     
     */
    public void setStoriesWithoutDeclaration(StoriesWithoutDeclarationType value) {
        this.storiesWithoutDeclaration = value;
    }

}
