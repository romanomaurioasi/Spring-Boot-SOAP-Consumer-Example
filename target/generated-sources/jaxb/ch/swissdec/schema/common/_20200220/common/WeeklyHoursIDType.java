
package ch.swissdec.schema.common._20200220.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per WeeklyHoursIDType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WeeklyHoursIDType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.swissdec.ch/schema/common/20200220/Common&gt;HoursOrLessonsType"&gt;
 *       &lt;attribute name="companyWeeklyHoursID" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyHoursIDType", propOrder = {
    "value"
})
public class WeeklyHoursIDType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "companyWeeklyHoursID", required = true)
    protected String companyWeeklyHoursID;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:c="http://www.swissdec.ch/schema/common/20200220/Common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Ore o lezioni&lt;/translation&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà companyWeeklyHoursID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWeeklyHoursID() {
        return companyWeeklyHoursID;
    }

    /**
     * Imposta il valore della proprietà companyWeeklyHoursID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWeeklyHoursID(String value) {
        this.companyWeeklyHoursID = value;
    }

}
