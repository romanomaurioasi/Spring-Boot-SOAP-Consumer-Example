
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ProofOfInsuranceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProofOfInsuranceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Link" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}LinkRowsType" minOccurs="0"/&gt;
 *         &lt;element name="CompensationOffice" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AddressRowsType"/&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AddressRowsType"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartingSalutation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Text" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TextRowsType"/&gt;
 *         &lt;element name="EndingSalutation" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}EndingSalutationRowsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProofOfInsuranceType", propOrder = {
    "link",
    "compensationOffice",
    "company",
    "date",
    "subject",
    "startingSalutation",
    "text",
    "endingSalutation"
})
public class ProofOfInsuranceType {

    @XmlElement(name = "Link")
    protected LinkRowsType link;
    @XmlElement(name = "CompensationOffice", required = true)
    protected AddressRowsType compensationOffice;
    @XmlElement(name = "Company", required = true)
    protected AddressRowsType company;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "StartingSalutation", required = true)
    protected String startingSalutation;
    @XmlElement(name = "Text", required = true)
    protected TextRowsType text;
    @XmlElement(name = "EndingSalutation", required = true)
    protected EndingSalutationRowsType endingSalutation;

    /**
     * Recupera il valore della proprietà link.
     * 
     * @return
     *     possible object is
     *     {@link LinkRowsType }
     *     
     */
    public LinkRowsType getLink() {
        return link;
    }

    /**
     * Imposta il valore della proprietà link.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRowsType }
     *     
     */
    public void setLink(LinkRowsType value) {
        this.link = value;
    }

    /**
     * Recupera il valore della proprietà compensationOffice.
     * 
     * @return
     *     possible object is
     *     {@link AddressRowsType }
     *     
     */
    public AddressRowsType getCompensationOffice() {
        return compensationOffice;
    }

    /**
     * Imposta il valore della proprietà compensationOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRowsType }
     *     
     */
    public void setCompensationOffice(AddressRowsType value) {
        this.compensationOffice = value;
    }

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link AddressRowsType }
     *     
     */
    public AddressRowsType getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRowsType }
     *     
     */
    public void setCompany(AddressRowsType value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Recupera il valore della proprietà subject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Imposta il valore della proprietà subject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Recupera il valore della proprietà startingSalutation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingSalutation() {
        return startingSalutation;
    }

    /**
     * Imposta il valore della proprietà startingSalutation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingSalutation(String value) {
        this.startingSalutation = value;
    }

    /**
     * Recupera il valore della proprietà text.
     * 
     * @return
     *     possible object is
     *     {@link TextRowsType }
     *     
     */
    public TextRowsType getText() {
        return text;
    }

    /**
     * Imposta il valore della proprietà text.
     * 
     * @param value
     *     allowed object is
     *     {@link TextRowsType }
     *     
     */
    public void setText(TextRowsType value) {
        this.text = value;
    }

    /**
     * Recupera il valore della proprietà endingSalutation.
     * 
     * @return
     *     possible object is
     *     {@link EndingSalutationRowsType }
     *     
     */
    public EndingSalutationRowsType getEndingSalutation() {
        return endingSalutation;
    }

    /**
     * Imposta il valore della proprietà endingSalutation.
     * 
     * @param value
     *     allowed object is
     *     {@link EndingSalutationRowsType }
     *     
     */
    public void setEndingSalutation(EndingSalutationRowsType value) {
        this.endingSalutation = value;
    }

}
