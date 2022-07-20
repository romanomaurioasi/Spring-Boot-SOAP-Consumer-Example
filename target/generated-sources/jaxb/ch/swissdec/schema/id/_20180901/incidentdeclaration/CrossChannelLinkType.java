
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.swissdec.schema.common._20180901.common.CredentialsType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;translation xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Cross Channel Link&lt;/translation&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:c="http://www.swissdec.ch/schema/common/20180901/Common" xmlns:id="http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;short&gt;&#13;
 *                         Cross-channel : Processus de communication qui se déroule sur plusieurs canaux, c'est-à-dire&#13;
 *                         h2m et m2m dans ce cas.&#13;
 *                     &lt;/short&gt;&lt;domain&gt;&#13;
 *                         Cross-channel : Canaux appariés Multi-channel : Canaux utilisés indépendamment les uns des&#13;
 *                         autres&#13;
 *                     &lt;/domain&gt;&lt;technical/&gt;&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per CrossChannelLinkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CrossChannelLinkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}StoryBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Credentials" type="{http://www.swissdec.ch/schema/common/20180901/Common}CredentialsType" minOccurs="0"/&gt;
 *         &lt;element name="Link" type="{http://www.swissdec.ch/schema/id/20180901/IncidentDeclaration}LinkType"/&gt;
 *         &lt;element name="LinkDescription" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotEmptyStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossChannelLinkType", propOrder = {
    "credentials",
    "link",
    "linkDescription"
})
public class CrossChannelLinkType
    extends StoryBaseType
{

    @XmlElement(name = "Credentials")
    protected CredentialsType credentials;
    @XmlElement(name = "Link", required = true)
    protected LinkType link;
    @XmlElement(name = "LinkDescription")
    protected String linkDescription;

    /**
     * Recupera il valore della proprietà credentials.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsType }
     *     
     */
    public CredentialsType getCredentials() {
        return credentials;
    }

    /**
     * Imposta il valore della proprietà credentials.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsType }
     *     
     */
    public void setCredentials(CredentialsType value) {
        this.credentials = value;
    }

    /**
     * Recupera il valore della proprietà link.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getLink() {
        return link;
    }

    /**
     * Imposta il valore della proprietà link.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setLink(LinkType value) {
        this.link = value;
    }

    /**
     * Recupera il valore della proprietà linkDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDescription() {
        return linkDescription;
    }

    /**
     * Imposta il valore della proprietà linkDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDescription(String value) {
        this.linkDescription = value;
    }

}
