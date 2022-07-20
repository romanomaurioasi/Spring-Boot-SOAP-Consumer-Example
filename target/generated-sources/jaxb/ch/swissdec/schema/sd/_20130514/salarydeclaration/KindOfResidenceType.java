
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per KindOfResidenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KindOfResidenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Daily" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType"/&gt;
 *         &lt;element name="Weekly" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AddressType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KindOfResidenceType", propOrder = {
    "daily",
    "weekly"
})
public class KindOfResidenceType {

    @XmlElement(name = "Daily")
    protected EmptyType daily;
    @XmlElement(name = "Weekly")
    protected AddressType weekly;

    /**
     * Recupera il valore della proprietà daily.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getDaily() {
        return daily;
    }

    /**
     * Imposta il valore della proprietà daily.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setDaily(EmptyType value) {
        this.daily = value;
    }

    /**
     * Recupera il valore della proprietà weekly.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getWeekly() {
        return weekly;
    }

    /**
     * Imposta il valore della proprietà weekly.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setWeekly(AddressType value) {
        this.weekly = value;
    }

}
