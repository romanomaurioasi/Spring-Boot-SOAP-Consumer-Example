
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.PositionType;


/**
 * <p>Classe Java per AdditionsPersonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AdditionsPersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://www.swissdec.ch/schema/common/20180901/Common}PositionType"/&gt;
 *         &lt;element name="Contract" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ContractType"/&gt;
 *         &lt;element name="ContractFixedUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ContractDissolveFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="JobTitle" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}TaxAtSourceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionsPersonType", propOrder = {
    "position",
    "contract",
    "contractFixedUntil",
    "contractDissolveFrom",
    "jobTitle",
    "taxAtSource"
})
public class AdditionsPersonType
    extends StoryBaseType
{

    @XmlElement(name = "Position", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected PositionType position;
    @XmlElement(name = "Contract", required = true)
    protected ContractType contract;
    @XmlElement(name = "ContractFixedUntil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractFixedUntil;
    @XmlElement(name = "ContractDissolveFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractDissolveFrom;
    @XmlElement(name = "JobTitle", required = true)
    protected String jobTitle;
    @XmlElement(name = "TaxAtSource")
    protected TaxAtSourceType taxAtSource;

    /**
     * Recupera il valore della proprietà position.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * Recupera il valore della proprietà contract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContract() {
        return contract;
    }

    /**
     * Imposta il valore della proprietà contract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContract(ContractType value) {
        this.contract = value;
    }

    /**
     * Recupera il valore della proprietà contractFixedUntil.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractFixedUntil() {
        return contractFixedUntil;
    }

    /**
     * Imposta il valore della proprietà contractFixedUntil.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractFixedUntil(XMLGregorianCalendar value) {
        this.contractFixedUntil = value;
    }

    /**
     * Recupera il valore della proprietà contractDissolveFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDissolveFrom() {
        return contractDissolveFrom;
    }

    /**
     * Imposta il valore della proprietà contractDissolveFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDissolveFrom(XMLGregorianCalendar value) {
        this.contractDissolveFrom = value;
    }

    /**
     * Recupera il valore della proprietà jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Imposta il valore della proprietà jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Recupera il valore della proprietà taxAtSource.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceType }
     *     
     */
    public TaxAtSourceType getTaxAtSource() {
        return taxAtSource;
    }

    /**
     * Imposta il valore della proprietà taxAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceType }
     *     
     */
    public void setTaxAtSource(TaxAtSourceType value) {
        this.taxAtSource = value;
    }

}
