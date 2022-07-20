
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeclareMonthTotalSalaryResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeclareMonthTotalSalaryResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AHV-AVS-DeclareMonthTotalSalaryResultType"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}FAK-CAF-DeclareMonthTotalSalaryResultType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclareMonthTotalSalaryResultType", propOrder = {
    "ahvavs",
    "fakcaf"
})
@XmlSeeAlso({
    ReducedDeclareMonthTotalSalaryResultType.class
})
public class DeclareMonthTotalSalaryResultType {

    @XmlElement(name = "AHV-AVS")
    protected AHVAVSDeclareMonthTotalSalaryResultType ahvavs;
    @XmlElement(name = "FAK-CAF")
    protected FAKCAFDeclareMonthTotalSalaryResultType fakcaf;

    /**
     * Recupera il valore della proprietà ahvavs.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSDeclareMonthTotalSalaryResultType }
     *     
     */
    public AHVAVSDeclareMonthTotalSalaryResultType getAHVAVS() {
        return ahvavs;
    }

    /**
     * Imposta il valore della proprietà ahvavs.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSDeclareMonthTotalSalaryResultType }
     *     
     */
    public void setAHVAVS(AHVAVSDeclareMonthTotalSalaryResultType value) {
        this.ahvavs = value;
    }

    /**
     * Recupera il valore della proprietà fakcaf.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFDeclareMonthTotalSalaryResultType }
     *     
     */
    public FAKCAFDeclareMonthTotalSalaryResultType getFAKCAF() {
        return fakcaf;
    }

    /**
     * Imposta il valore della proprietà fakcaf.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFDeclareMonthTotalSalaryResultType }
     *     
     */
    public void setFAKCAF(FAKCAFDeclareMonthTotalSalaryResultType value) {
        this.fakcaf = value;
    }

}
