
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TotalHoursAndLessonsOfWorkRefType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TotalHoursAndLessonsOfWorkRefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TotalHoursAndLessonsOfWorkType"&gt;
 *       &lt;attribute name="companyWeeklyHoursAndLessonsIDRef" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalHoursAndLessonsOfWorkRefType")
public class TotalHoursAndLessonsOfWorkRefType
    extends TotalHoursAndLessonsOfWorkType
{

    @XmlAttribute(name = "companyWeeklyHoursAndLessonsIDRef", required = true)
    protected String companyWeeklyHoursAndLessonsIDRef;

    /**
     * Recupera il valore della proprietà companyWeeklyHoursAndLessonsIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWeeklyHoursAndLessonsIDRef() {
        return companyWeeklyHoursAndLessonsIDRef;
    }

    /**
     * Imposta il valore della proprietà companyWeeklyHoursAndLessonsIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWeeklyHoursAndLessonsIDRef(String value) {
        this.companyWeeklyHoursAndLessonsIDRef = value;
    }

}
