
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.ParticularsType;
import ch.swissdec.schema.common._20200220.common.WorkType;


/**
 * <p>Classe Java per PersonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Particulars" type="{http://www.swissdec.ch/schema/common/20200220/Common}ParticularsType"/&gt;
 *         &lt;element name="Work" type="{http://www.swissdec.ch/schema/common/20200220/Common}WorkType"/&gt;
 *         &lt;element name="AHV-AVS-Salaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-SalariesType" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF-Salaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-SalariesType" minOccurs="0"/&gt;
 *         &lt;element name="UVG-LAA-Salaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVG-LAA-SalariesType" minOccurs="0"/&gt;
 *         &lt;element name="UVGZ-LAAC-Salaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVGZ-LAAC-SalariesType" minOccurs="0"/&gt;
 *         &lt;element name="KTG-AMC-Salaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}KTG-AMC-SalariesType" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-Salaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-SalariesType" minOccurs="0"/&gt;
 *         &lt;element name="TaxSalaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxSalariesType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSourceSalaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceSalariesType" minOccurs="0"/&gt;
 *         &lt;element name="TaxCrossborderSalaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxCrossborderSalariesType" minOccurs="0"/&gt;
 *         &lt;element name="StatisticSalaries" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticSalariesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "particulars",
    "work",
    "ahvavsSalaries",
    "fakcafSalaries",
    "uvglaaSalaries",
    "uvgzlaacSalaries",
    "ktgamcSalaries",
    "bvglppSalaries",
    "taxSalaries",
    "taxAtSourceSalaries",
    "taxCrossborderSalaries",
    "statisticSalaries"
})
public class PersonType {

    @XmlElement(name = "Particulars", required = true)
    protected ParticularsType particulars;
    @XmlElement(name = "Work", required = true)
    protected WorkType work;
    @XmlElement(name = "AHV-AVS-Salaries")
    protected AHVAVSSalariesType ahvavsSalaries;
    @XmlElement(name = "FAK-CAF-Salaries")
    protected FAKCAFSalariesType fakcafSalaries;
    @XmlElement(name = "UVG-LAA-Salaries")
    protected UVGLAASalariesType uvglaaSalaries;
    @XmlElement(name = "UVGZ-LAAC-Salaries")
    protected UVGZLAACSalariesType uvgzlaacSalaries;
    @XmlElement(name = "KTG-AMC-Salaries")
    protected KTGAMCSalariesType ktgamcSalaries;
    @XmlElement(name = "BVG-LPP-Salaries")
    protected BVGLPPSalariesType bvglppSalaries;
    @XmlElement(name = "TaxSalaries")
    protected TaxSalariesType taxSalaries;
    @XmlElement(name = "TaxAtSourceSalaries")
    protected TaxAtSourceSalariesType taxAtSourceSalaries;
    @XmlElement(name = "TaxCrossborderSalaries")
    protected TaxCrossborderSalariesType taxCrossborderSalaries;
    @XmlElement(name = "StatisticSalaries")
    protected StatisticSalariesType statisticSalaries;

    /**
     * Recupera il valore della proprietà particulars.
     * 
     * @return
     *     possible object is
     *     {@link ParticularsType }
     *     
     */
    public ParticularsType getParticulars() {
        return particulars;
    }

    /**
     * Imposta il valore della proprietà particulars.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticularsType }
     *     
     */
    public void setParticulars(ParticularsType value) {
        this.particulars = value;
    }

    /**
     * Recupera il valore della proprietà work.
     * 
     * @return
     *     possible object is
     *     {@link WorkType }
     *     
     */
    public WorkType getWork() {
        return work;
    }

    /**
     * Imposta il valore della proprietà work.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkType }
     *     
     */
    public void setWork(WorkType value) {
        this.work = value;
    }

    /**
     * Recupera il valore della proprietà ahvavsSalaries.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSSalariesType }
     *     
     */
    public AHVAVSSalariesType getAHVAVSSalaries() {
        return ahvavsSalaries;
    }

    /**
     * Imposta il valore della proprietà ahvavsSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSSalariesType }
     *     
     */
    public void setAHVAVSSalaries(AHVAVSSalariesType value) {
        this.ahvavsSalaries = value;
    }

    /**
     * Recupera il valore della proprietà fakcafSalaries.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFSalariesType }
     *     
     */
    public FAKCAFSalariesType getFAKCAFSalaries() {
        return fakcafSalaries;
    }

    /**
     * Imposta il valore della proprietà fakcafSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFSalariesType }
     *     
     */
    public void setFAKCAFSalaries(FAKCAFSalariesType value) {
        this.fakcafSalaries = value;
    }

    /**
     * Recupera il valore della proprietà uvglaaSalaries.
     * 
     * @return
     *     possible object is
     *     {@link UVGLAASalariesType }
     *     
     */
    public UVGLAASalariesType getUVGLAASalaries() {
        return uvglaaSalaries;
    }

    /**
     * Imposta il valore della proprietà uvglaaSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGLAASalariesType }
     *     
     */
    public void setUVGLAASalaries(UVGLAASalariesType value) {
        this.uvglaaSalaries = value;
    }

    /**
     * Recupera il valore della proprietà uvgzlaacSalaries.
     * 
     * @return
     *     possible object is
     *     {@link UVGZLAACSalariesType }
     *     
     */
    public UVGZLAACSalariesType getUVGZLAACSalaries() {
        return uvgzlaacSalaries;
    }

    /**
     * Imposta il valore della proprietà uvgzlaacSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGZLAACSalariesType }
     *     
     */
    public void setUVGZLAACSalaries(UVGZLAACSalariesType value) {
        this.uvgzlaacSalaries = value;
    }

    /**
     * Recupera il valore della proprietà ktgamcSalaries.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCSalariesType }
     *     
     */
    public KTGAMCSalariesType getKTGAMCSalaries() {
        return ktgamcSalaries;
    }

    /**
     * Imposta il valore della proprietà ktgamcSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCSalariesType }
     *     
     */
    public void setKTGAMCSalaries(KTGAMCSalariesType value) {
        this.ktgamcSalaries = value;
    }

    /**
     * Recupera il valore della proprietà bvglppSalaries.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPSalariesType }
     *     
     */
    public BVGLPPSalariesType getBVGLPPSalaries() {
        return bvglppSalaries;
    }

    /**
     * Imposta il valore della proprietà bvglppSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPSalariesType }
     *     
     */
    public void setBVGLPPSalaries(BVGLPPSalariesType value) {
        this.bvglppSalaries = value;
    }

    /**
     * Recupera il valore della proprietà taxSalaries.
     * 
     * @return
     *     possible object is
     *     {@link TaxSalariesType }
     *     
     */
    public TaxSalariesType getTaxSalaries() {
        return taxSalaries;
    }

    /**
     * Imposta il valore della proprietà taxSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSalariesType }
     *     
     */
    public void setTaxSalaries(TaxSalariesType value) {
        this.taxSalaries = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceSalaries.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceSalariesType }
     *     
     */
    public TaxAtSourceSalariesType getTaxAtSourceSalaries() {
        return taxAtSourceSalaries;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceSalariesType }
     *     
     */
    public void setTaxAtSourceSalaries(TaxAtSourceSalariesType value) {
        this.taxAtSourceSalaries = value;
    }

    /**
     * Recupera il valore della proprietà taxCrossborderSalaries.
     * 
     * @return
     *     possible object is
     *     {@link TaxCrossborderSalariesType }
     *     
     */
    public TaxCrossborderSalariesType getTaxCrossborderSalaries() {
        return taxCrossborderSalaries;
    }

    /**
     * Imposta il valore della proprietà taxCrossborderSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCrossborderSalariesType }
     *     
     */
    public void setTaxCrossborderSalaries(TaxCrossborderSalariesType value) {
        this.taxCrossborderSalaries = value;
    }

    /**
     * Recupera il valore della proprietà statisticSalaries.
     * 
     * @return
     *     possible object is
     *     {@link StatisticSalariesType }
     *     
     */
    public StatisticSalariesType getStatisticSalaries() {
        return statisticSalaries;
    }

    /**
     * Imposta il valore della proprietà statisticSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticSalariesType }
     *     
     */
    public void setStatisticSalaries(StatisticSalariesType value) {
        this.statisticSalaries = value;
    }

}
