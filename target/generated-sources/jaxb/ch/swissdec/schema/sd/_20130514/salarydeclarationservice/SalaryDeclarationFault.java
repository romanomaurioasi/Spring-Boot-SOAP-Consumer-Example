
package ch.swissdec.schema.sd._20130514.salarydeclarationservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * 2022-07-19T15:30:37.897+02:00
 * Generated source version: 3.3.5
 */

@WebFault(name = "SalaryDeclarationFault", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
public class SalaryDeclarationFault extends Exception {

    private ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationFaultType salaryDeclarationFault;

    public SalaryDeclarationFault() {
        super();
    }

    public SalaryDeclarationFault(String message) {
        super(message);
    }

    public SalaryDeclarationFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SalaryDeclarationFault(String message, ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationFaultType salaryDeclarationFault) {
        super(message);
        this.salaryDeclarationFault = salaryDeclarationFault;
    }

    public SalaryDeclarationFault(String message, ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationFaultType salaryDeclarationFault, java.lang.Throwable cause) {
        super(message, cause);
        this.salaryDeclarationFault = salaryDeclarationFault;
    }

    public ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationFaultType getFaultInfo() {
        return this.salaryDeclarationFault;
    }
}
