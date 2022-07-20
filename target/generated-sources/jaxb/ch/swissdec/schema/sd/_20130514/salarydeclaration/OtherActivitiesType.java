
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OtherActivitiesType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherActivitiesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="abroad"/&gt;
 *     &lt;enumeration value="abroadAndCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherActivitiesType")
@XmlEnum
public enum OtherActivitiesType {

    CH("CH"),
    @XmlEnumValue("abroad")
    ABROAD("abroad"),
    @XmlEnumValue("abroadAndCH")
    ABROAD_AND_CH("abroadAndCH");
    private final String value;

    OtherActivitiesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherActivitiesType fromValue(String v) {
        for (OtherActivitiesType c: OtherActivitiesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
