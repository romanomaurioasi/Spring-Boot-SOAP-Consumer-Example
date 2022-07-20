
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DialogType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DialogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AHV-AVS-DialogType"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}FAK-CAF-DialogType"/&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}UVG-LAA-DialogType"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}UVGZ-LAAC-DialogType"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}KTG-AMC-DialogType"/&gt;
 *         &lt;element name="BVG-LPP" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}BVG-LPP-DialogType"/&gt;
 *         &lt;element name="Tax" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxDialogType"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxAtSourceDialogType"/&gt;
 *         &lt;element name="TaxCrossborder" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxAtSourceDialogType"/&gt;
 *         &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}StatisticDialogType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogType", propOrder = {
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
    ReducedDialogType.class
})
public class DialogType {

    @XmlElement(name = "AHV-AVS")
    protected AHVAVSDialogType ahvavs;
    @XmlElement(name = "FAK-CAF")
    protected FAKCAFDialogType fakcaf;
    @XmlElement(name = "UVG-LAA")
    protected UVGLAADialogType uvglaa;
    @XmlElement(name = "UVGZ-LAAC")
    protected UVGZLAACDialogType uvgzlaac;
    @XmlElement(name = "KTG-AMC")
    protected KTGAMCDialogType ktgamc;
    @XmlElement(name = "BVG-LPP")
    protected BVGLPPDialogType bvglpp;
    @XmlElement(name = "Tax")
    protected TaxDialogType tax;
    @XmlElement(name = "TaxAtSource")
    protected TaxAtSourceDialogType taxAtSource;
    @XmlElement(name = "TaxCrossborder")
    protected TaxAtSourceDialogType taxCrossborder;
    @XmlElement(name = "Statistic")
    protected StatisticDialogType statistic;

    /**
     * Recupera il valore della proprietà ahvavs.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSDialogType }
     *     
     */
    public AHVAVSDialogType getAHVAVS() {
        return ahvavs;
    }

    /**
     * Imposta il valore della proprietà ahvavs.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSDialogType }
     *     
     */
    public void setAHVAVS(AHVAVSDialogType value) {
        this.ahvavs = value;
    }

    /**
     * Recupera il valore della proprietà fakcaf.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFDialogType }
     *     
     */
    public FAKCAFDialogType getFAKCAF() {
        return fakcaf;
    }

    /**
     * Imposta il valore della proprietà fakcaf.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFDialogType }
     *     
     */
    public void setFAKCAF(FAKCAFDialogType value) {
        this.fakcaf = value;
    }

    /**
     * Recupera il valore della proprietà uvglaa.
     * 
     * @return
     *     possible object is
     *     {@link UVGLAADialogType }
     *     
     */
    public UVGLAADialogType getUVGLAA() {
        return uvglaa;
    }

    /**
     * Imposta il valore della proprietà uvglaa.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGLAADialogType }
     *     
     */
    public void setUVGLAA(UVGLAADialogType value) {
        this.uvglaa = value;
    }

    /**
     * Recupera il valore della proprietà uvgzlaac.
     * 
     * @return
     *     possible object is
     *     {@link UVGZLAACDialogType }
     *     
     */
    public UVGZLAACDialogType getUVGZLAAC() {
        return uvgzlaac;
    }

    /**
     * Imposta il valore della proprietà uvgzlaac.
     * 
     * @param value
     *     allowed object is
     *     {@link UVGZLAACDialogType }
     *     
     */
    public void setUVGZLAAC(UVGZLAACDialogType value) {
        this.uvgzlaac = value;
    }

    /**
     * Recupera il valore della proprietà ktgamc.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCDialogType }
     *     
     */
    public KTGAMCDialogType getKTGAMC() {
        return ktgamc;
    }

    /**
     * Imposta il valore della proprietà ktgamc.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCDialogType }
     *     
     */
    public void setKTGAMC(KTGAMCDialogType value) {
        this.ktgamc = value;
    }

    /**
     * Recupera il valore della proprietà bvglpp.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPDialogType }
     *     
     */
    public BVGLPPDialogType getBVGLPP() {
        return bvglpp;
    }

    /**
     * Imposta il valore della proprietà bvglpp.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPDialogType }
     *     
     */
    public void setBVGLPP(BVGLPPDialogType value) {
        this.bvglpp = value;
    }

    /**
     * Recupera il valore della proprietà tax.
     * 
     * @return
     *     possible object is
     *     {@link TaxDialogType }
     *     
     */
    public TaxDialogType getTax() {
        return tax;
    }

    /**
     * Imposta il valore della proprietà tax.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDialogType }
     *     
     */
    public void setTax(TaxDialogType value) {
        this.tax = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSource.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceDialogType }
     *     
     */
    public TaxAtSourceDialogType getTaxAtSource() {
        return taxAtSource;
    }

    /**
     * Imposta il valore della proprietà taxAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceDialogType }
     *     
     */
    public void setTaxAtSource(TaxAtSourceDialogType value) {
        this.taxAtSource = value;
    }

    /**
     * Recupera il valore della proprietà taxCrossborder.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceDialogType }
     *     
     */
    public TaxAtSourceDialogType getTaxCrossborder() {
        return taxCrossborder;
    }

    /**
     * Imposta il valore della proprietà taxCrossborder.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceDialogType }
     *     
     */
    public void setTaxCrossborder(TaxAtSourceDialogType value) {
        this.taxCrossborder = value;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link StatisticDialogType }
     *     
     */
    public StatisticDialogType getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticDialogType }
     *     
     */
    public void setStatistic(StatisticDialogType value) {
        this.statistic = value;
    }

}
