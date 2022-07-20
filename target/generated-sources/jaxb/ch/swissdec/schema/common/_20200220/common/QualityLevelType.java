
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per QualityLevelType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Validity"/&gt;
 *     &lt;enumeration value="Plausibility"/&gt;
 *     &lt;enumeration value="Acceptance"/&gt;
 *     &lt;enumeration value="Comment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualityLevelType")
@XmlEnum
public enum QualityLevelType {

    @XmlEnumValue("Validity")
    VALIDITY("Validity"),
    @XmlEnumValue("Plausibility")
    PLAUSIBILITY("Plausibility"),
    @XmlEnumValue("Acceptance")
    ACCEPTANCE("Acceptance"),
    @XmlEnumValue("Comment")
    COMMENT("Comment");
    private final String value;

    QualityLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityLevelType fromValue(String v) {
        for (QualityLevelType c: QualityLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
