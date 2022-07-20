
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.NotificationsType;


/**
 * <p>Classe Java per ReversalResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReversalResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="Old" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceBaseType"/&gt;
 *         &lt;element name="New" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceBaseType"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversalResultType", propOrder = {
    "month",
    "old",
    "_new",
    "comment"
})
public class ReversalResultType {

    @XmlElement(name = "Month", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar month;
    @XmlElement(name = "Old", required = true)
    protected TaxAtSourceBaseType old;
    @XmlElement(name = "New", required = true)
    protected TaxAtSourceBaseType _new;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà month.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonth() {
        return month;
    }

    /**
     * Imposta il valore della proprietà month.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonth(XMLGregorianCalendar value) {
        this.month = value;
    }

    /**
     * Recupera il valore della proprietà old.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceBaseType }
     *     
     */
    public TaxAtSourceBaseType getOld() {
        return old;
    }

    /**
     * Imposta il valore della proprietà old.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceBaseType }
     *     
     */
    public void setOld(TaxAtSourceBaseType value) {
        this.old = value;
    }

    /**
     * Recupera il valore della proprietà new.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceBaseType }
     *     
     */
    public TaxAtSourceBaseType getNew() {
        return _new;
    }

    /**
     * Imposta il valore della proprietà new.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceBaseType }
     *     
     */
    public void setNew(TaxAtSourceBaseType value) {
        this._new = value;
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
