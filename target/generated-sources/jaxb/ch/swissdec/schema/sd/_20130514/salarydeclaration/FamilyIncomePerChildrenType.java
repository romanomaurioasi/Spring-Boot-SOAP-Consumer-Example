
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FamilyIncomePerChildrenType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FamilyIncomePerChildrenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FamilyIncomePerChild" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FamilyIncomePerChildType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyIncomePerChildrenType", propOrder = {
    "familyIncomePerChild"
})
public class FamilyIncomePerChildrenType {

    @XmlElement(name = "FamilyIncomePerChild", required = true)
    protected List<FamilyIncomePerChildType> familyIncomePerChild;

    /**
     * Gets the value of the familyIncomePerChild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyIncomePerChild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyIncomePerChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyIncomePerChildType }
     * 
     * 
     */
    public List<FamilyIncomePerChildType> getFamilyIncomePerChild() {
        if (familyIncomePerChild == null) {
            familyIncomePerChild = new ArrayList<FamilyIncomePerChildType>();
        }
        return this.familyIncomePerChild;
    }

}
