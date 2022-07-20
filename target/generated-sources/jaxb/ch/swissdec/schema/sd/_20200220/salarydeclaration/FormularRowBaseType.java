
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FormularRowBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FormularRowBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SharePlanDescription" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormularRowBaseType", propOrder = {
    "sharePlanDescription"
})
@XmlSeeAlso({
    TableAIncomeLineType.class,
    TableAWealthLineType.class,
    TableBLineType.class,
    TableCIncomeLineType.class,
    TableCOwnershipRightPortfolioLineType.class
})
public class FormularRowBaseType {

    @XmlElement(name = "SharePlanDescription", required = true)
    protected String sharePlanDescription;

    /**
     * Recupera il valore della proprietà sharePlanDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePlanDescription() {
        return sharePlanDescription;
    }

    /**
     * Imposta il valore della proprietà sharePlanDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePlanDescription(String value) {
        this.sharePlanDescription = value;
    }

}
