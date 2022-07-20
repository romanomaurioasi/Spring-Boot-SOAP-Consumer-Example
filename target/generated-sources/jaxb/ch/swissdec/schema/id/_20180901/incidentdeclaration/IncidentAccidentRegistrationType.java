
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IncidentAccidentRegistrationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentAccidentRegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncidentDate" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}RegistrationIncidentDateType"/&gt;
 *         &lt;element name="InsuranceCaseID" type="{http://www.swissdec.ch/schema/common/20180901/Common}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentAccidentRegistrationType", propOrder = {
    "incidentDate",
    "insuranceCaseID"
})
public class IncidentAccidentRegistrationType {

    @XmlElement(name = "IncidentDate", required = true)
    protected RegistrationIncidentDateType incidentDate;
    @XmlElement(name = "InsuranceCaseID")
    protected String insuranceCaseID;

    /**
     * Recupera il valore della proprietà incidentDate.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationIncidentDateType }
     *     
     */
    public RegistrationIncidentDateType getIncidentDate() {
        return incidentDate;
    }

    /**
     * Imposta il valore della proprietà incidentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationIncidentDateType }
     *     
     */
    public void setIncidentDate(RegistrationIncidentDateType value) {
        this.incidentDate = value;
    }

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

}
