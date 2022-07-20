
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatisticHourlyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticHourlyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Contract" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}EmploymentHourlyContractType"/&gt;
 *         &lt;element name="ContractualHourlyWage" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}ContractualHourlyWageType"/&gt;
 *         &lt;element name="TotallyWorked" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TotallyWorkedType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticHourlyType", propOrder = {
    "contract",
    "contractualHourlyWage",
    "totallyWorked"
})
public class StatisticHourlyType {

    @XmlElement(name = "Contract", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected EmploymentHourlyContractType contract;
    @XmlElement(name = "ContractualHourlyWage", required = true)
    protected ContractualHourlyWageType contractualHourlyWage;
    @XmlElement(name = "TotallyWorked", required = true)
    protected TotallyWorkedType totallyWorked;

    /**
     * Recupera il valore della proprietà contract.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentHourlyContractType }
     *     
     */
    public EmploymentHourlyContractType getContract() {
        return contract;
    }

    /**
     * Imposta il valore della proprietà contract.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentHourlyContractType }
     *     
     */
    public void setContract(EmploymentHourlyContractType value) {
        this.contract = value;
    }

    /**
     * Recupera il valore della proprietà contractualHourlyWage.
     * 
     * @return
     *     possible object is
     *     {@link ContractualHourlyWageType }
     *     
     */
    public ContractualHourlyWageType getContractualHourlyWage() {
        return contractualHourlyWage;
    }

    /**
     * Imposta il valore della proprietà contractualHourlyWage.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractualHourlyWageType }
     *     
     */
    public void setContractualHourlyWage(ContractualHourlyWageType value) {
        this.contractualHourlyWage = value;
    }

    /**
     * Recupera il valore della proprietà totallyWorked.
     * 
     * @return
     *     possible object is
     *     {@link TotallyWorkedType }
     *     
     */
    public TotallyWorkedType getTotallyWorked() {
        return totallyWorked;
    }

    /**
     * Imposta il valore della proprietà totallyWorked.
     * 
     * @param value
     *     allowed object is
     *     {@link TotallyWorkedType }
     *     
     */
    public void setTotallyWorked(TotallyWorkedType value) {
        this.totallyWorked = value;
    }

}
