
package ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.FaultStateType;


/**
 * <p>Classe Java per OrganizationAuthenticationFaultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationAuthenticationFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FaultContext" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationContainer}FaultContextType"/&gt;
 *         &lt;element name="FaultState" type="{http://www.swissdec.ch/schema/common/20180901/Common}FaultStateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationAuthenticationFaultType", propOrder = {
    "faultContext",
    "faultState"
})
public class OrganizationAuthenticationFaultType {

    @XmlElement(name = "FaultContext", required = true)
    protected FaultContextType faultContext;
    @XmlElement(name = "FaultState", required = true)
    protected FaultStateType faultState;

    /**
     * Recupera il valore della proprietà faultContext.
     * 
     * @return
     *     possible object is
     *     {@link FaultContextType }
     *     
     */
    public FaultContextType getFaultContext() {
        return faultContext;
    }

    /**
     * Imposta il valore della proprietà faultContext.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultContextType }
     *     
     */
    public void setFaultContext(FaultContextType value) {
        this.faultContext = value;
    }

    /**
     * Recupera il valore della proprietà faultState.
     * 
     * @return
     *     possible object is
     *     {@link FaultStateType }
     *     
     */
    public FaultStateType getFaultState() {
        return faultState;
    }

    /**
     * Imposta il valore della proprietà faultState.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultStateType }
     *     
     */
    public void setFaultState(FaultStateType value) {
        this.faultState = value;
    }

}
