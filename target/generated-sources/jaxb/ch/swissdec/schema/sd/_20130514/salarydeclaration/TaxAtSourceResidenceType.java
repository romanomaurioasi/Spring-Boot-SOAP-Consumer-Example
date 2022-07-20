
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceResidenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceResidenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="CantonCH" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CantonAddressType"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="AbroadCountry" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CountryISOType"/&gt;
 *           &lt;element name="KindOfResidence" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}KindOfResidenceType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceResidenceType", propOrder = {
    "cantonCH",
    "abroadCountry",
    "kindOfResidence"
})
public class TaxAtSourceResidenceType {

    @XmlElement(name = "CantonCH")
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType cantonCH;
    @XmlElement(name = "AbroadCountry")
    protected String abroadCountry;
    @XmlElement(name = "KindOfResidence")
    protected KindOfResidenceType kindOfResidence;

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

    /**
     * Recupera il valore della proprietà kindOfResidence.
     * 
     * @return
     *     possible object is
     *     {@link KindOfResidenceType }
     *     
     */
    public KindOfResidenceType getKindOfResidence() {
        return kindOfResidence;
    }

    /**
     * Imposta il valore della proprietà kindOfResidence.
     * 
     * @param value
     *     allowed object is
     *     {@link KindOfResidenceType }
     *     
     */
    public void setKindOfResidence(KindOfResidenceType value) {
        this.kindOfResidence = value;
    }

}
