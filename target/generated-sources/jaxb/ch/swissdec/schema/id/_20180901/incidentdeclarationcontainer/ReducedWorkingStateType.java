
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:idc="http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Avancement du travail&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per ReducedWorkingStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReducedWorkingStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}WorkingStateType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Success" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}IncidentStateType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReducedWorkingStateType")
public class ReducedWorkingStateType
    extends WorkingStateType
{


}
