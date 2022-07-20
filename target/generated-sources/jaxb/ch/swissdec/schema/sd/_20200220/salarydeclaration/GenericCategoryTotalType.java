
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per GenericCategoryTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GenericCategoryTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryCode" type="{http://www.swissdec.ch/schema/common/20200220/Common}AssuranceCategoryCodeType"/&gt;
 *         &lt;element name="Female-Total" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="Male-Total" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericCategoryTotalType", propOrder = {
    "categoryCode",
    "femaleTotal",
    "maleTotal"
})
public class GenericCategoryTotalType {

    @XmlElement(name = "CategoryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String categoryCode;
    @XmlElement(name = "Female-Total", required = true)
    protected BigDecimal femaleTotal;
    @XmlElement(name = "Male-Total", required = true)
    protected BigDecimal maleTotal;

    /**
     * Recupera il valore della proprietà categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Imposta il valore della proprietà categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Recupera il valore della proprietà femaleTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFemaleTotal() {
        return femaleTotal;
    }

    /**
     * Imposta il valore della proprietà femaleTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFemaleTotal(BigDecimal value) {
        this.femaleTotal = value;
    }

    /**
     * Recupera il valore della proprietà maleTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaleTotal() {
        return maleTotal;
    }

    /**
     * Imposta il valore della proprietà maleTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaleTotal(BigDecimal value) {
        this.maleTotal = value;
    }

}
