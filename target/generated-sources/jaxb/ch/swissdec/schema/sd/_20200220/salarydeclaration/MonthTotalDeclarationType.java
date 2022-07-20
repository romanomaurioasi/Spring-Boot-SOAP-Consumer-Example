
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MonthTotalDeclarationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MonthTotalDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}CompanyMonthTotalType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" use="required" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}SupportedMinorSchemaVersionAttributeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthTotalDeclarationType", propOrder = {
    "company"
})
public class MonthTotalDeclarationType {

    @XmlElement(name = "Company", required = true)
    protected CompanyMonthTotalType company;
    @XmlAttribute(name = "schemaVersion", required = true)
    protected BigDecimal schemaVersion;

    /**
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link CompanyMonthTotalType }
     *     
     */
    public CompanyMonthTotalType getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyMonthTotalType }
     *     
     */
    public void setCompany(CompanyMonthTotalType value) {
        this.company = value;
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
