
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.AHVAVSIdentificationType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.BVGLPPIdentificationType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.FAKCAFIdentificationType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.KTGAMCIdentificationType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.RequestIdentificationBaseType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.TaxAtSourceIdentificationType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.TaxIdentificationType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.UVGLAAIdentificationType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.UVGZLAACIdentificationType;


/**
 * <p>Classe Java per DomainIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DomainIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS-Identification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AHV-AVS-IdentificationType"/&gt;
 *         &lt;element name="UVG-LAA-Identification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}UVG-LAA-IdentificationType"/&gt;
 *         &lt;element name="UVGZ-LAAC-Identification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}UVGZ-LAAC-IdentificationType"/&gt;
 *         &lt;element name="KTG-AMC-Identification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}KTG-AMC-IdentificationType"/&gt;
 *         &lt;element name="BVG-LPP-Identification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-IdentificationType"/&gt;
 *         &lt;element name="FAK-CAF-Identification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FAK-CAF-IdentificationType"/&gt;
 *         &lt;element name="TaxIdentification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxIdentificationType"/&gt;
 *         &lt;element name="StatisticIdentification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}RequestIdentificationBaseType"/&gt;
 *         &lt;element name="TaxAtSourceIdentification" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceIdentificationType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainIdentificationType", propOrder = {
    "ahvavsIdentification",
    "uvglaaIdentification",
    "uvgzlaacIdentification",
    "ktgamcIdentification",
    "bvglppIdentification",
    "fakcafIdentification",
    "taxIdentification",
    "statisticIdentification",
    "taxAtSourceIdentification"
})
public class DomainIdentificationType {

    @XmlElement(name = "AHV-AVS-Identification")
    protected AHVAVSIdentificationType ahvavsIdentification;
    @XmlElement(name = "UVG-LAA-Identification")
    protected UVGLAAIdentificationType uvglaaIdentification;
    @XmlElement(name = "UVGZ-LAAC-Identification")
    protected UVGZLAACIdentificationType uvgzlaacIdentification;
    @XmlElement(name = "KTG-AMC-Identification")
    protected KTGAMCIdentificationType ktgamcIdentification;
    @XmlElement(name = "BVG-LPP-Identification")
    protected BVGLPPIdentificationType bvglppIdentification;
    @XmlElement(name = "FAK-CAF-Identification")
    protected FAKCAFIdentificationType fakcafIdentification;
    @XmlElement(name = "TaxIdentification")
    protected TaxIdentificationType taxIdentification;
    @XmlElement(name = "StatisticIdentification")
    protected RequestIdentificationBaseType statisticIdentification;
    @XmlElement(name = "TaxAtSourceIdentification")
    protected TaxAtSourceIdentificationType taxAtSourceIdentification;

    /**
     * Recupera il valore della proprietà ahvavsIdentification.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSIdentificationType }
     *     
     */
    public AHVAVSIdentificationType getAHVAVSIdentification() {
        return ahvavsIdentification;
    }

    /**
     * Imposta il valore della proprietà ahvavsIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSIdentificationType }
     *     
     */
    public void setAHVAVSIdentification(AHVAVSIdentificationType value) {
        this.ahvavsIdentification = value;
    }

    /**
     * Recupera il valore della proprietà uvglaaIdentification.
     * 
     * @return
     *     possible object is
     *     {@link UVGLAAIdentificationType }
     *     
     */
    public UVGLAAIdentificationType getUVGLAAIdentification() {
        return uvglaaIdentification;
    }

    /**
     * Imposta il valore della proprietà uvglaaIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGLAAIdentificationType }
     *     
     */
    public void setUVGLAAIdentification(UVGLAAIdentificationType value) {
        this.uvglaaIdentification = value;
    }

    /**
     * Recupera il valore della proprietà uvgzlaacIdentification.
     * 
     * @return
     *     possible object is
     *     {@link UVGZLAACIdentificationType }
     *     
     */
    public UVGZLAACIdentificationType getUVGZLAACIdentification() {
        return uvgzlaacIdentification;
    }

    /**
     * Imposta il valore della proprietà uvgzlaacIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGZLAACIdentificationType }
     *     
     */
    public void setUVGZLAACIdentification(UVGZLAACIdentificationType value) {
        this.uvgzlaacIdentification = value;
    }

    /**
     * Recupera il valore della proprietà ktgamcIdentification.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCIdentificationType }
     *     
     */
    public KTGAMCIdentificationType getKTGAMCIdentification() {
        return ktgamcIdentification;
    }

    /**
     * Imposta il valore della proprietà ktgamcIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCIdentificationType }
     *     
     */
    public void setKTGAMCIdentification(KTGAMCIdentificationType value) {
        this.ktgamcIdentification = value;
    }

    /**
     * Recupera il valore della proprietà bvglppIdentification.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPIdentificationType }
     *     
     */
    public BVGLPPIdentificationType getBVGLPPIdentification() {
        return bvglppIdentification;
    }

    /**
     * Imposta il valore della proprietà bvglppIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPIdentificationType }
     *     
     */
    public void setBVGLPPIdentification(BVGLPPIdentificationType value) {
        this.bvglppIdentification = value;
    }

    /**
     * Recupera il valore della proprietà fakcafIdentification.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFIdentificationType }
     *     
     */
    public FAKCAFIdentificationType getFAKCAFIdentification() {
        return fakcafIdentification;
    }

    /**
     * Imposta il valore della proprietà fakcafIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFIdentificationType }
     *     
     */
    public void setFAKCAFIdentification(FAKCAFIdentificationType value) {
        this.fakcafIdentification = value;
    }

    /**
     * Recupera il valore della proprietà taxIdentification.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationType }
     *     
     */
    public TaxIdentificationType getTaxIdentification() {
        return taxIdentification;
    }

    /**
     * Imposta il valore della proprietà taxIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationType }
     *     
     */
    public void setTaxIdentification(TaxIdentificationType value) {
        this.taxIdentification = value;
    }

    /**
     * Recupera il valore della proprietà statisticIdentification.
     * 
     * @return
     *     possible object is
     *     {@link RequestIdentificationBaseType }
     *     
     */
    public RequestIdentificationBaseType getStatisticIdentification() {
        return statisticIdentification;
    }

    /**
     * Imposta il valore della proprietà statisticIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestIdentificationBaseType }
     *     
     */
    public void setStatisticIdentification(RequestIdentificationBaseType value) {
        this.statisticIdentification = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceIdentificationType }
     *     
     */
    public TaxAtSourceIdentificationType getTaxAtSourceIdentification() {
        return taxAtSourceIdentification;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceIdentificationType }
     *     
     */
    public void setTaxAtSourceIdentification(TaxAtSourceIdentificationType value) {
        this.taxAtSourceIdentification = value;
    }

}
