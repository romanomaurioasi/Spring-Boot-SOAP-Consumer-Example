
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Base pour l'état du résultat&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per ResultStateBaseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResultStateBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddresseeContext" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}AddresseeContextType"/&gt;
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
    AHVAVSMinimalResultStateType.class,
    UVGLAAMinimalResultStateType.class,
    UVGZLAACMinimalResultStateType.class,
    KTGAMCMinimalResultStateType.class,
    BVGLPPMinimalResultStateType.class,
    FAKCAFMinimalResultStateType.class,
    StatisticProcessingType.class,
    StatisticSuccessType.class,
    TaxAtSourceMinimalResultStateType.class
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
