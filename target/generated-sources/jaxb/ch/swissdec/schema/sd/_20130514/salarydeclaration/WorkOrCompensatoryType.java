
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per WorkOrCompensatoryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WorkOrCompensatoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Employment" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmploymentType" minOccurs="0"/&gt;
 *         &lt;element name="Workplace" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CantonAndEXType"/&gt;
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrCompensatoryType", propOrder = {
    "employment",
    "workplace",
    "start",
    "end"
})
public class WorkOrCompensatoryType {

    @XmlElement(name = "Employment")
    @XmlSchemaType(name = "NMTOKEN")
    protected EmploymentType employment;
    @XmlElement(name = "Workplace", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAndEXType workplace;
    @XmlElement(name = "Start", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "End")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar end;

    /**
     * Recupera il valore della proprietà employment.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentType }
     *     
     */
    public EmploymentType getEmployment() {
        return employment;
    }

    /**
     * Imposta il valore della proprietà employment.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentType }
     *     
     */
    public void setEmployment(EmploymentType value) {
        this.employment = value;
    }

    /**
     * Recupera il valore della proprietà workplace.
     * 
     * @return
     *     possible object is
     *     {@link CantonAndEXType }
     *     
     */
    public CantonAndEXType getWorkplace() {
        return workplace;
    }

    /**
     * Imposta il valore della proprietà workplace.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAndEXType }
     *     
     */
    public void setWorkplace(CantonAndEXType value) {
        this.workplace = value;
    }

    /**
     * Recupera il valore della proprietà start.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Imposta il valore della proprietà start.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Recupera il valore della proprietà end.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Imposta il valore della proprietà end.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

}
