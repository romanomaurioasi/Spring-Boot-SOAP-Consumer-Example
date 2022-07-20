
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BodyPartType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BodyPartType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="abdomen_459"/&gt;
 *     &lt;enumeration value="bladder_669"/&gt;
 *     &lt;enumeration value="thoracicSpine_259"/&gt;
 *     &lt;enumeration value="entireBodySystemicEffect_819"/&gt;
 *     &lt;enumeration value="genitals_449"/&gt;
 *     &lt;enumeration value="neck_209"/&gt;
 *     &lt;enumeration value="cervicalSpine_249"/&gt;
 *     &lt;enumeration value="heart_619"/&gt;
 *     &lt;enumeration value="otherInternalInjuries_609"/&gt;
 *     &lt;enumeration value="liver_639"/&gt;
 *     &lt;enumeration value="lumbarSpine_269"/&gt;
 *     &lt;enumeration value="spleen_649"/&gt;
 *     &lt;enumeration value="nose_139"/&gt;
 *     &lt;enumeration value="multipleInjuries_709"/&gt;
 *     &lt;enumeration value="skullBrain_109"/&gt;
 *     &lt;enumeration value="shockPsych_809"/&gt;
 *     &lt;enumeration value="coccyxButtocks_429"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BodyPartType")
@XmlEnum
public enum BodyPartType {

    @XmlEnumValue("abdomen_459")
    ABDOMEN_459("abdomen_459"),
    @XmlEnumValue("bladder_669")
    BLADDER_669("bladder_669"),
    @XmlEnumValue("thoracicSpine_259")
    THORACIC_SPINE_259("thoracicSpine_259"),
    @XmlEnumValue("entireBodySystemicEffect_819")
    ENTIRE_BODY_SYSTEMIC_EFFECT_819("entireBodySystemicEffect_819"),
    @XmlEnumValue("genitals_449")
    GENITALS_449("genitals_449"),
    @XmlEnumValue("neck_209")
    NECK_209("neck_209"),
    @XmlEnumValue("cervicalSpine_249")
    CERVICAL_SPINE_249("cervicalSpine_249"),
    @XmlEnumValue("heart_619")
    HEART_619("heart_619"),
    @XmlEnumValue("otherInternalInjuries_609")
    OTHER_INTERNAL_INJURIES_609("otherInternalInjuries_609"),
    @XmlEnumValue("liver_639")
    LIVER_639("liver_639"),
    @XmlEnumValue("lumbarSpine_269")
    LUMBAR_SPINE_269("lumbarSpine_269"),
    @XmlEnumValue("spleen_649")
    SPLEEN_649("spleen_649"),
    @XmlEnumValue("nose_139")
    NOSE_139("nose_139"),
    @XmlEnumValue("multipleInjuries_709")
    MULTIPLE_INJURIES_709("multipleInjuries_709"),
    @XmlEnumValue("skullBrain_109")
    SKULL_BRAIN_109("skullBrain_109"),
    @XmlEnumValue("shockPsych_809")
    SHOCK_PSYCH_809("shockPsych_809"),
    @XmlEnumValue("coccyxButtocks_429")
    COCCYX_BUTTOCKS_429("coccyxButtocks_429");
    private final String value;

    BodyPartType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BodyPartType fromValue(String v) {
        for (BodyPartType c: BodyPartType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
