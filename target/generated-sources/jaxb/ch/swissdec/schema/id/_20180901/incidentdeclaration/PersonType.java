
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.ParticularsType;
import ch.swissdec.schema.common._20180901.common.WorkType;


/**
 * <p>Classe Java per PersonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Particulars" type="{http://www.swissdec.ch/schema/common/20180901/Common}ParticularsType"/&gt;
 *         &lt;element name="Work" type="{http://www.swissdec.ch/schema/common/20180901/Common}WorkType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="workplaceIDRef" use="required" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}WorkplaceIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "particulars",
    "work"
})
@XmlSeeAlso({
    PersonIncidentType.class
})
public class PersonType {

    @XmlElement(name = "Particulars", required = true)
    protected ParticularsType particulars;
    @XmlElement(name = "Work", required = true)
    protected WorkType work;
    @XmlAttribute(name = "workplaceIDRef", required = true)
    protected String workplaceIDRef;

    /**
     * Recupera il valore della proprietà particulars.
     * 
     * @return
     *     possible object is
     *     {@link ParticularsType }
     *     
     */
    public ParticularsType getParticulars() {
        return particulars;
    }

    /**
     * Imposta il valore della proprietà particulars.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticularsType }
     *     
     */
    public void setParticulars(ParticularsType value) {
        this.particulars = value;
    }

    /**
     * Recupera il valore della proprietà work.
     * 
     * @return
     *     possible object is
     *     {@link WorkType }
     *     
     */
    public WorkType getWork() {
        return work;
    }

    /**
     * Imposta il valore della proprietà work.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkType }
     *     
     */
    public void setWork(WorkType value) {
        this.work = value;
    }

    /**
     * Recupera il valore della proprietà workplaceIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceIDRef() {
        return workplaceIDRef;
    }

    /**
     * Imposta il valore della proprietà workplaceIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceIDRef(String value) {
        this.workplaceIDRef = value;
    }

}
