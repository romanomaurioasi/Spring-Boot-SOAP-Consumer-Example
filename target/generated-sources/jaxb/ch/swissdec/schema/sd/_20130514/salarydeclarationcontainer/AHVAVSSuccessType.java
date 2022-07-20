
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.sd._20130514.salarydeclaration.AHVAVSPersonsType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.AHVAVSSummaryType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.AHVAVSTotalsConsumerType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Informations concernant l'état&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per AHV-AVS-SuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-SuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AHV-AVS-MinimalResultStateType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS-QuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AHV-AVS-TotalsConsumerType" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ChangesConsideredUpTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="Staff" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AHV-AVS-PersonsType"/&gt;
 *           &lt;element name="Summary" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AHV-AVS-SummaryType"/&gt;
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
@XmlType(name = "AHV-AVS-SuccessType", propOrder = {
    "ahvavsQuittanceWithoutCompletion",
    "changesConsideredUpTo",
    "staff",
    "summary"
})
public class AHVAVSSuccessType
    extends AHVAVSMinimalResultStateType
{

    @XmlElement(name = "AHV-AVS-QuittanceWithoutCompletion")
    protected AHVAVSTotalsConsumerType ahvavsQuittanceWithoutCompletion;
    @XmlElement(name = "ChangesConsideredUpTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changesConsideredUpTo;
    @XmlElement(name = "Staff")
    protected AHVAVSPersonsType staff;
    @XmlElement(name = "Summary")
    protected AHVAVSSummaryType summary;

    /**
     * Recupera il valore della proprietà ahvavsQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link AHVAVSTotalsConsumerType }
     *     
     */
    public AHVAVSTotalsConsumerType getAHVAVSQuittanceWithoutCompletion() {
        return ahvavsQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà ahvavsQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link AHVAVSTotalsConsumerType }
     *     
     */
    public void setAHVAVSQuittanceWithoutCompletion(AHVAVSTotalsConsumerType value) {
        this.ahvavsQuittanceWithoutCompletion = value;
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
