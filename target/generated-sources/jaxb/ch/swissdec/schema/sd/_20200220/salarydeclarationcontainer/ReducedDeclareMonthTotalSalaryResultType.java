
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ReducedDeclareMonthTotalSalaryResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReducedDeclareMonthTotalSalaryResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}DeclareMonthTotalSalaryResultType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AHV-AVS-ReducedDeclareMonthTotalSalaryResultType"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}FAK-CAF-ReducedDeclareMonthTotalSalaryResultType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReducedDeclareMonthTotalSalaryResultType")
public class ReducedDeclareMonthTotalSalaryResultType
    extends DeclareMonthTotalSalaryResultType
{


}
