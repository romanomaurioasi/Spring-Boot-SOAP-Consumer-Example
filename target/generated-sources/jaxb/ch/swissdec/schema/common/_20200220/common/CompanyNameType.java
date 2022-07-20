
package ch.swissdec.schema.common._20200220.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompanyNameType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HR-RC-Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ComplementaryLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyNameType", propOrder = {
    "hrrcName",
    "complementaryLine"
})
public class CompanyNameType {

    @XmlElement(name = "HR-RC-Name", required = true)
    protected String hrrcName;
    @XmlElement(name = "ComplementaryLine")
    protected List<String> complementaryLine;

    /**
     * Recupera il valore della proprietà hrrcName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRRCName() {
        return hrrcName;
    }

    /**
     * Imposta il valore della proprietà hrrcName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRRCName(String value) {
        this.hrrcName = value;
    }

    /**
     * Gets the value of the complementaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComplementaryLine() {
        if (complementaryLine == null) {
            complementaryLine = new ArrayList<String>();
        }
        return this.complementaryLine;
    }

}
