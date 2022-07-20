
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.swissdec.schema.common._20180901.common.EmploymentContractType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Contract&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;Façon de contrat de travail&lt;/short&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per ContractType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContractType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KindOf" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmploymentContractType"/&gt;
 *         &lt;element name="ValidAsOf" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractType", propOrder = {
    "kindOf",
    "validAsOf"
})
public class ContractType {

    @XmlElement(name = "KindOf", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected EmploymentContractType kindOf;
    @XmlElement(name = "ValidAsOf", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validAsOf;

    /**
     * Recupera il valore della proprietà kindOf.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentContractType }
     *     
     */
    public EmploymentContractType getKindOf() {
        return kindOf;
    }

    /**
     * Imposta il valore della proprietà kindOf.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentContractType }
     *     
     */
    public void setKindOf(EmploymentContractType value) {
        this.kindOf = value;
    }

    /**
     * Recupera il valore della proprietà validAsOf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidAsOf() {
        return validAsOf;
    }

    /**
     * Imposta il valore della proprietà validAsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidAsOf(XMLGregorianCalendar value) {
        this.validAsOf = value;
    }

}
