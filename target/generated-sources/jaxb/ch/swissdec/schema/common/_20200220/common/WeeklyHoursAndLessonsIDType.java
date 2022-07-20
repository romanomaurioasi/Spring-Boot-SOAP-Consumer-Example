
package ch.swissdec.schema.common._20200220.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per WeeklyHoursAndLessonsIDType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WeeklyHoursAndLessonsIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/common/20200220/Common}WeeklyHoursAndLessonsType"&gt;
 *       &lt;attribute name="companyWeeklyHoursAndLessonsID" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyHoursAndLessonsIDType")
public class WeeklyHoursAndLessonsIDType
    extends WeeklyHoursAndLessonsType
{

    @XmlAttribute(name = "companyWeeklyHoursAndLessonsID", required = true)
    protected String companyWeeklyHoursAndLessonsID;

    /**
     * Recupera il valore della proprietà companyWeeklyHoursAndLessonsID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWeeklyHoursAndLessonsID() {
        return companyWeeklyHoursAndLessonsID;
    }

    /**
     * Imposta il valore della proprietà companyWeeklyHoursAndLessonsID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWeeklyHoursAndLessonsID(String value) {
        this.companyWeeklyHoursAndLessonsID = value;
    }

}
