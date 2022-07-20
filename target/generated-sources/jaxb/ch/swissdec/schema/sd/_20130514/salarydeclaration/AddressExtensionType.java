
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AddressExtensionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddressExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AddressType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Canton" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CantonAddressType" minOccurs="0"/&gt;
 *         &lt;element name="MunicipalityID" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}MunicipalityIDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressExtensionType", propOrder = {
    "canton",
    "municipalityID"
})
public class AddressExtensionType
    extends AddressType
{

    @XmlElement(name = "Canton")
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType canton;
    @XmlElement(name = "MunicipalityID")
    protected Integer municipalityID;

    /**
     * Recupera il valore della proprietà canton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getCanton() {
        return canton;
    }

    /**
     * Imposta il valore della proprietà canton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setCanton(CantonAddressType value) {
        this.canton = value;
    }

    /**
     * Recupera il valore della proprietà municipalityID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMunicipalityID() {
        return municipalityID;
    }

    /**
     * Imposta il valore della proprietà municipalityID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMunicipalityID(Integer value) {
        this.municipalityID = value;
    }

}
