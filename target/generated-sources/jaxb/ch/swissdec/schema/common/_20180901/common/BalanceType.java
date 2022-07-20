
package ch.swissdec.schema.common._20180901.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BalanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BalanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FavourCompany" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType"/&gt;
 *         &lt;element name="FavourInstitution" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountAbsoluteType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType", propOrder = {
    "favourCompany",
    "favourInstitution"
})
public class BalanceType {

    @XmlElement(name = "FavourCompany")
    protected BigDecimal favourCompany;
    @XmlElement(name = "FavourInstitution")
    protected BigDecimal favourInstitution;

    /**
     * Recupera il valore della proprietà favourCompany.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFavourCompany() {
        return favourCompany;
    }

    /**
     * Imposta il valore della proprietà favourCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFavourCompany(BigDecimal value) {
        this.favourCompany = value;
    }

    /**
     * Recupera il valore della proprietà favourInstitution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFavourInstitution() {
        return favourInstitution;
    }

    /**
     * Imposta il valore della proprietà favourInstitution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFavourInstitution(BigDecimal value) {
        this.favourInstitution = value;
    }

}
