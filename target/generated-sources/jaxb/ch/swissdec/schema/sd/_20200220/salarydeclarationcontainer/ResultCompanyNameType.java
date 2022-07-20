
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.CompanyNameType;
import ch.swissdec.schema.common._20200220.common.CompanyOwnerType;
import ch.swissdec.schema.common._20200220.common.UIDBFSUnknownType;


/**
 * <p>Classe Java per ResultCompanyNameType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResultCompanyNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyOwnerType" minOccurs="0"/&gt;
 *         &lt;element name="UID-BFS" type="{http://www.swissdec.ch/schema/common/20200220/Common}UID-BFS-UnknownType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultCompanyNameType", propOrder = {
    "name",
    "owner",
    "uidbfs"
})
public class ResultCompanyNameType {

    @XmlElement(name = "Name")
    protected CompanyNameType name;
    @XmlElement(name = "Owner")
    protected CompanyOwnerType owner;
    @XmlElement(name = "UID-BFS")
    protected UIDBFSUnknownType uidbfs;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setName(CompanyNameType value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà owner.
     * 
     * @return
     *     possible object is
     *     {@link CompanyOwnerType }
     *     
     */
    public CompanyOwnerType getOwner() {
        return owner;
    }

    /**
     * Imposta il valore della proprietà owner.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyOwnerType }
     *     
     */
    public void setOwner(CompanyOwnerType value) {
        this.owner = value;
    }

    /**
     * Recupera il valore della proprietà uidbfs.
     * 
     * @return
     *     possible object is
     *     {@link UIDBFSUnknownType }
     *     
     */
    public UIDBFSUnknownType getUIDBFS() {
        return uidbfs;
    }

    /**
     * Imposta il valore della proprietà uidbfs.
     * 
     * @param value
     *     allowed object is
     *     {@link UIDBFSUnknownType }
     *     
     */
    public void setUIDBFS(UIDBFSUnknownType value) {
        this.uidbfs = value;
    }

}
