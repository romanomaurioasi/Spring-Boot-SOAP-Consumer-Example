
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Location2Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Location2Type"&gt;
 *   &lt;restriction base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}Location3Type"&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="abroad"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Location2Type")
@XmlEnum(Location3Type.class)
public enum Location2Type {

    CH(Location3Type.CH),
    @XmlEnumValue("abroad")
    ABROAD(Location3Type.ABROAD);
    private final Location3Type value;

    Location2Type(Location3Type v) {
        value = v;
    }

    public Location3Type value() {
        return value;
    }

    public static Location2Type fromValue(Location3Type v) {
        for (Location2Type c: Location2Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
