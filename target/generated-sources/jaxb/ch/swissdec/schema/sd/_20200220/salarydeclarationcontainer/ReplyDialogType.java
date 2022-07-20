
package ch.swissdec.schema.sd._20200220.salarydeclarationcontainer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20200220.common.DialogMessagesType;


/**
 * <p>Classe Java per ReplyDialogType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReplyDialogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.swissdec.ch/schema/sd/20200220/SalaryDeclarationContainer}GetBaseGroup"/&gt;
 *         &lt;element name="DialogMessages" type="{http://www.swissdec.ch/schema/common/20200220/Common}DialogMessagesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyDialogType", propOrder = {
    "requestContext",
    "domain",
    "dialogMessages"
})
public class ReplyDialogType {

    @XmlElement(name = "RequestContext", required = true)
    protected RequestContextType requestContext;
    @XmlElement(name = "Domain", required = true)
    protected DomainIdentificationType domain;
    @XmlElement(name = "DialogMessages", required = true)
    protected DialogMessagesType dialogMessages;

    /**
     * Recupera il valore della proprietà requestContext.
     * 
     * @return
     *     possible object is
     *     {@link RequestContextType }
     *     
     */
    public RequestContextType getRequestContext() {
        return requestContext;
    }

    /**
     * Imposta il valore della proprietà requestContext.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestContextType }
     *     
     */
    public void setRequestContext(RequestContextType value) {
        this.requestContext = value;
    }

    /**
     * Recupera il valore della proprietà domain.
     * 
     * @return
     *     possible object is
     *     {@link DomainIdentificationType }
     *     
     */
    public DomainIdentificationType getDomain() {
        return domain;
    }

    /**
     * Imposta il valore della proprietà domain.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainIdentificationType }
     *     
     */
    public void setDomain(DomainIdentificationType value) {
        this.domain = value;
    }

    /**
     * Recupera il valore della proprietà dialogMessages.
     * 
     * @return
     *     possible object is
     *     {@link DialogMessagesType }
     *     
     */
    public DialogMessagesType getDialogMessages() {
        return dialogMessages;
    }

    /**
     * Imposta il valore della proprietà dialogMessages.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogMessagesType }
     *     
     */
    public void setDialogMessages(DialogMessagesType value) {
        this.dialogMessages = value;
    }

}
