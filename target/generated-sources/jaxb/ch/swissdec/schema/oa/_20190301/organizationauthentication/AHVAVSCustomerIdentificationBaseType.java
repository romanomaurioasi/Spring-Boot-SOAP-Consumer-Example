
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per AHV-AVS-CustomerIdentificationBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-CustomerIdentificationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AK-CC-BranchNumber" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}AK-CC-NumberType"/&gt;
 *         &lt;element name="AK-CC-CustomerNumber" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}NotEmptyStringType"/&gt;
 *         &lt;element name="AK-CC-SubNumber" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-CustomerIdentificationBaseType", propOrder = {
    "akccBranchNumber",
    "akccCustomerNumber",
    "akccSubNumber"
})
public class AHVAVSCustomerIdentificationBaseType {

    @XmlElement(name = "AK-CC-BranchNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String akccBranchNumber;
    @XmlElement(name = "AK-CC-CustomerNumber", required = true)
    protected String akccCustomerNumber;
    @XmlElement(name = "AK-CC-SubNumber")
    protected String akccSubNumber;

    /**
     * Recupera il valore della proprietà akccBranchNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKCCBranchNumber() {
        return akccBranchNumber;
    }

    /**
     * Imposta il valore della proprietà akccBranchNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKCCBranchNumber(String value) {
        this.akccBranchNumber = value;
    }

    /**
     * Recupera il valore della proprietà akccCustomerNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKCCCustomerNumber() {
        return akccCustomerNumber;
    }

    /**
     * Imposta il valore della proprietà akccCustomerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKCCCustomerNumber(String value) {
        this.akccCustomerNumber = value;
    }

    /**
     * Recupera il valore della proprietà akccSubNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKCCSubNumber() {
        return akccSubNumber;
    }

    /**
     * Imposta il valore della proprietà akccSubNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKCCSubNumber(String value) {
        this.akccSubNumber = value;
    }

}
