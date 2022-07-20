
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CivilStatusType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CivilStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="single"/&gt;
 *     &lt;enumeration value="married"/&gt;
 *     &lt;enumeration value="widowed"/&gt;
 *     &lt;enumeration value="divorced"/&gt;
 *     &lt;enumeration value="separated"/&gt;
 *     &lt;enumeration value="registeredPartnership"/&gt;
 *     &lt;enumeration value="partnershipDissolvedByLaw"/&gt;
 *     &lt;enumeration value="partnershipDissolvedByDeath"/&gt;
 *     &lt;enumeration value="partnershipDissolvedByDeclarationOfLost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CivilStatusType")
@XmlEnum
public enum CivilStatusType {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("married")
    MARRIED("married"),
    @XmlEnumValue("widowed")
    WIDOWED("widowed"),
    @XmlEnumValue("divorced")
    DIVORCED("divorced"),
    @XmlEnumValue("separated")
    SEPARATED("separated"),
    @XmlEnumValue("registeredPartnership")
    REGISTERED_PARTNERSHIP("registeredPartnership"),
    @XmlEnumValue("partnershipDissolvedByLaw")
    PARTNERSHIP_DISSOLVED_BY_LAW("partnershipDissolvedByLaw"),
    @XmlEnumValue("partnershipDissolvedByDeath")
    PARTNERSHIP_DISSOLVED_BY_DEATH("partnershipDissolvedByDeath"),
    @XmlEnumValue("partnershipDissolvedByDeclarationOfLost")
    PARTNERSHIP_DISSOLVED_BY_DECLARATION_OF_LOST("partnershipDissolvedByDeclarationOfLost");
    private final String value;

    CivilStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CivilStatusType fromValue(String v) {
        for (CivilStatusType c: CivilStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
