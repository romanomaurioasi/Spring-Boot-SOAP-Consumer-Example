
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ResidenceCategoryType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidenceCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="shortTerm-L"/&gt;
 *     &lt;enumeration value="annual-B"/&gt;
 *     &lt;enumeration value="settled-C"/&gt;
 *     &lt;enumeration value="crossBorder-G"/&gt;
 *     &lt;enumeration value="asylumSeeker-N"/&gt;
 *     &lt;enumeration value="needForProtection-S"/&gt;
 *     &lt;enumeration value="NotificationProcedureForShorttermWork90Days"/&gt;
 *     &lt;enumeration value="NotificationProcedureForShorttermWork120Days"/&gt;
 *     &lt;enumeration value="ProvisionallyAdmittedForeigners-F"/&gt;
 *     &lt;enumeration value="ResidentForeignNationalWithGainfulEmployment-Ci"/&gt;
 *     &lt;enumeration value="othersNotSwiss"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResidenceCategoryType")
@XmlEnum
public enum ResidenceCategoryType {

    @XmlEnumValue("shortTerm-L")
    SHORT_TERM_L("shortTerm-L"),
    @XmlEnumValue("annual-B")
    ANNUAL_B("annual-B"),
    @XmlEnumValue("settled-C")
    SETTLED_C("settled-C"),
    @XmlEnumValue("crossBorder-G")
    CROSS_BORDER_G("crossBorder-G"),
    @XmlEnumValue("asylumSeeker-N")
    ASYLUM_SEEKER_N("asylumSeeker-N"),
    @XmlEnumValue("needForProtection-S")
    NEED_FOR_PROTECTION_S("needForProtection-S"),
    @XmlEnumValue("NotificationProcedureForShorttermWork90Days")
    NOTIFICATION_PROCEDURE_FOR_SHORTTERM_WORK_90_DAYS("NotificationProcedureForShorttermWork90Days"),
    @XmlEnumValue("NotificationProcedureForShorttermWork120Days")
    NOTIFICATION_PROCEDURE_FOR_SHORTTERM_WORK_120_DAYS("NotificationProcedureForShorttermWork120Days"),
    @XmlEnumValue("ProvisionallyAdmittedForeigners-F")
    PROVISIONALLY_ADMITTED_FOREIGNERS_F("ProvisionallyAdmittedForeigners-F"),
    @XmlEnumValue("ResidentForeignNationalWithGainfulEmployment-Ci")
    RESIDENT_FOREIGN_NATIONAL_WITH_GAINFUL_EMPLOYMENT_CI("ResidentForeignNationalWithGainfulEmployment-Ci"),
    @XmlEnumValue("othersNotSwiss")
    OTHERS_NOT_SWISS("othersNotSwiss");
    private final String value;

    ResidenceCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidenceCategoryType fromValue(String v) {
        for (ResidenceCategoryType c: ResidenceCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
