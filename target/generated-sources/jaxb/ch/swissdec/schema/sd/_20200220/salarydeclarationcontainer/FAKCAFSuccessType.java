
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.sd._20200220.salarydeclaration.AHVAVSPersonsType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.AHVAVSSummaryType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.FAKCAFTotalsConsumerType;


/**
 * <p>Classe Java per FAK-CAF-SuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-SuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}FAK-CAF-MinimalResultStateType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FAK-CAF-QuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}FAK-CAF-TotalsConsumerType" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ChangesConsideredUpTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="Staff" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-PersonsType"/&gt;
 *           &lt;element name="Summary" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}AHV-AVS-SummaryType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-SuccessType", propOrder = {
    "fakcafQuittanceWithoutCompletion",
    "changesConsideredUpTo",
    "staff",
    "summary"
})
public class FAKCAFSuccessType
    extends FAKCAFMinimalResultStateType
{

    @XmlElement(name = "FAK-CAF-QuittanceWithoutCompletion")
    protected FAKCAFTotalsConsumerType fakcafQuittanceWithoutCompletion;
    @XmlElement(name = "ChangesConsideredUpTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changesConsideredUpTo;
    @XmlElement(name = "Staff")
    protected AHVAVSPersonsType staff;
    @XmlElement(name = "Summary")
    protected AHVAVSSummaryType summary;

    /**
     * Recupera il valore della proprietà fakcafQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link FAKCAFTotalsConsumerType }
     *     
     */
    public FAKCAFTotalsConsumerType getFAKCAFQuittanceWithoutCompletion() {
        return fakcafQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà fakcafQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link FAKCAFTotalsConsumerType }
     *     
     */
    public void setFAKCAFQuittanceWithoutCompletion(FAKCAFTotalsConsumerType value) {
        this.fakcafQuittanceWithoutCompletion = value;
    }

    /**
     * Recupera il valore della proprietà changesConsideredUpTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangesConsideredUpTo() {
        return changesConsideredUpTo;
    }

    /**
     * Imposta il valore della proprietà changesConsideredUpTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangesConsideredUpTo(XMLGregorianCalendar value) {
        this.changesConsideredUpTo = value;
    }

    /**
     * Recupera il valore della proprietà staff.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSPersonsType }
     *     
     */
    public AHVAVSPersonsType getStaff() {
        return staff;
    }

    /**
     * Imposta il valore della proprietà staff.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSPersonsType }
     *     
     */
    public void setStaff(AHVAVSPersonsType value) {
        this.staff = value;
    }

    /**
     * Recupera il valore della proprietà summary.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSSummaryType }
     *     
     */
    public AHVAVSSummaryType getSummary() {
        return summary;
    }

    /**
     * Imposta il valore della proprietà summary.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSSummaryType }
     *     
     */
    public void setSummary(AHVAVSSummaryType value) {
        this.summary = value;
    }

}
