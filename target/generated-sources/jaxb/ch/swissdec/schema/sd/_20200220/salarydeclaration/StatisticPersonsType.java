
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatisticPersonsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticPersonsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Person" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticPersonType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Descriptions" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticNotification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticPersonsType", propOrder = {
    "person",
    "descriptions"
})
public class StatisticPersonsType {

    @XmlElement(name = "Person", required = true)
    protected List<StatisticPersonType> person;
    @XmlElement(name = "Descriptions")
    protected StatisticNotification descriptions;

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticPersonType }
     * 
     * 
     */
    public List<StatisticPersonType> getPerson() {
        if (person == null) {
            person = new ArrayList<StatisticPersonType>();
        }
        return this.person;
    }

    /**
     * Recupera il valore della proprietà descriptions.
     * 
     * @return
     *     possible object is
     *     {@link StatisticNotification }
     *     
     */
    public StatisticNotification getDescriptions() {
        return descriptions;
    }

    /**
     * Imposta il valore della proprietà descriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticNotification }
     *     
     */
    public void setDescriptions(StatisticNotification value) {
        this.descriptions = value;
    }

}
