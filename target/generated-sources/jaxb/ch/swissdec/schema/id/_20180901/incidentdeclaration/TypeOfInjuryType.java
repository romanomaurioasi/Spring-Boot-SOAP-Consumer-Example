
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TypeOfInjuryType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfInjuryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="bite_01"/&gt;
 *     &lt;enumeration value="fracture_02"/&gt;
 *     &lt;enumeration value="inflammation_03"/&gt;
 *     &lt;enumeration value="contusion_04"/&gt;
 *     &lt;enumeration value="bruise_05"/&gt;
 *     &lt;enumeration value="chap_06"/&gt;
 *     &lt;enumeration value="cut_07"/&gt;
 *     &lt;enumeration value="shot_08"/&gt;
 *     &lt;enumeration value="swelling_09"/&gt;
 *     &lt;enumeration value="graze_10"/&gt;
 *     &lt;enumeration value="compressionSpine_11"/&gt;
 *     &lt;enumeration value="sting_12"/&gt;
 *     &lt;enumeration value="tearFissure_13"/&gt;
 *     &lt;enumeration value="burn_14"/&gt;
 *     &lt;enumeration value="sprainTwist_15"/&gt;
 *     &lt;enumeration value="poisoning_16"/&gt;
 *     &lt;enumeration value="causticity_17"/&gt;
 *     &lt;enumeration value="pulledMuscleLigament_18"/&gt;
 *     &lt;enumeration value="foreignObject_20"/&gt;
 *     &lt;enumeration value="dislocation_21"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfInjuryType")
@XmlEnum
public enum TypeOfInjuryType {

    @XmlEnumValue("bite_01")
    BITE_01("bite_01"),
    @XmlEnumValue("fracture_02")
    FRACTURE_02("fracture_02"),
    @XmlEnumValue("inflammation_03")
    INFLAMMATION_03("inflammation_03"),
    @XmlEnumValue("contusion_04")
    CONTUSION_04("contusion_04"),
    @XmlEnumValue("bruise_05")
    BRUISE_05("bruise_05"),
    @XmlEnumValue("chap_06")
    CHAP_06("chap_06"),
    @XmlEnumValue("cut_07")
    CUT_07("cut_07"),
    @XmlEnumValue("shot_08")
    SHOT_08("shot_08"),
    @XmlEnumValue("swelling_09")
    SWELLING_09("swelling_09"),
    @XmlEnumValue("graze_10")
    GRAZE_10("graze_10"),
    @XmlEnumValue("compressionSpine_11")
    COMPRESSION_SPINE_11("compressionSpine_11"),
    @XmlEnumValue("sting_12")
    STING_12("sting_12"),
    @XmlEnumValue("tearFissure_13")
    TEAR_FISSURE_13("tearFissure_13"),
    @XmlEnumValue("burn_14")
    BURN_14("burn_14"),
    @XmlEnumValue("sprainTwist_15")
    SPRAIN_TWIST_15("sprainTwist_15"),
    @XmlEnumValue("poisoning_16")
    POISONING_16("poisoning_16"),
    @XmlEnumValue("causticity_17")
    CAUSTICITY_17("causticity_17"),
    @XmlEnumValue("pulledMuscleLigament_18")
    PULLED_MUSCLE_LIGAMENT_18("pulledMuscleLigament_18"),
    @XmlEnumValue("foreignObject_20")
    FOREIGN_OBJECT_20("foreignObject_20"),
    @XmlEnumValue("dislocation_21")
    DISLOCATION_21("dislocation_21");
    private final String value;

    TypeOfInjuryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfInjuryType fromValue(String v) {
        for (TypeOfInjuryType c: TypeOfInjuryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
