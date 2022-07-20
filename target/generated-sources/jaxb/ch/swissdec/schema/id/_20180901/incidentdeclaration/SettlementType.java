
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.ContactInstitutionType;
import ch.swissdec.schema.common._20180901.common.NotificationsType;


/**
 * <p>Classe Java per SettlementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SettlementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SettlementID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TotalBalance" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}TotalBalanceType"/&gt;
 *         &lt;element name="Coverage" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="AnnualEarnings" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="CoveredDailyAllowance" type="{http://www.swissdec.ch/schema/common/20180901/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ContactInsurance" type="{http://www.swissdec.ch/schema/common/20180901/Common}ContactInstitutionType" minOccurs="0"/&gt;
 *         &lt;element name="Indemnifications" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}IndemnificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementType", propOrder = {
    "settlementID",
    "settlementDate",
    "totalBalance",
    "coverage",
    "annualEarnings",
    "coveredDailyAllowance",
    "contactInsurance",
    "indemnifications",
    "comment"
})
public class SettlementType
    extends StoryBaseType
{

    @XmlElement(name = "SettlementID", required = true)
    protected String settlementID;
    @XmlElement(name = "SettlementDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settlementDate;
    @XmlElement(name = "TotalBalance", required = true)
    protected TotalBalanceType totalBalance;
    @XmlElement(name = "Coverage")
    protected String coverage;
    @XmlElement(name = "AnnualEarnings")
    protected BigDecimal annualEarnings;
    @XmlElement(name = "CoveredDailyAllowance")
    protected BigDecimal coveredDailyAllowance;
    @XmlElement(name = "ContactInsurance")
    protected ContactInstitutionType contactInsurance;
    @XmlElement(name = "Indemnifications")
    protected IndemnificationsType indemnifications;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà settlementID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementID() {
        return settlementID;
    }

    /**
     * Imposta il valore della proprietà settlementID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementID(String value) {
        this.settlementID = value;
    }

    /**
     * Recupera il valore della proprietà settlementDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementDate() {
        return settlementDate;
    }

    /**
     * Imposta il valore della proprietà settlementDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementDate(XMLGregorianCalendar value) {
        this.settlementDate = value;
    }

    /**
     * Recupera il valore della proprietà totalBalance.
     * 
     * @return
     *     possible object is
     *     {@link TotalBalanceType }
     *     
     */
    public TotalBalanceType getTotalBalance() {
        return totalBalance;
    }

    /**
     * Imposta il valore della proprietà totalBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalBalanceType }
     *     
     */
    public void setTotalBalance(TotalBalanceType value) {
        this.totalBalance = value;
    }

    /**
     * Recupera il valore della proprietà coverage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Imposta il valore della proprietà coverage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

    /**
     * Recupera il valore della proprietà annualEarnings.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualEarnings() {
        return annualEarnings;
    }

    /**
     * Imposta il valore della proprietà annualEarnings.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualEarnings(BigDecimal value) {
        this.annualEarnings = value;
    }

    /**
     * Recupera il valore della proprietà coveredDailyAllowance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoveredDailyAllowance() {
        return coveredDailyAllowance;
    }

    /**
     * Imposta il valore della proprietà coveredDailyAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoveredDailyAllowance(BigDecimal value) {
        this.coveredDailyAllowance = value;
    }

    /**
     * Recupera il valore della proprietà contactInsurance.
     * 
     * @return
     *     possible object is
     *     {@link ContactInstitutionType }
     *     
     */
    public ContactInstitutionType getContactInsurance() {
        return contactInsurance;
    }

    /**
     * Imposta il valore della proprietà contactInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInstitutionType }
     *     
     */
    public void setContactInsurance(ContactInstitutionType value) {
        this.contactInsurance = value;
    }

    /**
     * Recupera il valore della proprietà indemnifications.
     * 
     * @return
     *     possible object is
     *     {@link IndemnificationsType }
     *     
     */
    public IndemnificationsType getIndemnifications() {
        return indemnifications;
    }

    /**
     * Imposta il valore della proprietà indemnifications.
     * 
     * @param value
     *     allowed object is
     *     {@link IndemnificationsType }
     *     
     */
    public void setIndemnifications(IndemnificationsType value) {
        this.indemnifications = value;
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
