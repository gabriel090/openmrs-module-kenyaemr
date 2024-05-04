/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.calculation.library.hiv;

import org.openmrs.Person;
import org.openmrs.api.PersonService;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.calculation.result.SimpleResult;
import org.openmrs.module.kenyacore.calculation.AbstractPatientCalculation;

import java.util.Collection;
import java.util.Map;

/**
 * Calculates the patient address
 *
 */
public class CountyAddressCalculation extends AbstractPatientCalculation {

    @Override
    public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> parameterValues, PatientCalculationContext context) {

        CalculationResultMap ret = new CalculationResultMap();

        PersonService personService = Context.getPersonService();
        if (personService != null) {
            for (Integer ptId : cohort) {
                Person person = personService.getPerson(ptId);
                if (person != null && person.getPersonAddress() != null) {
                    if (person.getPersonAddress().getCountry() != null)
                        ret.put(ptId, new SimpleResult(person.getPersonAddress().getCountry(), this));
                    else if (person.getPersonAddress().getCountyDistrict() != null) {
                        ret.put(ptId, new SimpleResult(person.getPersonAddress().getCountyDistrict(), this));
                    }
                }
            }
        } else {
            for (Integer ptId : cohort) {
                ret.put(ptId, new SimpleResult("No Person Service", this));
            }
        }

        return ret;
    }
}
