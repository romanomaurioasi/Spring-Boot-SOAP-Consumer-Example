
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StandardRemarkAnnuityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StandardRemarkAnnuityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rectificate" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}RectificateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardRemarkAnnuityType", propOrder = {
    "rectificate"
})
public class StandardRemarkAnnuityType {

    @XmlElement(name = "Rectificate")
    protected RectificateType rectificate;

    /**
     * Recupera il valore della proprietà rectificate.
     * 
     * @return
     *     possible object is
     *     {@link RectificateType }
     *     
     */
    public RectificateType getRectificate() {
        return rectificate;
    }

    /**
     * Imposta il valore della proprietà rectificate.
     * 
     * @param value
     *     allowed object is
     *     {@link RectificateType }
     *     
     */
    public void setRectificate(RectificateType value) {
        this.rectificate = value;
    }

}
