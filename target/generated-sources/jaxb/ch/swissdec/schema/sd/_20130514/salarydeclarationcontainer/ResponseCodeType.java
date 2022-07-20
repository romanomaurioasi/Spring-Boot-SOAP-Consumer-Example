
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ResponseCodeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="accepted"/&gt;
 *     &lt;enumeration value="acceptedWithWarning"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseCodeType")
@XmlEnum
public enum ResponseCodeType {

    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),
    @XmlEnumValue("acceptedWithWarning")
    ACCEPTED_WITH_WARNING("acceptedWithWarning");
    private final String value;

    ResponseCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseCodeType fromValue(String v) {
        for (ResponseCodeType c: ResponseCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
