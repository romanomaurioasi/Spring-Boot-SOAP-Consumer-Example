
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UVGZ-LAAC-TotalsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UVGZ-LAAC-TotalsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}UVGZ-LAAC-TotalsConsumerType"&gt;
 *       &lt;attribute name="institutionIDRef" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}InstitutionIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVGZ-LAAC-TotalsType")
public class UVGZLAACTotalsType
    extends UVGZLAACTotalsConsumerType
{

    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà institutionIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionIDRef() {
        return institutionIDRef;
    }

    /**
     * Imposta il valore della proprietà institutionIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionIDRef(String value) {
        this.institutionIDRef = value;
    }

}
