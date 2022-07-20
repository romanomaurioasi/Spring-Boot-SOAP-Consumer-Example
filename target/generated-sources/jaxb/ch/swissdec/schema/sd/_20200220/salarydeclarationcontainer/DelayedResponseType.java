
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DelayedResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DelayedResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndUserInformation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayedResponseType", propOrder = {
    "endUserInformation"
})
public class DelayedResponseType {

    @XmlElement(name = "EndUserInformation", required = true)
    protected String endUserInformation;

    /**
     * Recupera il valore della proprietà endUserInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUserInformation() {
        return endUserInformation;
    }

    /**
     * Imposta il valore della proprietà endUserInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUserInformation(String value) {
        this.endUserInformation = value;
    }

}
