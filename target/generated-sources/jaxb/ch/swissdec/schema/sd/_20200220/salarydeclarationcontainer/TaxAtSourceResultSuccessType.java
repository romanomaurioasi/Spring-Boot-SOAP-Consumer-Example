
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.sd._20200220.salarydeclaration.TaxAtSourcePersonsType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.TaxAtSourceSummaryType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.TaxAtSourceTotalsConsumerType;


/**
 * <p>Classe Java per TaxAtSourceResultSuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceResultSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxAtSourceMinimalResultStateType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TaxAtSourceQuittanceWithoutCompletion" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceTotalsConsumerType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ChangesConsideredUpTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="Staff" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourcePersonsType"/&gt;
 *           &lt;element name="Summary" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceSummaryType"/&gt;
 *           &lt;element name="TaxAtSourceDeclarationQuittance" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceTotalsConsumerType"/&gt;
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
@XmlType(name = "TaxAtSourceResultSuccessType", propOrder = {
    "taxAtSourceQuittanceWithoutCompletion",
    "changesConsideredUpTo",
    "staff",
    "summary",
    "taxAtSourceDeclarationQuittance"
})
public class TaxAtSourceResultSuccessType
    extends TaxAtSourceMinimalResultStateType
{

    @XmlElement(name = "TaxAtSourceQuittanceWithoutCompletion")
    protected TaxAtSourceTotalsConsumerType taxAtSourceQuittanceWithoutCompletion;
    @XmlElement(name = "ChangesConsideredUpTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changesConsideredUpTo;
    @XmlElement(name = "Staff")
    protected TaxAtSourcePersonsType staff;
    @XmlElement(name = "Summary")
    protected TaxAtSourceSummaryType summary;
    @XmlElement(name = "TaxAtSourceDeclarationQuittance")
    protected TaxAtSourceTotalsConsumerType taxAtSourceDeclarationQuittance;

    /**
     * Recupera il valore della proprietà taxAtSourceQuittanceWithoutCompletion.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceTotalsConsumerType }
     *     
     */
    public TaxAtSourceTotalsConsumerType getTaxAtSourceQuittanceWithoutCompletion() {
        return taxAtSourceQuittanceWithoutCompletion;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceQuittanceWithoutCompletion.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceTotalsConsumerType }
     *     
     */
    public void setTaxAtSourceQuittanceWithoutCompletion(TaxAtSourceTotalsConsumerType value) {
        this.taxAtSourceQuittanceWithoutCompletion = value;
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
     *     {@link TaxAtSourcePersonsType }
     *     
     */
    public TaxAtSourcePersonsType getStaff() {
        return staff;
    }

    /**
     * Imposta il valore della proprietà staff.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourcePersonsType }
     *     
     */
    public void setStaff(TaxAtSourcePersonsType value) {
        this.staff = value;
    }

    /**
     * Recupera il valore della proprietà summary.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceSummaryType }
     *     
     */
    public TaxAtSourceSummaryType getSummary() {
        return summary;
    }

    /**
     * Imposta il valore della proprietà summary.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceSummaryType }
     *     
     */
    public void setSummary(TaxAtSourceSummaryType value) {
        this.summary = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSourceDeclarationQuittance.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceTotalsConsumerType }
     *     
     */
    public TaxAtSourceTotalsConsumerType getTaxAtSourceDeclarationQuittance() {
        return taxAtSourceDeclarationQuittance;
    }

    /**
     * Imposta il valore della proprietà taxAtSourceDeclarationQuittance.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceTotalsConsumerType }
     *     
     */
    public void setTaxAtSourceDeclarationQuittance(TaxAtSourceTotalsConsumerType value) {
        this.taxAtSourceDeclarationQuittance = value;
    }

}
