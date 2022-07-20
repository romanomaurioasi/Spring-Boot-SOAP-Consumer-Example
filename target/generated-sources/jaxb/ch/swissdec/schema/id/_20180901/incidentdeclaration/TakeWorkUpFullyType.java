
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per TakeWorkUpFullyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TakeWorkUpFullyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TakeWorkUpFullyDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ExpectedLastDayOfIncapacityToWork" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ExpectedIncapacityToWork" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ExpectedIncapacityToWorkType"/&gt;
 *         &lt;element name="NoIncapacityToWork" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TakeWorkUpFullyType", propOrder = {
    "takeWorkUpFullyDate",
    "expectedLastDayOfIncapacityToWork",
    "expectedIncapacityToWork",
    "noIncapacityToWork"
})
public class TakeWorkUpFullyType
    extends StoryBaseType
{

    @XmlElement(name = "TakeWorkUpFullyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar takeWorkUpFullyDate;
    @XmlElement(name = "ExpectedLastDayOfIncapacityToWork")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedLastDayOfIncapacityToWork;
    @XmlElement(name = "ExpectedIncapacityToWork")
    @XmlSchemaType(name = "NMTOKEN")
    protected ExpectedIncapacityToWorkType expectedIncapacityToWork;
    @XmlElement(name = "NoIncapacityToWork")
    protected EmptyType noIncapacityToWork;

    /**
     * Recupera il valore della proprietà takeWorkUpFullyDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTakeWorkUpFullyDate() {
        return takeWorkUpFullyDate;
    }

    /**
     * Imposta il valore della proprietà takeWorkUpFullyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTakeWorkUpFullyDate(XMLGregorianCalendar value) {
        this.takeWorkUpFullyDate = value;
    }

    /**
     * Recupera il valore della proprietà expectedLastDayOfIncapacityToWork.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedLastDayOfIncapacityToWork() {
        return expectedLastDayOfIncapacityToWork;
    }

    /**
     * Imposta il valore della proprietà expectedLastDayOfIncapacityToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedLastDayOfIncapacityToWork(XMLGregorianCalendar value) {
        this.expectedLastDayOfIncapacityToWork = value;
    }

    /**
     * Recupera il valore della proprietà expectedIncapacityToWork.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedIncapacityToWorkType }
     *     
     */
    public ExpectedIncapacityToWorkType getExpectedIncapacityToWork() {
        return expectedIncapacityToWork;
    }

    /**
     * Imposta il valore della proprietà expectedIncapacityToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedIncapacityToWorkType }
     *     
     */
    public void setExpectedIncapacityToWork(ExpectedIncapacityToWorkType value) {
        this.expectedIncapacityToWork = value;
    }

    /**
     * Recupera il valore della proprietà noIncapacityToWork.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNoIncapacityToWork() {
        return noIncapacityToWork;
    }

    /**
     * Imposta il valore della proprietà noIncapacityToWork.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNoIncapacityToWork(EmptyType value) {
        this.noIncapacityToWork = value;
    }

}
