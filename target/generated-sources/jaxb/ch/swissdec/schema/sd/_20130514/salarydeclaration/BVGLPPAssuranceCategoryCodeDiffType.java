
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;LPP-code type&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;&#13;
 *                         LPP catégorie d'assurance code type.&#13;
 *                         Les attribute de différence sont:&#13;
 *                         - mappingFrom: une règle de projection est appliqué.&#13;
 *                         - manualMutationRequiredFrom: une mutation de code a été fait hors du standard salarial&#13;
 *                         - automaticMutationPossibleFrom: une mutation de code automatique est possible au&#13;
 *                         collationnement&#13;
 *                         - automaticMutationProcessedFrom: une mutation de code automatique a été fait dans déclaration&#13;
 *                         de salaires&#13;
 *                     &lt;/short&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per BVG-LPP-AssuranceCategoryCodeDiffType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-AssuranceCategoryCodeDiffType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration&gt;BVG-LPP-AssuranceCategoryCodeType"&gt;
 *       &lt;attribute name="mappingFrom" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeEmptyType" /&gt;
 *       &lt;attribute name="manualMutationRequiredFrom" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeEmptyType" /&gt;
 *       &lt;attribute name="automaticMutationPossibleFrom" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeEmptyType" /&gt;
 *       &lt;attribute name="automaticMutationProcessedFrom" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeEmptyType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-AssuranceCategoryCodeDiffType", propOrder = {
    "value"
})
public class BVGLPPAssuranceCategoryCodeDiffType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "mappingFrom")
    protected String mappingFrom;
    @XmlAttribute(name = "manualMutationRequiredFrom")
    protected String manualMutationRequiredFrom;
    @XmlAttribute(name = "automaticMutationPossibleFrom")
    protected String automaticMutationPossibleFrom;
    @XmlAttribute(name = "automaticMutationProcessedFrom")
    protected String automaticMutationProcessedFrom;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;LPP Type de catégorie d'assurance (vide est possible)&lt;/translation&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;LPP Type de code de catégorie d'assurance (vide est possible)&lt;/short&gt;&lt;domain&gt;&#13;
     *                         Pour chaque LPP solution d'assurance, une catégorie d'assurance est codé par l'assureur.&#13;
     *                     &lt;/domain&gt;&lt;technical&gt;&#13;
     *                         pattern [\S] est définit dans http://www.w3.org/TR/xmlschema-2/ :&#13;
     *                         \s Equivalent character class [#x20\t\n\r]&#13;
     *                         \S Equivalent character class [^\s]&#13;
     *                     &lt;/technical&gt;&lt;/description&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà mappingFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingFrom() {
        return mappingFrom;
    }

    /**
     * Imposta il valore della proprietà mappingFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingFrom(String value) {
        this.mappingFrom = value;
    }

    /**
     * Recupera il valore della proprietà manualMutationRequiredFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualMutationRequiredFrom() {
        return manualMutationRequiredFrom;
    }

    /**
     * Imposta il valore della proprietà manualMutationRequiredFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualMutationRequiredFrom(String value) {
        this.manualMutationRequiredFrom = value;
    }

    /**
     * Recupera il valore della proprietà automaticMutationPossibleFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticMutationPossibleFrom() {
        return automaticMutationPossibleFrom;
    }

    /**
     * Imposta il valore della proprietà automaticMutationPossibleFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticMutationPossibleFrom(String value) {
        this.automaticMutationPossibleFrom = value;
    }

    /**
     * Recupera il valore della proprietà automaticMutationProcessedFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticMutationProcessedFrom() {
        return automaticMutationProcessedFrom;
    }

    /**
     * Imposta il valore della proprietà automaticMutationProcessedFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticMutationProcessedFrom(String value) {
        this.automaticMutationProcessedFrom = value;
    }

}
