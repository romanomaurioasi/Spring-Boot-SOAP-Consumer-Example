
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FavourInstitutionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FavourInstitutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Repayment" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType"/&gt;
 *         &lt;element name="RepaymentThird" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FavourInstitutionType", propOrder = {
    "repayment",
    "repaymentThird"
})
public class FavourInstitutionType {

    @XmlElement(name = "Repayment", required = true)
    protected BigDecimal repayment;
    @XmlElement(name = "RepaymentThird")
    protected BigDecimal repaymentThird;

    /**
     * Recupera il valore della proprietà repayment.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepayment() {
        return repayment;
    }

    /**
     * Imposta il valore della proprietà repayment.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepayment(BigDecimal value) {
        this.repayment = value;
    }

    /**
     * Recupera il valore della proprietà repaymentThird.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaymentThird() {
        return repaymentThird;
    }

    /**
     * Imposta il valore della proprietà repaymentThird.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaymentThird(BigDecimal value) {
        this.repaymentThird = value;
    }

}
