
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.NotificationsType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.ContributionsStaffType;


/**
 * <p>Classe Java per BVG-LPP-SuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-SuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}BVG-LPP-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangesConsideredUpTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Staff" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}ContributionsStaffType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-SuccessType", propOrder = {
    "changesConsideredUpTo",
    "staff",
    "warning",
    "info"
})
public class BVGLPPSuccessType
    extends BVGLPPMinimalResultStateType
{

    @XmlElement(name = "ChangesConsideredUpTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changesConsideredUpTo;
    @XmlElement(name = "Staff")
    protected ContributionsStaffType staff;
    @XmlElement(name = "Warning")
    protected NotificationsType warning;
    @XmlElement(name = "Info")
    protected NotificationsType info;

    /**
     * Recupera il valore della proprietà changesConsideredUpTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangesConsideredUpTo() {
        return changesConsideredUpTo;
    }

    /**
     * Imposta il valore della proprietà changesConsideredUpTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangesConsideredUpTo(XMLGregorianCalendar value) {
        this.changesConsideredUpTo = value;
    }

    /**
     * Recupera il valore della proprietà staff.
     * 
     * @return
     *     possible object is
     *     {@link ContributionsStaffType }
     *     
     */
    public ContributionsStaffType getStaff() {
        return staff;
    }

    /**
     * Imposta il valore della proprietà staff.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionsStaffType }
     *     
     */
    public void setStaff(ContributionsStaffType value) {
        this.staff = value;
    }

    /**
     * Recupera il valore della proprietà warning.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getWarning() {
        return warning;
    }

    /**
     * Imposta il valore della proprietà warning.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setWarning(NotificationsType value) {
        this.warning = value;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setInfo(NotificationsType value) {
        this.info = value;
    }

}
