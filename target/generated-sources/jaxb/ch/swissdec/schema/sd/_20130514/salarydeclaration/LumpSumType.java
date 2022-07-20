
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LumpSumType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LumpSumType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Representation" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Car" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Other" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SortSumType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LumpSumType", propOrder = {
    "representation",
    "car",
    "other"
})
public class LumpSumType {

    @XmlElement(name = "Representation")
    protected BigDecimal representation;
    @XmlElement(name = "Car")
    protected BigDecimal car;
    @XmlElement(name = "Other")
    protected SortSumType other;

    /**
     * Recupera il valore della proprietà representation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepresentation() {
        return representation;
    }

    /**
     * Imposta il valore della proprietà representation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepresentation(BigDecimal value) {
        this.representation = value;
    }

    /**
     * Recupera il valore della proprietà car.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCar() {
        return car;
    }

    /**
     * Imposta il valore della proprietà car.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCar(BigDecimal value) {
        this.car = value;
    }

    /**
     * Recupera il valore della proprietà other.
     * 
     * @return
     *     possible object is
     *     {@link SortSumType }
     *     
     */
    public SortSumType getOther() {
        return other;
    }

    /**
     * Imposta il valore della proprietà other.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSumType }
     *     
     */
    public void setOther(SortSumType value) {
        this.other = value;
    }

}
