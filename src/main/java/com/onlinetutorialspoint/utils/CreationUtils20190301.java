/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.utils;

import ch.swissdec.schema.common._20180901.common.CompanyNameType;
import ch.swissdec.schema.common._20180901.common.LanguageCodeType;
import ch.swissdec.schema.common._20180901.common.UserAgentType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.ContactPersonType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.GenericCustomerIdentificationMultiType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.InstitutionsType;
import ch.swissdec.schema.oa._20190301.organizationauthentication.OrganizationRegistrationType;
import ch.swissdec.schema.oa._20190301.organizationauthenticationcontainer.RequestContextType;

/**
 * Helper Util to create request snippets from the SUAv1 (20190301) standard.
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-04 11:45:00 +0200 (Fr., 04 Sep 2020) $
 */
public class CreationUtils20190301 {

    public static OrganizationRegistrationType createOrganizationRegistration() {
        OrganizationRegistrationType organizationRegistration = new OrganizationRegistrationType();
        organizationRegistration.setInstitution(new InstitutionsType());
        organizationRegistration.setCompanyName(createCompanyName());
        organizationRegistration.setCompanyContactPerson(createContactPerson());
        organizationRegistration.setCompanyUIDBFS("");
        return organizationRegistration;
    }

    public static CompanyNameType createCompanyName() {
        return createCompanyName("");
    }

    public static CompanyNameType createCompanyName(String hrrcname) {
        CompanyNameType companyName = new CompanyNameType();
        companyName.setHRRCName(hrrcname);
        return companyName;
    }

    public static ContactPersonType createContactPerson() {
        ContactPersonType contactPerson = new ContactPersonType();
        contactPerson.setName("");
        contactPerson.setEmailAddress("");
        return contactPerson;
    }

    public static RequestContextType createRequestContext(UserAgentType userAgent) {
        RequestContextType requestContext = new RequestContextType();
        requestContext.setUserAgent(userAgent);
        requestContext.setCompanyName(createCompanyName());
        requestContext.setTransmissionDate(Utils.getXMLGregorianCalendar());
        requestContext.setRequestID(Utils.generateID());
        requestContext.setLanguageCode(LanguageCodeType.DE);
        return requestContext;
    }

    public static GenericCustomerIdentificationMultiType createGenericCustomerIdentificationMulti(String insuranceID,
                                                                                                  String insuranceCompanyName,
                                                                                                  String customerIdentity,
                                                                                                  String contractIdentity) {
        GenericCustomerIdentificationMultiType gim = new GenericCustomerIdentificationMultiType();
        gim.setInsuranceID(insuranceID);
        gim.setInsuranceCompanyName(insuranceCompanyName);
        gim.setCustomerIdentity(customerIdentity);
        gim.setContractIdentity(contractIdentity);
        return gim;
    }
}
