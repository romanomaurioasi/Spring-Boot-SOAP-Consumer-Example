
package ch.swissdec.schema.id._20180901.incidentdeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.NameAndAddressType;
import ch.swissdec.schema.common._20180901.common.NotificationsType;
import ch.swissdec.schema.id._20180901.incidentdeclaration.KTGAMCStaffType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:idc="http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Avancement du travail&lt;/translation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per KTG-AMC-IncidentStateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KTG-AMC-IncidentStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddresseeContext" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}ContextConsumerBaseType"/&gt;
 *         &lt;element name="InstitutionAddress" type="{http://www.swissdec.ch/schema/common/20180901/Common}NameAndAddressType"/&gt;
 *         &lt;element name="DigitalizationScope" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclarationContainer}DigitalizationScopeType"/&gt;
 *         &lt;element name="Staff" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}KTG-AMC-StaffType"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KTG-AMC-IncidentStateType", propOrder = {
    "addresseeContext",
    "institutionAddress",
    "digitalizationScope",
    "staff",
    "info",
    "warning"
})
public class KTGAMCIncidentStateType {

    @XmlElement(name = "AddresseeContext", required = true)
    protected ContextConsumerBaseType addresseeContext;
    @XmlElement(name = "InstitutionAddress", required = true)
    protected NameAndAddressType institutionAddress;
    @XmlElement(name = "DigitalizationScope", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected DigitalizationScopeType digitalizationScope;
    @XmlElement(name = "Staff", required = true)
    protected KTGAMCStaffType staff;
    @XmlElement(name = "Info")
    protected NotificationsType info;
    @XmlElement(name = "Warning")
    protected NotificationsType warning;

    /**
     * Recupera il valore della proprietà addresseeContext.
     * 
     * @return
     *     possible object is
     *     {@link ContextConsumerBaseType }
     *     
     */
    public ContextConsumerBaseType getAddresseeContext() {
        return addresseeContext;
    }

    /**
     * Imposta il valore della proprietà addresseeContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextConsumerBaseType }
     *     
     */
    public void setAddresseeContext(ContextConsumerBaseType value) {
        this.addresseeContext = value;
    }

    /**
     * Recupera il valore della proprietà institutionAddress.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressType }
     *     
     */
    public NameAndAddressType getInstitutionAddress() {
        return institutionAddress;
    }

    /**
     * Imposta il valore della proprietà institutionAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressType }
     *     
     */
    public void setInstitutionAddress(NameAndAddressType value) {
        this.institutionAddress = value;
    }

    /**
     * Recupera il valore della proprietà digitalizationScope.
     * 
     * @return
     *     possible object is
     *     {@link DigitalizationScopeType }
     *     
     */
    public DigitalizationScopeType getDigitalizationScope() {
        return digitalizationScope;
    }

    /**
     * Imposta il valore della proprietà digitalizationScope.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalizationScopeType }
     *     
     */
    public void setDigitalizationScope(DigitalizationScopeType value) {
        this.digitalizationScope = value;
    }

    /**
     * Recupera il valore della proprietà staff.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCStaffType }
     *     
     */
    public KTGAMCStaffType getStaff() {
        return staff;
    }

    /**
     * Imposta il valore della proprietà staff.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCStaffType }
     *     
     */
    public void setStaff(KTGAMCStaffType value) {
        this.staff = value;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setInfo(NotificationsType value) {
        this.info = value;
    }

    /**
     * Recupera il valore della proprietà warning.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getWarning() {
        return warning;
    }

    /**
     * Imposta il valore della proprietà warning.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setWarning(NotificationsType value) {
        this.warning = value;
    }

}
