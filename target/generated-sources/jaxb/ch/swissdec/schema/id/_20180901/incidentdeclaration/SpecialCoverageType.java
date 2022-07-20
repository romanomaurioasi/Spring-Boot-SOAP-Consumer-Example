
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Spez.Übernahme&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short/&gt;&lt;domain&gt;&#13;
 *                         FamilyMember = Familienmitglied, Gesellschafter(in)&#13;
 *                         OptionalEnterpriserInsurance = Freiwillige Unternehmerversicherung&#13;
 *                         NegotiatedInsurance = Abredeversicherung&#13;
 *                     &lt;/domain&gt;&lt;technical/&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per SpecialCoverageType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SpecialCoverageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FamilyMember" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="OptionalEnterpriserInsurance" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="NegotiatedInsurance" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialCoverageType", propOrder = {
    "familyMember",
    "optionalEnterpriserInsurance",
    "negotiatedInsurance"
})
public class SpecialCoverageType
    extends StoryBaseType
{

    @XmlElement(name = "FamilyMember")
    protected EmptyType familyMember;
    @XmlElement(name = "OptionalEnterpriserInsurance")
    protected EmptyType optionalEnterpriserInsurance;
    @XmlElement(name = "NegotiatedInsurance")
    protected EmptyType negotiatedInsurance;

    /**
     * Recupera il valore della proprietà familyMember.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getFamilyMember() {
        return familyMember;
    }

    /**
     * Imposta il valore della proprietà familyMember.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setFamilyMember(EmptyType value) {
        this.familyMember = value;
    }

    /**
     * Recupera il valore della proprietà optionalEnterpriserInsurance.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getOptionalEnterpriserInsurance() {
        return optionalEnterpriserInsurance;
    }

    /**
     * Imposta il valore della proprietà optionalEnterpriserInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setOptionalEnterpriserInsurance(EmptyType value) {
        this.optionalEnterpriserInsurance = value;
    }

    /**
     * Recupera il valore della proprietà negotiatedInsurance.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getNegotiatedInsurance() {
        return negotiatedInsurance;
    }

    /**
     * Imposta il valore della proprietà negotiatedInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setNegotiatedInsurance(EmptyType value) {
        this.negotiatedInsurance = value;
    }

}
