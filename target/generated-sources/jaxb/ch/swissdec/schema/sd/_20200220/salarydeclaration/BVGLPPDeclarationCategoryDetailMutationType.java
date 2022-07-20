
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-DeclarationCategoryDetailMutationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-DeclarationCategoryDetailMutationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryDetailBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reason" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-DeclarationCategoryReasonMutationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-DeclarationCategoryDetailMutationType", propOrder = {
    "reason"
})
public class BVGLPPDeclarationCategoryDetailMutationType
    extends DeclarationCategoryDetailBaseType
{

    @XmlElement(name = "Reason", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected BVGLPPDeclarationCategoryReasonMutationType reason;

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPDeclarationCategoryReasonMutationType }
     *     
     */
    public BVGLPPDeclarationCategoryReasonMutationType getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPDeclarationCategoryReasonMutationType }
     *     
     */
    public void setReason(BVGLPPDeclarationCategoryReasonMutationType value) {
        this.reason = value;
    }

}
