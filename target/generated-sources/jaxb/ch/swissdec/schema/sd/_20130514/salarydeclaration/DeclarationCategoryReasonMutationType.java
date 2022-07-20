
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclarationCategoryReasonMutationType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DeclarationCategoryReasonMutationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="civilstate"/&gt;
 *     &lt;enumeration value="partnerWork"/&gt;
 *     &lt;enumeration value="sideline"/&gt;
 *     &lt;enumeration value="partnerWorkIT"/&gt;
 *     &lt;enumeration value="residence"/&gt;
 *     &lt;enumeration value="childrenDeduction"/&gt;
 *     &lt;enumeration value="churchTax"/&gt;
 *     &lt;enumeration value="activityRate"/&gt;
 *     &lt;enumeration value="others"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeclarationCategoryReasonMutationType")
@XmlEnum
public enum DeclarationCategoryReasonMutationType {

    @XmlEnumValue("civilstate")
    CIVILSTATE("civilstate"),
    @XmlEnumValue("partnerWork")
    PARTNER_WORK("partnerWork"),
    @XmlEnumValue("sideline")
    SIDELINE("sideline"),
    @XmlEnumValue("partnerWorkIT")
    PARTNER_WORK_IT("partnerWorkIT"),
    @XmlEnumValue("residence")
    RESIDENCE("residence"),
    @XmlEnumValue("childrenDeduction")
    CHILDREN_DEDUCTION("childrenDeduction"),
    @XmlEnumValue("churchTax")
    CHURCH_TAX("churchTax"),
    @XmlEnumValue("activityRate")
    ACTIVITY_RATE("activityRate"),
    @XmlEnumValue("others")
    OTHERS("others");
    private final String value;

    DeclarationCategoryReasonMutationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeclarationCategoryReasonMutationType fromValue(String v) {
        for (DeclarationCategoryReasonMutationType c: DeclarationCategoryReasonMutationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
