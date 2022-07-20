
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EducationType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EducationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="universityMaster"/&gt;
 *     &lt;enumeration value="universityBachelor"/&gt;
 *     &lt;enumeration value="higherEducationMaster"/&gt;
 *     &lt;enumeration value="higherEducationBachelor"/&gt;
 *     &lt;enumeration value="higherVocEducation"/&gt;
 *     &lt;enumeration value="higherVocEducationMaster"/&gt;
 *     &lt;enumeration value="higherVocEducationBachelor"/&gt;
 *     &lt;enumeration value="teacherCertificate"/&gt;
 *     &lt;enumeration value="universityEntranceCertificate"/&gt;
 *     &lt;enumeration value="vocEducationCompl"/&gt;
 *     &lt;enumeration value="enterpriseEducation"/&gt;
 *     &lt;enumeration value="mandatorySchoolOnly"/&gt;
 *     &lt;enumeration value="doctorate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EducationType")
@XmlEnum
public enum EducationType {

    @XmlEnumValue("universityMaster")
    UNIVERSITY_MASTER("universityMaster"),
    @XmlEnumValue("universityBachelor")
    UNIVERSITY_BACHELOR("universityBachelor"),
    @XmlEnumValue("higherEducationMaster")
    HIGHER_EDUCATION_MASTER("higherEducationMaster"),
    @XmlEnumValue("higherEducationBachelor")
    HIGHER_EDUCATION_BACHELOR("higherEducationBachelor"),
    @XmlEnumValue("higherVocEducation")
    HIGHER_VOC_EDUCATION("higherVocEducation"),
    @XmlEnumValue("higherVocEducationMaster")
    HIGHER_VOC_EDUCATION_MASTER("higherVocEducationMaster"),
    @XmlEnumValue("higherVocEducationBachelor")
    HIGHER_VOC_EDUCATION_BACHELOR("higherVocEducationBachelor"),
    @XmlEnumValue("teacherCertificate")
    TEACHER_CERTIFICATE("teacherCertificate"),
    @XmlEnumValue("universityEntranceCertificate")
    UNIVERSITY_ENTRANCE_CERTIFICATE("universityEntranceCertificate"),
    @XmlEnumValue("vocEducationCompl")
    VOC_EDUCATION_COMPL("vocEducationCompl"),
    @XmlEnumValue("enterpriseEducation")
    ENTERPRISE_EDUCATION("enterpriseEducation"),
    @XmlEnumValue("mandatorySchoolOnly")
    MANDATORY_SCHOOL_ONLY("mandatorySchoolOnly"),
    @XmlEnumValue("doctorate")
    DOCTORATE("doctorate");
    private final String value;

    EducationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EducationType fromValue(String v) {
        for (EducationType c: EducationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
