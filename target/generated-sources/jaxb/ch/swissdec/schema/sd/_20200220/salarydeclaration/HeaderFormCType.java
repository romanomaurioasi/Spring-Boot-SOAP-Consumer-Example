
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per HeaderFormCType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HeaderFormCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}HeaderCommonType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MoveToCH" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EntryConcern" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EntryEmployerCH" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="WithdrawalEmployerCH" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="WithdrawalConcern" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MoveFromCH" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfDestinationResidenceOrWorkplace" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceAtRealisation" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}Location2Type" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceAtRealisation" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}Location3Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderFormCType", propOrder = {
    "moveToCH",
    "entryConcern",
    "entryEmployerCH",
    "withdrawalEmployerCH",
    "withdrawalConcern",
    "moveFromCH",
    "countryOfDestinationResidenceOrWorkplace",
    "residenceAtRealisation",
    "workplaceAtRealisation"
})
public class HeaderFormCType
    extends HeaderCommonType
{

    @XmlElement(name = "MoveToCH")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar moveToCH;
    @XmlElement(name = "EntryConcern", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryConcern;
    @XmlElement(name = "EntryEmployerCH", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryEmployerCH;
    @XmlElement(name = "WithdrawalEmployerCH")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withdrawalEmployerCH;
    @XmlElement(name = "WithdrawalConcern")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withdrawalConcern;
    @XmlElement(name = "MoveFromCH")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar moveFromCH;
    @XmlElement(name = "CountryOfDestinationResidenceOrWorkplace")
    protected String countryOfDestinationResidenceOrWorkplace;
    @XmlElement(name = "ResidenceAtRealisation")
    @XmlSchemaType(name = "NMTOKEN")
    protected Location2Type residenceAtRealisation;
    @XmlElement(name = "WorkplaceAtRealisation")
    @XmlSchemaType(name = "NMTOKEN")
    protected Location3Type workplaceAtRealisation;

    /**
     * Recupera il valore della proprietà moveToCH.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoveToCH() {
        return moveToCH;
    }

    /**
     * Imposta il valore della proprietà moveToCH.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoveToCH(XMLGregorianCalendar value) {
        this.moveToCH = value;
    }

    /**
     * Recupera il valore della proprietà entryConcern.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryConcern() {
        return entryConcern;
    }

    /**
     * Imposta il valore della proprietà entryConcern.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryConcern(XMLGregorianCalendar value) {
        this.entryConcern = value;
    }

    /**
     * Recupera il valore della proprietà entryEmployerCH.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryEmployerCH() {
        return entryEmployerCH;
    }

    /**
     * Imposta il valore della proprietà entryEmployerCH.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryEmployerCH(XMLGregorianCalendar value) {
        this.entryEmployerCH = value;
    }

    /**
     * Recupera il valore della proprietà withdrawalEmployerCH.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalEmployerCH() {
        return withdrawalEmployerCH;
    }

    /**
     * Imposta il valore della proprietà withdrawalEmployerCH.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalEmployerCH(XMLGregorianCalendar value) {
        this.withdrawalEmployerCH = value;
    }

    /**
     * Recupera il valore della proprietà withdrawalConcern.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalConcern() {
        return withdrawalConcern;
    }

    /**
     * Imposta il valore della proprietà withdrawalConcern.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalConcern(XMLGregorianCalendar value) {
        this.withdrawalConcern = value;
    }

    /**
     * Recupera il valore della proprietà moveFromCH.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoveFromCH() {
        return moveFromCH;
    }

    /**
     * Imposta il valore della proprietà moveFromCH.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoveFromCH(XMLGregorianCalendar value) {
        this.moveFromCH = value;
    }

    /**
     * Recupera il valore della proprietà countryOfDestinationResidenceOrWorkplace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfDestinationResidenceOrWorkplace() {
        return countryOfDestinationResidenceOrWorkplace;
    }

    /**
     * Imposta il valore della proprietà countryOfDestinationResidenceOrWorkplace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfDestinationResidenceOrWorkplace(String value) {
        this.countryOfDestinationResidenceOrWorkplace = value;
    }

    /**
     * Recupera il valore della proprietà residenceAtRealisation.
     * 
     * @return
     *     possible object is
     *     {@link Location2Type }
     *     
     */
    public Location2Type getResidenceAtRealisation() {
        return residenceAtRealisation;
    }

    /**
     * Imposta il valore della proprietà residenceAtRealisation.
     * 
     * @param value
     *     allowed object is
     *     {@link Location2Type }
     *     
     */
    public void setResidenceAtRealisation(Location2Type value) {
        this.residenceAtRealisation = value;
    }

    /**
     * Recupera il valore della proprietà workplaceAtRealisation.
     * 
     * @return
     *     possible object is
     *     {@link Location3Type }
     *     
     */
    public Location3Type getWorkplaceAtRealisation() {
        return workplaceAtRealisation;
    }

    /**
     * Imposta il valore della proprietà workplaceAtRealisation.
     * 
     * @param value
     *     allowed object is
     *     {@link Location3Type }
     *     
     */
    public void setWorkplaceAtRealisation(Location3Type value) {
        this.workplaceAtRealisation = value;
    }

}
