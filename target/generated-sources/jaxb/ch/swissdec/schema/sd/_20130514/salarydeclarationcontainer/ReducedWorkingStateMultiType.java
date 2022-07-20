
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Avancement du travail
 * 
 * <p>Classe Java per ReducedWorkingStateMultiType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReducedWorkingStateMultiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}WorkingStateMultiType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Success" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}SuccessResponseType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReducedWorkingStateMultiType")
public class ReducedWorkingStateMultiType
    extends WorkingStateMultiType
{


}
