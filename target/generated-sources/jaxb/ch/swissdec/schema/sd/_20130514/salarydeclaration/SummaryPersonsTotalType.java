
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per SummaryPersonsTotalType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SummaryPersonsTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Total" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TotalType"/&gt;
 *         &lt;element name="DetailsAvailable" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryPersonsTotalType", propOrder = {
    "total",
    "detailsAvailable"
})
public class SummaryPersonsTotalType {

    @XmlElement(name = "Total", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String total;
    @XmlElement(name = "DetailsAvailable")
    @XmlSchemaType(name = "unsignedInt")
    protected long detailsAvailable;

    /**
     * Recupera il valore della proprietà total.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Imposta il valore della proprietà total.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Recupera il valore della proprietà detailsAvailable.
     * 
     */
    public long getDetailsAvailable() {
        return detailsAvailable;
    }

    /**
     * Imposta il valore della proprietà detailsAvailable.
     * 
     */
    public void setDetailsAvailable(long value) {
        this.detailsAvailable = value;
    }

}
