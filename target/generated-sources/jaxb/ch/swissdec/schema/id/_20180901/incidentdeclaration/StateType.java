
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Process" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}MainStateType"/&gt;
 *         &lt;element name="Coverage" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}YesNoUnknownType"/&gt;
 *         &lt;element name="SmallRemark" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="CrossChannelLinkIDWaitForUse" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateType", propOrder = {
    "process",
    "coverage",
    "smallRemark",
    "crossChannelLinkIDWaitForUse"
})
public class StateType {

    @XmlElement(name = "Process", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected MainStateType process;
    @XmlElement(name = "Coverage", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected YesNoUnknownType coverage;
    @XmlElement(name = "SmallRemark")
    protected String smallRemark;
    @XmlElement(name = "CrossChannelLinkIDWaitForUse")
    protected List<String> crossChannelLinkIDWaitForUse;

    /**
     * Recupera il valore della proprietà process.
     * 
     * @return
     *     possible object is
     *     {@link MainStateType }
     *     
     */
    public MainStateType getProcess() {
        return process;
    }

    /**
     * Imposta il valore della proprietà process.
     * 
     * @param value
     *     allowed object is
     *     {@link MainStateType }
     *     
     */
    public void setProcess(MainStateType value) {
        this.process = value;
    }

    /**
     * Recupera il valore della proprietà coverage.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownType }
     *     
     */
    public YesNoUnknownType getCoverage() {
        return coverage;
    }

    /**
     * Imposta il valore della proprietà coverage.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownType }
     *     
     */
    public void setCoverage(YesNoUnknownType value) {
        this.coverage = value;
    }

    /**
     * Recupera il valore della proprietà smallRemark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallRemark() {
        return smallRemark;
    }

    /**
     * Imposta il valore della proprietà smallRemark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallRemark(String value) {
        this.smallRemark = value;
    }

    /**
     * Gets the value of the crossChannelLinkIDWaitForUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossChannelLinkIDWaitForUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossChannelLinkIDWaitForUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCrossChannelLinkIDWaitForUse() {
        if (crossChannelLinkIDWaitForUse == null) {
            crossChannelLinkIDWaitForUse = new ArrayList<String>();
        }
        return this.crossChannelLinkIDWaitForUse;
    }

}
