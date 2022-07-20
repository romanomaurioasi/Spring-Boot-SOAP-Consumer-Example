
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ResultStateBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResultStateBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddresseeContext" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}AddresseeContextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultStateBaseType", propOrder = {
    "addresseeContext"
})
@XmlSeeAlso({
    TaxProcessingType.class,
    TaxNotSupportedType.class,
    TaxResultSuccessType.class,
    StatisticProcessingType.class,
    StatisticSuccessType.class,
    AHVAVSMinimalResultStateType.class,
    FAKCAFMinimalResultStateType.class,
    UVGLAAMinimalResultStateType.class,
    UVGZLAACMinimalResultStateType.class,
    KTGAMCMinimalResultStateType.class,
    BVGLPPMinimalResultStateType.class,
    TaxSuccessDialogType.class,
    TaxAtSourceMinimalResultStateType.class,
    StatisticSuccessDialogType.class
})
public class ResultStateBaseType {

    @XmlElement(name = "AddresseeContext", required = true)
    protected AddresseeContextType addresseeContext;

    /**
     * Recupera il valore della proprietà addresseeContext.
     * 
     * @return
     *     possible object is
     *     {@link AddresseeContextType }
     *     
     */
    public AddresseeContextType getAddresseeContext() {
        return addresseeContext;
    }

    /**
     * Imposta il valore della proprietà addresseeContext.
     * 
     * @param value
     *     allowed object is
     *     {@link AddresseeContextType }
     *     
     */
    public void setAddresseeContext(AddresseeContextType value) {
        this.addresseeContext = value;
    }

}
