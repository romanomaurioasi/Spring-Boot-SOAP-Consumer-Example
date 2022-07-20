
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ProcessType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="finished"/&gt;
 *     &lt;enumeration value="manual"/&gt;
 *     &lt;enumeration value="reject"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessType")
@XmlEnum
public enum ProcessType {

    @XmlEnumValue("finished")
    FINISHED("finished"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("reject")
    REJECT("reject");
    private final String value;

    ProcessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessType fromValue(String v) {
        for (ProcessType c: ProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
