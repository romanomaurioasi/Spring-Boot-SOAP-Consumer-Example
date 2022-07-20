
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclarationCategoryReasonEntryType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DeclarationCategoryReasonEntryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="entryCompany"/&gt;
 *     &lt;enumeration value="cantonChange"/&gt;
 *     &lt;enumeration value="others"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeclarationCategoryReasonEntryType")
@XmlEnum
public enum DeclarationCategoryReasonEntryType {

    @XmlEnumValue("entryCompany")
    ENTRY_COMPANY("entryCompany"),
    @XmlEnumValue("cantonChange")
    CANTON_CHANGE("cantonChange"),
    @XmlEnumValue("others")
    OTHERS("others");
    private final String value;

    DeclarationCategoryReasonEntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeclarationCategoryReasonEntryType fromValue(String v) {
        for (DeclarationCategoryReasonEntryType c: DeclarationCategoryReasonEntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
