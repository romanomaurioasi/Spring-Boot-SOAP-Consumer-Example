
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.NotificationsType;


/**
 * <p>Classe Java per StatisticCustomerIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticCustomerIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayAgreement" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}PayAgreementType"/&gt;
 *         &lt;element name="PayrollUnit" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="institutionID" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticCustomerIdentificationType", propOrder = {
    "payAgreement",
    "payrollUnit",
    "comment"
})
public class StatisticCustomerIdentificationType {

    @XmlElement(name = "PayAgreement", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected PayAgreementType payAgreement;
    @XmlElement(name = "PayrollUnit")
    protected String payrollUnit;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;
    @XmlAttribute(name = "institutionID", required = true)
    protected String institutionID;

    /**
     * Recupera il valore della proprietà payAgreement.
     * 
     * @return
     *     possible object is
     *     {@link PayAgreementType }
     *     
     */
    public PayAgreementType getPayAgreement() {
        return payAgreement;
    }

    /**
     * Imposta il valore della proprietà payAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link PayAgreementType }
     *     
     */
    public void setPayAgreement(PayAgreementType value) {
        this.payAgreement = value;
    }

    /**
     * Recupera il valore della proprietà payrollUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollUnit() {
        return payrollUnit;
    }

    /**
     * Imposta il valore della proprietà payrollUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollUnit(String value) {
        this.payrollUnit = value;
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

    /**
     * Recupera il valore della proprietà institutionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionID() {
        return institutionID;
    }

    /**
     * Imposta il valore della proprietà institutionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionID(String value) {
        this.institutionID = value;
    }

}
