
package ch.swissdec.schema.sd._20130514.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Résultat de la déclaration de salaires&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:sd="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclaration" xmlns:sdc="http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;Résultat de la déclaration de salaires avec les données de retour pertinents&lt;/short&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per StatisticSalaryResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatisticSalaryResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warning" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}NotificationsType" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}NotificationsType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CompletionReleaseIsMissing" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ResultStateBaseType"/&gt;
 *           &lt;element name="Processing" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}StatisticProcessingType"/&gt;
 *           &lt;element name="Error" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}ErrorResponseType"/&gt;
 *           &lt;element name="Success" type="{http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationContainer}StatisticSuccessType"/&gt;
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
@XmlType(name = "StatisticSalaryResultType", propOrder = {
    "warning",
    "info",
    "completionReleaseIsMissing",
    "processing",
    "error",
    "success"
})
@XmlSeeAlso({
    StatisticReducedSalaryResultType.class
})
public class StatisticSalaryResultType {

    @XmlElement(name = "Warning")
    protected NotificationsType warning;
    @XmlElement(name = "Info")
    protected NotificationsType info;
    @XmlElement(name = "CompletionReleaseIsMissing")
    protected ResultStateBaseType completionReleaseIsMissing;
    @XmlElement(name = "Processing")
    protected StatisticProcessingType processing;
    @XmlElement(name = "Error")
    protected ErrorResponseType error;
    @XmlElement(name = "Success")
    protected StatisticSuccessType success;

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
     * Recupera il valore della proprietà completionReleaseIsMissing.
     * 
     * @return
     *     possible object is
     *     {@link ResultStateBaseType }
     *     
     */
    public ResultStateBaseType getCompletionReleaseIsMissing() {
        return completionReleaseIsMissing;
    }

    /**
     * Imposta il valore della proprietà completionReleaseIsMissing.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStateBaseType }
     *     
     */
    public void setCompletionReleaseIsMissing(ResultStateBaseType value) {
        this.completionReleaseIsMissing = value;
    }

    /**
     * Recupera il valore della proprietà processing.
     * 
     * @return
     *     possible object is
     *     {@link StatisticProcessingType }
     *     
     */
    public StatisticProcessingType getProcessing() {
        return processing;
    }

    /**
     * Imposta il valore della proprietà processing.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticProcessingType }
     *     
     */
    public void setProcessing(StatisticProcessingType value) {
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
     *     {@link StatisticSuccessType }
     *     
     */
    public StatisticSuccessType getSuccess() {
        return success;
    }

    /**
     * Imposta il valore della proprietà success.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticSuccessType }
     *     
     */
    public void setSuccess(StatisticSuccessType value) {
        this.success = value;
    }

}
