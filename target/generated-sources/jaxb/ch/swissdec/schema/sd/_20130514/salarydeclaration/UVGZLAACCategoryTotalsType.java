
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UVGZ-LAAC-CategoryTotalsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVGZ-LAAC-CategoryTotalsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVGZ-LAAC-CategoryTotal" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GenericCategoryTotalType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVGZ-LAAC-CategoryTotalsType", propOrder = {
    "uvgzlaacCategoryTotal"
})
public class UVGZLAACCategoryTotalsType {

    @XmlElement(name = "UVGZ-LAAC-CategoryTotal", required = true)
    protected List<GenericCategoryTotalType> uvgzlaacCategoryTotal;

    /**
     * Gets the value of the uvgzlaacCategoryTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvgzlaacCategoryTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGZLAACCategoryTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericCategoryTotalType }
     * 
     * 
     */
    public List<GenericCategoryTotalType> getUVGZLAACCategoryTotal() {
        if (uvgzlaacCategoryTotal == null) {
            uvgzlaacCategoryTotal = new ArrayList<GenericCategoryTotalType>();
        }
        return this.uvgzlaacCategoryTotal;
    }

}
