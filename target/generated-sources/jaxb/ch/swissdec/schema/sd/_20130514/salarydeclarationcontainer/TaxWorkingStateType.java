
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.CantonAndEXType;


/**
 * Avancement du travail
 * 
 * <p>Classe Java per TaxWorkingStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxWorkingStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateGroup"/&gt;
 *         &lt;element name="Success" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}TaxStateSuccessType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="canton" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CantonAndEXType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxWorkingStateType", propOrder = {
    "ignored",
    "processing",
    "error",
    "success"
})
@XmlSeeAlso({
    TaxWorkingStateConsumerType.class
})
public class TaxWorkingStateType {

    @XmlElement(name = "Ignored")
    protected EmptyType ignored;
    @XmlElement(name = "Processing")
    protected EmptyType processing;
    @XmlElement(name = "Error")
    protected ErrorResponseType error;
    @XmlElement(name = "Success")
    protected TaxStateSuccessType success;
    @XmlAttribute(name = "canton", required = true)
    protected CantonAndEXType canton;

    /**
     * Recupera il valore della proprietà ignored.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getIgnored() {
        return ignored;
    }

    /**
     * Imposta il valore della proprietà ignored.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setIgnored(EmptyType value) {
        this.ignored = value;
    }

    /**
     * Recupera il valore della proprietà processing.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getProcessing() {
        return processing;
    }

    /**
     * Imposta il valore della proprietà processing.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setProcessing(EmptyType value) {
        this.processing = value;
    }

    /**
     * Recupera il valore della proprietà error.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponseType }
     *     
     */
    public ErrorResponseType getError() {
        return error;
    }

    /**
     * Imposta il valore della proprietà error.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponseType }
     *     
     */
    public void setError(ErrorResponseType value) {
        this.error = value;
    }

    /**
     * Recupera il valore della proprietà success.
     * 
     * @return
     *     possible object is
     *     {@link TaxStateSuccessType }
     *     
     */
    public TaxStateSuccessType getSuccess() {
        return success;
    }

    /**
     * Imposta il valore della proprietà success.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxStateSuccessType }
     *     
     */
    public void setSuccess(TaxStateSuccessType value) {
        this.success = value;
    }

    /**
     * Recupera il valore della proprietà canton.
     * 
     * @return
     *     possible object is
     *     {@link CantonAndEXType }
     *     
     */
    public CantonAndEXType getCanton() {
        return canton;
    }

    /**
     * Imposta il valore della proprietà canton.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAndEXType }
     *     
     */
    public void setCanton(CantonAndEXType value) {
        this.canton = value;
    }

}
