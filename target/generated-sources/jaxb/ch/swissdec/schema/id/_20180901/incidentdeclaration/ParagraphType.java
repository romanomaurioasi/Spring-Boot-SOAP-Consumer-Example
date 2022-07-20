
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per ParagraphType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParagraphType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Value" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ParagraphValueType" minOccurs="0"/&gt;
 *           &lt;element name="Answer" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ParagraphAnswerType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sectionIDRef" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SectionIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParagraphType", propOrder = {
    "id",
    "label",
    "value",
    "answer"
})
public class ParagraphType {

    @XmlElement(name = "ID")
    protected short id;
    @XmlElement(name = "Label", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String label;
    @XmlElement(name = "Value")
    protected ParagraphValueType value;
    @XmlElement(name = "Answer")
    protected ParagraphAnswerType answer;
    @XmlAttribute(name = "sectionIDRef")
    protected String sectionIDRef;

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public short getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setID(short value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Imposta il valore della proprietà label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphValueType }
     *     
     */
    public ParagraphValueType getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphValueType }
     *     
     */
    public void setValue(ParagraphValueType value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà answer.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphAnswerType }
     *     
     */
    public ParagraphAnswerType getAnswer() {
        return answer;
    }

    /**
     * Imposta il valore della proprietà answer.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphAnswerType }
     *     
     */
    public void setAnswer(ParagraphAnswerType value) {
        this.answer = value;
    }

    /**
     * Recupera il valore della proprietà sectionIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionIDRef() {
        return sectionIDRef;
    }

    /**
     * Imposta il valore della proprietà sectionIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionIDRef(String value) {
        this.sectionIDRef = value;
    }

}
