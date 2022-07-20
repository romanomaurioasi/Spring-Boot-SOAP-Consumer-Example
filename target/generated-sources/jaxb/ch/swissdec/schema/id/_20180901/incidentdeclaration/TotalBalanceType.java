
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TotalBalanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TotalBalanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FavourCompany" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}FavourCompanyType"/&gt;
 *         &lt;element name="FavourInstitution" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}FavourInstitutionType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalBalanceType", propOrder = {
    "favourCompany",
    "favourInstitution"
})
public class TotalBalanceType {

    @XmlElement(name = "FavourCompany")
    protected FavourCompanyType favourCompany;
    @XmlElement(name = "FavourInstitution")
    protected FavourInstitutionType favourInstitution;

    /**
     * Recupera il valore della proprietà favourCompany.
     * 
     * @return
     *     possible object is
     *     {@link FavourCompanyType }
     *     
     */
    public FavourCompanyType getFavourCompany() {
        return favourCompany;
    }

    /**
     * Imposta il valore della proprietà favourCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link FavourCompanyType }
     *     
     */
    public void setFavourCompany(FavourCompanyType value) {
        this.favourCompany = value;
    }

    /**
     * Recupera il valore della proprietà favourInstitution.
     * 
     * @return
     *     possible object is
     *     {@link FavourInstitutionType }
     *     
     */
    public FavourInstitutionType getFavourInstitution() {
        return favourInstitution;
    }

    /**
     * Imposta il valore della proprietà favourInstitution.
     * 
     * @param value
     *     allowed object is
     *     {@link FavourInstitutionType }
     *     
     */
    public void setFavourInstitution(FavourInstitutionType value) {
        this.favourInstitution = value;
    }

}
