package ch.swissdec.schema.sd._20130514.salarydeclarationservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2022-07-19T15:30:37.995+02:00
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "SalaryDeclarationService",
                  wsdlLocation = "file:/C:/Dev/Analisi/Spring-Boot-SOAP-Consumer-Example/src/main/resources/20130514/wsdl/SalaryDeclarationService.wsdl",
                  targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationService")
public class SalaryDeclarationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationService", "SalaryDeclarationService");
    public final static QName SalaryDeclaration = new QName("http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationService", "SalaryDeclaration");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Dev/Analisi/Spring-Boot-SOAP-Consumer-Example/src/main/resources/20130514/wsdl/SalaryDeclarationService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SalaryDeclarationService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Dev/Analisi/Spring-Boot-SOAP-Consumer-Example/src/main/resources/20130514/wsdl/SalaryDeclarationService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SalaryDeclarationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SalaryDeclarationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SalaryDeclarationService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SalaryDeclarationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SalaryDeclarationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SalaryDeclarationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SalaryDeclarationPort
     */
    @WebEndpoint(name = "SalaryDeclaration")
    public SalaryDeclarationPort getSalaryDeclaration() {
        return super.getPort(SalaryDeclaration, SalaryDeclarationPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SalaryDeclarationPort
     */
    @WebEndpoint(name = "SalaryDeclaration")
    public SalaryDeclarationPort getSalaryDeclaration(WebServiceFeature... features) {
        return super.getPort(SalaryDeclaration, SalaryDeclarationPort.class, features);
    }

}
