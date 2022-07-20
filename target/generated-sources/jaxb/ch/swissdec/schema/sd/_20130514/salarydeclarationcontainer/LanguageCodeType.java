
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LanguageCodeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageCodeType")
@XmlEnum
public enum LanguageCodeType {

    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("en")
    EN("en");
    private final String value;

    LanguageCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageCodeType fromValue(String v) {
        for (LanguageCodeType c: LanguageCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
