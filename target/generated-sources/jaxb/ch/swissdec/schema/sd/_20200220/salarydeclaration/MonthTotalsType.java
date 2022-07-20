
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MonthTotalsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonthTotalsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AHV-AVS-MonthTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-MonthTotalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FAK-CAF-MonthTotal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-MonthTotalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthTotalsType", propOrder = {
    "ahvavsMonthTotal",
    "fakcafMonthTotal"
})
public class MonthTotalsType {

    @XmlElement(name = "AHV-AVS-MonthTotal")
    protected List<AHVAVSMonthTotalType> ahvavsMonthTotal;
    @XmlElement(name = "FAK-CAF-MonthTotal")
    protected List<FAKCAFMonthTotalType> fakcafMonthTotal;

    /**
     * Gets the value of the ahvavsMonthTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ahvavsMonthTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAHVAVSMonthTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AHVAVSMonthTotalType }
     * 
     * 
     */
    public List<AHVAVSMonthTotalType> getAHVAVSMonthTotal() {
        if (ahvavsMonthTotal == null) {
            ahvavsMonthTotal = new ArrayList<AHVAVSMonthTotalType>();
        }
        return this.ahvavsMonthTotal;
    }

    /**
     * Gets the value of the fakcafMonthTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fakcafMonthTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFAKCAFMonthTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAKCAFMonthTotalType }
     * 
     * 
     */
    public List<FAKCAFMonthTotalType> getFAKCAFMonthTotal() {
        if (fakcafMonthTotal == null) {
            fakcafMonthTotal = new ArrayList<FAKCAFMonthTotalType>();
        }
        return this.fakcafMonthTotal;
    }

}
