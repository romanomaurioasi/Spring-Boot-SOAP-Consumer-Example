
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;usage xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;all, AHV, UVG-, UVGZ, KTG, BVG, FAK, Tax, Statistic, TAtSrc&lt;/usage&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per SalaryDeclarationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalaryDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}CompanyType"/&gt;
 *         &lt;element name="GeneralSalaryDeclarationDescription" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}GeneralSalaryDeclarationDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SupportedMinorSchemaVersionAttributeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalaryDeclarationType", propOrder = {
    "company",
    "generalSalaryDeclarationDescription"
})
public class SalaryDeclarationType {

    @XmlElement(name = "Company", required = true)
    protected CompanyType company;
    @XmlElement(name = "GeneralSalaryDeclarationDescription", required = true)
    protected GeneralSalaryDeclarationDescriptionType generalSalaryDeclarationDescription;
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
     * Recupera il valore della proprietà generalSalaryDeclarationDescription.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSalaryDeclarationDescriptionType }
     *     
     */
    public GeneralSalaryDeclarationDescriptionType getGeneralSalaryDeclarationDescription() {
        return generalSalaryDeclarationDescription;
    }

    /**
     * Imposta il valore della proprietà generalSalaryDeclarationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSalaryDeclarationDescriptionType }
     *     
     */
    public void setGeneralSalaryDeclarationDescription(GeneralSalaryDeclarationDescriptionType value) {
        this.generalSalaryDeclarationDescription = value;
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
