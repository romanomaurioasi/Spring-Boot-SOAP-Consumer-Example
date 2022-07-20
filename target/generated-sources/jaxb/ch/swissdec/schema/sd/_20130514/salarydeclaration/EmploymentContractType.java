
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EmploymentContractType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EmploymentContractType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="indefiniteSalaryMth"/&gt;
 *     &lt;enumeration value="indefiniteSalaryMthAWT"/&gt;
 *     &lt;enumeration value="indefiniteSalaryHrs"/&gt;
 *     &lt;enumeration value="indefiniteSalaryNoTimeConstraint"/&gt;
 *     &lt;enumeration value="fixedSalaryMth"/&gt;
 *     &lt;enumeration value="fixedSalaryHrs"/&gt;
 *     &lt;enumeration value="fixedSalaryNoTimeConstraint"/&gt;
 *     &lt;enumeration value="apprentice"/&gt;
 *     &lt;enumeration value="internshipContract"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmploymentContractType")
@XmlEnum
public enum EmploymentContractType {

    @XmlEnumValue("indefiniteSalaryMth")
    INDEFINITE_SALARY_MTH("indefiniteSalaryMth"),
    @XmlEnumValue("indefiniteSalaryMthAWT")
    INDEFINITE_SALARY_MTH_AWT("indefiniteSalaryMthAWT"),
    @XmlEnumValue("indefiniteSalaryHrs")
    INDEFINITE_SALARY_HRS("indefiniteSalaryHrs"),
    @XmlEnumValue("indefiniteSalaryNoTimeConstraint")
    INDEFINITE_SALARY_NO_TIME_CONSTRAINT("indefiniteSalaryNoTimeConstraint"),
    @XmlEnumValue("fixedSalaryMth")
    FIXED_SALARY_MTH("fixedSalaryMth"),
    @XmlEnumValue("fixedSalaryHrs")
    FIXED_SALARY_HRS("fixedSalaryHrs"),
    @XmlEnumValue("fixedSalaryNoTimeConstraint")
    FIXED_SALARY_NO_TIME_CONSTRAINT("fixedSalaryNoTimeConstraint"),
    @XmlEnumValue("apprentice")
    APPRENTICE("apprentice"),
    @XmlEnumValue("internshipContract")
    INTERNSHIP_CONTRACT("internshipContract");
    private final String value;

    EmploymentContractType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentContractType fromValue(String v) {
        for (EmploymentContractType c: EmploymentContractType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
