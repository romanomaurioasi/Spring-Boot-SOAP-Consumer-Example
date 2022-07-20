
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EmploymentMonthlyContractType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EmploymentMonthlyContractType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="indefiniteSalaryMth"/&gt;
 *     &lt;enumeration value="indefiniteSalaryMthAWT"/&gt;
 *     &lt;enumeration value="fixedSalaryMth"/&gt;
 *     &lt;enumeration value="apprentice"/&gt;
 *     &lt;enumeration value="internshipContract"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmploymentMonthlyContractType")
@XmlEnum
public enum EmploymentMonthlyContractType {

    @XmlEnumValue("indefiniteSalaryMth")
    INDEFINITE_SALARY_MTH("indefiniteSalaryMth"),
    @XmlEnumValue("indefiniteSalaryMthAWT")
    INDEFINITE_SALARY_MTH_AWT("indefiniteSalaryMthAWT"),
    @XmlEnumValue("fixedSalaryMth")
    FIXED_SALARY_MTH("fixedSalaryMth"),
    @XmlEnumValue("apprentice")
    APPRENTICE("apprentice"),
    @XmlEnumValue("internshipContract")
    INTERNSHIP_CONTRACT("internshipContract");
    private final String value;

    EmploymentMonthlyContractType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentMonthlyContractType fromValue(String v) {
        for (EmploymentMonthlyContractType c: EmploymentMonthlyContractType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
