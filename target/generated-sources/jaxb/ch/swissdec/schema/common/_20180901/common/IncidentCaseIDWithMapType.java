
package ch.swissdec.schema.common._20180901.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IncidentCaseIDWithMapType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IncidentCaseIDWithMapType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.swissdec.ch/schema/common/20180901/Common&gt;IncidentCaseIDType"&gt;
 *       &lt;attribute name="incidentCaseIDMap" use="required" type="{http://www.swissdec.ch/schema/common/20180901/Common}InstanceRefIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentCaseIDWithMapType")
public class IncidentCaseIDWithMapType
    extends IncidentCaseIDType
{

    @XmlAttribute(name = "incidentCaseIDMap", required = true)
    protected String incidentCaseIDMap;

    /**
     * Recupera il valore della proprietà incidentCaseIDMap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCaseIDMap() {
        return incidentCaseIDMap;
    }

    /**
     * Imposta il valore della proprietà incidentCaseIDMap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCaseIDMap(String value) {
        this.incidentCaseIDMap = value;
    }

}
