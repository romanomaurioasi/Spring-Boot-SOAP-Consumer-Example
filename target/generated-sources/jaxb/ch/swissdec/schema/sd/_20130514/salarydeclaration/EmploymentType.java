
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EmploymentType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EmploymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="mainJob"/&gt;
 *     &lt;enumeration value="sideJob"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmploymentType")
@XmlEnum
public enum EmploymentType {

    @XmlEnumValue("mainJob")
    MAIN_JOB("mainJob"),
    @XmlEnumValue("sideJob")
    SIDE_JOB("sideJob");
    private final String value;

    EmploymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentType fromValue(String v) {
        for (EmploymentType c: EmploymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
