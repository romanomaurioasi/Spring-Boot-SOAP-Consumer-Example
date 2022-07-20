
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;succès&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per StatisticSuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ResultStateBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatisticQuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}StatisticQuittanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticSuccessType", propOrder = {
    "statisticQuittanceWithoutCompletion"
})
public class StatisticSuccessType
    extends ResultStateBaseType
{

    @XmlElement(name = "StatisticQuittanceWithoutCompletion")
    protected StatisticQuittanceType statisticQuittanceWithoutCompletion;

    /**
     * Recupera il valore della proprietà statisticQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link StatisticQuittanceType }
     *     
     */
    public StatisticQuittanceType getStatisticQuittanceWithoutCompletion() {
        return statisticQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà statisticQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticQuittanceType }
     *     
     */
    public void setStatisticQuittanceWithoutCompletion(StatisticQuittanceType value) {
        this.statisticQuittanceWithoutCompletion = value;
    }

}
