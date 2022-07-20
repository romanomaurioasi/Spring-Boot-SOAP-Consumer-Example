
package ch.swissdec.schema.common._20200220.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NotificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QualityLevel" type="{http://www.swissdec.ch/schema/common/20200220/Common}QualityLevelType"/&gt;
 *         &lt;element name="DescriptionCode" type="{http://www.swissdec.ch/schema/common/20200220/Common}DescriptionCodeType"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", propOrder = {
    "qualityLevel",
    "descriptionCode",
    "description"
})
public class NotificationType {

    @XmlElement(name = "QualityLevel", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected QualityLevelType qualityLevel;
    @XmlElement(name = "DescriptionCode", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger descriptionCode;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Recupera il valore della proprietà qualityLevel.
     * 
     * @return
     *     possible object is
     *     {@link QualityLevelType }
     *     
     */
    public QualityLevelType getQualityLevel() {
        return qualityLevel;
    }

    /**
     * Imposta il valore della proprietà qualityLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityLevelType }
     *     
     */
    public void setQualityLevel(QualityLevelType value) {
        this.qualityLevel = value;
    }

    /**
     * Recupera il valore della proprietà descriptionCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Imposta il valore della proprietà descriptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDescriptionCode(BigInteger value) {
        this.descriptionCode = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
