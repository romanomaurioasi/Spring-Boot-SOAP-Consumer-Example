
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FAK-CAF-CustomerIdentificationBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-CustomerIdentificationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FAK-CAF-BranchNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType"/&gt;
 *         &lt;element name="FAK-CAF-CustomerNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType"/&gt;
 *         &lt;element name="FAK-CAF-SubNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}IDType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-CustomerIdentificationBaseType", propOrder = {
    "fakcafBranchNumber",
    "fakcafCustomerNumber",
    "fakcafSubNumber",
    "comment"
})
@XmlSeeAlso({
    FAKCAFCustomerIdentificationType.class,
    FAKCAFCustomerIdentificationConsumerType.class
})
public class FAKCAFCustomerIdentificationBaseType {

    @XmlElement(name = "FAK-CAF-BranchNumber", required = true)
    protected String fakcafBranchNumber;
    @XmlElement(name = "FAK-CAF-CustomerNumber", required = true)
    protected String fakcafCustomerNumber;
    @XmlElement(name = "FAK-CAF-SubNumber")
    protected String fakcafSubNumber;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà fakcafBranchNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAKCAFBranchNumber() {
        return fakcafBranchNumber;
    }

    /**
     * Imposta il valore della proprietà fakcafBranchNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAKCAFBranchNumber(String value) {
        this.fakcafBranchNumber = value;
    }

    /**
     * Recupera il valore della proprietà fakcafCustomerNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAKCAFCustomerNumber() {
        return fakcafCustomerNumber;
    }

    /**
     * Imposta il valore della proprietà fakcafCustomerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAKCAFCustomerNumber(String value) {
        this.fakcafCustomerNumber = value;
    }

    /**
     * Recupera il valore della proprietà fakcafSubNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAKCAFSubNumber() {
        return fakcafSubNumber;
    }

    /**
     * Imposta il valore della proprietà fakcafSubNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAKCAFSubNumber(String value) {
        this.fakcafSubNumber = value;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setComment(NotificationsType value) {
        this.comment = value;
    }

}
