
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PositionType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="highestCadre"/&gt;
 *     &lt;enumeration value="middleCadre"/&gt;
 *     &lt;enumeration value="lowerCadre"/&gt;
 *     &lt;enumeration value="lowestCadre"/&gt;
 *     &lt;enumeration value="noCadre"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionType")
@XmlEnum
public enum PositionType {

    @XmlEnumValue("highestCadre")
    HIGHEST_CADRE("highestCadre"),
    @XmlEnumValue("middleCadre")
    MIDDLE_CADRE("middleCadre"),
    @XmlEnumValue("lowerCadre")
    LOWER_CADRE("lowerCadre"),
    @XmlEnumValue("lowestCadre")
    LOWEST_CADRE("lowestCadre"),
    @XmlEnumValue("noCadre")
    NO_CADRE("noCadre");
    private final String value;

    PositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionType fromValue(String v) {
        for (PositionType c: PositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
