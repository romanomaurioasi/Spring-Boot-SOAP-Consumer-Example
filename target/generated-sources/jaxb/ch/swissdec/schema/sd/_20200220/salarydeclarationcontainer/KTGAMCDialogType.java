
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.NotificationsType;


/**
 * <p>Classe Java per KTG-AMC-DialogType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="KTG-AMC-DialogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/common/20200220/Common}NotificationsType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="NotSupported" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}KTG-AMC-MinimalResultStateType"/&gt;
 *           &lt;element name="Processing" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}KTG-AMC-ProcessingType"/&gt;
 *           &lt;element name="Error" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}ErrorResponseType"/&gt;
 *           &lt;element name="Success" type="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}KTG-AMC-SuccessDialogType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KTG-AMC-DialogType", propOrder = {
    "warning",
    "info",
    "notSupported",
    "processing",
    "error",
    "success"
})
@XmlSeeAlso({
    KTGAMCReducedDialogType.class
})
public class KTGAMCDialogType {

    @XmlElement(name = "Warning")
    protected NotificationsType warning;
    @XmlElement(name = "Info")
    protected NotificationsType info;
    @XmlElement(name = "NotSupported")
    protected KTGAMCMinimalResultStateType notSupported;
    @XmlElement(name = "Processing")
    protected KTGAMCProcessingType processing;
    @XmlElement(name = "Error")
    protected ErrorResponseType error;
    @XmlElement(name = "Success")
    protected KTGAMCSuccessDialogType success;

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
     * Recupera il valore della proprietà notSupported.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCMinimalResultStateType }
     *     
     */
    public KTGAMCMinimalResultStateType getNotSupported() {
        return notSupported;
    }

    /**
     * Imposta il valore della proprietà notSupported.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCMinimalResultStateType }
     *     
     */
    public void setNotSupported(KTGAMCMinimalResultStateType value) {
        this.notSupported = value;
    }

    /**
     * Recupera il valore della proprietà processing.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCProcessingType }
     *     
     */
    public KTGAMCProcessingType getProcessing() {
        return processing;
    }

    /**
     * Imposta il valore della proprietà processing.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCProcessingType }
     *     
     */
    public void setProcessing(KTGAMCProcessingType value) {
        this.processing = value;
    }

    /**
     * Recupera il valore della proprietà error.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponseType }
     *     
     */
    public ErrorResponseType getError() {
        return error;
    }

    /**
     * Imposta il valore della proprietà error.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponseType }
     *     
     */
    public void setError(ErrorResponseType value) {
        this.error = value;
    }

    /**
     * Recupera il valore della proprietà success.
     * 
     * @return
     *     possible object is
     *     {@link KTGAMCSuccessDialogType }
     *     
     */
    public KTGAMCSuccessDialogType getSuccess() {
        return success;
    }

    /**
     * Imposta il valore della proprietà success.
     * 
     * @param value
     *     allowed object is
     *     {@link KTGAMCSuccessDialogType }
     *     
     */
    public void setSuccess(KTGAMCSuccessDialogType value) {
        this.success = value;
    }

}
