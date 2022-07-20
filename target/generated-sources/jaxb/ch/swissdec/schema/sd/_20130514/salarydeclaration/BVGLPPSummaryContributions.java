
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-SummaryContributions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-SummaryContributions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identical" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="ManualMutationRequiredFrom" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="AutomaticMutationPossibleFrom" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="AutomaticMutationProcessedFrom" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="MappedFrom" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Unknown" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Missing" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-SummaryContributions", propOrder = {
    "identical",
    "manualMutationRequiredFrom",
    "automaticMutationPossibleFrom",
    "automaticMutationProcessedFrom",
    "mappedFrom",
    "unknown",
    "missing"
})
public class BVGLPPSummaryContributions {

    @XmlElement(name = "Identical")
    @XmlSchemaType(name = "unsignedInt")
    protected long identical;
    @XmlElement(name = "ManualMutationRequiredFrom")
    @XmlSchemaType(name = "unsignedInt")
    protected long manualMutationRequiredFrom;
    @XmlElement(name = "AutomaticMutationPossibleFrom")
    @XmlSchemaType(name = "unsignedInt")
    protected long automaticMutationPossibleFrom;
    @XmlElement(name = "AutomaticMutationProcessedFrom")
    @XmlSchemaType(name = "unsignedInt")
    protected long automaticMutationProcessedFrom;
    @XmlElement(name = "MappedFrom")
    @XmlSchemaType(name = "unsignedInt")
    protected long mappedFrom;
    @XmlElement(name = "Unknown")
    @XmlSchemaType(name = "unsignedInt")
    protected long unknown;
    @XmlElement(name = "Missing")
    @XmlSchemaType(name = "unsignedInt")
    protected long missing;

    /**
     * Recupera il valore della proprietà identical.
     * 
     */
    public long getIdentical() {
        return identical;
    }

    /**
     * Imposta il valore della proprietà identical.
     * 
     */
    public void setIdentical(long value) {
        this.identical = value;
    }

    /**
     * Recupera il valore della proprietà manualMutationRequiredFrom.
     * 
     */
    public long getManualMutationRequiredFrom() {
        return manualMutationRequiredFrom;
    }

    /**
     * Imposta il valore della proprietà manualMutationRequiredFrom.
     * 
     */
    public void setManualMutationRequiredFrom(long value) {
        this.manualMutationRequiredFrom = value;
    }

    /**
     * Recupera il valore della proprietà automaticMutationPossibleFrom.
     * 
     */
    public long getAutomaticMutationPossibleFrom() {
        return automaticMutationPossibleFrom;
    }

    /**
     * Imposta il valore della proprietà automaticMutationPossibleFrom.
     * 
     */
    public void setAutomaticMutationPossibleFrom(long value) {
        this.automaticMutationPossibleFrom = value;
    }

    /**
     * Recupera il valore della proprietà automaticMutationProcessedFrom.
     * 
     */
    public long getAutomaticMutationProcessedFrom() {
        return automaticMutationProcessedFrom;
    }

    /**
     * Imposta il valore della proprietà automaticMutationProcessedFrom.
     * 
     */
    public void setAutomaticMutationProcessedFrom(long value) {
        this.automaticMutationProcessedFrom = value;
    }

    /**
     * Recupera il valore della proprietà mappedFrom.
     * 
     */
    public long getMappedFrom() {
        return mappedFrom;
    }

    /**
     * Imposta il valore della proprietà mappedFrom.
     * 
     */
    public void setMappedFrom(long value) {
        this.mappedFrom = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     */
    public long getUnknown() {
        return unknown;
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     */
    public void setUnknown(long value) {
        this.unknown = value;
    }

    /**
     * Recupera il valore della proprietà missing.
     * 
     */
    public long getMissing() {
        return missing;
    }

    /**
     * Imposta il valore della proprietà missing.
     * 
     */
    public void setMissing(long value) {
        this.missing = value;
    }

}
