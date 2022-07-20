
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TypeOfOwnershipType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfOwnershipType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="staffShares"/&gt;
 *     &lt;enumeration value="publiclyTradedOptions"/&gt;
 *     &lt;enumeration value="otherOptions"/&gt;
 *     &lt;enumeration value="deferredBenefitsStaffShares"/&gt;
 *     &lt;enumeration value="fictitiousStaffShare"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfOwnershipType")
@XmlEnum
public enum TypeOfOwnershipType {

    @XmlEnumValue("staffShares")
    STAFF_SHARES("staffShares"),
    @XmlEnumValue("publiclyTradedOptions")
    PUBLICLY_TRADED_OPTIONS("publiclyTradedOptions"),
    @XmlEnumValue("otherOptions")
    OTHER_OPTIONS("otherOptions"),
    @XmlEnumValue("deferredBenefitsStaffShares")
    DEFERRED_BENEFITS_STAFF_SHARES("deferredBenefitsStaffShares"),
    @XmlEnumValue("fictitiousStaffShare")
    FICTITIOUS_STAFF_SHARE("fictitiousStaffShare");
    private final String value;

    TypeOfOwnershipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfOwnershipType fromValue(String v) {
        for (TypeOfOwnershipType c: TypeOfOwnershipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
