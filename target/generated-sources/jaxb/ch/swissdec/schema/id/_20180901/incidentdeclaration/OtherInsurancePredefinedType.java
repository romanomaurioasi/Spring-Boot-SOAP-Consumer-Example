
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OtherInsurancePredefinedType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherInsurancePredefinedType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="suva"/&gt;
 *     &lt;enumeration value="otherCompulsoryAccidentInsurance"/&gt;
 *     &lt;enumeration value="KTG-AMC"/&gt;
 *     &lt;enumeration value="IV-AI"/&gt;
 *     &lt;enumeration value="AHV-AVS"/&gt;
 *     &lt;enumeration value="occupationalPreventionEstablishment"/&gt;
 *     &lt;enumeration value="militaryInsurance"/&gt;
 *     &lt;enumeration value="unemploymentInsurance"/&gt;
 *     &lt;enumeration value="maternetyIdemnity"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherInsurancePredefinedType")
@XmlEnum
public enum OtherInsurancePredefinedType {

    @XmlEnumValue("suva")
    SUVA("suva"),
    @XmlEnumValue("otherCompulsoryAccidentInsurance")
    OTHER_COMPULSORY_ACCIDENT_INSURANCE("otherCompulsoryAccidentInsurance"),
    @XmlEnumValue("KTG-AMC")
    KTG_AMC("KTG-AMC"),
    @XmlEnumValue("IV-AI")
    IV_AI("IV-AI"),
    @XmlEnumValue("AHV-AVS")
    AHV_AVS("AHV-AVS"),
    @XmlEnumValue("occupationalPreventionEstablishment")
    OCCUPATIONAL_PREVENTION_ESTABLISHMENT("occupationalPreventionEstablishment"),
    @XmlEnumValue("militaryInsurance")
    MILITARY_INSURANCE("militaryInsurance"),
    @XmlEnumValue("unemploymentInsurance")
    UNEMPLOYMENT_INSURANCE("unemploymentInsurance"),
    @XmlEnumValue("maternetyIdemnity")
    MATERNETY_IDEMNITY("maternetyIdemnity");
    private final String value;

    OtherInsurancePredefinedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherInsurancePredefinedType fromValue(String v) {
        for (OtherInsurancePredefinedType c: OtherInsurancePredefinedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
