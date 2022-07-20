
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GenericCustomerIdentificationMultiType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GenericCustomerIdentificationMultiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BaseCustomerIdentificationMultiType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsuranceID" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}IDType"/&gt;
 *         &lt;element name="InsuranceCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerIdentity" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType"/&gt;
 *         &lt;element name="ContractIdentity" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotEmptyStringType"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="institutionID" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}InstitutionIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericCustomerIdentificationMultiType")
public class GenericCustomerIdentificationMultiType
    extends BaseCustomerIdentificationMultiType
{


}
