
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per KindOfSalariesTimedType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KindOfSalariesTimedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HourlyPay" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}HourlyPayType" minOccurs="0"/&gt;
 *         &lt;element name="Detail" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}KindOfSalaryTimedType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KindOfSalariesTimedType", propOrder = {
    "hourlyPay",
    "detail"
})
public class KindOfSalariesTimedType {

    @XmlElement(name = "HourlyPay")
    protected HourlyPayType hourlyPay;
    @XmlElement(name = "Detail")
    protected List<KindOfSalaryTimedType> detail;

    /**
     * Recupera il valore della proprietà hourlyPay.
     * 
     * @return
     *     possible object is
     *     {@link HourlyPayType }
     *     
     */
    public HourlyPayType getHourlyPay() {
        return hourlyPay;
    }

    /**
     * Imposta il valore della proprietà hourlyPay.
     * 
     * @param value
     *     allowed object is
     *     {@link HourlyPayType }
     *     
     */
    public void setHourlyPay(HourlyPayType value) {
        this.hourlyPay = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KindOfSalaryTimedType }
     * 
     * 
     */
    public List<KindOfSalaryTimedType> getDetail() {
        if (detail == null) {
            detail = new ArrayList<KindOfSalaryTimedType>();
        }
        return this.detail;
    }

}
