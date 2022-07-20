
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AHV-AVS-CustomerIdentificationConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-CustomerIdentificationConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AHV-AVS-CustomerIdentificationBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AK-CC-BranchNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}AK-CC-NumberType"/&gt;
 *         &lt;element name="AK-CC-CustomerNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType"/&gt;
 *         &lt;element name="AK-CC-SubNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-CustomerIdentificationConsumerType")
public class AHVAVSCustomerIdentificationConsumerType
    extends AHVAVSCustomerIdentificationBaseType
{


}
