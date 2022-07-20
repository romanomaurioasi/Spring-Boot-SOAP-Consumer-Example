
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;usage xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;all&lt;/usage&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per IncidentDeclarationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CompanyType"/&gt;
 *         &lt;element name="GeneralIncidentDeclarationDescription" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}GeneralIncidentDeclarationDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" use="required" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}SupportedMinorSchemaVersionAttributeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentDeclarationType", propOrder = {
    "company",
    "generalIncidentDeclarationDescription"
})
public class IncidentDeclarationType {

    @XmlElement(name = "Company", required = true)
    protected CompanyType company;
    @XmlElement(name = "GeneralIncidentDeclarationDescription", required = true)
    protected GeneralIncidentDeclarationDescriptionType generalIncidentDeclarationDescription;
    @XmlAttribute(name = "schemaVersion", required = true)
    protected BigDecimal schemaVersion;

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompany(CompanyType value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà generalIncidentDeclarationDescription.
     * 
     * @return
     *     possible object is
     *     {@link GeneralIncidentDeclarationDescriptionType }
     *     
     */
    public GeneralIncidentDeclarationDescriptionType getGeneralIncidentDeclarationDescription() {
        return generalIncidentDeclarationDescription;
    }

    /**
     * Imposta il valore della proprietà generalIncidentDeclarationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralIncidentDeclarationDescriptionType }
     *     
     */
    public void setGeneralIncidentDeclarationDescription(GeneralIncidentDeclarationDescriptionType value) {
        this.generalIncidentDeclarationDescription = value;
    }

    /**
     * Recupera il valore della proprietà schemaVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Imposta il valore della proprietà schemaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSchemaVersion(BigDecimal value) {
        this.schemaVersion = value;
    }

}
