
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SalaryResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AHV-AVS-SalaryResultType"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}FAK-CAF-SalaryResultType"/&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}UVG-LAA-SalaryResultType"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}UVGZ-LAAC-SalaryResultType"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}KTG-AMC-SalaryResultType"/&gt;
 *         &lt;element name="BVG-LPP" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}BVG-LPP-SalaryResultType"/&gt;
 *         &lt;element name="Tax" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxSalaryResultType"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxAtSourceSalaryResultType"/&gt;
 *         &lt;element name="TaxCrossborder" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxCrossborderSalaryResultType"/&gt;
 *         &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}StatisticSalaryResultType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryResultType", propOrder = {
    "ahvavs",
    "fakcaf",
    "uvglaa",
    "uvgzlaac",
    "ktgamc",
    "bvglpp",
    "tax",
    "taxAtSource",
    "taxCrossborder",
    "statistic"
})
@XmlSeeAlso({
    ReducedSalaryResultType.class
})
public class SalaryResultType {

    @XmlElement(name = "AHV-AVS")
    protected AHVAVSSalaryResultType ahvavs;
    @XmlElement(name = "FAK-CAF")
    protected FAKCAFSalaryResultType fakcaf;
    @XmlElement(name = "UVG-LAA")
    protected UVGLAASalaryResultType uvglaa;
    @XmlElement(name = "UVGZ-LAAC")
    protected UVGZLAACSalaryResultType uvgzlaac;
    @XmlElement(name = "KTG-AMC")
    protected KTGAMCSalaryResultType ktgamc;
    @XmlElement(name = "BVG-LPP")
    protected BVGLPPSalaryResultType bvglpp;
    @XmlElement(name = "Tax")
    protected TaxSalaryResultType tax;
    @XmlElement(name = "TaxAtSource")
    protected TaxAtSourceSalaryResultType taxAtSource;
    @XmlElement(name = "TaxCrossborder")
    protected TaxCrossborderSalaryResultType taxCrossborder;
    @XmlElement(name = "Statistic")
    protected StatisticSalaryResultType statistic;

    /**
     * Recupera il valore della proprietà ahvavs.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSSalaryResultType }
     *     
     */
    public AHVAVSSalaryResultType getAHVAVS() {
        return ahvavs;
    }

    /**
     * Imposta il valore della proprietà ahvavs.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSSalaryResultType }
     *     
     */
    public void setAHVAVS(AHVAVSSalaryResultType value) {
        this.ahvavs = value;
    }

    /**
     * Recupera il valore della proprietà fakcaf.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFSalaryResultType }
     *     
     */
    public FAKCAFSalaryResultType getFAKCAF() {
        return fakcaf;
    }

    /**
     * Imposta il valore della proprietà fakcaf.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFSalaryResultType }
     *     
     */
    public void setFAKCAF(FAKCAFSalaryResultType value) {
        this.fakcaf = value;
    }

    /**
     * Recupera il valore della proprietà uvglaa.
     * 
     * @return
     *     possible object is
     *     {@link UVGLAASalaryResultType }
     *     
     */
    public UVGLAASalaryResultType getUVGLAA() {
        return uvglaa;
    }

    /**
     * Imposta il valore della proprietà uvglaa.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGLAASalaryResultType }
     *     
     */
    public void setUVGLAA(UVGLAASalaryResultType value) {
        this.uvglaa = value;
    }

    /**
     * Recupera il valore della proprietà uvgzlaac.
     * 
     * @return
     *     possible object is
     *     {@link UVGZLAACSalaryResultType }
     *     
     */
    public UVGZLAACSalaryResultType getUVGZLAAC() {
        return uvgzlaac;
    }

    /**
     * Imposta il valore della proprietà uvgzlaac.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGZLAACSalaryResultType }
     *     
     */
    public void setUVGZLAAC(UVGZLAACSalaryResultType value) {
        this.uvgzlaac = value;
    }

    /**
     * Recupera il valore della proprietà ktgamc.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCSalaryResultType }
     *     
     */
    public KTGAMCSalaryResultType getKTGAMC() {
        return ktgamc;
    }

    /**
     * Imposta il valore della proprietà ktgamc.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCSalaryResultType }
     *     
     */
    public void setKTGAMC(KTGAMCSalaryResultType value) {
        this.ktgamc = value;
    }

    /**
     * Recupera il valore della proprietà bvglpp.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPSalaryResultType }
     *     
     */
    public BVGLPPSalaryResultType getBVGLPP() {
        return bvglpp;
    }

    /**
     * Imposta il valore della proprietà bvglpp.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPSalaryResultType }
     *     
     */
    public void setBVGLPP(BVGLPPSalaryResultType value) {
        this.bvglpp = value;
    }

    /**
     * Recupera il valore della proprietà tax.
     * 
     * @return
     *     possible object is
     *     {@link TaxSalaryResultType }
     *     
     */
    public TaxSalaryResultType getTax() {
        return tax;
    }

    /**
     * Imposta il valore della proprietà tax.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSalaryResultType }
     *     
     */
    public void setTax(TaxSalaryResultType value) {
        this.tax = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSource.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceSalaryResultType }
     *     
     */
    public TaxAtSourceSalaryResultType getTaxAtSource() {
        return taxAtSource;
    }

    /**
     * Imposta il valore della proprietà taxAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceSalaryResultType }
     *     
     */
    public void setTaxAtSource(TaxAtSourceSalaryResultType value) {
        this.taxAtSource = value;
    }

    /**
     * Recupera il valore della proprietà taxCrossborder.
     * 
     * @return
     *     possible object is
     *     {@link TaxCrossborderSalaryResultType }
     *     
     */
    public TaxCrossborderSalaryResultType getTaxCrossborder() {
        return taxCrossborder;
    }

    /**
     * Imposta il valore della proprietà taxCrossborder.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCrossborderSalaryResultType }
     *     
     */
    public void setTaxCrossborder(TaxCrossborderSalaryResultType value) {
        this.taxCrossborder = value;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link StatisticSalaryResultType }
     *     
     */
    public StatisticSalaryResultType getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticSalaryResultType }
     *     
     */
    public void setStatistic(StatisticSalaryResultType value) {
        this.statistic = value;
    }

}
