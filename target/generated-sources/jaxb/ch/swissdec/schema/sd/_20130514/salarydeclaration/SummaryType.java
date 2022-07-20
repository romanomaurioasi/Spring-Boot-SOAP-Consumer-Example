
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SummaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Persons" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SummaryPersonsType"/&gt;
 *         &lt;element name="Contributions-BVG-LPP-Code" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-SummaryContributions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryType", propOrder = {
    "persons",
    "contributionsBVGLPPCode"
})
public class SummaryType {

    @XmlElement(name = "Persons", required = true)
    protected SummaryPersonsType persons;
    @XmlElement(name = "Contributions-BVG-LPP-Code", required = true)
    protected BVGLPPSummaryContributions contributionsBVGLPPCode;

    /**
     * Recupera il valore della proprietà persons.
     * 
     * @return
     *     possible object is
     *     {@link SummaryPersonsType }
     *     
     */
    public SummaryPersonsType getPersons() {
        return persons;
    }

    /**
     * Imposta il valore della proprietà persons.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryPersonsType }
     *     
     */
    public void setPersons(SummaryPersonsType value) {
        this.persons = value;
    }

    /**
     * Recupera il valore della proprietà contributionsBVGLPPCode.
     * 
     * @return
     *     possible object is
     *     {@link BVGLPPSummaryContributions }
     *     
     */
    public BVGLPPSummaryContributions getContributionsBVGLPPCode() {
        return contributionsBVGLPPCode;
    }

    /**
     * Imposta il valore della proprietà contributionsBVGLPPCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BVGLPPSummaryContributions }
     *     
     */
    public void setContributionsBVGLPPCode(BVGLPPSummaryContributions value) {
        this.contributionsBVGLPPCode = value;
    }

}
