
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ErrorResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndUserInformation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetailInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaultInformation" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}SalaryDeclarationFaultType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResponseType", propOrder = {
    "endUserInformation",
    "detailInformation",
    "faultInformation"
})
public class ErrorResponseType {

    @XmlElement(name = "EndUserInformation", required = true)
    protected String endUserInformation;
    @XmlElement(name = "DetailInformation")
    protected String detailInformation;
    @XmlElement(name = "FaultInformation")
    protected SalaryDeclarationFaultType faultInformation;

    /**
     * Recupera il valore della proprietà endUserInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUserInformation() {
        return endUserInformation;
    }

    /**
     * Imposta il valore della proprietà endUserInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUserInformation(String value) {
        this.endUserInformation = value;
    }

    /**
     * Recupera il valore della proprietà detailInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailInformation() {
        return detailInformation;
    }

    /**
     * Imposta il valore della proprietà detailInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailInformation(String value) {
        this.detailInformation = value;
    }

    /**
     * Recupera il valore della proprietà faultInformation.
     * 
     * @return
     *     possible object is
     *     {@link SalaryDeclarationFaultType }
     *     
     */
    public SalaryDeclarationFaultType getFaultInformation() {
        return faultInformation;
    }

    /**
     * Imposta il valore della proprietà faultInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryDeclarationFaultType }
     *     
     */
    public void setFaultInformation(SalaryDeclarationFaultType value) {
        this.faultInformation = value;
    }

}
