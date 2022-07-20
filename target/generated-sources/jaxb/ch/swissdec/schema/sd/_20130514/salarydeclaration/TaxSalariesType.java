
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxSalariesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxSalariesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxAnnuity" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAnnuityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxSalary" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxSalaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSalariesType", propOrder = {
    "taxAnnuity",
    "taxSalary"
})
public class TaxSalariesType {

    @XmlElement(name = "TaxAnnuity")
    protected List<TaxAnnuityType> taxAnnuity;
    @XmlElement(name = "TaxSalary")
    protected List<TaxSalaryType> taxSalary;

    /**
     * Gets the value of the taxAnnuity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAnnuity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAnnuity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAnnuityType }
     * 
     * 
     */
    public List<TaxAnnuityType> getTaxAnnuity() {
        if (taxAnnuity == null) {
            taxAnnuity = new ArrayList<TaxAnnuityType>();
        }
        return this.taxAnnuity;
    }

    /**
     * Gets the value of the taxSalary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSalary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxSalary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSalaryType }
     * 
     * 
     */
    public List<TaxSalaryType> getTaxSalary() {
        if (taxSalary == null) {
            taxSalary = new ArrayList<TaxSalaryType>();
        }
        return this.taxSalary;
    }

}
