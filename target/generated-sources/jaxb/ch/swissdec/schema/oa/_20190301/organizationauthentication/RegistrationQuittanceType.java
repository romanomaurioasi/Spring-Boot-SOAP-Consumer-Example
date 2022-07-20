
package ch.swissdec.schema.oa._20190301.organizationauthentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.swissdec.schema.common._20180901.common.NotificationsType;


/**
 * <p>Classe Java per RegistrationQuittanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RegistrationQuittanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X509Subject"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CommonName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="StateOrProvinceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="BusinessCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompanyUID-BFS" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}UID-BFSType"/&gt;
 *         &lt;element name="AuthorizedForUID-BFS" type="{http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthentication}UID-BFSType" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.swissdec.ch/schema/common/20180901/Common}NotificationsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationQuittanceType", propOrder = {
    "x509Subject",
    "companyUIDBFS",
    "authorizedForUIDBFS",
    "comment"
})
public class RegistrationQuittanceType {

    @XmlElement(name = "X509Subject", required = true)
    protected RegistrationQuittanceType.X509Subject x509Subject;
    @XmlElement(name = "CompanyUID-BFS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String companyUIDBFS;
    @XmlElement(name = "AuthorizedForUID-BFS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String authorizedForUIDBFS;
    @XmlElement(name = "Comment")
    protected NotificationsType comment;

    /**
     * Recupera il valore della proprietà x509Subject.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationQuittanceType.X509Subject }
     *     
     */
    public RegistrationQuittanceType.X509Subject getX509Subject() {
        return x509Subject;
    }

    /**
     * Imposta il valore della proprietà x509Subject.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationQuittanceType.X509Subject }
     *     
     */
    public void setX509Subject(RegistrationQuittanceType.X509Subject value) {
        this.x509Subject = value;
    }

    /**
     * Recupera il valore della proprietà companyUIDBFS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyUIDBFS() {
        return companyUIDBFS;
    }

    /**
     * Imposta il valore della proprietà companyUIDBFS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyUIDBFS(String value) {
        this.companyUIDBFS = value;
    }

    /**
     * Recupera il valore della proprietà authorizedForUIDBFS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedForUIDBFS() {
        return authorizedForUIDBFS;
    }

    /**
     * Imposta il valore della proprietà authorizedForUIDBFS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedForUIDBFS(String value) {
        this.authorizedForUIDBFS = value;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsType }
     *     
     */
    public NotificationsType getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsType }
     *     
     */
    public void setComment(NotificationsType value) {
        this.comment = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CommonName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="StateOrProvinceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="BusinessCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonName",
        "organizationName",
        "localityName",
        "stateOrProvinceName",
        "countryName",
        "businessCategory"
    })
    public static class X509Subject {

        @XmlElement(name = "CommonName", required = true)
        protected String commonName;
        @XmlElement(name = "OrganizationName", required = true)
        protected String organizationName;
        @XmlElement(name = "LocalityName", required = true)
        protected String localityName;
        @XmlElement(name = "StateOrProvinceName", required = true)
        protected String stateOrProvinceName;
        @XmlElement(name = "CountryName", required = true)
        protected String countryName;
        @XmlElement(name = "BusinessCategory")
        protected String businessCategory;

        /**
         * Recupera il valore della proprietà commonName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommonName() {
            return commonName;
        }

        /**
         * Imposta il valore della proprietà commonName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommonName(String value) {
            this.commonName = value;
        }

        /**
         * Recupera il valore della proprietà organizationName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationName() {
            return organizationName;
        }

        /**
         * Imposta il valore della proprietà organizationName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationName(String value) {
            this.organizationName = value;
        }

        /**
         * Recupera il valore della proprietà localityName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalityName() {
            return localityName;
        }

        /**
         * Imposta il valore della proprietà localityName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalityName(String value) {
            this.localityName = value;
        }

        /**
         * Recupera il valore della proprietà stateOrProvinceName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateOrProvinceName() {
            return stateOrProvinceName;
        }

        /**
         * Imposta il valore della proprietà stateOrProvinceName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateOrProvinceName(String value) {
            this.stateOrProvinceName = value;
        }

        /**
         * Recupera il valore della proprietà countryName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryName() {
            return countryName;
        }

        /**
         * Imposta il valore della proprietà countryName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryName(String value) {
            this.countryName = value;
        }

        /**
         * Recupera il valore della proprietà businessCategory.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessCategory() {
            return businessCategory;
        }

        /**
         * Imposta il valore della proprietà businessCategory.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessCategory(String value) {
            this.businessCategory = value;
        }

    }

}
