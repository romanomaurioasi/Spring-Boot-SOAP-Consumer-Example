
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ReducedDialogType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReducedDialogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}DialogType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AHV-AVS" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AHV-AVS-ReducedDialogType"/&gt;
 *         &lt;element name="FAK-CAF" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}FAK-CAF-ReducedDialogType"/&gt;
 *         &lt;element name="UVG-LAA" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}UVG-LAA-ReducedDialogType"/&gt;
 *         &lt;element name="UVGZ-LAAC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}UVGZ-LAAC-ReducedDialogType"/&gt;
 *         &lt;element name="KTG-AMC" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}KTG-AMC-ReducedDialogType"/&gt;
 *         &lt;element name="BVG-LPP" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}BVG-LPP-ReducedDialogType"/&gt;
 *         &lt;element name="Tax" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxReducedDialogType"/&gt;
 *         &lt;element name="TaxAtSource" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxAtSourceReducedDialogType"/&gt;
 *         &lt;element name="TaxCrossborder" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}TaxAtSourceReducedDialogType"/&gt;
 *         &lt;element name="Statistic" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}StatisticReducedDialogType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReducedDialogType")
public class ReducedDialogType
    extends DialogType
{


}
