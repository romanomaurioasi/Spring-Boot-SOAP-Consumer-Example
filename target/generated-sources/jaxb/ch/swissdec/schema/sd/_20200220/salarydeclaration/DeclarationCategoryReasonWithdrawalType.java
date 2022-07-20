
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclarationCategoryReasonWithdrawalType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DeclarationCategoryReasonWithdrawalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="withdrawalCompany"/&gt;
 *     &lt;enumeration value="naturalization"/&gt;
 *     &lt;enumeration value="settled-C"/&gt;
 *     &lt;enumeration value="cantonChange"/&gt;
 *     &lt;enumeration value="others"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeclarationCategoryReasonWithdrawalType")
@XmlEnum
public enum DeclarationCategoryReasonWithdrawalType {

    @XmlEnumValue("withdrawalCompany")
    WITHDRAWAL_COMPANY("withdrawalCompany"),
    @XmlEnumValue("naturalization")
    NATURALIZATION("naturalization"),
    @XmlEnumValue("settled-C")
    SETTLED_C("settled-C"),
    @XmlEnumValue("cantonChange")
    CANTON_CHANGE("cantonChange"),
    @XmlEnumValue("others")
    OTHERS("others");
    private final String value;

    DeclarationCategoryReasonWithdrawalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeclarationCategoryReasonWithdrawalType fromValue(String v) {
        for (DeclarationCategoryReasonWithdrawalType c: DeclarationCategoryReasonWithdrawalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
