
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EffectiveType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EffectiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelFoodAccommodation" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Other" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SortSumOptionalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveType", propOrder = {
    "travelFoodAccommodation",
    "other"
})
public class EffectiveType {

    @XmlElement(name = "TravelFoodAccommodation")
    protected BigDecimal travelFoodAccommodation;
    @XmlElement(name = "Other")
    protected SortSumOptionalType other;

    /**
     * Recupera il valore della proprietà travelFoodAccommodation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTravelFoodAccommodation() {
        return travelFoodAccommodation;
    }

    /**
     * Imposta il valore della proprietà travelFoodAccommodation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTravelFoodAccommodation(BigDecimal value) {
        this.travelFoodAccommodation = value;
    }

    /**
     * Recupera il valore della proprietà other.
     * 
     * @return
     *     possible object is
     *     {@link SortSumOptionalType }
     *     
     */
    public SortSumOptionalType getOther() {
        return other;
    }

    /**
     * Imposta il valore della proprietà other.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumOptionalType }
     *     
     */
    public void setOther(SortSumOptionalType value) {
        this.other = value;
    }

}
