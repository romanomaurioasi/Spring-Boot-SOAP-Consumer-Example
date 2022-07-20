
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UVGZ-LAAC-SalariesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVGZ-LAAC-SalariesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVGZ-LAAC-Salary" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVGZ-LAAC-SalaryType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVGZ-LAAC-SalariesType", propOrder = {
    "uvgzlaacSalary"
})
public class UVGZLAACSalariesType {

    @XmlElement(name = "UVGZ-LAAC-Salary", required = true)
    protected List<UVGZLAACSalaryType> uvgzlaacSalary;

    /**
     * Gets the value of the uvgzlaacSalary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvgzlaacSalary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGZLAACSalary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UVGZLAACSalaryType }
     * 
     * 
     */
    public List<UVGZLAACSalaryType> getUVGZLAACSalary() {
        if (uvgzlaacSalary == null) {
            uvgzlaacSalary = new ArrayList<UVGZLAACSalaryType>();
        }
        return this.uvgzlaacSalary;
    }

}
