
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-CodeDescriptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-CodeDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BVG-LPP-Code" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeType"/&gt;
 *         &lt;element name="Description" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-CodeDescriptionType", propOrder = {
    "bvglppCode",
    "description"
})
public class BVGLPPCodeDescriptionType {

    @XmlElement(name = "BVG-LPP-Code", required = true)
    protected String bvglppCode;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Recupera il valore della proprietà bvglppCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVGLPPCode() {
        return bvglppCode;
    }

    /**
     * Imposta il valore della proprietà bvglppCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVGLPPCode(String value) {
        this.bvglppCode = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
