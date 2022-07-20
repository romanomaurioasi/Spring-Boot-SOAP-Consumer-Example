
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ChangeCredentialsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ChangeCredentialsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OldCredentials" type="{http://www.swissdec.ch/schema/common/20180901/Common}CredentialsType"/&gt;
 *         &lt;element name="NewCredentials" type="{http://www.swissdec.ch/schema/common/20180901/Common}CredentialsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCredentialsType", propOrder = {
    "oldCredentials",
    "newCredentials"
})
public class ChangeCredentialsType {

    @XmlElement(name = "OldCredentials", required = true)
    protected CredentialsType oldCredentials;
    @XmlElement(name = "NewCredentials", required = true)
    protected CredentialsType newCredentials;

    /**
     * Recupera il valore della proprietà oldCredentials.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsType }
     *     
     */
    public CredentialsType getOldCredentials() {
        return oldCredentials;
    }

    /**
     * Imposta il valore della proprietà oldCredentials.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsType }
     *     
     */
    public void setOldCredentials(CredentialsType value) {
        this.oldCredentials = value;
    }

    /**
     * Recupera il valore della proprietà newCredentials.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsType }
     *     
     */
    public CredentialsType getNewCredentials() {
        return newCredentials;
    }

    /**
     * Imposta il valore della proprietà newCredentials.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsType }
     *     
     */
    public void setNewCredentials(CredentialsType value) {
        this.newCredentials = value;
    }

}
