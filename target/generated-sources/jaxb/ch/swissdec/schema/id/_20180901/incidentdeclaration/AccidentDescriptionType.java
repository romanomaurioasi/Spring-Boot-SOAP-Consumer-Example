
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.EmptyType;


/**
 * <p>Classe Java per AccidentDescriptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AccidentDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Accident" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}ClassOfInsuranceType"/&gt;
 *           &lt;element name="OccupationalDisease" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *           &lt;element name="CaseOfDeath" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}CaseOfDeathType"/&gt;
 *           &lt;element name="Relapse" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryRelapseType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IncidentDate" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryIncidentDateTimeType"/&gt;
 *         &lt;element name="IncidentScene" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IncidentDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PoliceReportExists" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}YesNoUnknownType"/&gt;
 *         &lt;element name="Injury" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}InjuryType"/&gt;
 *         &lt;element name="ExistInvolvedPersons" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}YesNoUnknownType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccidentDescriptionType", propOrder = {
    "accident",
    "occupationalDisease",
    "caseOfDeath",
    "relapse",
    "incidentDate",
    "incidentScene",
    "incidentDescription",
    "policeReportExists",
    "injury",
    "existInvolvedPersons"
})
public class AccidentDescriptionType
    extends StoryBaseType
{

    @XmlElement(name = "Accident")
    protected ClassOfInsuranceType accident;
    @XmlElement(name = "OccupationalDisease")
    protected EmptyType occupationalDisease;
    @XmlElement(name = "CaseOfDeath")
    protected CaseOfDeathType caseOfDeath;
    @XmlElement(name = "Relapse")
    protected StoryRelapseType relapse;
    @XmlElement(name = "IncidentDate", required = true)
    protected StoryIncidentDateTimeType incidentDate;
    @XmlElement(name = "IncidentScene", required = true)
    protected String incidentScene;
    @XmlElement(name = "IncidentDescription", required = true)
    protected String incidentDescription;
    @XmlElement(name = "PoliceReportExists", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected YesNoUnknownType policeReportExists;
    @XmlElement(name = "Injury", required = true)
    protected InjuryType injury;
    @XmlElement(name = "ExistInvolvedPersons", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected YesNoUnknownType existInvolvedPersons;

    /**
     * Recupera il valore della proprietà accident.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfInsuranceType }
     *     
     */
    public ClassOfInsuranceType getAccident() {
        return accident;
    }

    /**
     * Imposta il valore della proprietà accident.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfInsuranceType }
     *     
     */
    public void setAccident(ClassOfInsuranceType value) {
        this.accident = value;
    }

    /**
     * Recupera il valore della proprietà occupationalDisease.
     * 
     * @return
     *     possible object is
     *     {@link EmptyType }
     *     
     */
    public EmptyType getOccupationalDisease() {
        return occupationalDisease;
    }

    /**
     * Imposta il valore della proprietà occupationalDisease.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyType }
     *     
     */
    public void setOccupationalDisease(EmptyType value) {
        this.occupationalDisease = value;
    }

    /**
     * Recupera il valore della proprietà caseOfDeath.
     * 
     * @return
     *     possible object is
     *     {@link CaseOfDeathType }
     *     
     */
    public CaseOfDeathType getCaseOfDeath() {
        return caseOfDeath;
    }

    /**
     * Imposta il valore della proprietà caseOfDeath.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseOfDeathType }
     *     
     */
    public void setCaseOfDeath(CaseOfDeathType value) {
        this.caseOfDeath = value;
    }

    /**
     * Recupera il valore della proprietà relapse.
     * 
     * @return
     *     possible object is
     *     {@link StoryRelapseType }
     *     
     */
    public StoryRelapseType getRelapse() {
        return relapse;
    }

    /**
     * Imposta il valore della proprietà relapse.
     * 
     * @param value
     *     allowed object is
     *     {@link StoryRelapseType }
     *     
     */
    public void setRelapse(StoryRelapseType value) {
        this.relapse = value;
    }

    /**
     * Recupera il valore della proprietà incidentDate.
     * 
     * @return
     *     possible object is
     *     {@link StoryIncidentDateTimeType }
     *     
     */
    public StoryIncidentDateTimeType getIncidentDate() {
        return incidentDate;
    }

    /**
     * Imposta il valore della proprietà incidentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link StoryIncidentDateTimeType }
     *     
     */
    public void setIncidentDate(StoryIncidentDateTimeType value) {
        this.incidentDate = value;
    }

    /**
     * Recupera il valore della proprietà incidentScene.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentScene() {
        return incidentScene;
    }

    /**
     * Imposta il valore della proprietà incidentScene.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentScene(String value) {
        this.incidentScene = value;
    }

    /**
     * Recupera il valore della proprietà incidentDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentDescription() {
        return incidentDescription;
    }

    /**
     * Imposta il valore della proprietà incidentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentDescription(String value) {
        this.incidentDescription = value;
    }

    /**
     * Recupera il valore della proprietà policeReportExists.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownType }
     *     
     */
    public YesNoUnknownType getPoliceReportExists() {
        return policeReportExists;
    }

    /**
     * Imposta il valore della proprietà policeReportExists.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownType }
     *     
     */
    public void setPoliceReportExists(YesNoUnknownType value) {
        this.policeReportExists = value;
    }

    /**
     * Recupera il valore della proprietà injury.
     * 
     * @return
     *     possible object is
     *     {@link InjuryType }
     *     
     */
    public InjuryType getInjury() {
        return injury;
    }

    /**
     * Imposta il valore della proprietà injury.
     * 
     * @param value
     *     allowed object is
     *     {@link InjuryType }
     *     
     */
    public void setInjury(InjuryType value) {
        this.injury = value;
    }

    /**
     * Recupera il valore della proprietà existInvolvedPersons.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownType }
     *     
     */
    public YesNoUnknownType getExistInvolvedPersons() {
        return existInvolvedPersons;
    }

    /**
     * Imposta il valore della proprietà existInvolvedPersons.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownType }
     *     
     */
    public void setExistInvolvedPersons(YesNoUnknownType value) {
        this.existInvolvedPersons = value;
    }

}
