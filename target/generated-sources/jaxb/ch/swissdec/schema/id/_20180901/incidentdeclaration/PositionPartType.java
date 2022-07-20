
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PositionPartType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionPartType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="left_1"/&gt;
 *     &lt;enumeration value="right_2"/&gt;
 *     &lt;enumeration value="both_3"/&gt;
 *     &lt;enumeration value="unassigned_9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionPartType")
@XmlEnum
public enum PositionPartType {

    @XmlEnumValue("left_1")
    LEFT_1("left_1"),
    @XmlEnumValue("right_2")
    RIGHT_2("right_2"),
    @XmlEnumValue("both_3")
    BOTH_3("both_3"),
    @XmlEnumValue("unassigned_9")
    UNASSIGNED_9("unassigned_9");
    private final String value;

    PositionPartType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionPartType fromValue(String v) {
        for (PositionPartType c: PositionPartType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
