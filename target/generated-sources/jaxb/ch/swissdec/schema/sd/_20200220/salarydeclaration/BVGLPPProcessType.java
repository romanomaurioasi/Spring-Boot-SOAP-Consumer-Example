
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-ProcessType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="BVG-LPP-ProcessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="finished"/&gt;
 *     &lt;enumeration value="provisional"/&gt;
 *     &lt;enumeration value="reject"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BVG-LPP-ProcessType")
@XmlEnum
public enum BVGLPPProcessType {

    @XmlEnumValue("finished")
    FINISHED("finished"),
    @XmlEnumValue("provisional")
    PROVISIONAL("provisional"),
    @XmlEnumValue("reject")
    REJECT("reject");
    private final String value;

    BVGLPPProcessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BVGLPPProcessType fromValue(String v) {
        for (BVGLPPProcessType c: BVGLPPProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
