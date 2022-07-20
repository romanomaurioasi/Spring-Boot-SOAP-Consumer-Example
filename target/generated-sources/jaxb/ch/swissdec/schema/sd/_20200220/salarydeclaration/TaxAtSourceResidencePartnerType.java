
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.CantonAddressType;


/**
 * <p>Classe Java per TaxAtSourceResidencePartnerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceResidencePartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CantonCH" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAddressType"/&gt;
 *         &lt;element name="AbroadCountry" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}CountryISOType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceResidencePartnerType", propOrder = {
    "cantonCH",
    "abroadCountry"
})
public class TaxAtSourceResidencePartnerType {

    @XmlElement(name = "CantonCH")
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType cantonCH;
    @XmlElement(name = "AbroadCountry")
    protected String abroadCountry;

    /**
     * Recupera il valore della proprietà cantonCH.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getCantonCH() {
        return cantonCH;
    }

    /**
     * Imposta il valore della proprietà cantonCH.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setCantonCH(CantonAddressType value) {
        this.cantonCH = value;
    }

    /**
     * Recupera il valore della proprietà abroadCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbroadCountry() {
        return abroadCountry;
    }

    /**
     * Imposta il valore della proprietà abroadCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbroadCountry(String value) {
        this.abroadCountry = value;
    }

}
