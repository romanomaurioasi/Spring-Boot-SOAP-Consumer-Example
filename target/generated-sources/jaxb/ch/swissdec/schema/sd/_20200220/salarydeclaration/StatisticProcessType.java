
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatisticProcessType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StatisticProcessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="finished"/&gt;
 *     &lt;enumeration value="reject"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatisticProcessType")
@XmlEnum
public enum StatisticProcessType {

    @XmlEnumValue("finished")
    FINISHED("finished"),
    @XmlEnumValue("reject")
    REJECT("reject");
    private final String value;

    StatisticProcessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatisticProcessType fromValue(String v) {
        for (StatisticProcessType c: StatisticProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
