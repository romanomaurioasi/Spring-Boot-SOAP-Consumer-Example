package ch.swissdec.schema.sd._20130514.salarydeclarationservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2022-07-19T15:30:37.962+02:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationService", name = "SalaryDeclarationPort")
@XmlSeeAlso({ch.swissdec.schema.sd._20130514.salarydeclaration.ObjectFactory.class, ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.ObjectFactory.class, ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SalaryDeclarationPort {

    @WebMethod(operationName = "GetStatusFromDeclareSalary")
    @WebResult(name = "GetStatusFromDeclareSalaryResponse", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", partName = "parameters")
    public ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationStatusResponseType getStatusFromDeclareSalary(

        @WebParam(partName = "parameters", name = "GetStatusFromDeclareSalary", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
        ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetStatusFromDeclareSalaryType parameters
    ) throws SalaryDeclarationFault;

    @WebMethod(operationName = "GetResultFromSynchronizeContract")
    @WebResult(name = "GetResultFromSynchronizeContractResponse", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", partName = "parameters")
    public ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetResultFromDeclareSalaryResponseType getResultFromSynchronizeContract(

        @WebParam(partName = "parameters", name = "GetResultFromSynchronizeContract", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
        ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetResultFromDeclareSalaryType parameters
    ) throws SalaryDeclarationFault;

    @WebMethod(operationName = "GetStatusFromSynchronizeContract")
    @WebResult(name = "GetStatusFromSynchronizeContractResponse", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", partName = "parameters")
    public ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationStatusResponseType getStatusFromSynchronizeContract(

        @WebParam(partName = "parameters", name = "GetStatusFromSynchronizeContract", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
        ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetStatusFromDeclareSalaryType parameters
    ) throws SalaryDeclarationFault;

    @WebMethod(operationName = "Ping")
    @WebResult(name = "PingResponse", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", partName = "parameters")
    public ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.PingType ping(

        @WebParam(partName = "parameters", name = "Ping", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
        ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.PingType parameters
    );

    @WebMethod(operationName = "DeclareSalary")
    @WebResult(name = "DeclareSalaryResponse", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", partName = "parameters")
    public ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.DeclareSalaryResponseType declareSalary(

        @WebParam(partName = "parameters", name = "DeclareSalary", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
        ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationRequestType parameters
    ) throws SalaryDeclarationFault;

    @WebMethod(operationName = "CheckInteroperability")
    @WebResult(name = "CheckInteroperabilityResponse", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", partName = "parameters")
    public ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.CheckInteroperabilityResponseType checkInteroperability(

        @WebParam(partName = "parameters", name = "CheckInteroperability", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
        ch.swissdec.schema.sd._20130514.salarydeclarationservicetypes.CheckInteroperabilityType parameters
    );

    @WebMethod(operationName = "GetResultFromDeclareSalary")
    @WebResult(name = "GetResultFromDeclareSalaryResponse", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", partName = "parameters")
    public ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetResultFromDeclareSalaryResponseType getResultFromDeclareSalary(

        @WebParam(partName = "parameters", name = "GetResultFromDeclareSalary", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
        ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.GetResultFromDeclareSalaryType parameters
    ) throws SalaryDeclarationFault;

    @WebMethod(operationName = "SynchronizeContract")
    @WebResult(name = "SynchronizeContractResponse", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes", partName = "parameters")
    public ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.DeclareSalaryResponseType synchronizeContract(

        @WebParam(partName = "parameters", name = "SynchronizeContract", targetNamespace = "http://www.swissdec.ch/schema/sd/20130514/SalaryDeclarationServiceTypes")
        ch.swissdec.schema.sd._20130514.salarydeclarationcontainer.SalaryDeclarationRequestType parameters
    ) throws SalaryDeclarationFault;
}
