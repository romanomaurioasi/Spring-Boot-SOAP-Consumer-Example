
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OwnershipRightDetailType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OwnershipRightDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormularA" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FormularAType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FormularB" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FormularBType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FormularC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FormularCType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnershipRightDetailType", propOrder = {
    "formularA",
    "formularB",
    "formularC"
})
public class OwnershipRightDetailType {

    @XmlElement(name = "FormularA")
    protected List<FormularAType> formularA;
    @XmlElement(name = "FormularB")
    protected List<FormularBType> formularB;
    @XmlElement(name = "FormularC")
    protected List<FormularCType> formularC;

    /**
     * Gets the value of the formularA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formularA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormularA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormularAType }
     * 
     * 
     */
    public List<FormularAType> getFormularA() {
        if (formularA == null) {
            formularA = new ArrayList<FormularAType>();
        }
        return this.formularA;
    }

    /**
     * Gets the value of the formularB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formularB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormularB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormularBType }
     * 
     * 
     */
    public List<FormularBType> getFormularB() {
        if (formularB == null) {
            formularB = new ArrayList<FormularBType>();
        }
        return this.formularB;
    }

    /**
     * Gets the value of the formularC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formularC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormularC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormularCType }
     * 
     * 
     */
    public List<FormularCType> getFormularC() {
        if (formularC == null) {
            formularC = new ArrayList<FormularCType>();
        }
        return this.formularC;
    }

}
