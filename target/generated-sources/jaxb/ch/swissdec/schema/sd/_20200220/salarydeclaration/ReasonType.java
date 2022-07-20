
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.EmptyType;


/**
 * <p>Classe Java per ReasonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReasonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlockedOptions" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="UnquotedOptions" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="DeferredBenefitsStaffShares" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="FictitousStaffShare" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReasonType", propOrder = {
    "blockedOptions",
    "unquotedOptions",
    "deferredBenefitsStaffShares",
    "fictitousStaffShare"
})
public class ReasonType {

    @XmlElement(name = "BlockedOptions")
    protected EmptyType blockedOptions;
    @XmlElement(name = "UnquotedOptions")
    protected EmptyType unquotedOptions;
    @XmlElement(name = "DeferredBenefitsStaffShares")
    protected EmptyType deferredBenefitsStaffShares;
    @XmlElement(name = "FictitousStaffShare")
    protected EmptyType fictitousStaffShare;

    /**
     * Recupera il valore della proprietà blockedOptions.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getBlockedOptions() {
        return blockedOptions;
    }

    /**
     * Imposta il valore della proprietà blockedOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setBlockedOptions(EmptyType value) {
        this.blockedOptions = value;
    }

    /**
     * Recupera il valore della proprietà unquotedOptions.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getUnquotedOptions() {
        return unquotedOptions;
    }

    /**
     * Imposta il valore della proprietà unquotedOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setUnquotedOptions(EmptyType value) {
        this.unquotedOptions = value;
    }

    /**
     * Recupera il valore della proprietà deferredBenefitsStaffShares.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getDeferredBenefitsStaffShares() {
        return deferredBenefitsStaffShares;
    }

    /**
     * Imposta il valore della proprietà deferredBenefitsStaffShares.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setDeferredBenefitsStaffShares(EmptyType value) {
        this.deferredBenefitsStaffShares = value;
    }

    /**
     * Recupera il valore della proprietà fictitousStaffShare.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getFictitousStaffShare() {
        return fictitousStaffShare;
    }

    /**
     * Imposta il valore della proprietà fictitousStaffShare.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setFictitousStaffShare(EmptyType value) {
        this.fictitousStaffShare = value;
    }

}
