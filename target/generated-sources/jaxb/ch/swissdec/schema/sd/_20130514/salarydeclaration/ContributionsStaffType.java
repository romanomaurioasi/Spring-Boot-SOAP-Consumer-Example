
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ContributionsStaffType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContributionsStaffType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identified" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ContributionsPersonsType" minOccurs="0"/&gt;
 *         &lt;element name="Unknown" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ContributionsPersonsType" minOccurs="0"/&gt;
 *         &lt;element name="Missing" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ContributionsPersonsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContributionsStaffType", propOrder = {
    "identified",
    "unknown",
    "missing"
})
public class ContributionsStaffType {

    @XmlElement(name = "Identified")
    protected ContributionsPersonsType identified;
    @XmlElement(name = "Unknown")
    protected ContributionsPersonsType unknown;
    @XmlElement(name = "Missing")
    protected ContributionsPersonsType missing;

    /**
     * Recupera il valore della proprietà identified.
     * 
     * @return
     *     possible object is
     *     {@link ContributionsPersonsType }
     *     
     */
    public ContributionsPersonsType getIdentified() {
        return identified;
    }

    /**
     * Imposta il valore della proprietà identified.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionsPersonsType }
     *     
     */
    public void setIdentified(ContributionsPersonsType value) {
        this.identified = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     * @return
     *     possible object is
     *     {@link ContributionsPersonsType }
     *     
     */
    public ContributionsPersonsType getUnknown() {
        return unknown;
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionsPersonsType }
     *     
     */
    public void setUnknown(ContributionsPersonsType value) {
        this.unknown = value;
    }

    /**
     * Recupera il valore della proprietà missing.
     * 
     * @return
     *     possible object is
     *     {@link ContributionsPersonsType }
     *     
     */
    public ContributionsPersonsType getMissing() {
        return missing;
    }

    /**
     * Imposta il valore della proprietà missing.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionsPersonsType }
     *     
     */
    public void setMissing(ContributionsPersonsType value) {
        this.missing = value;
    }

}
