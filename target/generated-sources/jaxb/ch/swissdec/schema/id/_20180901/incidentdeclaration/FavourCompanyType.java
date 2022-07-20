
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FavourCompanyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FavourCompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Payment" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType"/&gt;
 *         &lt;element name="PaymentThird" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FavourCompanyType", propOrder = {
    "payment",
    "paymentThird"
})
public class FavourCompanyType {

    @XmlElement(name = "Payment", required = true)
    protected BigDecimal payment;
    @XmlElement(name = "PaymentThird")
    protected BigDecimal paymentThird;

    /**
     * Recupera il valore della proprietà payment.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * Imposta il valore della proprietà payment.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayment(BigDecimal value) {
        this.payment = value;
    }

    /**
     * Recupera il valore della proprietà paymentThird.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentThird() {
        return paymentThird;
    }

    /**
     * Imposta il valore della proprietà paymentThird.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentThird(BigDecimal value) {
        this.paymentThird = value;
    }

}
