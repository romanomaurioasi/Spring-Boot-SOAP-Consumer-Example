
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.AHVAVSMonthTotalType;


/**
 * <p>Classe Java per AHV-AVS-DeclareMonthTotalSuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-DeclareMonthTotalSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AHV-AVS-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AHV-AVS-QuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-MonthTotalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-DeclareMonthTotalSuccessType", propOrder = {
    "ahvavsQuittanceWithoutCompletion"
})
public class AHVAVSDeclareMonthTotalSuccessType
    extends AHVAVSMinimalResultStateType
{

    @XmlElement(name = "AHV-AVS-QuittanceWithoutCompletion")
    protected List<AHVAVSMonthTotalType> ahvavsQuittanceWithoutCompletion;

    /**
     * Gets the value of the ahvavsQuittanceWithoutCompletion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ahvavsQuittanceWithoutCompletion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAHVAVSQuittanceWithoutCompletion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AHVAVSMonthTotalType }
     * 
     * 
     */
    public List<AHVAVSMonthTotalType> getAHVAVSQuittanceWithoutCompletion() {
        if (ahvavsQuittanceWithoutCompletion == null) {
            ahvavsQuittanceWithoutCompletion = new ArrayList<AHVAVSMonthTotalType>();
        }
        return this.ahvavsQuittanceWithoutCompletion;
    }

}
