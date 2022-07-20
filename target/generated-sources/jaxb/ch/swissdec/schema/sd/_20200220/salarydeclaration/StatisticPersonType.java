
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.SocialInsuranceIdentificationType;


/**
 * <p>Classe Java per StatisticPersonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticPersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Social-InsuranceIdentification" type="{http://www.swissdec.ch/schema/common/20200220/Common}Social-InsuranceIdentificationType"/&gt;
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DescriptionCode" type="{http://www.swissdec.ch/schema/common/20200220/Common}DescriptionCodeType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticPersonType", propOrder = {
    "socialInsuranceIdentification",
    "employeeNumber",
    "descriptionCode"
})
public class StatisticPersonType {

    @XmlElement(name = "Social-InsuranceIdentification", required = true)
    protected SocialInsuranceIdentificationType socialInsuranceIdentification;
    @XmlElement(name = "EmployeeNumber", required = true)
    protected String employeeNumber;
    @XmlElement(name = "DescriptionCode", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected List<BigInteger> descriptionCode;

    /**
     * Recupera il valore della proprietà socialInsuranceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link SocialInsuranceIdentificationType }
     *     
     */
    public SocialInsuranceIdentificationType getSocialInsuranceIdentification() {
        return socialInsuranceIdentification;
    }

    /**
     * Imposta il valore della proprietà socialInsuranceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialInsuranceIdentificationType }
     *     
     */
    public void setSocialInsuranceIdentification(SocialInsuranceIdentificationType value) {
        this.socialInsuranceIdentification = value;
    }

    /**
     * Recupera il valore della proprietà employeeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Imposta il valore della proprietà employeeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the descriptionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getDescriptionCode() {
        if (descriptionCode == null) {
            descriptionCode = new ArrayList<BigInteger>();
        }
        return this.descriptionCode;
    }

}
