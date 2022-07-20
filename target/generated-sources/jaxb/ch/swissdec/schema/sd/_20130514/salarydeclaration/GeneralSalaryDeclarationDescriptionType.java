
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per GeneralSalaryDeclarationDescriptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralSalaryDeclarationDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="AccountingPeriod" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *         &lt;element name="ContactPerson" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ContactPersonType" minOccurs="0"/&gt;
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
@XmlType(name = "GeneralSalaryDeclarationDescriptionType", propOrder = {
    "creationDate",
    "accountingPeriod",
    "contactPerson",
    "comment"
})
public class GeneralSalaryDeclarationDescriptionType {

    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "AccountingPeriod", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar accountingPeriod;
    @XmlElement(name = "ContactPerson")
    protected ContactPersonType contactPerson;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Imposta il valore della proprietà creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Recupera il valore della proprietà accountingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountingPeriod() {
        return accountingPeriod;
    }

    /**
     * Imposta il valore della proprietà accountingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountingPeriod(XMLGregorianCalendar value) {
        this.accountingPeriod = value;
    }

    /**
     * Recupera il valore della proprietà contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getContactPerson() {
        return contactPerson;
    }

    /**
     * Imposta il valore della proprietà contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setContactPerson(ContactPersonType value) {
        this.contactPerson = value;
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
