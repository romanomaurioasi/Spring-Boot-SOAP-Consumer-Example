
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxReducedSalaryResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxReducedSalaryResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxSalaryResultType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CompletionReleaseIsMissing" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxNotSupportedType"/&gt;
 *           &lt;element name="Processing" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxProcessingType"/&gt;
 *           &lt;element name="Success" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxResultSuccessType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReducedSalaryResultType")
public class TaxReducedSalaryResultType
    extends TaxSalaryResultType
{


}
