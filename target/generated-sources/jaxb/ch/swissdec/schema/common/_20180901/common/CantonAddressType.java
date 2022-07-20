
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CantonAddressType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CantonAddressType"&gt;
 *   &lt;restriction base="{http://www.swissdec.ch/schema/common/20180901/Common}CantonAndEXType"&gt;
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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CantonAddressType")
@XmlEnum(CantonAndEXType.class)
public enum CantonAddressType {

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
    ZH;

    public String value() {
        return name();
    }

    public static CantonAddressType fromValue(String v) {
        return valueOf(v);
    }

}
