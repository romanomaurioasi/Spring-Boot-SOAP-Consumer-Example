
package ch.swissdec.schema.common._20200220.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompanyDescriptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyDescriptionBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Workplace" type="{http://www.swissdec.ch/schema/common/20200220/Common}WorkplaceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDescriptionType", propOrder = {
    "workplace"
})
public class CompanyDescriptionType
    extends CompanyDescriptionBaseType
{

    @XmlElement(name = "Workplace", required = true)
    protected List<WorkplaceType> workplace;

    /**
     * Gets the value of the workplace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workplace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkplace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkplaceType }
     * 
     * 
     */
    public List<WorkplaceType> getWorkplace() {
        if (workplace == null) {
            workplace = new ArrayList<WorkplaceType>();
        }
        return this.workplace;
    }

}
