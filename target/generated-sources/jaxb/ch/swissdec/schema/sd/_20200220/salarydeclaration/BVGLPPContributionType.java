
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20200220.common.NotificationsType;


/**
 * <p>Classe Java per BVG-LPP-ContributionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-ContributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BVG-LPP-Code" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeContribution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="EmployerContribution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyContribution" type="{http://www.swissdec.ch/schema/common/20200220/Common}SalaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-ContributionType", propOrder = {
    "bvglppCode",
    "validAsOf",
    "employeeContribution",
    "employerContribution",
    "thirdPartyContribution",
    "warning",
    "info"
})
public class BVGLPPContributionType {

    @XmlElement(name = "BVG-LPP-Code")
    protected String bvglppCode;
    @XmlElement(name = "ValidAsOf")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validAsOf;
    @XmlElement(name = "EmployeeContribution")
    protected BigDecimal employeeContribution;
    @XmlElement(name = "EmployerContribution")
    protected BigDecimal employerContribution;
    @XmlElement(name = "ThirdPartyContribution")
    protected BigDecimal thirdPartyContribution;
    @XmlElement(name = "Warning")
    protected NotificationsType warning;
    @XmlElement(name = "Info")
    protected NotificationsType info;

    /**
     * Recupera il valore della proprietà bvglppCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVGLPPCode() {
        return bvglppCode;
    }

    /**
     * Imposta il valore della proprietà bvglppCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVGLPPCode(String value) {
        this.bvglppCode = value;
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
     * Recupera il valore della proprietà employeeContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeContribution() {
        return employeeContribution;
    }

    /**
     * Imposta il valore della proprietà employeeContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeContribution(BigDecimal value) {
        this.employeeContribution = value;
    }

    /**
     * Recupera il valore della proprietà employerContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployerContribution() {
        return employerContribution;
    }

    /**
     * Imposta il valore della proprietà employerContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployerContribution(BigDecimal value) {
        this.employerContribution = value;
    }

    /**
     * Recupera il valore della proprietà thirdPartyContribution.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThirdPartyContribution() {
        return thirdPartyContribution;
    }

    /**
     * Imposta il valore della proprietà thirdPartyContribution.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThirdPartyContribution(BigDecimal value) {
        this.thirdPartyContribution = value;
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
