
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-DeclarationCategoryReasonEntryType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BVG-LPP-DeclarationCategoryReasonEntryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="entryCompany"/&gt;
 *     &lt;enumeration value="interruptionOfEmployment"/&gt;
 *     &lt;enumeration value="others"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BVG-LPP-DeclarationCategoryReasonEntryType")
@XmlEnum
public enum BVGLPPDeclarationCategoryReasonEntryType {

    @XmlEnumValue("entryCompany")
    ENTRY_COMPANY("entryCompany"),
    @XmlEnumValue("interruptionOfEmployment")
    INTERRUPTION_OF_EMPLOYMENT("interruptionOfEmployment"),
    @XmlEnumValue("others")
    OTHERS("others");
    private final String value;

    BVGLPPDeclarationCategoryReasonEntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BVGLPPDeclarationCategoryReasonEntryType fromValue(String v) {
        for (BVGLPPDeclarationCategoryReasonEntryType c: BVGLPPDeclarationCategoryReasonEntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
