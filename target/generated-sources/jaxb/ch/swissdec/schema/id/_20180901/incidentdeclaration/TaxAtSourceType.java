
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.CantonAddressType;
import ch.swissdec.schema.common._20180901.common.TaxAtSourceCategoryType;


/**
 * <p>Classe Java per TaxAtSourceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxAtSourceCanton" type="{http://www.swissdec.ch/schema/common/20180901/Common}CantonAddressType"/&gt;
 *         &lt;element name="TaxAtSourceMunicipalityID" type="{http://www.swissdec.ch/schema/common/20180901/Common}MunicipalityIDType"/&gt;
 *         &lt;element name="TaxAtSourceCategory" type="{http://www.swissdec.ch/schema/common/20180901/Common}TaxAtSourceCategoryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceType", propOrder = {
    "taxAtSourceCanton",
    "taxAtSourceMunicipalityID",
    "taxAtSourceCategory"
})
public class TaxAtSourceType {

    @XmlElement(name = "TaxAtSourceCanton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType taxAtSourceCanton;
    @XmlElement(name = "TaxAtSourceMunicipalityID")
    protected int taxAtSourceMunicipalityID;
    @XmlElement(name = "TaxAtSourceCategory", required = true)
    protected TaxAtSourceCategoryType taxAtSourceCategory;

    /**
     * Recupera il valore della proprietà taxAtSourceCanton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getTaxAtSourceCanton() {
        return taxAtSourceCanton;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setTaxAtSourceCanton(CantonAddressType value) {
        this.taxAtSourceCanton = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceMunicipalityID.
     * 
     */
    public int getTaxAtSourceMunicipalityID() {
        return taxAtSourceMunicipalityID;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceMunicipalityID.
     * 
     */
    public void setTaxAtSourceMunicipalityID(int value) {
        this.taxAtSourceMunicipalityID = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceCategory.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCategoryType }
     *     
     */
    public TaxAtSourceCategoryType getTaxAtSourceCategory() {
        return taxAtSourceCategory;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCategoryType }
     *     
     */
    public void setTaxAtSourceCategory(TaxAtSourceCategoryType value) {
        this.taxAtSourceCategory = value;
    }

}
