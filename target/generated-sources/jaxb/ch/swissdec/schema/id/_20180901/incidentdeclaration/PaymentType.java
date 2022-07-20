
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PaymentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PaymentAddressBaseType" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PaymentAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "company",
    "person"
})
public class PaymentType
    extends StoryBaseType
{

    @XmlElement(name = "Company")
    protected PaymentAddressBaseType company;
    @XmlElement(name = "Person")
    protected PaymentAddressType person;

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAddressBaseType }
     *     
     */
    public PaymentAddressBaseType getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAddressBaseType }
     *     
     */
    public void setCompany(PaymentAddressBaseType value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà person.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAddressType }
     *     
     */
    public PaymentAddressType getPerson() {
        return person;
    }

    /**
     * Imposta il valore della proprietà person.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAddressType }
     *     
     */
    public void setPerson(PaymentAddressType value) {
        this.person = value;
    }

}
