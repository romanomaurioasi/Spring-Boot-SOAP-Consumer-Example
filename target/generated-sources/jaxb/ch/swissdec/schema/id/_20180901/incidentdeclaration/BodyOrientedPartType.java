
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BodyOrientedPartType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BodyOrientedPartType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="eye_12"/&gt;
 *     &lt;enumeration value="pelvis_40"/&gt;
 *     &lt;enumeration value="elbow_32"/&gt;
 *     &lt;enumeration value="finger_36"/&gt;
 *     &lt;enumeration value="metatarsusWithoutToes_54"/&gt;
 *     &lt;enumeration value="ankle_53"/&gt;
 *     &lt;enumeration value="face_11"/&gt;
 *     &lt;enumeration value="metacarpusWithoutFingers_35"/&gt;
 *     &lt;enumeration value="wrist_34"/&gt;
 *     &lt;enumeration value="hipJoint_41"/&gt;
 *     &lt;enumeration value="jaw_16"/&gt;
 *     &lt;enumeration value="knee_51"/&gt;
 *     &lt;enumeration value="groin_43"/&gt;
 *     &lt;enumeration value="lungsInclusiveAirways_62"/&gt;
 *     &lt;enumeration value="multipleAreasUpperExtremities_37"/&gt;
 *     &lt;enumeration value="multipleAreasLowerExtremities_56"/&gt;
 *     &lt;enumeration value="kidney_65"/&gt;
 *     &lt;enumeration value="upperArm_31"/&gt;
 *     &lt;enumeration value="thigh_50"/&gt;
 *     &lt;enumeration value="earHearing_14"/&gt;
 *     &lt;enumeration value="rear_21"/&gt;
 *     &lt;enumeration value="shoulder_30"/&gt;
 *     &lt;enumeration value="thorax_23"/&gt;
 *     &lt;enumeration value="lowerArm_33"/&gt;
 *     &lt;enumeration value="lowerThigh_52"/&gt;
 *     &lt;enumeration value="teeth_15"/&gt;
 *     &lt;enumeration value="toes_55"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BodyOrientedPartType")
@XmlEnum
public enum BodyOrientedPartType {

    @XmlEnumValue("eye_12")
    EYE_12("eye_12"),
    @XmlEnumValue("pelvis_40")
    PELVIS_40("pelvis_40"),
    @XmlEnumValue("elbow_32")
    ELBOW_32("elbow_32"),
    @XmlEnumValue("finger_36")
    FINGER_36("finger_36"),
    @XmlEnumValue("metatarsusWithoutToes_54")
    METATARSUS_WITHOUT_TOES_54("metatarsusWithoutToes_54"),
    @XmlEnumValue("ankle_53")
    ANKLE_53("ankle_53"),
    @XmlEnumValue("face_11")
    FACE_11("face_11"),
    @XmlEnumValue("metacarpusWithoutFingers_35")
    METACARPUS_WITHOUT_FINGERS_35("metacarpusWithoutFingers_35"),
    @XmlEnumValue("wrist_34")
    WRIST_34("wrist_34"),
    @XmlEnumValue("hipJoint_41")
    HIP_JOINT_41("hipJoint_41"),
    @XmlEnumValue("jaw_16")
    JAW_16("jaw_16"),
    @XmlEnumValue("knee_51")
    KNEE_51("knee_51"),
    @XmlEnumValue("groin_43")
    GROIN_43("groin_43"),
    @XmlEnumValue("lungsInclusiveAirways_62")
    LUNGS_INCLUSIVE_AIRWAYS_62("lungsInclusiveAirways_62"),
    @XmlEnumValue("multipleAreasUpperExtremities_37")
    MULTIPLE_AREAS_UPPER_EXTREMITIES_37("multipleAreasUpperExtremities_37"),
    @XmlEnumValue("multipleAreasLowerExtremities_56")
    MULTIPLE_AREAS_LOWER_EXTREMITIES_56("multipleAreasLowerExtremities_56"),
    @XmlEnumValue("kidney_65")
    KIDNEY_65("kidney_65"),
    @XmlEnumValue("upperArm_31")
    UPPER_ARM_31("upperArm_31"),
    @XmlEnumValue("thigh_50")
    THIGH_50("thigh_50"),
    @XmlEnumValue("earHearing_14")
    EAR_HEARING_14("earHearing_14"),
    @XmlEnumValue("rear_21")
    REAR_21("rear_21"),
    @XmlEnumValue("shoulder_30")
    SHOULDER_30("shoulder_30"),
    @XmlEnumValue("thorax_23")
    THORAX_23("thorax_23"),
    @XmlEnumValue("lowerArm_33")
    LOWER_ARM_33("lowerArm_33"),
    @XmlEnumValue("lowerThigh_52")
    LOWER_THIGH_52("lowerThigh_52"),
    @XmlEnumValue("teeth_15")
    TEETH_15("teeth_15"),
    @XmlEnumValue("toes_55")
    TOES_55("toes_55");
    private final String value;

    BodyOrientedPartType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BodyOrientedPartType fromValue(String v) {
        for (BodyOrientedPartType c: BodyOrientedPartType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
