
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.CompanyDescriptionType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.StatisticNotification;
import ch.swissdec.schema.sd._20200220.salarydeclaration.StatisticPersonsType;
import ch.swissdec.schema.sd._20200220.salarydeclaration.StatisticProcessType;


/**
 * <p>Classe Java per StatisticSuccessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResultStateBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Process" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticProcessType"/&gt;
 *         &lt;element name="ProcessDescriptions" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticNotification" minOccurs="0"/&gt;
 *         &lt;element name="CompanyDescription" type="{http://www.swissdec.ch/schema/common/20200220/Common}CompanyDescriptionType"/&gt;
 *         &lt;element name="Staff" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}StatisticPersonsType" minOccurs="0"/&gt;
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
    "process",
    "processDescriptions",
    "companyDescription",
    "staff"
})
public class StatisticSuccessType
    extends ResultStateBaseType
{

    @XmlElement(name = "Process", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected StatisticProcessType process;
    @XmlElement(name = "ProcessDescriptions")
    protected StatisticNotification processDescriptions;
    @XmlElement(name = "CompanyDescription", required = true)
    protected CompanyDescriptionType companyDescription;
    @XmlElement(name = "Staff")
    protected StatisticPersonsType staff;

    /**
     * Recupera il valore della proprietà process.
     * 
     * @return
     *     possible object is
     *     {@link StatisticProcessType }
     *     
     */
    public StatisticProcessType getProcess() {
        return process;
    }

    /**
     * Imposta il valore della proprietà process.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticProcessType }
     *     
     */
    public void setProcess(StatisticProcessType value) {
        this.process = value;
    }

    /**
     * Recupera il valore della proprietà processDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link StatisticNotification }
     *     
     */
    public StatisticNotification getProcessDescriptions() {
        return processDescriptions;
    }

    /**
     * Imposta il valore della proprietà processDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticNotification }
     *     
     */
    public void setProcessDescriptions(StatisticNotification value) {
        this.processDescriptions = value;
    }

    /**
     * Recupera il valore della proprietà companyDescription.
     * 
     * @return
     *     possible object is
     *     {@link CompanyDescriptionType }
     *     
     */
    public CompanyDescriptionType getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Imposta il valore della proprietà companyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyDescriptionType }
     *     
     */
    public void setCompanyDescription(CompanyDescriptionType value) {
        this.companyDescription = value;
    }

    /**
     * Recupera il valore della proprietà staff.
     * 
     * @return
     *     possible object is
     *     {@link StatisticPersonsType }
     *     
     */
    public StatisticPersonsType getStaff() {
        return staff;
    }

    /**
     * Imposta il valore della proprietà staff.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticPersonsType }
     *     
     */
    public void setStaff(StatisticPersonsType value) {
        this.staff = value;
    }

}
