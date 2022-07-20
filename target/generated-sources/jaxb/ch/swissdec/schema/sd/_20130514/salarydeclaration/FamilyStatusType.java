
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FamilyStatusType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="mother"/&gt;
 *     &lt;enumeration value="stepmother"/&gt;
 *     &lt;enumeration value="fosterMother"/&gt;
 *     &lt;enumeration value="sister"/&gt;
 *     &lt;enumeration value="grandmother"/&gt;
 *     &lt;enumeration value="father"/&gt;
 *     &lt;enumeration value="stepfather"/&gt;
 *     &lt;enumeration value="fosterFather"/&gt;
 *     &lt;enumeration value="brother"/&gt;
 *     &lt;enumeration value="grandfather"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FamilyStatusType")
@XmlEnum
public enum FamilyStatusType {

    @XmlEnumValue("mother")
    MOTHER("mother"),
    @XmlEnumValue("stepmother")
    STEPMOTHER("stepmother"),
    @XmlEnumValue("fosterMother")
    FOSTER_MOTHER("fosterMother"),
    @XmlEnumValue("sister")
    SISTER("sister"),
    @XmlEnumValue("grandmother")
    GRANDMOTHER("grandmother"),
    @XmlEnumValue("father")
    FATHER("father"),
    @XmlEnumValue("stepfather")
    STEPFATHER("stepfather"),
    @XmlEnumValue("fosterFather")
    FOSTER_FATHER("fosterFather"),
    @XmlEnumValue("brother")
    BROTHER("brother"),
    @XmlEnumValue("grandfather")
    GRANDFATHER("grandfather");
    private final String value;

    FamilyStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FamilyStatusType fromValue(String v) {
        for (FamilyStatusType c: FamilyStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
