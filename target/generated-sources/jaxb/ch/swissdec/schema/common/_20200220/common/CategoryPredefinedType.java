
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CategoryPredefinedType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryPredefinedType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="HEN"/&gt;
 *     &lt;enumeration value="HEY"/&gt;
 *     &lt;enumeration value="MEN"/&gt;
 *     &lt;enumeration value="MEY"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="NOY"/&gt;
 *     &lt;enumeration value="SFN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CategoryPredefinedType")
@XmlEnum
public enum CategoryPredefinedType {

    HEN,
    HEY,
    MEN,
    MEY,
    NON,
    NOY,
    SFN;

    public String value() {
        return name();
    }

    public static CategoryPredefinedType fromValue(String v) {
        return valueOf(v);
    }

}
