
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per AgreementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AgreementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OtherInsurancePredefined" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}OtherInsurancePredefinedType"/&gt;
 *         &lt;element name="OtherInsurance" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="NoOtherInsurance" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementType", propOrder = {
    "otherInsurancePredefined",
    "otherInsurance",
    "noOtherInsurance"
})
public class AgreementType
    extends StoryBaseType
{

    @XmlElement(name = "OtherInsurancePredefined")
    @XmlSchemaType(name = "NMTOKEN")
    protected OtherInsurancePredefinedType otherInsurancePredefined;
    @XmlElement(name = "OtherInsurance")
    protected String otherInsurance;
    @XmlElement(name = "NoOtherInsurance")
    protected EmptyType noOtherInsurance;

    /**
     * Recupera il valore della proprietà otherInsurancePredefined.
     * 
     * @return
     *     possible object is
     *     {@link OtherInsurancePredefinedType }
     *     
     */
    public OtherInsurancePredefinedType getOtherInsurancePredefined() {
        return otherInsurancePredefined;
    }

    /**
     * Imposta il valore della proprietà otherInsurancePredefined.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherInsurancePredefinedType }
     *     
     */
    public void setOtherInsurancePredefined(OtherInsurancePredefinedType value) {
        this.otherInsurancePredefined = value;
    }

    /**
     * Recupera il valore della proprietà otherInsurance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInsurance() {
        return otherInsurance;
    }

    /**
     * Imposta il valore della proprietà otherInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInsurance(String value) {
        this.otherInsurance = value;
    }

    /**
     * Recupera il valore della proprietà noOtherInsurance.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNoOtherInsurance() {
        return noOtherInsurance;
    }

    /**
     * Imposta il valore della proprietà noOtherInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNoOtherInsurance(EmptyType value) {
        this.noOtherInsurance = value;
    }

}
