
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per UVG-LAA-BranchTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVG-LAA-BranchTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BranchIdentifier" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BranchIdentifierType"/&gt;
 *         &lt;element name="Female-Totals" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}UVG-LAA-GenericTotalType"/&gt;
 *         &lt;element name="Male-Totals" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}UVG-LAA-GenericTotalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVG-LAA-BranchTotalType", propOrder = {
    "branchIdentifier",
    "femaleTotals",
    "maleTotals"
})
public class UVGLAABranchTotalType {

    @XmlElement(name = "BranchIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String branchIdentifier;
    @XmlElement(name = "Female-Totals", required = true)
    protected UVGLAAGenericTotalType femaleTotals;
    @XmlElement(name = "Male-Totals", required = true)
    protected UVGLAAGenericTotalType maleTotals;

    /**
     * Recupera il valore della proprietà branchIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdentifier() {
        return branchIdentifier;
    }

    /**
     * Imposta il valore della proprietà branchIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdentifier(String value) {
        this.branchIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà femaleTotals.
     * 
     * @return
     *     possible object is
     *     {@link UVGLAAGenericTotalType }
     *     
     */
    public UVGLAAGenericTotalType getFemaleTotals() {
        return femaleTotals;
    }

    /**
     * Imposta il valore della proprietà femaleTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGLAAGenericTotalType }
     *     
     */
    public void setFemaleTotals(UVGLAAGenericTotalType value) {
        this.femaleTotals = value;
    }

    /**
     * Recupera il valore della proprietà maleTotals.
     * 
     * @return
     *     possible object is
     *     {@link UVGLAAGenericTotalType }
     *     
     */
    public UVGLAAGenericTotalType getMaleTotals() {
        return maleTotals;
    }

    /**
     * Imposta il valore della proprietà maleTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGLAAGenericTotalType }
     *     
     */
    public void setMaleTotals(UVGLAAGenericTotalType value) {
        this.maleTotals = value;
    }

}
