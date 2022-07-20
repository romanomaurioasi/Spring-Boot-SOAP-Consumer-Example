
package ch.swissdec.schema.sd._20200220.salarydeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.EmptyType;
import ch.swissdec.schema.common._20200220.common.PositionType;


/**
 * <p>Classe Java per StatisticAdditionalParticularsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticAdditionalParticularsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Education" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}EducationType"/&gt;
 *         &lt;element name="Position" type="{http://www.swissdec.ch/schema/common/20200220/Common}PositionType"/&gt;
 *         &lt;element name="JobTitle" type="{http://www.swissdec.ch/schema/common/20200220/Common}IDType"/&gt;
 *         &lt;element name="LeaveEntitlement" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclaration}DaysPerYearType"/&gt;
 *         &lt;element name="TemporaryAgencyWorker" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="PermanentStaffPublicAdmin" type="{http://www.swissdec.ch/schema/common/20200220/Common}EmptyType" minOccurs="0"/&gt;
 *         &lt;element name="FlexProfiling" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticAdditionalParticularsType", propOrder = {
    "education",
    "position",
    "jobTitle",
    "leaveEntitlement",
    "temporaryAgencyWorker",
    "permanentStaffPublicAdmin",
    "flexProfiling"
})
public class StatisticAdditionalParticularsType {

    @XmlElement(name = "Education", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected EducationType education;
    @XmlElement(name = "Position", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected PositionType position;
    @XmlElement(name = "JobTitle", required = true)
    protected String jobTitle;
    @XmlElement(name = "LeaveEntitlement")
    @XmlSchemaType(name = "integer")
    protected int leaveEntitlement;
    @XmlElement(name = "TemporaryAgencyWorker")
    protected EmptyType temporaryAgencyWorker;
    @XmlElement(name = "PermanentStaffPublicAdmin")
    protected EmptyType permanentStaffPublicAdmin;
    @XmlElement(name = "FlexProfiling")
    protected String flexProfiling;

    /**
     * Recupera il valore della proprietà education.
     * 
     * @return
     *     possible object is
     *     {@link EducationType }
     *     
     */
    public EducationType getEducation() {
        return education;
    }

    /**
     * Imposta il valore della proprietà education.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationType }
     *     
     */
    public void setEducation(EducationType value) {
        this.education = value;
    }

    /**
     * Recupera il valore della proprietà position.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * Recupera il valore della proprietà jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Imposta il valore della proprietà jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Recupera il valore della proprietà leaveEntitlement.
     * 
     */
    public int getLeaveEntitlement() {
        return leaveEntitlement;
    }

    /**
     * Imposta il valore della proprietà leaveEntitlement.
     * 
     */
    public void setLeaveEntitlement(int value) {
        this.leaveEntitlement = value;
    }

    /**
     * Recupera il valore della proprietà temporaryAgencyWorker.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getTemporaryAgencyWorker() {
        return temporaryAgencyWorker;
    }

    /**
     * Imposta il valore della proprietà temporaryAgencyWorker.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setTemporaryAgencyWorker(EmptyType value) {
        this.temporaryAgencyWorker = value;
    }

    /**
     * Recupera il valore della proprietà permanentStaffPublicAdmin.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getPermanentStaffPublicAdmin() {
        return permanentStaffPublicAdmin;
    }

    /**
     * Imposta il valore della proprietà permanentStaffPublicAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setPermanentStaffPublicAdmin(EmptyType value) {
        this.permanentStaffPublicAdmin = value;
    }

    /**
     * Recupera il valore della proprietà flexProfiling.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexProfiling() {
        return flexProfiling;
    }

    /**
     * Imposta il valore della proprietà flexProfiling.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexProfiling(String value) {
        this.flexProfiling = value;
    }

}
