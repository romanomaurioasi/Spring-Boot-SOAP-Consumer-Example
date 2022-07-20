
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FAK-CAF-TotalsConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-TotalsConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Total-FAK-CAF-PerCanton" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}Total-FAK-CAF-PerCantonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-TotalsConsumerType", propOrder = {
    "totalFAKCAFPerCanton"
})
@XmlSeeAlso({
    FAKCAFTotalsType.class
})
public class FAKCAFTotalsConsumerType {

    @XmlElement(name = "Total-FAK-CAF-PerCanton")
    protected List<TotalFAKCAFPerCantonType> totalFAKCAFPerCanton;

    /**
     * Gets the value of the totalFAKCAFPerCanton property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalFAKCAFPerCanton property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalFAKCAFPerCanton().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalFAKCAFPerCantonType }
     * 
     * 
     */
    public List<TotalFAKCAFPerCantonType> getTotalFAKCAFPerCanton() {
        if (totalFAKCAFPerCanton == null) {
            totalFAKCAFPerCanton = new ArrayList<TotalFAKCAFPerCantonType>();
        }
        return this.totalFAKCAFPerCanton;
    }

}
