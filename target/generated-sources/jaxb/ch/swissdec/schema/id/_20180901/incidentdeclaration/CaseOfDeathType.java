
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per CaseOfDeathType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CaseOfDeathType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateOfDeath" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ClassOfInsurance" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ClassOfInsuranceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseOfDeathType", propOrder = {
    "dateOfDeath",
    "classOfInsurance"
})
public class CaseOfDeathType {

    @XmlElement(name = "DateOfDeath", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDeath;
    @XmlElement(name = "ClassOfInsurance", required = true)
    protected ClassOfInsuranceType classOfInsurance;

    /**
     * Recupera il valore della proprietà dateOfDeath.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Imposta il valore della proprietà dateOfDeath.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
    }

    /**
     * Recupera il valore della proprietà classOfInsurance.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfInsuranceType }
     *     
     */
    public ClassOfInsuranceType getClassOfInsurance() {
        return classOfInsurance;
    }

    /**
     * Imposta il valore della proprietà classOfInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfInsuranceType }
     *     
     */
    public void setClassOfInsurance(ClassOfInsuranceType value) {
        this.classOfInsurance = value;
    }

}
