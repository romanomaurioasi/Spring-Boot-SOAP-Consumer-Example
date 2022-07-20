
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxCustomerIdentificationConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxCustomerIdentificationConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CantonID" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CantonAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCustomerIdentificationConsumerType", propOrder = {
    "cantonID"
})
public class TaxCustomerIdentificationConsumerType {

    @XmlElement(name = "CantonID", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType cantonID;

    /**
     * Recupera il valore della proprietà cantonID.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getCantonID() {
        return cantonID;
    }

    /**
     * Imposta il valore della proprietà cantonID.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setCantonID(CantonAddressType value) {
        this.cantonID = value;
    }

}
