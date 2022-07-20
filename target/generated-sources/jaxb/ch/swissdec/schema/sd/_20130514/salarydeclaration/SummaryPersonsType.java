
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SummaryPersonsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SummaryPersonsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identified" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SummaryPersonsTotalType"/&gt;
 *         &lt;element name="Unknown" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SummaryPersonsTotalType"/&gt;
 *         &lt;element name="Missing" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SummaryPersonsTotalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryPersonsType", propOrder = {
    "identified",
    "unknown",
    "missing"
})
public class SummaryPersonsType {

    @XmlElement(name = "Identified", required = true)
    protected SummaryPersonsTotalType identified;
    @XmlElement(name = "Unknown", required = true)
    protected SummaryPersonsTotalType unknown;
    @XmlElement(name = "Missing", required = true)
    protected SummaryPersonsTotalType missing;

    /**
     * Recupera il valore della proprietà identified.
     * 
     * @return
     *     possible object is
     *     {@link SummaryPersonsTotalType }
     *     
     */
    public SummaryPersonsTotalType getIdentified() {
        return identified;
    }

    /**
     * Imposta il valore della proprietà identified.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryPersonsTotalType }
     *     
     */
    public void setIdentified(SummaryPersonsTotalType value) {
        this.identified = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     * @return
     *     possible object is
     *     {@link SummaryPersonsTotalType }
     *     
     */
    public SummaryPersonsTotalType getUnknown() {
        return unknown;
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryPersonsTotalType }
     *     
     */
    public void setUnknown(SummaryPersonsTotalType value) {
        this.unknown = value;
    }

    /**
     * Recupera il valore della proprietà missing.
     * 
     * @return
     *     possible object is
     *     {@link SummaryPersonsTotalType }
     *     
     */
    public SummaryPersonsTotalType getMissing() {
        return missing;
    }

    /**
     * Imposta il valore della proprietà missing.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryPersonsTotalType }
     *     
     */
    public void setMissing(SummaryPersonsTotalType value) {
        this.missing = value;
    }

}
