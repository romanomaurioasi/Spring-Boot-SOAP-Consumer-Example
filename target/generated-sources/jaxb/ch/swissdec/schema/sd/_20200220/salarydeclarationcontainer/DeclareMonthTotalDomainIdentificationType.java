
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.AHVAVSIdentificationType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.FAKCAFIdentificationType;


/**
 * <p>Classe Java per DeclareMonthTotalDomainIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclareMonthTotalDomainIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS-Identification" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-IdentificationType"/&gt;
 *         &lt;element name="FAK-CAF-Identification" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-IdentificationType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclareMonthTotalDomainIdentificationType", propOrder = {
    "ahvavsIdentification",
    "fakcafIdentification"
})
public class DeclareMonthTotalDomainIdentificationType {

    @XmlElement(name = "AHV-AVS-Identification")
    protected AHVAVSIdentificationType ahvavsIdentification;
    @XmlElement(name = "FAK-CAF-Identification")
    protected FAKCAFIdentificationType fakcafIdentification;

    /**
     * Recupera il valore della proprietà ahvavsIdentification.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSIdentificationType }
     *     
     */
    public AHVAVSIdentificationType getAHVAVSIdentification() {
        return ahvavsIdentification;
    }

    /**
     * Imposta il valore della proprietà ahvavsIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSIdentificationType }
     *     
     */
    public void setAHVAVSIdentification(AHVAVSIdentificationType value) {
        this.ahvavsIdentification = value;
    }

    /**
     * Recupera il valore della proprietà fakcafIdentification.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFIdentificationType }
     *     
     */
    public FAKCAFIdentificationType getFAKCAFIdentification() {
        return fakcafIdentification;
    }

    /**
     * Imposta il valore della proprietà fakcafIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFIdentificationType }
     *     
     */
    public void setFAKCAFIdentification(FAKCAFIdentificationType value) {
        this.fakcafIdentification = value;
    }

}
