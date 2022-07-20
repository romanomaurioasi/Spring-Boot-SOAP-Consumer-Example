
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.EmptyType;


/**
 * <p>Classe Java per SingleParentFamilyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SingleParentFamilyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="NoConcubinage" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType"/&gt;
 *         &lt;element name="Concubinage" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}ConcubinageType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleParentFamilyType", propOrder = {
    "noConcubinage",
    "concubinage"
})
public class SingleParentFamilyType {

    @XmlElement(name = "NoConcubinage")
    protected EmptyType noConcubinage;
    @XmlElement(name = "Concubinage")
    protected ConcubinageType concubinage;

    /**
     * Recupera il valore della proprietà noConcubinage.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNoConcubinage() {
        return noConcubinage;
    }

    /**
     * Imposta il valore della proprietà noConcubinage.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNoConcubinage(EmptyType value) {
        this.noConcubinage = value;
    }

    /**
     * Recupera il valore della proprietà concubinage.
     * 
     * @return
     *     possible object is
     *     {@link ConcubinageType }
     *     
     */
    public ConcubinageType getConcubinage() {
        return concubinage;
    }

    /**
     * Imposta il valore della proprietà concubinage.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcubinageType }
     *     
     */
    public void setConcubinage(ConcubinageType value) {
        this.concubinage = value;
    }

}
