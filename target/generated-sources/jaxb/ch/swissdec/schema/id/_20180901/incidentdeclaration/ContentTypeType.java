
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ContentTypeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="certificateOfIncapacityToWork"/&gt;
 *     &lt;enumeration value="correspondence"/&gt;
 *     &lt;enumeration value="invoice "/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentTypeType")
@XmlEnum
public enum ContentTypeType {

    @XmlEnumValue("certificateOfIncapacityToWork")
    CERTIFICATE_OF_INCAPACITY_TO_WORK("certificateOfIncapacityToWork"),
    @XmlEnumValue("correspondence")
    CORRESPONDENCE("correspondence"),
    @XmlEnumValue("invoice ")
    INVOICE("invoice "),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ContentTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentTypeType fromValue(String v) {
        for (ContentTypeType c: ContentTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
