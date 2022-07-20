
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompanyIdentitiesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Old" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CompanyUIDType"/&gt;
 *         &lt;element name="New" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CompanyUIDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentitiesType", propOrder = {
    "old",
    "_new"
})
public class CompanyIdentitiesType {

    @XmlElement(name = "Old", required = true)
    protected CompanyUIDType old;
    @XmlElement(name = "New", required = true)
    protected CompanyUIDType _new;

    /**
     * Recupera il valore della proprietà old.
     * 
     * @return
     *     possible object is
     *     {@link CompanyUIDType }
     *     
     */
    public CompanyUIDType getOld() {
        return old;
    }

    /**
     * Imposta il valore della proprietà old.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyUIDType }
     *     
     */
    public void setOld(CompanyUIDType value) {
        this.old = value;
    }

    /**
     * Recupera il valore della proprietà new.
     * 
     * @return
     *     possible object is
     *     {@link CompanyUIDType }
     *     
     */
    public CompanyUIDType getNew() {
        return _new;
    }

    /**
     * Imposta il valore della proprietà new.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyUIDType }
     *     
     */
    public void setNew(CompanyUIDType value) {
        this._new = value;
    }

}
