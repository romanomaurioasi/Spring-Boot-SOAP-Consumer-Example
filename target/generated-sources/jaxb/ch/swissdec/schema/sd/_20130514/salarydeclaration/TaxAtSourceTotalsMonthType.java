
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceTotalsMonthType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceTotalsMonthType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}TaxAtSourceTotalsBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="TotalTaxableEarning" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="TotalTaxAtSource" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *         &lt;element name="TotalCommission" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceTotalsMonthType")
public class TaxAtSourceTotalsMonthType
    extends TaxAtSourceTotalsBaseType
{


}
