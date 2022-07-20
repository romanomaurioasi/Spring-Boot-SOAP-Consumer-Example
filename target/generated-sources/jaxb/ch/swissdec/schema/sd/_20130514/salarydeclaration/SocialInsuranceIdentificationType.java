
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Identification d'assurance sociale&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;&#13;
 *                         Les assurances sociales utilisent un numéro d'assurance sociale pour&#13;
 *                         l'identification de personnes (assurés).&#13;
 *                     &lt;/short&gt;&lt;domain&gt;&#13;
 *                         Pour les personnes qui possèdent et un numéro AS et un numéro AVS il faut indiquer les&#13;
 *                         deux numéros d'identification (le changement de numéro AVS au numéro AS ne se passera pas&#13;
 *                         simultanément dans toutes les institutions sociales, le numéro AVS "ancien" reste donc&#13;
 *                         nécessaire)&#13;
 *                         Pour les personne qui possèdent soit le numéro AVS soit le numéro AS il faut indiquer le numéro&#13;
 *                         présent.&#13;
 *                         Pour les personnes qui ne possèdent ni le numéro AVS ni le numéro AS il faut utiliser&#13;
 *                         l'élément "inconnu".&#13;
 *                     &lt;/domain&gt;&lt;technical&gt;&#13;
 *                         Pour le modèle, le cas avec les deux numéros doit être spécifié séparément (SV-AS-Number&#13;
 *                         et AHV-AVS-Number) pour qu'il n'y ait pas de problèmes avec la règle UPA (unique particle&#13;
 *                         attribution rule)&#13;
 *                     &lt;/technical&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per Social-InsuranceIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Social-InsuranceIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SV-AS-Number" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SV-AS-NumberType"/&gt;
 *         &lt;element name="unknown" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}EmptyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Social-InsuranceIdentificationType", propOrder = {
    "svasNumber",
    "unknown"
})
public class SocialInsuranceIdentificationType {

    @XmlElement(name = "SV-AS-Number")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String svasNumber;
    protected EmptyType unknown;

    /**
     * Recupera il valore della proprietà svasNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVASNumber() {
        return svasNumber;
    }

    /**
     * Imposta il valore della proprietà svasNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVASNumber(String value) {
        this.svasNumber = value;
    }

    /**
     * Recupera il valore della proprietà unknown.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getUnknown() {
        return unknown;
    }

    /**
     * Imposta il valore della proprietà unknown.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setUnknown(EmptyType value) {
        this.unknown = value;
    }

}
