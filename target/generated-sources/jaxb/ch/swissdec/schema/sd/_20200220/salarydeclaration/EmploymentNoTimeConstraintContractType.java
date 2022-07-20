
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EmploymentNoTimeConstraintContractType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EmploymentNoTimeConstraintContractType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="indefiniteSalaryNoTimeConstraint"/&gt;
 *     &lt;enumeration value="fixedSalaryNoTimeConstraint"/&gt;
 *     &lt;enumeration value="administrativeBoard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmploymentNoTimeConstraintContractType")
@XmlEnum
public enum EmploymentNoTimeConstraintContractType {

    @XmlEnumValue("indefiniteSalaryNoTimeConstraint")
    INDEFINITE_SALARY_NO_TIME_CONSTRAINT("indefiniteSalaryNoTimeConstraint"),
    @XmlEnumValue("fixedSalaryNoTimeConstraint")
    FIXED_SALARY_NO_TIME_CONSTRAINT("fixedSalaryNoTimeConstraint"),
    @XmlEnumValue("administrativeBoard")
    ADMINISTRATIVE_BOARD("administrativeBoard");
    private final String value;

    EmploymentNoTimeConstraintContractType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentNoTimeConstraintContractType fromValue(String v) {
        for (EmploymentNoTimeConstraintContractType c: EmploymentNoTimeConstraintContractType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
