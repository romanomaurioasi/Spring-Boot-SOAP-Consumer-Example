
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DigitalizationScopeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DigitalizationScopeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Basic"/&gt;
 *     &lt;enumeration value="BasicCoverage"/&gt;
 *     &lt;enumeration value="BasicCoverageSettlement"/&gt;
 *     &lt;enumeration value="BasicDialog"/&gt;
 *     &lt;enumeration value="BasicCoverageDialog"/&gt;
 *     &lt;enumeration value="BasicCoverageSettlementDialog"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DigitalizationScopeType")
@XmlEnum
public enum DigitalizationScopeType {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("BasicCoverage")
    BASIC_COVERAGE("BasicCoverage"),
    @XmlEnumValue("BasicCoverageSettlement")
    BASIC_COVERAGE_SETTLEMENT("BasicCoverageSettlement"),
    @XmlEnumValue("BasicDialog")
    BASIC_DIALOG("BasicDialog"),
    @XmlEnumValue("BasicCoverageDialog")
    BASIC_COVERAGE_DIALOG("BasicCoverageDialog"),
    @XmlEnumValue("BasicCoverageSettlementDialog")
    BASIC_COVERAGE_SETTLEMENT_DIALOG("BasicCoverageSettlementDialog");
    private final String value;

    DigitalizationScopeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigitalizationScopeType fromValue(String v) {
        for (DigitalizationScopeType c: DigitalizationScopeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
