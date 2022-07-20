
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per Social-InsuranceIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Social-InsuranceIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SV-AS-Number" type="{http://www.swissdec.ch/schema/common/20200220/Common}SV-AS-NumberType"/&gt;
 *         &lt;element name="unknown" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Social-InsuranceIdentificationType", propOrder = {
    "svasNumber",
    "unknown"
})
public class SocialInsuranceIdentificationType {

    @XmlElement(name = "SV-AS-Number")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String svasNumber;
    protected EmptyType unknown;

    /**
     * Recupera il valore della proprietà svasNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVASNumber() {
        return svasNumber;
    }

    /**
     * Imposta il valore della proprietà svasNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVASNumber(String value) {
        this.svasNumber = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getUnknown() {
        return unknown;
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setUnknown(EmptyType value) {
        this.unknown = value;
    }

}
