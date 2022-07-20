
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ResponseCodeAAwRType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseCodeAAwRType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="accepted"/&gt;
 *     &lt;enumeration value="acceptedWithWarning"/&gt;
 *     &lt;enumeration value="rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseCodeAAwRType")
@XmlEnum
public enum ResponseCodeAAwRType {

    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),
    @XmlEnumValue("acceptedWithWarning")
    ACCEPTED_WITH_WARNING("acceptedWithWarning"),
    @XmlEnumValue("rejected")
    REJECTED("rejected");
    private final String value;

    ResponseCodeAAwRType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseCodeAAwRType fromValue(String v) {
        for (ResponseCodeAAwRType c: ResponseCodeAAwRType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
