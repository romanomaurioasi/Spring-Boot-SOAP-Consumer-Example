
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatisticType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayAgreement" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}PayAgreementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticType", propOrder = {
    "payAgreement"
})
public class StatisticType {

    @XmlElement(name = "PayAgreement", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected PayAgreementType payAgreement;

    /**
     * Recupera il valore della proprietà payAgreement.
     * 
     * @return
     *     possible object is
     *     {@link PayAgreementType }
     *     
     */
    public PayAgreementType getPayAgreement() {
        return payAgreement;
    }

    /**
     * Imposta il valore della proprietà payAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link PayAgreementType }
     *     
     */
    public void setPayAgreement(PayAgreementType value) {
        this.payAgreement = value;
    }

}
