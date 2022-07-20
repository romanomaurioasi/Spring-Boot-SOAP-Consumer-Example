
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FaultCodeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="NOT_accepted"/&gt;
 *     &lt;enumeration value="NOT_plausible"/&gt;
 *     &lt;enumeration value="NOT_valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultCodeType")
@XmlEnum
public enum FaultCodeType {

    @XmlEnumValue("NOT_accepted")
    NOT_ACCEPTED("NOT_accepted"),
    @XmlEnumValue("NOT_plausible")
    NOT_PLAUSIBLE("NOT_plausible"),
    @XmlEnumValue("NOT_valid")
    NOT_VALID("NOT_valid");
    private final String value;

    FaultCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultCodeType fromValue(String v) {
        for (FaultCodeType c: FaultCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
