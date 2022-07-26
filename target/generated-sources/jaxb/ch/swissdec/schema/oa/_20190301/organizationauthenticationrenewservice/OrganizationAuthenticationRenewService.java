package ch.swissdec.schema.oa._20190301.organizationauthenticationrenewservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2022-07-19T15:30:56.402+02:00
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "OrganizationAuthenticationRenewService",
                  wsdlLocation = "file:/C:/Dev/Analisi/Spring-Boot-SOAP-Consumer-Example/src/main/resources/20190301/wsdl/OrganizationAuthenticationRenewService.wsdl",
                  targetNamespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationRenewService")
public class OrganizationAuthenticationRenewService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationRenewService", "OrganizationAuthenticationRenewService");
    public final static QName OrganizationAuthenticationRenew = new QName("http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationRenewService", "OrganizationAuthenticationRenew");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Dev/Analisi/Spring-Boot-SOAP-Consumer-Example/src/main/resources/20190301/wsdl/OrganizationAuthenticationRenewService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrganizationAuthenticationRenewService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Dev/Analisi/Spring-Boot-SOAP-Consumer-Example/src/main/resources/20190301/wsdl/OrganizationAuthenticationRenewService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrganizationAuthenticationRenewService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrganizationAuthenticationRenewService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrganizationAuthenticationRenewService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OrganizationAuthenticationRenewService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrganizationAuthenticationRenewService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrganizationAuthenticationRenewService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns OrganizationAuthenticationRenewPort
     */
    @WebEndpoint(name = "OrganizationAuthenticationRenew")
    public OrganizationAuthenticationRenewPort getOrganizationAuthenticationRenew() {
        return super.getPort(OrganizationAuthenticationRenew, OrganizationAuthenticationRenewPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrganizationAuthenticationRenewPort
     */
    @WebEndpoint(name = "OrganizationAuthenticationRenew")
    public OrganizationAuthenticationRenewPort getOrganizationAuthenticationRenew(WebServiceFeature... features) {
        return super.getPort(OrganizationAuthenticationRenew, OrganizationAuthenticationRenewPort.class, features);
    }

}
