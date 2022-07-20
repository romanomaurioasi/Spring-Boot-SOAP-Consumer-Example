
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PayAgreementType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PayAgreementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="CLA-Association"/&gt;
 *     &lt;enumeration value="CLA-BusinessOrGovernment"/&gt;
 *     &lt;enumeration value="collectiveContractOutside-CLA"/&gt;
 *     &lt;enumeration value="individualContract"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayAgreementType")
@XmlEnum
public enum PayAgreementType {

    @XmlEnumValue("CLA-Association")
    CLA_ASSOCIATION("CLA-Association"),
    @XmlEnumValue("CLA-BusinessOrGovernment")
    CLA_BUSINESS_OR_GOVERNMENT("CLA-BusinessOrGovernment"),
    @XmlEnumValue("collectiveContractOutside-CLA")
    COLLECTIVE_CONTRACT_OUTSIDE_CLA("collectiveContractOutside-CLA"),
    @XmlEnumValue("individualContract")
    INDIVIDUAL_CONTRACT("individualContract");
    private final String value;

    PayAgreementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayAgreementType fromValue(String v) {
        for (PayAgreementType c: PayAgreementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
