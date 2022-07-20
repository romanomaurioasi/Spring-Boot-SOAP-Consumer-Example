
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AwaitCorrectionFromCompanyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AwaitCorrectionFromCompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidAsOf" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="TaxAtSourceCategory" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCategoryType"/&gt;
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
@XmlType(name = "AwaitCorrectionFromCompanyType", propOrder = {
    "validAsOf",
    "taxAtSourceCategory",
    "comment"
})
public class AwaitCorrectionFromCompanyType {

    @XmlElement(name = "ValidAsOf", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar validAsOf;
    @XmlElement(name = "TaxAtSourceCategory", required = true)
    protected TaxAtSourceCategoryType taxAtSourceCategory;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà validAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidAsOf() {
        return validAsOf;
    }

    /**
     * Imposta il valore della proprietà validAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidAsOf(XMLGregorianCalendar value) {
        this.validAsOf = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceCategory.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCategoryType }
     *     
     */
    public TaxAtSourceCategoryType getTaxAtSourceCategory() {
        return taxAtSourceCategory;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCategoryType }
     *     
     */
    public void setTaxAtSourceCategory(TaxAtSourceCategoryType value) {
        this.taxAtSourceCategory = value;
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
