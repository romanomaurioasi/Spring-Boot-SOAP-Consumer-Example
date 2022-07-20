
package ch.swissdec.schema.sd._20130514.salarydeclaration;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per BVG-LPP-SalaryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BVG-LPP-SalaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationCategory" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}DeclarationCategoryGeneralType" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-Code" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}BVG-LPP-AssuranceCategoryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="BVG-LPP-AnnualBasis" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}SalaryAmountType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="institutionIDRef" use="required" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration}InstitutionIDType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BVG-LPP-SalaryType", propOrder = {
    "declarationCategory",
    "bvglppCode",
    "bvglppAnnualBasis"
})
public class BVGLPPSalaryType {

    @XmlElement(name = "DeclarationCategory")
    protected DeclarationCategoryGeneralType declarationCategory;
    @XmlElement(name = "BVG-LPP-Code")
    protected String bvglppCode;
    @XmlElement(name = "BVG-LPP-AnnualBasis", required = true)
    protected BigDecimal bvglppAnnualBasis;
    @XmlAttribute(name = "institutionIDRef", required = true)
    protected String institutionIDRef;

    /**
     * Recupera il valore della proprietà declarationCategory.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryGeneralType }
     *     
     */
    public DeclarationCategoryGeneralType getDeclarationCategory() {
        return declarationCategory;
    }

    /**
     * Imposta il valore della proprietà declarationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryGeneralType }
     *     
     */
    public void setDeclarationCategory(DeclarationCategoryGeneralType value) {
        this.declarationCategory = value;
    }

    /**
     * Recupera il valore della proprietà bvglppCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBVGLPPCode() {
        return bvglppCode;
    }

    /**
     * Imposta il valore della proprietà bvglppCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBVGLPPCode(String value) {
        this.bvglppCode = value;
    }

    /**
     * Recupera il valore della proprietà bvglppAnnualBasis.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBVGLPPAnnualBasis() {
        return bvglppAnnualBasis;
    }

    /**
     * Imposta il valore della proprietà bvglppAnnualBasis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBVGLPPAnnualBasis(BigDecimal value) {
        this.bvglppAnnualBasis = value;
    }

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
