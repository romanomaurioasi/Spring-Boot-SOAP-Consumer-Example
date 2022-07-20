
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AHV-AVS-DeclarationCategoryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AHV-AVS-DeclarationCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryGeneralType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entry" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryDetailBaseType" minOccurs="0"/&gt;
 *         &lt;element name="Withdrawal" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryDetailBaseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AHV-AVS-DeclarationCategoryType")
public class AHVAVSDeclarationCategoryType
    extends DeclarationCategoryGeneralType
{


}
