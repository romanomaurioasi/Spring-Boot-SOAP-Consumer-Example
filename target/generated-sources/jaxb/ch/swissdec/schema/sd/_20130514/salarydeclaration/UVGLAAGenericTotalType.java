
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UVG-LAA-GenericTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVG-LAA-GenericTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NBU-BU-ANP-AP-Total" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="BU-AP-Total" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVG-LAA-GenericTotalType", propOrder = {
    "nbubuanpapTotal",
    "buapTotal"
})
public class UVGLAAGenericTotalType {

    @XmlElement(name = "NBU-BU-ANP-AP-Total", required = true)
    protected BigDecimal nbubuanpapTotal;
    @XmlElement(name = "BU-AP-Total", required = true)
    protected BigDecimal buapTotal;

    /**
     * Recupera il valore della proprietà nbubuanpapTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNBUBUANPAPTotal() {
        return nbubuanpapTotal;
    }

    /**
     * Imposta il valore della proprietà nbubuanpapTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNBUBUANPAPTotal(BigDecimal value) {
        this.nbubuanpapTotal = value;
    }

    /**
     * Recupera il valore della proprietà buapTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBUAPTotal() {
        return buapTotal;
    }

    /**
     * Imposta il valore della proprietà buapTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBUAPTotal(BigDecimal value) {
        this.buapTotal = value;
    }

}
