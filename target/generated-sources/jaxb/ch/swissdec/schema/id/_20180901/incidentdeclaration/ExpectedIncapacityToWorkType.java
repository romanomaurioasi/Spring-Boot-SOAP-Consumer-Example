
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ExpectedIncapacityToWorkType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpectedIncapacityToWorkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="to30Days"/&gt;
 *     &lt;enumeration value="moreThan30Days"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExpectedIncapacityToWorkType")
@XmlEnum
public enum ExpectedIncapacityToWorkType {

    @XmlEnumValue("to30Days")
    TO_30_DAYS("to30Days"),
    @XmlEnumValue("moreThan30Days")
    MORE_THAN_30_DAYS("moreThan30Days"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ExpectedIncapacityToWorkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpectedIncapacityToWorkType fromValue(String v) {
        for (ExpectedIncapacityToWorkType c: ExpectedIncapacityToWorkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
