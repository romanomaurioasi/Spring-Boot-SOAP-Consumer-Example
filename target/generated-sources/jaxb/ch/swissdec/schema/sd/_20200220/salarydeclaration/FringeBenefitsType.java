
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FringeBenefitsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FringeBenefitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FoodLodging" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="CompanyCar" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Other" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SortSumType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FringeBenefitsType", propOrder = {
    "foodLodging",
    "companyCar",
    "other"
})
public class FringeBenefitsType {

    @XmlElement(name = "FoodLodging")
    protected BigDecimal foodLodging;
    @XmlElement(name = "CompanyCar")
    protected BigDecimal companyCar;
    @XmlElement(name = "Other")
    protected SortSumType other;

    /**
     * Recupera il valore della proprietà foodLodging.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFoodLodging() {
        return foodLodging;
    }

    /**
     * Imposta il valore della proprietà foodLodging.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFoodLodging(BigDecimal value) {
        this.foodLodging = value;
    }

    /**
     * Recupera il valore della proprietà companyCar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompanyCar() {
        return companyCar;
    }

    /**
     * Imposta il valore della proprietà companyCar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompanyCar(BigDecimal value) {
        this.companyCar = value;
    }

    /**
     * Recupera il valore della proprietà other.
     * 
     * @return
     *     possible object is
     *     {@link SortSumType }
     *     
     */
    public SortSumType getOther() {
        return other;
    }

    /**
     * Imposta il valore della proprietà other.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumType }
     *     
     */
    public void setOther(SortSumType value) {
        this.other = value;
    }

}
