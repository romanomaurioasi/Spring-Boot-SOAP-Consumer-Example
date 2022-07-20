
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SalaryTotalsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryTotalsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AHV-AVS-Totals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-TotalsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF-Totals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-TotalsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVG-LAA-Totals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVG-LAA-TotalsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVGZ-LAAC-Totals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVGZ-LAAC-TotalsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KTG-AMC-Totals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}KTG-AMC-TotalsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-Totals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-PeriodTotalsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSourceTotals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceTotalsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxCrossborderTotals" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxCrossborderTotalsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryTotalsType", propOrder = {
    "ahvavsTotals",
    "fakcafTotals",
    "uvglaaTotals",
    "uvgzlaacTotals",
    "ktgamcTotals",
    "bvglppTotals",
    "taxAtSourceTotals",
    "taxCrossborderTotals"
})
public class SalaryTotalsType {

    @XmlElement(name = "AHV-AVS-Totals")
    protected List<AHVAVSTotalsType> ahvavsTotals;
    @XmlElement(name = "FAK-CAF-Totals")
    protected List<FAKCAFTotalsType> fakcafTotals;
    @XmlElement(name = "UVG-LAA-Totals")
    protected List<UVGLAATotalsType> uvglaaTotals;
    @XmlElement(name = "UVGZ-LAAC-Totals")
    protected List<UVGZLAACTotalsType> uvgzlaacTotals;
    @XmlElement(name = "KTG-AMC-Totals")
    protected List<KTGAMCTotalsType> ktgamcTotals;
    @XmlElement(name = "BVG-LPP-Totals")
    protected List<BVGLPPPeriodTotalsType> bvglppTotals;
    @XmlElement(name = "TaxAtSourceTotals")
    protected List<TaxAtSourceTotalsType> taxAtSourceTotals;
    @XmlElement(name = "TaxCrossborderTotals")
    protected List<TaxCrossborderTotalsType> taxCrossborderTotals;

    /**
     * Gets the value of the ahvavsTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ahvavsTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAHVAVSTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AHVAVSTotalsType }
     * 
     * 
     */
    public List<AHVAVSTotalsType> getAHVAVSTotals() {
        if (ahvavsTotals == null) {
            ahvavsTotals = new ArrayList<AHVAVSTotalsType>();
        }
        return this.ahvavsTotals;
    }

    /**
     * Gets the value of the fakcafTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fakcafTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFAKCAFTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAKCAFTotalsType }
     * 
     * 
     */
    public List<FAKCAFTotalsType> getFAKCAFTotals() {
        if (fakcafTotals == null) {
            fakcafTotals = new ArrayList<FAKCAFTotalsType>();
        }
        return this.fakcafTotals;
    }

    /**
     * Gets the value of the uvglaaTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvglaaTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGLAATotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UVGLAATotalsType }
     * 
     * 
     */
    public List<UVGLAATotalsType> getUVGLAATotals() {
        if (uvglaaTotals == null) {
            uvglaaTotals = new ArrayList<UVGLAATotalsType>();
        }
        return this.uvglaaTotals;
    }

    /**
     * Gets the value of the uvgzlaacTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvgzlaacTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGZLAACTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UVGZLAACTotalsType }
     * 
     * 
     */
    public List<UVGZLAACTotalsType> getUVGZLAACTotals() {
        if (uvgzlaacTotals == null) {
            uvgzlaacTotals = new ArrayList<UVGZLAACTotalsType>();
        }
        return this.uvgzlaacTotals;
    }

    /**
     * Gets the value of the ktgamcTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ktgamcTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKTGAMCTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KTGAMCTotalsType }
     * 
     * 
     */
    public List<KTGAMCTotalsType> getKTGAMCTotals() {
        if (ktgamcTotals == null) {
            ktgamcTotals = new ArrayList<KTGAMCTotalsType>();
        }
        return this.ktgamcTotals;
    }

    /**
     * Gets the value of the bvglppTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bvglppTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBVGLPPTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BVGLPPPeriodTotalsType }
     * 
     * 
     */
    public List<BVGLPPPeriodTotalsType> getBVGLPPTotals() {
        if (bvglppTotals == null) {
            bvglppTotals = new ArrayList<BVGLPPPeriodTotalsType>();
        }
        return this.bvglppTotals;
    }

    /**
     * Gets the value of the taxAtSourceTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAtSourceTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAtSourceTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAtSourceTotalsType }
     * 
     * 
     */
    public List<TaxAtSourceTotalsType> getTaxAtSourceTotals() {
        if (taxAtSourceTotals == null) {
            taxAtSourceTotals = new ArrayList<TaxAtSourceTotalsType>();
        }
        return this.taxAtSourceTotals;
    }

    /**
     * Gets the value of the taxCrossborderTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCrossborderTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCrossborderTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCrossborderTotalsType }
     * 
     * 
     */
    public List<TaxCrossborderTotalsType> getTaxCrossborderTotals() {
        if (taxCrossborderTotals == null) {
            taxCrossborderTotals = new ArrayList<TaxCrossborderTotalsType>();
        }
        return this.taxCrossborderTotals;
    }

}
