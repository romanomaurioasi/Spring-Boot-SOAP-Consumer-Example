
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per StoryBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StoryBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Creation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="StoryID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoryBaseType", propOrder = {
    "creation",
    "storyID"
})
@XmlSeeAlso({
    CoveredDailyAllowanceType.class,
    IncapacitiesToWorkType.class,
    TakeWorkUpFullyType.class,
    TreatmentsType.class,
    AgreementType.class,
    AnnualSalaryType.class,
    PaymentType.class,
    AdditionsPersonType.class,
    AbsencesType.class,
    SpecialCodeType.class,
    AccidentDescriptionType.class,
    SalaryRaiseType.class,
    PersonMutatedType.class,
    SpecialCoverageType.class,
    BooleanStoryType.class,
    AttachmentType.class,
    ProcessCtrlRequestType.class,
    SettlementType.class,
    RepaymentType.class,
    CrossChannelLinkType.class,
    ProcessCtrlResponseType.class,
    DialogMessageType.class
})
public class StoryBaseType {

    @XmlElement(name = "Creation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    @XmlElement(name = "StoryID", required = true)
    protected String storyID;

    /**
     * Recupera il valore della proprietà creation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreation() {
        return creation;
    }

    /**
     * Imposta il valore della proprietà creation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreation(XMLGregorianCalendar value) {
        this.creation = value;
    }

    /**
     * Recupera il valore della proprietà storyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoryID() {
        return storyID;
    }

    /**
     * Imposta il valore della proprietà storyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoryID(String value) {
        this.storyID = value;
    }

}
