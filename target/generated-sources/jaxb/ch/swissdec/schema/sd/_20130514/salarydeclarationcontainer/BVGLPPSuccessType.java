
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.sd._20130514.salarydeclaration.BVGLPPCodeDescriptionsType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.ContributionsStaffType;
import ch.swissdec.schema.sd._20130514.salarydeclaration.SummaryType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;succès&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;Disposition des cotisations avec succès&lt;/short&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per BVG-LPP-SuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-SuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}BVG-LPP-MinimalResultStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangesConsideredUpTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CodeDescriptions" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-CodeDescriptionsType" minOccurs="0"/&gt;
 *         &lt;element name="Staff" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ContributionsStaffType"/&gt;
 *         &lt;element name="Summary" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SummaryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-SuccessType", propOrder = {
    "changesConsideredUpTo",
    "codeDescriptions",
    "staff",
    "summary"
})
public class BVGLPPSuccessType
    extends BVGLPPMinimalResultStateType
{

    @XmlElement(name = "ChangesConsideredUpTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changesConsideredUpTo;
    @XmlElement(name = "CodeDescriptions")
    protected BVGLPPCodeDescriptionsType codeDescriptions;
    @XmlElement(name = "Staff", required = true)
    protected ContributionsStaffType staff;
    @XmlElement(name = "Summary", required = true)
    protected SummaryType summary;

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
     * Recupera il valore della proprietà codeDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPCodeDescriptionsType }
     *     
     */
    public BVGLPPCodeDescriptionsType getCodeDescriptions() {
        return codeDescriptions;
    }

    /**
     * Imposta il valore della proprietà codeDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPCodeDescriptionsType }
     *     
     */
    public void setCodeDescriptions(BVGLPPCodeDescriptionsType value) {
        this.codeDescriptions = value;
    }

    /**
     * Recupera il valore della proprietà staff.
     * 
     * @return
     *     possible object is
     *     {@link ContributionsStaffType }
     *     
     */
    public ContributionsStaffType getStaff() {
        return staff;
    }

    /**
     * Imposta il valore della proprietà staff.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionsStaffType }
     *     
     */
    public void setStaff(ContributionsStaffType value) {
        this.staff = value;
    }

    /**
     * Recupera il valore della proprietà summary.
     * 
     * @return
     *     possible object is
     *     {@link SummaryType }
     *     
     */
    public SummaryType getSummary() {
        return summary;
    }

    /**
     * Imposta il valore della proprietà summary.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryType }
     *     
     */
    public void setSummary(SummaryType value) {
        this.summary = value;
    }

}
