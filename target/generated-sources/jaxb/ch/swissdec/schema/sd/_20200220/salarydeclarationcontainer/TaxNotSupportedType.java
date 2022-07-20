
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.CantonAddressType;


/**
 * <p>Classe Java per TaxNotSupportedType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxNotSupportedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ResultStateBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstitutionCantonID" type="{http://www.swissdec.ch/schema/common/20200220/Common}CantonAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxNotSupportedType", propOrder = {
    "institutionCantonID"
})
public class TaxNotSupportedType
    extends ResultStateBaseType
{

    @XmlElement(name = "InstitutionCantonID", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CantonAddressType institutionCantonID;

    /**
     * Recupera il valore della proprietà institutionCantonID.
     * 
     * @return
     *     possible object is
     *     {@link CantonAddressType }
     *     
     */
    public CantonAddressType getInstitutionCantonID() {
        return institutionCantonID;
    }

    /**
     * Imposta il valore della proprietà institutionCantonID.
     * 
     * @param value
     *     allowed object is
     *     {@link CantonAddressType }
     *     
     */
    public void setInstitutionCantonID(CantonAddressType value) {
        this.institutionCantonID = value;
    }

}
