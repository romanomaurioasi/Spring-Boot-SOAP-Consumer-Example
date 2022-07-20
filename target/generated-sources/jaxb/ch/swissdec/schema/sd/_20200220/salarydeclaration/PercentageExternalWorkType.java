
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PercentageExternalWorkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PercentageExternalWorkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Effective" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType"/&gt;
 *         &lt;element name="Lump" type="{http://www.swissdec.ch/schema/common/20200220/Common}PercentType"/&gt;
 *         &lt;element name="Ruling" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}RulingType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageExternalWorkType", propOrder = {
    "effective",
    "lump",
    "ruling"
})
public class PercentageExternalWorkType {

    @XmlElement(name = "Effective")
    protected BigDecimal effective;
    @XmlElement(name = "Lump")
    protected BigDecimal lump;
    @XmlElement(name = "Ruling")
    protected RulingType ruling;

    /**
     * Recupera il valore della proprietà effective.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEffective() {
        return effective;
    }

    /**
     * Imposta il valore della proprietà effective.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEffective(BigDecimal value) {
        this.effective = value;
    }

    /**
     * Recupera il valore della proprietà lump.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLump() {
        return lump;
    }

    /**
     * Imposta il valore della proprietà lump.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLump(BigDecimal value) {
        this.lump = value;
    }

    /**
     * Recupera il valore della proprietà ruling.
     * 
     * @return
     *     possible object is
     *     {@link RulingType }
     *     
     */
    public RulingType getRuling() {
        return ruling;
    }

    /**
     * Imposta il valore della proprietà ruling.
     * 
     * @param value
     *     allowed object is
     *     {@link RulingType }
     *     
     */
    public void setRuling(RulingType value) {
        this.ruling = value;
    }

}
