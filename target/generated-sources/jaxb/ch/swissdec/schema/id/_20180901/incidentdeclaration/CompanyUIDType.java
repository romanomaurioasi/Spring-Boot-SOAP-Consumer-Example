
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.swissdec.schema.common._20180901.common.UIDBFSUnknownType;


/**
 * <p>Classe Java per CompanyUIDType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompanyUIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UID-BFS" type="{http://www.swissdec.ch/schema/common/20180901/Common}UID-BFS-UnknownType"/&gt;
 *         &lt;element name="DelegateUID-BFS" type="{http://www.swissdec.ch/schema/common/20180901/Common}UID-BFSType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyUIDType", propOrder = {
    "uidbfs",
    "delegateUIDBFS"
})
public class CompanyUIDType {

    @XmlElement(name = "UID-BFS", required = true)
    protected UIDBFSUnknownType uidbfs;
    @XmlElement(name = "DelegateUID-BFS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String delegateUIDBFS;

    /**
     * Recupera il valore della proprietà uidbfs.
     * 
     * @return
     *     possible object is
     *     {@link UIDBFSUnknownType }
     *     
     */
    public UIDBFSUnknownType getUIDBFS() {
        return uidbfs;
    }

    /**
     * Imposta il valore della proprietà uidbfs.
     * 
     * @param value
     *     allowed object is
     *     {@link UIDBFSUnknownType }
     *     
     */
    public void setUIDBFS(UIDBFSUnknownType value) {
        this.uidbfs = value;
    }

    /**
     * Recupera il valore della proprietà delegateUIDBFS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegateUIDBFS() {
        return delegateUIDBFS;
    }

    /**
     * Imposta il valore della proprietà delegateUIDBFS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegateUIDBFS(String value) {
        this.delegateUIDBFS = value;
    }

}
