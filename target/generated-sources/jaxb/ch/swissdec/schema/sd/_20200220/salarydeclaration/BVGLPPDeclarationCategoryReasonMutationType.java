
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-DeclarationCategoryReasonMutationType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BVG-LPP-DeclarationCategoryReasonMutationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="changeSalary"/&gt;
 *     &lt;enumeration value="activityRate"/&gt;
 *     &lt;enumeration value="changeBVG-LPP-Code"/&gt;
 *     &lt;enumeration value="residence"/&gt;
 *     &lt;enumeration value="others"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BVG-LPP-DeclarationCategoryReasonMutationType")
@XmlEnum
public enum BVGLPPDeclarationCategoryReasonMutationType {

    @XmlEnumValue("changeSalary")
    CHANGE_SALARY("changeSalary"),
    @XmlEnumValue("activityRate")
    ACTIVITY_RATE("activityRate"),
    @XmlEnumValue("changeBVG-LPP-Code")
    CHANGE_BVG_LPP_CODE("changeBVG-LPP-Code"),
    @XmlEnumValue("residence")
    RESIDENCE("residence"),
    @XmlEnumValue("others")
    OTHERS("others");
    private final String value;

    BVGLPPDeclarationCategoryReasonMutationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BVGLPPDeclarationCategoryReasonMutationType fromValue(String v) {
        for (BVGLPPDeclarationCategoryReasonMutationType c: BVGLPPDeclarationCategoryReasonMutationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
