
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.BVGLPPCustomerIdentificationMultiType;


/**
 * <p>Classe Java per BVG-LPP-MinimalResultStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-MinimalResultStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResultStateBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Institution" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-CustomerIdentificationMultiType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-MinimalResultStateType", propOrder = {
    "institution"
})
@XmlSeeAlso({
    BVGLPPProcessingType.class,
    BVGLPPSuccessType.class,
    BVGLPPSuccessDialogType.class
})
public class BVGLPPMinimalResultStateType
    extends ResultStateBaseType
{

    @XmlElement(name = "Institution", required = true)
    protected BVGLPPCustomerIdentificationMultiType institution;

    /**
     * Recupera il valore della proprietà institution.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPCustomerIdentificationMultiType }
     *     
     */
    public BVGLPPCustomerIdentificationMultiType getInstitution() {
        return institution;
    }

    /**
     * Imposta il valore della proprietà institution.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPCustomerIdentificationMultiType }
     *     
     */
    public void setInstitution(BVGLPPCustomerIdentificationMultiType value) {
        this.institution = value;
    }

}
