
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Location3Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Location3Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="abroad"/&gt;
 *     &lt;enumeration value="noWorksForCompany"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Location3Type")
@XmlEnum
public enum Location3Type {

    CH("CH"),
    @XmlEnumValue("abroad")
    ABROAD("abroad"),
    @XmlEnumValue("noWorksForCompany")
    NO_WORKS_FOR_COMPANY("noWorksForCompany");
    private final String value;

    Location3Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Location3Type fromValue(String v) {
        for (Location3Type c: Location3Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
