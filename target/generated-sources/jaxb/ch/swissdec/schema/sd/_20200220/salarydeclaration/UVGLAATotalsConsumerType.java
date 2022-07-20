
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UVG-LAA-TotalsConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVG-LAA-TotalsConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVG-LAA-BranchTotals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVG-LAA-BranchTotalsType"/&gt;
 *         &lt;element name="UVG-LAA-MasterTotal" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType"/&gt;
 *         &lt;element name="NumberOfFemalePersons" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="NumberOfMalePersons" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVG-LAA-TotalsConsumerType", propOrder = {
    "uvglaaBranchTotals",
    "uvglaaMasterTotal",
    "numberOfFemalePersons",
    "numberOfMalePersons"
})
@XmlSeeAlso({
    UVGLAATotalsType.class
})
public class UVGLAATotalsConsumerType {

    @XmlElement(name = "UVG-LAA-BranchTotals", required = true)
    protected UVGLAABranchTotalsType uvglaaBranchTotals;
    @XmlElement(name = "UVG-LAA-MasterTotal", required = true)
    protected BigDecimal uvglaaMasterTotal;
    @XmlElement(name = "NumberOfFemalePersons", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfFemalePersons;
    @XmlElement(name = "NumberOfMalePersons", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfMalePersons;

    /**
     * Recupera il valore della proprietà uvglaaBranchTotals.
     * 
     * @return
     *     possible object is
     *     {@link UVGLAABranchTotalsType }
     *     
     */
    public UVGLAABranchTotalsType getUVGLAABranchTotals() {
        return uvglaaBranchTotals;
    }

    /**
     * Imposta il valore della proprietà uvglaaBranchTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGLAABranchTotalsType }
     *     
     */
    public void setUVGLAABranchTotals(UVGLAABranchTotalsType value) {
        this.uvglaaBranchTotals = value;
    }

    /**
     * Recupera il valore della proprietà uvglaaMasterTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUVGLAAMasterTotal() {
        return uvglaaMasterTotal;
    }

    /**
     * Imposta il valore della proprietà uvglaaMasterTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUVGLAAMasterTotal(BigDecimal value) {
        this.uvglaaMasterTotal = value;
    }

    /**
     * Recupera il valore della proprietà numberOfFemalePersons.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFemalePersons() {
        return numberOfFemalePersons;
    }

    /**
     * Imposta il valore della proprietà numberOfFemalePersons.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFemalePersons(BigInteger value) {
        this.numberOfFemalePersons = value;
    }

    /**
     * Recupera il valore della proprietà numberOfMalePersons.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMalePersons() {
        return numberOfMalePersons;
    }

    /**
     * Imposta il valore della proprietà numberOfMalePersons.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMalePersons(BigInteger value) {
        this.numberOfMalePersons = value;
    }

}
