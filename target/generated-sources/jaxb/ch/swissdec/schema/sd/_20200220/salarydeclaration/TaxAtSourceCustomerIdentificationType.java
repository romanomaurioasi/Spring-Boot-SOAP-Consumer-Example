
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceCustomerIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceCustomerIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceCustomerIdentificationBaseType"&gt;
 *       &lt;attribute name="institutionID" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceCustomerIdentificationType")
public class TaxAtSourceCustomerIdentificationType
    extends TaxAtSourceCustomerIdentificationBaseType
{

    @XmlAttribute(name = "institutionID", required = true)
    protected String institutionID;

    /**
     * Recupera il valore della proprietà institutionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionID() {
        return institutionID;
    }

    /**
     * Imposta il valore della proprietà institutionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionID(String value) {
        this.institutionID = value;
    }

}
