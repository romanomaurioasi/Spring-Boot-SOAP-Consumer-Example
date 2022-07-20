
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per DialogMessageType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DialogMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StandardDialogID" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StandardFormIDType"/&gt;
 *         &lt;element name="Previous" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}PreviousType" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Paragraph" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ParagraphType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Section" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SectionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogMessageType", propOrder = {
    "standardDialogID",
    "previous",
    "title",
    "description",
    "paragraph",
    "section"
})
public class DialogMessageType
    extends StoryBaseType
{

    @XmlElement(name = "StandardDialogID", required = true)
    protected String standardDialogID;
    @XmlElement(name = "Previous")
    protected PreviousType previous;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String description;
    @XmlElement(name = "Paragraph", required = true)
    protected List<ParagraphType> paragraph;
    @XmlElement(name = "Section")
    protected List<SectionType> section;

    /**
     * Recupera il valore della proprietà standardDialogID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardDialogID() {
        return standardDialogID;
    }

    /**
     * Imposta il valore della proprietà standardDialogID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardDialogID(String value) {
        this.standardDialogID = value;
    }

    /**
     * Recupera il valore della proprietà previous.
     * 
     * @return
     *     possible object is
     *     {@link PreviousType }
     *     
     */
    public PreviousType getPrevious() {
        return previous;
    }

    /**
     * Imposta il valore della proprietà previous.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousType }
     *     
     */
    public void setPrevious(PreviousType value) {
        this.previous = value;
    }

    /**
     * Recupera il valore della proprietà title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Imposta il valore della proprietà title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the paragraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<ParagraphType>();
        }
        return this.paragraph;
    }

    /**
     * Gets the value of the section property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionType }
     * 
     * 
     */
    public List<SectionType> getSection() {
        if (section == null) {
            section = new ArrayList<SectionType>();
        }
        return this.section;
    }

}
