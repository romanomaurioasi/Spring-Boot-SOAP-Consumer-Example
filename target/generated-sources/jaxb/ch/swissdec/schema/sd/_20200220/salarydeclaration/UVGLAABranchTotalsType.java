
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UVG-LAA-BranchTotalsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVG-LAA-BranchTotalsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVG-LAA-BranchTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}UVG-LAA-BranchTotalType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVG-LAA-BranchTotalsType", propOrder = {
    "uvglaaBranchTotal"
})
public class UVGLAABranchTotalsType {

    @XmlElement(name = "UVG-LAA-BranchTotal", required = true)
    protected List<UVGLAABranchTotalType> uvglaaBranchTotal;

    /**
     * Gets the value of the uvglaaBranchTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvglaaBranchTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUVGLAABranchTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UVGLAABranchTotalType }
     * 
     * 
     */
    public List<UVGLAABranchTotalType> getUVGLAABranchTotal() {
        if (uvglaaBranchTotal == null) {
            uvglaaBranchTotal = new ArrayList<UVGLAABranchTotalType>();
        }
        return this.uvglaaBranchTotal;
    }

}
