
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per YesNoUnknownType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNoUnknownType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="yes"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "YesNoUnknownType")
@XmlEnum
public enum YesNoUnknownType {

    @XmlEnumValue("yes")
    YES("yes"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    YesNoUnknownType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNoUnknownType fromValue(String v) {
        for (YesNoUnknownType c: YesNoUnknownType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
