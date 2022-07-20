
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CorrectionResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CorrectionResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Reversal" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}ReversalResultType"/&gt;
 *         &lt;element name="AwaitCorrectionFromCompany" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AwaitCorrectionFromCompanyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectionResultType", propOrder = {
    "reversal",
    "awaitCorrectionFromCompany"
})
public class CorrectionResultType {

    @XmlElement(name = "Reversal")
    protected ReversalResultType reversal;
    @XmlElement(name = "AwaitCorrectionFromCompany")
    protected AwaitCorrectionFromCompanyType awaitCorrectionFromCompany;

    /**
     * Recupera il valore della proprietà reversal.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResultType }
     *     
     */
    public ReversalResultType getReversal() {
        return reversal;
    }

    /**
     * Imposta il valore della proprietà reversal.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResultType }
     *     
     */
    public void setReversal(ReversalResultType value) {
        this.reversal = value;
    }

    /**
     * Recupera il valore della proprietà awaitCorrectionFromCompany.
     * 
     * @return
     *     possible object is
     *     {@link AwaitCorrectionFromCompanyType }
     *     
     */
    public AwaitCorrectionFromCompanyType getAwaitCorrectionFromCompany() {
        return awaitCorrectionFromCompany;
    }

    /**
     * Imposta il valore della proprietà awaitCorrectionFromCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link AwaitCorrectionFromCompanyType }
     *     
     */
    public void setAwaitCorrectionFromCompany(AwaitCorrectionFromCompanyType value) {
        this.awaitCorrectionFromCompany = value;
    }

}
