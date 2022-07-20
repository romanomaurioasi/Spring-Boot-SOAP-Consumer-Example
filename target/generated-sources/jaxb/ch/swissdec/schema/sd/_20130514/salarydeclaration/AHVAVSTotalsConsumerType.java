
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AHV-AVS-TotalsConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-TotalsConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Total-AHV-AVS-Incomes" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="Total-AHV-AVS-Open" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="Total-ALV-AC-Incomes" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="Total-ALVZ-ACS-Incomes" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="Total-ALV-AC-Open" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="Total-FLG-LFA-Incomes" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-TotalsConsumerType", propOrder = {
    "totalAHVAVSIncomes",
    "totalAHVAVSOpen",
    "totalALVACIncomes",
    "totalALVZACSIncomes",
    "totalALVACOpen",
    "totalFLGLFAIncomes"
})
@XmlSeeAlso({
    AHVAVSTotalsType.class
})
public class AHVAVSTotalsConsumerType {

    @XmlElement(name = "Total-AHV-AVS-Incomes", required = true)
    protected BigDecimal totalAHVAVSIncomes;
    @XmlElement(name = "Total-AHV-AVS-Open", required = true)
    protected BigDecimal totalAHVAVSOpen;
    @XmlElement(name = "Total-ALV-AC-Incomes", required = true)
    protected BigDecimal totalALVACIncomes;
    @XmlElement(name = "Total-ALVZ-ACS-Incomes", required = true)
    protected BigDecimal totalALVZACSIncomes;
    @XmlElement(name = "Total-ALV-AC-Open", required = true)
    protected BigDecimal totalALVACOpen;
    @XmlElement(name = "Total-FLG-LFA-Incomes")
    protected BigDecimal totalFLGLFAIncomes;

    /**
     * Recupera il valore della proprietà totalAHVAVSIncomes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAHVAVSIncomes() {
        return totalAHVAVSIncomes;
    }

    /**
     * Imposta il valore della proprietà totalAHVAVSIncomes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAHVAVSIncomes(BigDecimal value) {
        this.totalAHVAVSIncomes = value;
    }

    /**
     * Recupera il valore della proprietà totalAHVAVSOpen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAHVAVSOpen() {
        return totalAHVAVSOpen;
    }

    /**
     * Imposta il valore della proprietà totalAHVAVSOpen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAHVAVSOpen(BigDecimal value) {
        this.totalAHVAVSOpen = value;
    }

    /**
     * Recupera il valore della proprietà totalALVACIncomes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalALVACIncomes() {
        return totalALVACIncomes;
    }

    /**
     * Imposta il valore della proprietà totalALVACIncomes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalALVACIncomes(BigDecimal value) {
        this.totalALVACIncomes = value;
    }

    /**
     * Recupera il valore della proprietà totalALVZACSIncomes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalALVZACSIncomes() {
        return totalALVZACSIncomes;
    }

    /**
     * Imposta il valore della proprietà totalALVZACSIncomes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalALVZACSIncomes(BigDecimal value) {
        this.totalALVZACSIncomes = value;
    }

    /**
     * Recupera il valore della proprietà totalALVACOpen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalALVACOpen() {
        return totalALVACOpen;
    }

    /**
     * Imposta il valore della proprietà totalALVACOpen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalALVACOpen(BigDecimal value) {
        this.totalALVACOpen = value;
    }

    /**
     * Recupera il valore della proprietà totalFLGLFAIncomes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFLGLFAIncomes() {
        return totalFLGLFAIncomes;
    }

    /**
     * Imposta il valore della proprietà totalFLGLFAIncomes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFLGLFAIncomes(BigDecimal value) {
        this.totalFLGLFAIncomes = value;
    }

}
