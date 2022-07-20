
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EmploymentHourlyContractType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EmploymentHourlyContractType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="indefiniteSalaryHrs"/&gt;
 *     &lt;enumeration value="fixedSalaryHrs"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmploymentHourlyContractType")
@XmlEnum
public enum EmploymentHourlyContractType {

    @XmlEnumValue("indefiniteSalaryHrs")
    INDEFINITE_SALARY_HRS("indefiniteSalaryHrs"),
    @XmlEnumValue("fixedSalaryHrs")
    FIXED_SALARY_HRS("fixedSalaryHrs");
    private final String value;

    EmploymentHourlyContractType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentHourlyContractType fromValue(String v) {
        for (EmploymentHourlyContractType c: EmploymentHourlyContractType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
