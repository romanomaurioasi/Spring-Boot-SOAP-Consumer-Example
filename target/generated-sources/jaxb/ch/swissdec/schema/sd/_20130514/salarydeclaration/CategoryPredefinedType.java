
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CategoryPredefinedType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryPredefinedType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="specialAgreement"/&gt;
 *     &lt;enumeration value="honoraryBoardOfDirectorsResidingAbroad"/&gt;
 *     &lt;enumeration value="monetaryValuesServicesResidingAbroad"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CategoryPredefinedType")
@XmlEnum
public enum CategoryPredefinedType {

    @XmlEnumValue("specialAgreement")
    SPECIAL_AGREEMENT("specialAgreement"),
    @XmlEnumValue("honoraryBoardOfDirectorsResidingAbroad")
    HONORARY_BOARD_OF_DIRECTORS_RESIDING_ABROAD("honoraryBoardOfDirectorsResidingAbroad"),
    @XmlEnumValue("monetaryValuesServicesResidingAbroad")
    MONETARY_VALUES_SERVICES_RESIDING_ABROAD("monetaryValuesServicesResidingAbroad");
    private final String value;

    CategoryPredefinedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryPredefinedType fromValue(String v) {
        for (CategoryPredefinedType c: CategoryPredefinedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
