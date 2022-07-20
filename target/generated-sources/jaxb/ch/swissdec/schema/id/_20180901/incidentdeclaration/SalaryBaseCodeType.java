
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SalaryBaseCodeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SalaryBaseCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="BasicWages"/&gt;
 *     &lt;enumeration value="FamilyIncomeSupplement"/&gt;
 *     &lt;enumeration value="VacationAndPublicHolidayCompensation"/&gt;
 *     &lt;enumeration value="OtherSupplements"/&gt;
 *     &lt;enumeration value="Gratuity"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalaryBaseCodeType")
@XmlEnum
public enum SalaryBaseCodeType {

    @XmlEnumValue("BasicWages")
    BASIC_WAGES("BasicWages"),
    @XmlEnumValue("FamilyIncomeSupplement")
    FAMILY_INCOME_SUPPLEMENT("FamilyIncomeSupplement"),
    @XmlEnumValue("VacationAndPublicHolidayCompensation")
    VACATION_AND_PUBLIC_HOLIDAY_COMPENSATION("VacationAndPublicHolidayCompensation"),
    @XmlEnumValue("OtherSupplements")
    OTHER_SUPPLEMENTS("OtherSupplements"),
    @XmlEnumValue("Gratuity")
    GRATUITY("Gratuity");
    private final String value;

    SalaryBaseCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalaryBaseCodeType fromValue(String v) {
        for (SalaryBaseCodeType c: SalaryBaseCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
