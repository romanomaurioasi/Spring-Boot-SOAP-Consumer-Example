
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UVG-LAA-SalariesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVG-LAA-SalariesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVG-LAA-Salary" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVG-LAA-SalaryType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVG-LAA-SalariesType", propOrder = {
    "uvglaaSalary"
})
public class UVGLAASalariesType {

    @XmlElement(name = "UVG-LAA-Salary", required = true)
    protected List<UVGLAASalaryType> uvglaaSalary;

    /**
     * Gets the value of the uvglaaSalary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvglaaSalary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGLAASalary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UVGLAASalaryType }
     * 
     * 
     */
    public List<UVGLAASalaryType> getUVGLAASalary() {
        if (uvglaaSalary == null) {
            uvglaaSalary = new ArrayList<UVGLAASalaryType>();
        }
        return this.uvglaaSalary;
    }

}
