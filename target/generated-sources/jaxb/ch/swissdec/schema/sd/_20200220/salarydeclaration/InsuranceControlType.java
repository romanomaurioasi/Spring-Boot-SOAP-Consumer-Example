
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.UIDBFSUnknownType;


/**
 * <p>Classe Java per InsuranceControlType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsuranceControlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Name" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *           &lt;element name="UID-BFS" type="{http://www.swissdec.ch/schema/common/20200220/Common}UID-BFS-UnknownType"/&gt;
 *           &lt;element name="ValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="NoneWithReason" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceControlType", propOrder = {
    "name",
    "uidbfs",
    "validAsOf",
    "noneWithReason"
})
public class InsuranceControlType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "UID-BFS")
    protected UIDBFSUnknownType uidbfs;
    @XmlElement(name = "ValidAsOf")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validAsOf;
    @XmlElement(name = "NoneWithReason")
    protected String noneWithReason;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà uidbfs.
     * 
     * @return
     *     possible object is
     *     {@link UIDBFSUnknownType }
     *     
     */
    public UIDBFSUnknownType getUIDBFS() {
        return uidbfs;
    }

    /**
     * Imposta il valore della proprietà uidbfs.
     * 
     * @param value
     *     allowed object is
     *     {@link UIDBFSUnknownType }
     *     
     */
    public void setUIDBFS(UIDBFSUnknownType value) {
        this.uidbfs = value;
    }

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
     * Recupera il valore della proprietà noneWithReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoneWithReason() {
        return noneWithReason;
    }

    /**
     * Imposta il valore della proprietà noneWithReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoneWithReason(String value) {
        this.noneWithReason = value;
    }

}
