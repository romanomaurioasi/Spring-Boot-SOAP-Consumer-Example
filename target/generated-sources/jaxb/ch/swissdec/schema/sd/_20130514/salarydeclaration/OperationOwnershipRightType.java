
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OperationOwnershipRightType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationOwnershipRightType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="emission"/&gt;
 *     &lt;enumeration value="purchase"/&gt;
 *     &lt;enumeration value="issue"/&gt;
 *     &lt;enumeration value="vesting"/&gt;
 *     &lt;enumeration value="realization"/&gt;
 *     &lt;enumeration value="release"/&gt;
 *     &lt;enumeration value="returnEtc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationOwnershipRightType")
@XmlEnum
public enum OperationOwnershipRightType {

    @XmlEnumValue("emission")
    EMISSION("emission"),
    @XmlEnumValue("purchase")
    PURCHASE("purchase"),
    @XmlEnumValue("issue")
    ISSUE("issue"),
    @XmlEnumValue("vesting")
    VESTING("vesting"),
    @XmlEnumValue("realization")
    REALIZATION("realization"),
    @XmlEnumValue("release")
    RELEASE("release"),
    @XmlEnumValue("returnEtc")
    RETURN_ETC("returnEtc");
    private final String value;

    OperationOwnershipRightType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationOwnershipRightType fromValue(String v) {
        for (OperationOwnershipRightType c: OperationOwnershipRightType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
