
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Domaine&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per ReducedSalaryResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReducedSalaryResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}SalaryResultType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AHV-AVS-ReducedSalaryResultType"/&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}UVG-LAA-ReducedSalaryResultType"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}UVGZ-LAAC-ReducedSalaryResultType"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}KTG-AMC-ReducedSalaryResultType"/&gt;
 *         &lt;element name="BVG-LPP" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}BVG-LPP-ReducedSalaryResultType"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}FAK-CAF-ReducedSalaryResultType"/&gt;
 *         &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}StatisticReducedSalaryResultType"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}TaxAtSourceReducedSalaryResultType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReducedSalaryResultType")
public class ReducedSalaryResultType
    extends SalaryResultType
{


}
