
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per KindOfSalaryTimedType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KindOfSalaryTimedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}KindOfSalaryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Factor" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}FactorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KindOfSalaryTimedType", propOrder = {
    "factor"
})
public class KindOfSalaryTimedType
    extends KindOfSalaryType
{

    @XmlElement(name = "Factor")
    protected BigDecimal factor;

    /**
     * Recupera il valore della proprietà factor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactor() {
        return factor;
    }

    /**
     * Imposta il valore della proprietà factor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactor(BigDecimal value) {
        this.factor = value;
    }

}
