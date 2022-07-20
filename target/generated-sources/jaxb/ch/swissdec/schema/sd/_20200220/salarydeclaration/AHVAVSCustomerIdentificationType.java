
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AHV-AVS-CustomerIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-CustomerIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-CustomerIdentificationNormalType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVG-LAA-Insurance" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}InsuranceControlType"/&gt;
 *         &lt;element name="BVG-LPP-Insurance" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}InsuranceControlType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-CustomerIdentificationType", propOrder = {
    "uvglaaInsurance",
    "bvglppInsurance"
})
public class AHVAVSCustomerIdentificationType
    extends AHVAVSCustomerIdentificationNormalType
{

    @XmlElement(name = "UVG-LAA-Insurance", required = true)
    protected InsuranceControlType uvglaaInsurance;
    @XmlElement(name = "BVG-LPP-Insurance", required = true)
    protected InsuranceControlType bvglppInsurance;

    /**
     * Recupera il valore della proprietà uvglaaInsurance.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceControlType }
     *     
     */
    public InsuranceControlType getUVGLAAInsurance() {
        return uvglaaInsurance;
    }

    /**
     * Imposta il valore della proprietà uvglaaInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceControlType }
     *     
     */
    public void setUVGLAAInsurance(InsuranceControlType value) {
        this.uvglaaInsurance = value;
    }

    /**
     * Recupera il valore della proprietà bvglppInsurance.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceControlType }
     *     
     */
    public InsuranceControlType getBVGLPPInsurance() {
        return bvglppInsurance;
    }

    /**
     * Imposta il valore della proprietà bvglppInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceControlType }
     *     
     */
    public void setBVGLPPInsurance(InsuranceControlType value) {
        this.bvglppInsurance = value;
    }

}
