
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-SalariesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-SalariesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="BVG-LPP-Salary" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-SalaryType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="BVG-LPP-PeriodSalary" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}BVG-LPP-PeriodSalaryType" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-SalariesType", propOrder = {
    "bvglppSalary",
    "bvglppPeriodSalary"
})
public class BVGLPPSalariesType {

    @XmlElement(name = "BVG-LPP-Salary")
    protected List<BVGLPPSalaryType> bvglppSalary;
    @XmlElement(name = "BVG-LPP-PeriodSalary")
    protected List<BVGLPPPeriodSalaryType> bvglppPeriodSalary;

    /**
     * Gets the value of the bvglppSalary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bvglppSalary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBVGLPPSalary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BVGLPPSalaryType }
     * 
     * 
     */
    public List<BVGLPPSalaryType> getBVGLPPSalary() {
        if (bvglppSalary == null) {
            bvglppSalary = new ArrayList<BVGLPPSalaryType>();
        }
        return this.bvglppSalary;
    }

    /**
     * Gets the value of the bvglppPeriodSalary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bvglppPeriodSalary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBVGLPPPeriodSalary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BVGLPPPeriodSalaryType }
     * 
     * 
     */
    public List<BVGLPPPeriodSalaryType> getBVGLPPPeriodSalary() {
        if (bvglppPeriodSalary == null) {
            bvglppPeriodSalary = new ArrayList<BVGLPPPeriodSalaryType>();
        }
        return this.bvglppPeriodSalary;
    }

}
