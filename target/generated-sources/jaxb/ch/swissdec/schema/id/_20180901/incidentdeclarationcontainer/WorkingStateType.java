
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:idc="http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Avancement du travail&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per WorkingStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WorkingStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Success" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}IncidentStateType"/&gt;
 *         &lt;element name="Ignored" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *         &lt;element name="Error" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ErrorResponseType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="institutionIDRef" use="required" type="{http://www.swissdec.ch/schema/common/20180901/Common}InstanceRefIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkingStateType", propOrder = {
    "success",
    "ignored",
    "error"
})
@XmlSeeAlso({
    ReducedWorkingStateType.class
})
public class WorkingStateType {

    @XmlElement(name = "Success")
    protected IncidentStateType success;
    @XmlElement(name = "Ignored")
    protected EmptyType ignored;
    @XmlElement(name = "Error")
    protected ErrorResponseType error;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà success.
     * 
     * @return
     *     possible object is
     *     {@link IncidentStateType }
     *     
     */
    public IncidentStateType getSuccess() {
        return success;
    }

    /**
     * Imposta il valore della proprietà success.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentStateType }
     *     
     */
    public void setSuccess(IncidentStateType value) {
        this.success = value;
    }

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
     * Recupera il valore della proprietà institutionIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionIDRef() {
        return institutionIDRef;
    }

    /**
     * Imposta il valore della proprietà institutionIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionIDRef(String value) {
        this.institutionIDRef = value;
    }

}
