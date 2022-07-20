
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.EmptyType;


/**
 * <p>Classe Java per ConcubinageType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConcubinageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SoleCustody" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType"/&gt;
 *         &lt;element name="ShareCustodyAndHigherIncome" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType"/&gt;
 *         &lt;element name="AdultChildAndHigherIncome" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcubinageType", propOrder = {
    "soleCustody",
    "shareCustodyAndHigherIncome",
    "adultChildAndHigherIncome"
})
public class ConcubinageType {

    @XmlElement(name = "SoleCustody")
    protected EmptyType soleCustody;
    @XmlElement(name = "ShareCustodyAndHigherIncome")
    protected EmptyType shareCustodyAndHigherIncome;
    @XmlElement(name = "AdultChildAndHigherIncome")
    protected EmptyType adultChildAndHigherIncome;

    /**
     * Recupera il valore della proprietà soleCustody.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getSoleCustody() {
        return soleCustody;
    }

    /**
     * Imposta il valore della proprietà soleCustody.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setSoleCustody(EmptyType value) {
        this.soleCustody = value;
    }

    /**
     * Recupera il valore della proprietà shareCustodyAndHigherIncome.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getShareCustodyAndHigherIncome() {
        return shareCustodyAndHigherIncome;
    }

    /**
     * Imposta il valore della proprietà shareCustodyAndHigherIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setShareCustodyAndHigherIncome(EmptyType value) {
        this.shareCustodyAndHigherIncome = value;
    }

    /**
     * Recupera il valore della proprietà adultChildAndHigherIncome.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getAdultChildAndHigherIncome() {
        return adultChildAndHigherIncome;
    }

    /**
     * Imposta il valore della proprietà adultChildAndHigherIncome.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setAdultChildAndHigherIncome(EmptyType value) {
        this.adultChildAndHigherIncome = value;
    }

}
