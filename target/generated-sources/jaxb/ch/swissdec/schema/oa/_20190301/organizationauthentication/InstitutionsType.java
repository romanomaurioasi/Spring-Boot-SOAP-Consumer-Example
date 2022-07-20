
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InstitutionsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InstitutionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}AHV-AVS-CustomerIdentificationBaseType"/&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}GenericCustomerIdentificationMultiType"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}GenericCustomerIdentificationMultiType"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}GenericCustomerIdentificationMultiType"/&gt;
 *         &lt;element name="BVG-LPP" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}GenericCustomerIdentificationMultiType"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}FAK-CAF-CustomerIdentificationBaseType"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}TaxAtSourceCustomerIdentificationBaseType"/&gt;
 *         &lt;element name="Tax" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}TaxAtSourceCustomerIdentificationBaseType"/&gt;
 *         &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}StatisticIdentificationType"/&gt;
 *         &lt;element name="KU-AC" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}GenericCustomerIdentificationMultiType"/&gt;
 *         &lt;element name="Other" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}OtherCustomerIdentificationType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutionsType", propOrder = {
    "ahvavs",
    "uvglaa",
    "uvgzlaac",
    "ktgamc",
    "bvglpp",
    "fakcaf",
    "taxAtSource",
    "tax",
    "statistic",
    "kuac",
    "other"
})
public class InstitutionsType {

    @XmlElement(name = "AHV-AVS")
    protected AHVAVSCustomerIdentificationBaseType ahvavs;
    @XmlElement(name = "UVG-LAA")
    protected GenericCustomerIdentificationMultiType uvglaa;
    @XmlElement(name = "UVGZ-LAAC")
    protected GenericCustomerIdentificationMultiType uvgzlaac;
    @XmlElement(name = "KTG-AMC")
    protected GenericCustomerIdentificationMultiType ktgamc;
    @XmlElement(name = "BVG-LPP")
    protected GenericCustomerIdentificationMultiType bvglpp;
    @XmlElement(name = "FAK-CAF")
    protected FAKCAFCustomerIdentificationBaseType fakcaf;
    @XmlElement(name = "TaxAtSource")
    protected TaxAtSourceCustomerIdentificationBaseType taxAtSource;
    @XmlElement(name = "Tax")
    protected TaxAtSourceCustomerIdentificationBaseType tax;
    @XmlElement(name = "Statistic")
    protected StatisticIdentificationType statistic;
    @XmlElement(name = "KU-AC")
    protected GenericCustomerIdentificationMultiType kuac;
    @XmlElement(name = "Other")
    protected OtherCustomerIdentificationType other;

    /**
     * Recupera il valore della proprietà ahvavs.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSCustomerIdentificationBaseType }
     *     
     */
    public AHVAVSCustomerIdentificationBaseType getAHVAVS() {
        return ahvavs;
    }

    /**
     * Imposta il valore della proprietà ahvavs.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSCustomerIdentificationBaseType }
     *     
     */
    public void setAHVAVS(AHVAVSCustomerIdentificationBaseType value) {
        this.ahvavs = value;
    }

    /**
     * Recupera il valore della proprietà uvglaa.
     * 
     * @return
     *     possible object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public GenericCustomerIdentificationMultiType getUVGLAA() {
        return uvglaa;
    }

    /**
     * Imposta il valore della proprietà uvglaa.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public void setUVGLAA(GenericCustomerIdentificationMultiType value) {
        this.uvglaa = value;
    }

    /**
     * Recupera il valore della proprietà uvgzlaac.
     * 
     * @return
     *     possible object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public GenericCustomerIdentificationMultiType getUVGZLAAC() {
        return uvgzlaac;
    }

    /**
     * Imposta il valore della proprietà uvgzlaac.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public void setUVGZLAAC(GenericCustomerIdentificationMultiType value) {
        this.uvgzlaac = value;
    }

    /**
     * Recupera il valore della proprietà ktgamc.
     * 
     * @return
     *     possible object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public GenericCustomerIdentificationMultiType getKTGAMC() {
        return ktgamc;
    }

    /**
     * Imposta il valore della proprietà ktgamc.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public void setKTGAMC(GenericCustomerIdentificationMultiType value) {
        this.ktgamc = value;
    }

    /**
     * Recupera il valore della proprietà bvglpp.
     * 
     * @return
     *     possible object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public GenericCustomerIdentificationMultiType getBVGLPP() {
        return bvglpp;
    }

    /**
     * Imposta il valore della proprietà bvglpp.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public void setBVGLPP(GenericCustomerIdentificationMultiType value) {
        this.bvglpp = value;
    }

    /**
     * Recupera il valore della proprietà fakcaf.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFCustomerIdentificationBaseType }
     *     
     */
    public FAKCAFCustomerIdentificationBaseType getFAKCAF() {
        return fakcaf;
    }

    /**
     * Imposta il valore della proprietà fakcaf.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFCustomerIdentificationBaseType }
     *     
     */
    public void setFAKCAF(FAKCAFCustomerIdentificationBaseType value) {
        this.fakcaf = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSource.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCustomerIdentificationBaseType }
     *     
     */
    public TaxAtSourceCustomerIdentificationBaseType getTaxAtSource() {
        return taxAtSource;
    }

    /**
     * Imposta il valore della proprietà taxAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCustomerIdentificationBaseType }
     *     
     */
    public void setTaxAtSource(TaxAtSourceCustomerIdentificationBaseType value) {
        this.taxAtSource = value;
    }

    /**
     * Recupera il valore della proprietà tax.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceCustomerIdentificationBaseType }
     *     
     */
    public TaxAtSourceCustomerIdentificationBaseType getTax() {
        return tax;
    }

    /**
     * Imposta il valore della proprietà tax.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceCustomerIdentificationBaseType }
     *     
     */
    public void setTax(TaxAtSourceCustomerIdentificationBaseType value) {
        this.tax = value;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link StatisticIdentificationType }
     *     
     */
    public StatisticIdentificationType getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticIdentificationType }
     *     
     */
    public void setStatistic(StatisticIdentificationType value) {
        this.statistic = value;
    }

    /**
     * Recupera il valore della proprietà kuac.
     * 
     * @return
     *     possible object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public GenericCustomerIdentificationMultiType getKUAC() {
        return kuac;
    }

    /**
     * Imposta il valore della proprietà kuac.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericCustomerIdentificationMultiType }
     *     
     */
    public void setKUAC(GenericCustomerIdentificationMultiType value) {
        this.kuac = value;
    }

    /**
     * Recupera il valore della proprietà other.
     * 
     * @return
     *     possible object is
     *     {@link OtherCustomerIdentificationType }
     *     
     */
    public OtherCustomerIdentificationType getOther() {
        return other;
    }

    /**
     * Imposta il valore della proprietà other.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCustomerIdentificationType }
     *     
     */
    public void setOther(OtherCustomerIdentificationType value) {
        this.other = value;
    }

}
