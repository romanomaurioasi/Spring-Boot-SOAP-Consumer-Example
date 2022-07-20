
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DomainType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DomainType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="UVG-LAA"/&gt;
 *     &lt;enumeration value="UVGZ-LAAC"/&gt;
 *     &lt;enumeration value="KU-AC"/&gt;
 *     &lt;enumeration value="KTG-AMC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DomainType")
@XmlEnum
public enum DomainType {

    @XmlEnumValue("UVG-LAA")
    UVG_LAA("UVG-LAA"),
    @XmlEnumValue("UVGZ-LAAC")
    UVGZ_LAAC("UVGZ-LAAC"),
    @XmlEnumValue("KU-AC")
    KU_AC("KU-AC"),
    @XmlEnumValue("KTG-AMC")
    KTG_AMC("KTG-AMC");
    private final String value;

    DomainType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DomainType fromValue(String v) {
        for (DomainType c: DomainType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
