
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.CantonAddressType;


/**
 * <p>Classe Java per Total-FAK-CAF-PerCantonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Total-FAK-CAF-PerCantonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Total-FAK-CAF-ContributorySalary" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="Total-FAK-CAF-FamilyIncomeSupplement" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="Canton" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Total-FAK-CAF-PerCantonType", propOrder = {
    "totalFAKCAFContributorySalary",
    "totalFAKCAFFamilyIncomeSupplement",
    "canton"
})
public class TotalFAKCAFPerCantonType {

    @XmlElement(name = "Total-FAK-CAF-ContributorySalary", required = true)
    protected BigDecimal totalFAKCAFContributorySalary;
    @XmlElement(name = "Total-FAK-CAF-FamilyIncomeSupplement", required = true)
    protected BigDecimal totalFAKCAFFamilyIncomeSupplement;
    @XmlElement(name = "Canton", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType canton;

    /**
     * Recupera il valore della proprietà totalFAKCAFContributorySalary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFAKCAFContributorySalary() {
        return totalFAKCAFContributorySalary;
    }

    /**
     * Imposta il valore della proprietà totalFAKCAFContributorySalary.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFAKCAFContributorySalary(BigDecimal value) {
        this.totalFAKCAFContributorySalary = value;
    }

    /**
     * Recupera il valore della proprietà totalFAKCAFFamilyIncomeSupplement.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFAKCAFFamilyIncomeSupplement() {
        return totalFAKCAFFamilyIncomeSupplement;
    }

    /**
     * Imposta il valore della proprietà totalFAKCAFFamilyIncomeSupplement.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFAKCAFFamilyIncomeSupplement(BigDecimal value) {
        this.totalFAKCAFFamilyIncomeSupplement = value;
    }

    /**
     * Recupera il valore della proprietà canton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getCanton() {
        return canton;
    }

    /**
     * Imposta il valore della proprietà canton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setCanton(CantonAddressType value) {
        this.canton = value;
    }

}
