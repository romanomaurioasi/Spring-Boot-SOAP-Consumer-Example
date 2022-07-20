
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MainStateType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MainStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="registrationReceived"/&gt;
 *     &lt;enumeration value="checkingDeclaration"/&gt;
 *     &lt;enumeration value="verifyingClaim"/&gt;
 *     &lt;enumeration value="performingEntitlement"/&gt;
 *     &lt;enumeration value="communicationStopped"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MainStateType")
@XmlEnum
public enum MainStateType {

    @XmlEnumValue("registrationReceived")
    REGISTRATION_RECEIVED("registrationReceived"),
    @XmlEnumValue("checkingDeclaration")
    CHECKING_DECLARATION("checkingDeclaration"),
    @XmlEnumValue("verifyingClaim")
    VERIFYING_CLAIM("verifyingClaim"),
    @XmlEnumValue("performingEntitlement")
    PERFORMING_ENTITLEMENT("performingEntitlement"),
    @XmlEnumValue("communicationStopped")
    COMMUNICATION_STOPPED("communicationStopped");
    private final String value;

    MainStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MainStateType fromValue(String v) {
        for (MainStateType c: MainStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
