
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SalaryCountersType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryCountersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOf-AHV-AVS-Salary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-UVG-LAA-Salary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-UVGZ-LAAC-Salary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-KTG-AMC-Salary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-BVG-LPP-Salary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-FAK-CAF-Salary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-TaxAnnuity-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-TaxSalary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-StatisticSalary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NumberOf-TaxAtSourceSalary-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryCountersType", propOrder = {
    "numberOfAHVAVSSalaryTags",
    "numberOfUVGLAASalaryTags",
    "numberOfUVGZLAACSalaryTags",
    "numberOfKTGAMCSalaryTags",
    "numberOfBVGLPPSalaryTags",
    "numberOfFAKCAFSalaryTags",
    "numberOfTaxAnnuityTags",
    "numberOfTaxSalaryTags",
    "numberOfStatisticSalaryTags",
    "numberOfTaxAtSourceSalaryTags"
})
public class SalaryCountersType {

    @XmlElement(name = "NumberOf-AHV-AVS-Salary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfAHVAVSSalaryTags;
    @XmlElement(name = "NumberOf-UVG-LAA-Salary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfUVGLAASalaryTags;
    @XmlElement(name = "NumberOf-UVGZ-LAAC-Salary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfUVGZLAACSalaryTags;
    @XmlElement(name = "NumberOf-KTG-AMC-Salary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfKTGAMCSalaryTags;
    @XmlElement(name = "NumberOf-BVG-LPP-Salary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfBVGLPPSalaryTags;
    @XmlElement(name = "NumberOf-FAK-CAF-Salary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfFAKCAFSalaryTags;
    @XmlElement(name = "NumberOf-TaxAnnuity-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfTaxAnnuityTags;
    @XmlElement(name = "NumberOf-TaxSalary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfTaxSalaryTags;
    @XmlElement(name = "NumberOf-StatisticSalary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfStatisticSalaryTags;
    @XmlElement(name = "NumberOf-TaxAtSourceSalary-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfTaxAtSourceSalaryTags;

    /**
     * Recupera il valore della proprietà numberOfAHVAVSSalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfAHVAVSSalaryTags() {
        return numberOfAHVAVSSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfAHVAVSSalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfAHVAVSSalaryTags(Long value) {
        this.numberOfAHVAVSSalaryTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfUVGLAASalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfUVGLAASalaryTags() {
        return numberOfUVGLAASalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfUVGLAASalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfUVGLAASalaryTags(Long value) {
        this.numberOfUVGLAASalaryTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfUVGZLAACSalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfUVGZLAACSalaryTags() {
        return numberOfUVGZLAACSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfUVGZLAACSalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfUVGZLAACSalaryTags(Long value) {
        this.numberOfUVGZLAACSalaryTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfKTGAMCSalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfKTGAMCSalaryTags() {
        return numberOfKTGAMCSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfKTGAMCSalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfKTGAMCSalaryTags(Long value) {
        this.numberOfKTGAMCSalaryTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfBVGLPPSalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfBVGLPPSalaryTags() {
        return numberOfBVGLPPSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfBVGLPPSalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfBVGLPPSalaryTags(Long value) {
        this.numberOfBVGLPPSalaryTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfFAKCAFSalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfFAKCAFSalaryTags() {
        return numberOfFAKCAFSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfFAKCAFSalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfFAKCAFSalaryTags(Long value) {
        this.numberOfFAKCAFSalaryTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfTaxAnnuityTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfTaxAnnuityTags() {
        return numberOfTaxAnnuityTags;
    }

    /**
     * Imposta il valore della proprietà numberOfTaxAnnuityTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfTaxAnnuityTags(Long value) {
        this.numberOfTaxAnnuityTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfTaxSalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfTaxSalaryTags() {
        return numberOfTaxSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfTaxSalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfTaxSalaryTags(Long value) {
        this.numberOfTaxSalaryTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfStatisticSalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfStatisticSalaryTags() {
        return numberOfStatisticSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfStatisticSalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfStatisticSalaryTags(Long value) {
        this.numberOfStatisticSalaryTags = value;
    }

    /**
     * Recupera il valore della proprietà numberOfTaxAtSourceSalaryTags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfTaxAtSourceSalaryTags() {
        return numberOfTaxAtSourceSalaryTags;
    }

    /**
     * Imposta il valore della proprietà numberOfTaxAtSourceSalaryTags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfTaxAtSourceSalaryTags(Long value) {
        this.numberOfTaxAtSourceSalaryTags = value;
    }

}
