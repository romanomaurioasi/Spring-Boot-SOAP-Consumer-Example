
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AddresseeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddresseeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxCrossborder" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ControlsMultiType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddresseeType", propOrder = {
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
public class AddresseeType {

    @XmlElement(name = "AHV-AVS")
    protected List<ControlsMultiType> ahvavs;
    @XmlElement(name = "FAK-CAF")
    protected List<ControlsMultiType> fakcaf;
    @XmlElement(name = "UVG-LAA")
    protected List<ControlsMultiType> uvglaa;
    @XmlElement(name = "UVGZ-LAAC")
    protected List<ControlsMultiType> uvgzlaac;
    @XmlElement(name = "KTG-AMC")
    protected List<ControlsMultiType> ktgamc;
    @XmlElement(name = "BVG-LPP")
    protected List<ControlsMultiType> bvglpp;
    @XmlElement(name = "Tax")
    protected ControlsType tax;
    @XmlElement(name = "TaxAtSource")
    protected List<ControlsMultiType> taxAtSource;
    @XmlElement(name = "TaxCrossborder")
    protected List<ControlsMultiType> taxCrossborder;
    @XmlElement(name = "Statistic")
    protected ControlsMultiType statistic;

    /**
     * Gets the value of the ahvavs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ahvavs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAHVAVS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getAHVAVS() {
        if (ahvavs == null) {
            ahvavs = new ArrayList<ControlsMultiType>();
        }
        return this.ahvavs;
    }

    /**
     * Gets the value of the fakcaf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fakcaf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFAKCAF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getFAKCAF() {
        if (fakcaf == null) {
            fakcaf = new ArrayList<ControlsMultiType>();
        }
        return this.fakcaf;
    }

    /**
     * Gets the value of the uvglaa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvglaa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGLAA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getUVGLAA() {
        if (uvglaa == null) {
            uvglaa = new ArrayList<ControlsMultiType>();
        }
        return this.uvglaa;
    }

    /**
     * Gets the value of the uvgzlaac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvgzlaac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGZLAAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getUVGZLAAC() {
        if (uvgzlaac == null) {
            uvgzlaac = new ArrayList<ControlsMultiType>();
        }
        return this.uvgzlaac;
    }

    /**
     * Gets the value of the ktgamc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ktgamc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKTGAMC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getKTGAMC() {
        if (ktgamc == null) {
            ktgamc = new ArrayList<ControlsMultiType>();
        }
        return this.ktgamc;
    }

    /**
     * Gets the value of the bvglpp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bvglpp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBVGLPP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getBVGLPP() {
        if (bvglpp == null) {
            bvglpp = new ArrayList<ControlsMultiType>();
        }
        return this.bvglpp;
    }

    /**
     * Recupera il valore della proprietà tax.
     * 
     * @return
     *     possible object is
     *     {@link ControlsType }
     *     
     */
    public ControlsType getTax() {
        return tax;
    }

    /**
     * Imposta il valore della proprietà tax.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlsType }
     *     
     */
    public void setTax(ControlsType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the taxAtSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAtSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAtSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getTaxAtSource() {
        if (taxAtSource == null) {
            taxAtSource = new ArrayList<ControlsMultiType>();
        }
        return this.taxAtSource;
    }

    /**
     * Gets the value of the taxCrossborder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCrossborder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCrossborder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlsMultiType }
     * 
     * 
     */
    public List<ControlsMultiType> getTaxCrossborder() {
        if (taxCrossborder == null) {
            taxCrossborder = new ArrayList<ControlsMultiType>();
        }
        return this.taxCrossborder;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link ControlsMultiType }
     *     
     */
    public ControlsMultiType getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlsMultiType }
     *     
     */
    public void setStatistic(ControlsMultiType value) {
        this.statistic = value;
    }

}
