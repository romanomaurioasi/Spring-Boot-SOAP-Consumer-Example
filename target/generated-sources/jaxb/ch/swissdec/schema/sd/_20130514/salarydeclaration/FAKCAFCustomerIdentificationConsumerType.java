
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FAK-CAF-CustomerIdentificationConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FAK-CAF-CustomerIdentificationConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}FAK-CAF-CustomerIdentificationBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FAK-CAF-BranchNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType"/&gt;
 *         &lt;element name="FAK-CAF-CustomerNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType"/&gt;
 *         &lt;element name="FAK-CAF-SubNumber" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}IDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAK-CAF-CustomerIdentificationConsumerType")
public class FAKCAFCustomerIdentificationConsumerType
    extends FAKCAFCustomerIdentificationBaseType
{


}
