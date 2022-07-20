
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatisticQuittanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticQuittanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOf-Person-Tags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticQuittanceType", propOrder = {
    "numberOfPersonTags"
})
public class StatisticQuittanceType {

    @XmlElement(name = "NumberOf-Person-Tags")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfPersonTags;

    /**
     * Recupera il valore della proprietà numberOfPersonTags.
     * 
     */
    public long getNumberOfPersonTags() {
        return numberOfPersonTags;
    }

    /**
     * Imposta il valore della proprietà numberOfPersonTags.
     * 
     */
    public void setNumberOfPersonTags(long value) {
        this.numberOfPersonTags = value;
    }

}
