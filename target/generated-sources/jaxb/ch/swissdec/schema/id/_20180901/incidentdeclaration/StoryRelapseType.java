
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per StoryRelapseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StoryRelapseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsuranceCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType"/&gt;
 *         &lt;element name="RelapseDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoryRelapseType", propOrder = {
    "insuranceCaseID",
    "relapseDate"
})
public class StoryRelapseType {

    @XmlElement(name = "InsuranceCaseID", required = true)
    protected String insuranceCaseID;
    @XmlElement(name = "RelapseDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar relapseDate;

    /**
     * Recupera il valore della proprietà insuranceCaseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCaseID() {
        return insuranceCaseID;
    }

    /**
     * Imposta il valore della proprietà insuranceCaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCaseID(String value) {
        this.insuranceCaseID = value;
    }

    /**
     * Recupera il valore della proprietà relapseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRelapseDate() {
        return relapseDate;
    }

    /**
     * Imposta il valore della proprietà relapseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRelapseDate(XMLGregorianCalendar value) {
        this.relapseDate = value;
    }

}
