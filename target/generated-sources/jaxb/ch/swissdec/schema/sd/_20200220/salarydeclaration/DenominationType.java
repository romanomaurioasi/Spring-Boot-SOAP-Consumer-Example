
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DenominationType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DenominationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="romanCatholic"/&gt;
 *     &lt;enumeration value="christianCatholic"/&gt;
 *     &lt;enumeration value="reformedEvangelical"/&gt;
 *     &lt;enumeration value="jewishCommunity"/&gt;
 *     &lt;enumeration value="otherOrNone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DenominationType")
@XmlEnum
public enum DenominationType {

    @XmlEnumValue("romanCatholic")
    ROMAN_CATHOLIC("romanCatholic"),
    @XmlEnumValue("christianCatholic")
    CHRISTIAN_CATHOLIC("christianCatholic"),
    @XmlEnumValue("reformedEvangelical")
    REFORMED_EVANGELICAL("reformedEvangelical"),
    @XmlEnumValue("jewishCommunity")
    JEWISH_COMMUNITY("jewishCommunity"),
    @XmlEnumValue("otherOrNone")
    OTHER_OR_NONE("otherOrNone");
    private final String value;

    DenominationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenominationType fromValue(String v) {
        for (DenominationType c: DenominationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
