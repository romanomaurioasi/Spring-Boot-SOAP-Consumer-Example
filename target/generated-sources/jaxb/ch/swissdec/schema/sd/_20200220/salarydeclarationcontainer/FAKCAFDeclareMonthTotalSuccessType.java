
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.FAKCAFMonthTotalType;


/**
 * <p>Classe Java per FAK-CAF-DeclareMonthTotalSuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-DeclareMonthTotalSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}FAK-CAF-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FAK-CAF-QuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-MonthTotalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-DeclareMonthTotalSuccessType", propOrder = {
    "fakcafQuittanceWithoutCompletion"
})
public class FAKCAFDeclareMonthTotalSuccessType
    extends FAKCAFMinimalResultStateType
{

    @XmlElement(name = "FAK-CAF-QuittanceWithoutCompletion")
    protected List<FAKCAFMonthTotalType> fakcafQuittanceWithoutCompletion;

    /**
     * Gets the value of the fakcafQuittanceWithoutCompletion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fakcafQuittanceWithoutCompletion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFAKCAFQuittanceWithoutCompletion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAKCAFMonthTotalType }
     * 
     * 
     */
    public List<FAKCAFMonthTotalType> getFAKCAFQuittanceWithoutCompletion() {
        if (fakcafQuittanceWithoutCompletion == null) {
            fakcafQuittanceWithoutCompletion = new ArrayList<FAKCAFMonthTotalType>();
        }
        return this.fakcafQuittanceWithoutCompletion;
    }

}
