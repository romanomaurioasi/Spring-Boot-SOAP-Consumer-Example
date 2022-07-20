
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FAK-CAF-DeclarationCategoryReasonWithdrawalType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="FAK-CAF-DeclarationCategoryReasonWithdrawalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="withdrawalCompany"/&gt;
 *     &lt;enumeration value="cantonChange"/&gt;
 *     &lt;enumeration value="others"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FAK-CAF-DeclarationCategoryReasonWithdrawalType")
@XmlEnum
public enum FAKCAFDeclarationCategoryReasonWithdrawalType {

    @XmlEnumValue("withdrawalCompany")
    WITHDRAWAL_COMPANY("withdrawalCompany"),
    @XmlEnumValue("cantonChange")
    CANTON_CHANGE("cantonChange"),
    @XmlEnumValue("others")
    OTHERS("others");
    private final String value;

    FAKCAFDeclarationCategoryReasonWithdrawalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FAKCAFDeclarationCategoryReasonWithdrawalType fromValue(String v) {
        for (FAKCAFDeclarationCategoryReasonWithdrawalType c: FAKCAFDeclarationCategoryReasonWithdrawalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
