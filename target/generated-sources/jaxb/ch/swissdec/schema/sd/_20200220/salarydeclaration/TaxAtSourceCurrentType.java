
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaxAtSourceCurrentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxAtSourceCurrentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Residence" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}TaxAtSourceResidenceType"/&gt;
 *         &lt;element name="WorkMunicipalityID" type="{http://www.swissdec.ch/schema/common/20200220/Common}MunicipalityIDType"/&gt;
 *         &lt;element name="DeclarationCategory" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DeclarationCategoryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="workplaceIDRef" use="required" type="{http://www.swissdec.ch/schema/common/20200220/Common}InstanceRefIDType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAtSourceCurrentType", propOrder = {
    "residence",
    "workMunicipalityID",
    "declarationCategory"
})
public class TaxAtSourceCurrentType
    extends TaxAtSourceBaseType
{

    @XmlElement(name = "Residence", required = true)
    protected TaxAtSourceResidenceType residence;
    @XmlElement(name = "WorkMunicipalityID")
    protected int workMunicipalityID;
    @XmlElement(name = "DeclarationCategory")
    protected DeclarationCategoryType declarationCategory;
    @XmlAttribute(name = "workplaceIDRef", required = true)
    protected String workplaceIDRef;

    /**
     * Recupera il valore della proprietà residence.
     * 
     * @return
     *     possible object is
     *     {@link TaxAtSourceResidenceType }
     *     
     */
    public TaxAtSourceResidenceType getResidence() {
        return residence;
    }

    /**
     * Imposta il valore della proprietà residence.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAtSourceResidenceType }
     *     
     */
    public void setResidence(TaxAtSourceResidenceType value) {
        this.residence = value;
    }

    /**
     * Recupera il valore della proprietà workMunicipalityID.
     * 
     */
    public int getWorkMunicipalityID() {
        return workMunicipalityID;
    }

    /**
     * Imposta il valore della proprietà workMunicipalityID.
     * 
     */
    public void setWorkMunicipalityID(int value) {
        this.workMunicipalityID = value;
    }

    /**
     * Recupera il valore della proprietà declarationCategory.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationCategoryType }
     *     
     */
    public DeclarationCategoryType getDeclarationCategory() {
        return declarationCategory;
    }

    /**
     * Imposta il valore della proprietà declarationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationCategoryType }
     *     
     */
    public void setDeclarationCategory(DeclarationCategoryType value) {
        this.declarationCategory = value;
    }

    /**
     * Recupera il valore della proprietà workplaceIDRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkplaceIDRef() {
        return workplaceIDRef;
    }

    /**
     * Imposta il valore della proprietà workplaceIDRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkplaceIDRef(String value) {
        this.workplaceIDRef = value;
    }

}
