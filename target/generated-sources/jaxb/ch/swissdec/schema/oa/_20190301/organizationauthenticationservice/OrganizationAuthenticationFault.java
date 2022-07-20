
package ch.swissdec.schema.oa._20190301.organizationauthenticationservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * 2022-07-19T15:30:50.986+02:00
 * Generated source version: 3.3.5
 */

@WebFault(name = "OrganizationAuthenticationFault", targetNamespace = "http://www.swissdec.ch/schema/oa/20190301/OrganizationAuthenticationServiceTypes")
public class OrganizationAuthenticationFault extends Exception {

    private ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.OrganizationAuthenticationFaultType organizationAuthenticationFault;

    public OrganizationAuthenticationFault() {
        super();
    }

    public OrganizationAuthenticationFault(String message) {
        super(message);
    }

    public OrganizationAuthenticationFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public OrganizationAuthenticationFault(String message, ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.OrganizationAuthenticationFaultType organizationAuthenticationFault) {
        super(message);
        this.organizationAuthenticationFault = organizationAuthenticationFault;
    }

    public OrganizationAuthenticationFault(String message, ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.OrganizationAuthenticationFaultType organizationAuthenticationFault, java.lang.Throwable cause) {
        super(message, cause);
        this.organizationAuthenticationFault = organizationAuthenticationFault;
    }

    public ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.OrganizationAuthenticationFaultType getFaultInfo() {
        return this.organizationAuthenticationFault;
    }
}
