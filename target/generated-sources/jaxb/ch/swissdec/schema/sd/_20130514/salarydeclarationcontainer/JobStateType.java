
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per JobStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="JobStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}TaxWorkingStateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateType" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobStateType", propOrder = {
    "ahvavs",
    "uvglaa",
    "uvgzlaac",
    "ktgamc",
    "bvglpp",
    "fakcaf",
    "tax",
    "statistic",
    "taxAtSource"
})
public class JobStateType {

    @XmlElement(name = "AHV-AVS")
    protected List<WorkingStateMultiType> ahvavs;
    @XmlElement(name = "UVG-LAA")
    protected List<WorkingStateMultiType> uvglaa;
    @XmlElement(name = "UVGZ-LAAC")
    protected List<WorkingStateMultiType> uvgzlaac;
    @XmlElement(name = "KTG-AMC")
    protected List<WorkingStateMultiType> ktgamc;
    @XmlElement(name = "BVG-LPP")
    protected List<WorkingStateMultiType> bvglpp;
    @XmlElement(name = "FAK-CAF")
    protected List<WorkingStateMultiType> fakcaf;
    @XmlElement(name = "Tax")
    protected List<TaxWorkingStateType> tax;
    @XmlElement(name = "Statistic")
    protected WorkingStateType statistic;
    @XmlElement(name = "TaxAtSource")
    protected List<WorkingStateMultiType> taxAtSource;

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
     * {@link WorkingStateMultiType }
     * 
     * 
     */
    public List<WorkingStateMultiType> getAHVAVS() {
        if (ahvavs == null) {
            ahvavs = new ArrayList<WorkingStateMultiType>();
        }
        return this.ahvavs;
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
     * {@link WorkingStateMultiType }
     * 
     * 
     */
    public List<WorkingStateMultiType> getUVGLAA() {
        if (uvglaa == null) {
            uvglaa = new ArrayList<WorkingStateMultiType>();
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
     * {@link WorkingStateMultiType }
     * 
     * 
     */
    public List<WorkingStateMultiType> getUVGZLAAC() {
        if (uvgzlaac == null) {
            uvgzlaac = new ArrayList<WorkingStateMultiType>();
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
     * {@link WorkingStateMultiType }
     * 
     * 
     */
    public List<WorkingStateMultiType> getKTGAMC() {
        if (ktgamc == null) {
            ktgamc = new ArrayList<WorkingStateMultiType>();
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
     * {@link WorkingStateMultiType }
     * 
     * 
     */
    public List<WorkingStateMultiType> getBVGLPP() {
        if (bvglpp == null) {
            bvglpp = new ArrayList<WorkingStateMultiType>();
        }
        return this.bvglpp;
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
     * {@link WorkingStateMultiType }
     * 
     * 
     */
    public List<WorkingStateMultiType> getFAKCAF() {
        if (fakcaf == null) {
            fakcaf = new ArrayList<WorkingStateMultiType>();
        }
        return this.fakcaf;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxWorkingStateType }
     * 
     * 
     */
    public List<TaxWorkingStateType> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxWorkingStateType>();
        }
        return this.tax;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link WorkingStateType }
     *     
     */
    public WorkingStateType getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingStateType }
     *     
     */
    public void setStatistic(WorkingStateType value) {
        this.statistic = value;
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
     * {@link WorkingStateMultiType }
     * 
     * 
     */
    public List<WorkingStateMultiType> getTaxAtSource() {
        if (taxAtSource == null) {
            taxAtSource = new ArrayList<WorkingStateMultiType>();
        }
        return this.taxAtSource;
    }

}
