
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DegreeOfRelationshipType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DegreeOfRelationshipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="unrelated"/&gt;
 *     &lt;enumeration value="OwnerWife"/&gt;
 *     &lt;enumeration value="OwnerHusband"/&gt;
 *     &lt;enumeration value="OwnerBloodRelation"/&gt;
 *     &lt;enumeration value="OwnerSiblings"/&gt;
 *     &lt;enumeration value="OwnerAdoptedChild"/&gt;
 *     &lt;enumeration value="OwnerFosterChild"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DegreeOfRelationshipType")
@XmlEnum
public enum DegreeOfRelationshipType {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("unrelated")
    UNRELATED("unrelated"),
    @XmlEnumValue("OwnerWife")
    OWNER_WIFE("OwnerWife"),
    @XmlEnumValue("OwnerHusband")
    OWNER_HUSBAND("OwnerHusband"),
    @XmlEnumValue("OwnerBloodRelation")
    OWNER_BLOOD_RELATION("OwnerBloodRelation"),
    @XmlEnumValue("OwnerSiblings")
    OWNER_SIBLINGS("OwnerSiblings"),
    @XmlEnumValue("OwnerAdoptedChild")
    OWNER_ADOPTED_CHILD("OwnerAdoptedChild"),
    @XmlEnumValue("OwnerFosterChild")
    OWNER_FOSTER_CHILD("OwnerFosterChild");
    private final String value;

    DegreeOfRelationshipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DegreeOfRelationshipType fromValue(String v) {
        for (DegreeOfRelationshipType c: DegreeOfRelationshipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
