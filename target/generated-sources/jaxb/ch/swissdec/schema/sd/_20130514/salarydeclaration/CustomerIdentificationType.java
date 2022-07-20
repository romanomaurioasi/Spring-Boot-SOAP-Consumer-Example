
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CustomerIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AHV-AVS-CustomerIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GenericCustomerIdentificationMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GenericCustomerIdentificationMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GenericCustomerIdentificationMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-CustomerIdentificationMultiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FAK-CAF-CustomerIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceCustomerIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIdentificationType", propOrder = {
    "ahvavs",
    "uvglaa",
    "uvgzlaac",
    "ktgamc",
    "bvglpp",
    "fakcaf",
    "taxAtSource"
})
public class CustomerIdentificationType {

    @XmlElement(name = "AHV-AVS")
    protected List<AHVAVSCustomerIdentificationType> ahvavs;
    @XmlElement(name = "UVG-LAA")
    protected List<GenericCustomerIdentificationMultiType> uvglaa;
    @XmlElement(name = "UVGZ-LAAC")
    protected List<GenericCustomerIdentificationMultiType> uvgzlaac;
    @XmlElement(name = "KTG-AMC")
    protected List<GenericCustomerIdentificationMultiType> ktgamc;
    @XmlElement(name = "BVG-LPP")
    protected List<BVGLPPCustomerIdentificationMultiType> bvglpp;
    @XmlElement(name = "FAK-CAF")
    protected List<FAKCAFCustomerIdentificationType> fakcaf;
    @XmlElement(name = "TaxAtSource")
    protected List<TaxAtSourceCustomerIdentificationType> taxAtSource;

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
     * {@link AHVAVSCustomerIdentificationType }
     * 
     * 
     */
    public List<AHVAVSCustomerIdentificationType> getAHVAVS() {
        if (ahvavs == null) {
            ahvavs = new ArrayList<AHVAVSCustomerIdentificationType>();
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
     * {@link GenericCustomerIdentificationMultiType }
     * 
     * 
     */
    public List<GenericCustomerIdentificationMultiType> getUVGLAA() {
        if (uvglaa == null) {
            uvglaa = new ArrayList<GenericCustomerIdentificationMultiType>();
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
     * {@link GenericCustomerIdentificationMultiType }
     * 
     * 
     */
    public List<GenericCustomerIdentificationMultiType> getUVGZLAAC() {
        if (uvgzlaac == null) {
            uvgzlaac = new ArrayList<GenericCustomerIdentificationMultiType>();
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
     * {@link GenericCustomerIdentificationMultiType }
     * 
     * 
     */
    public List<GenericCustomerIdentificationMultiType> getKTGAMC() {
        if (ktgamc == null) {
            ktgamc = new ArrayList<GenericCustomerIdentificationMultiType>();
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
     * {@link BVGLPPCustomerIdentificationMultiType }
     * 
     * 
     */
    public List<BVGLPPCustomerIdentificationMultiType> getBVGLPP() {
        if (bvglpp == null) {
            bvglpp = new ArrayList<BVGLPPCustomerIdentificationMultiType>();
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
     * {@link FAKCAFCustomerIdentificationType }
     * 
     * 
     */
    public List<FAKCAFCustomerIdentificationType> getFAKCAF() {
        if (fakcaf == null) {
            fakcaf = new ArrayList<FAKCAFCustomerIdentificationType>();
        }
        return this.fakcaf;
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
     * {@link TaxAtSourceCustomerIdentificationType }
     * 
     * 
     */
    public List<TaxAtSourceCustomerIdentificationType> getTaxAtSource() {
        if (taxAtSource == null) {
            taxAtSource = new ArrayList<TaxAtSourceCustomerIdentificationType>();
        }
        return this.taxAtSource;
    }

}
