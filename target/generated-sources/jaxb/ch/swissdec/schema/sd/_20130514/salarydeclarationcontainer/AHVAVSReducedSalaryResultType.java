
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Résultat réduit de la déclaration de salaires&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;Résultat réduit de la déclaration de salaires pour la communication entre &#13;
 *                     distributeur et destinataire.&lt;/short&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per AHV-AVS-ReducedSalaryResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-ReducedSalaryResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AHV-AVS-SalaryResultType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}NotificationsType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="NotSupported" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AHV-AVS-MinimalResultStateType"/&gt;
 *           &lt;element name="CompletionReleaseIsMissing" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AHV-AVS-MinimalResultStateType"/&gt;
 *           &lt;element name="Processing" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AHV-AVS-ProcessingType"/&gt;
 *           &lt;element name="Success" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AHV-AVS-SuccessType"/&gt;
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
@XmlType(name = "AHV-AVS-ReducedSalaryResultType")
public class AHVAVSReducedSalaryResultType
    extends AHVAVSSalaryResultType
{


}
