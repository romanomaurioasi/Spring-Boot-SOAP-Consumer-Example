
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CantonAndEXType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CantonAndEXType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="AG"/&gt;
 *     &lt;enumeration value="AI"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BL"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="JU"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NW"/&gt;
 *     &lt;enumeration value="OW"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="SZ"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TI"/&gt;
 *     &lt;enumeration value="UR"/&gt;
 *     &lt;enumeration value="VD"/&gt;
 *     &lt;enumeration value="VS"/&gt;
 *     &lt;enumeration value="ZG"/&gt;
 *     &lt;enumeration value="ZH"/&gt;
 *     &lt;enumeration value="EX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CantonAndEXType")
@XmlEnum
public enum CantonAndEXType {

    AG,
    AI,
    AR,
    BE,
    BL,
    BS,
    FR,
    GE,
    GL,
    GR,
    JU,
    LU,
    NE,
    NW,
    OW,
    SG,
    SH,
    SO,
    SZ,
    TG,
    TI,
    UR,
    VD,
    VS,
    ZG,
    ZH,
    EX;

    public String value() {
        return name();
    }

    public static CantonAndEXType fromValue(String v) {
        return valueOf(v);
    }

}
