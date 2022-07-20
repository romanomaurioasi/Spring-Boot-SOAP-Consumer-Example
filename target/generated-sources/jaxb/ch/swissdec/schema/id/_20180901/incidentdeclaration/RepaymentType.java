
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.ContactInstitutionType;


/**
 * <p>Classe Java per RepaymentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RepaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RepaymentID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="LinkToSettlementID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ESR" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ESRType"/&gt;
 *           &lt;element name="Transfer" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}TransferType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ContactInsurance" type="{http://www.swissdec.ch/schema/common/20180901/Common}ContactInstitutionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepaymentType", propOrder = {
    "repaymentID",
    "linkToSettlementID",
    "expiryDate",
    "esr",
    "transfer",
    "contactInsurance"
})
public class RepaymentType
    extends StoryBaseType
{

    @XmlElement(name = "RepaymentID", required = true)
    protected String repaymentID;
    @XmlElement(name = "LinkToSettlementID", required = true)
    protected String linkToSettlementID;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "ESR")
    protected ESRType esr;
    @XmlElement(name = "Transfer")
    protected TransferType transfer;
    @XmlElement(name = "ContactInsurance")
    protected ContactInstitutionType contactInsurance;

    /**
     * Recupera il valore della proprietà repaymentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentID() {
        return repaymentID;
    }

    /**
     * Imposta il valore della proprietà repaymentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentID(String value) {
        this.repaymentID = value;
    }

    /**
     * Recupera il valore della proprietà linkToSettlementID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToSettlementID() {
        return linkToSettlementID;
    }

    /**
     * Imposta il valore della proprietà linkToSettlementID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToSettlementID(String value) {
        this.linkToSettlementID = value;
    }

    /**
     * Recupera il valore della proprietà expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Imposta il valore della proprietà expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Recupera il valore della proprietà esr.
     * 
     * @return
     *     possible object is
     *     {@link ESRType }
     *     
     */
    public ESRType getESR() {
        return esr;
    }

    /**
     * Imposta il valore della proprietà esr.
     * 
     * @param value
     *     allowed object is
     *     {@link ESRType }
     *     
     */
    public void setESR(ESRType value) {
        this.esr = value;
    }

    /**
     * Recupera il valore della proprietà transfer.
     * 
     * @return
     *     possible object is
     *     {@link TransferType }
     *     
     */
    public TransferType getTransfer() {
        return transfer;
    }

    /**
     * Imposta il valore della proprietà transfer.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferType }
     *     
     */
    public void setTransfer(TransferType value) {
        this.transfer = value;
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

}
