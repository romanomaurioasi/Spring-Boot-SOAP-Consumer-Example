
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceCustomerIdentificationConsumerType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceCustomerIdentificationConsumerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceCustomerIdentificationBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CantonID" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAddressType"/&gt;
 *         &lt;element name="CustomerIdentity" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType"/&gt;
 *         &lt;element name="PayrollUnit" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceCustomerIdentificationConsumerType")
public class TaxAtSourceCustomerIdentificationConsumerType
    extends TaxAtSourceCustomerIdentificationBaseType
{


}
