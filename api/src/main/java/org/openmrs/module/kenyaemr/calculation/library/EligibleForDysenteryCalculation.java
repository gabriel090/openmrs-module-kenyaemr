/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.calculation.library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.openmrs.*;
import org.openmrs.api.ConceptService;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.kenyacore.calculation.*;
import org.openmrs.module.kenyaemr.metadata.CommonMetadata;
import org.openmrs.module.kenyaemr.util.EmrUtils;
import org.openmrs.module.metadatadeploy.MetadataUtils;

import java.text.SimpleDateFormat;
import java.util.*;

public class EligibleForDysenteryCalculation extends AbstractPatientCalculation implements PatientFlagCalculation {
    protected static final Log log = LogFactory.getLog(EligibleForSariIliScreeningCalculation.class);
    public static final EncounterType triageEncType = MetadataUtils.existing(EncounterType.class, CommonMetadata._EncounterType.TRIAGE);
    public static final Form triageScreeningForm = MetadataUtils.existing(Form.class, CommonMetadata._Form.TRIAGE);
    @Override
    public String getFlagMessage() {
        return "Suspected Dysentery case";
    }
    Integer BLOOD_IN_STOOL = 132494;

    Integer SCRENING_QUESTION = 5219;
    Integer ONSET_DATE = 159948;

    /**
     * Evaluates the calculation
     */

    @Override
    public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> parameterValues, PatientCalculationContext context) {

        Set<Integer> alive = Filters.alive(cohort, context);
        PatientService patientService = Context.getPatientService();
        CalculationResultMap ret = new CalculationResultMap();
        for (Integer ptId :alive) {
            boolean result = false;
            Integer triageDateDifference = 0;
            Integer greenCardDateDifference = 0;
            Date triageOnsetDate = null;
            Date greenCardOnsetDate = null;
            Date dateCreated = null;
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String todayDate = dateFormat.format(currentDate);
            Patient patient = patientService.getPatient(ptId);
            Encounter lastTriageEnc = EmrUtils.lastEncounter(patient, triageEncType, triageScreeningForm);
            Encounter lastGreenCardEnc = EmrUtils.lastEncounter(Context.getPatientService().getPatient(ptId), Context.getEncounterService().getEncounterTypeByUuid("a0034eee-1940-4e35-847f-97537a35d05e"));   //last greencard followup form
            ConceptService cs = Context.getConceptService();
            Concept bloodInStool = cs.getConcept(BLOOD_IN_STOOL);
            Concept screeningQuestion = cs.getConcept(SCRENING_QUESTION);
            boolean patientBloodInStoolResult = lastTriageEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastTriageEnc, screeningQuestion, bloodInStool) : false;
            boolean patientBloodInStoolResultGreenCard = lastGreenCardEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastGreenCardEnc, screeningQuestion, bloodInStool) : false;
            if (lastGreenCardEnc !=null) {

                    for (Obs obs : lastGreenCardEnc.getObs()) {
                        dateCreated = obs.getDateCreated();
                        if (obs.getConcept().getConceptId().equals(ONSET_DATE)) {
                            greenCardOnsetDate = obs.getValueDatetime();
                            greenCardDateDifference = daysBetween(currentDate, greenCardOnsetDate);

                        }
                    }
                String createdDate = dateFormat.format(dateCreated);
                if(createdDate != null && createdDate.equals(todayDate)) {
                      if (greenCardDateDifference < 2 && patientBloodInStoolResult || patientBloodInStoolResultGreenCard) {
                          result = true;
                      }
                }
            }
            if (lastTriageEnc !=null) {
                    for (Obs obs : lastTriageEnc.getObs()) {
                        dateCreated = obs.getDateCreated();
                        if (obs.getConcept().getConceptId().equals(ONSET_DATE)) {
                            triageOnsetDate = obs.getValueDatetime();
                            triageDateDifference = daysBetween(currentDate, triageOnsetDate);

                        }
                    }
                String createdDate = dateFormat.format(dateCreated);
                if(createdDate != null && createdDate.equals(todayDate)) {
                       if (triageDateDifference < 2 && patientBloodInStoolResult || patientBloodInStoolResultGreenCard) {
                                result = true;
                        }
                    }
            }
            ret.put(ptId, new BooleanResult(result, this));
        }

        return ret;
    }
    private int daysBetween(Date date1, Date date2) {
        DateTime d1 = new DateTime(date1.getTime());
        DateTime d2 = new DateTime(date2.getTime());
        return Math.abs(Days.daysBetween(d1, d2).getDays());
    }
}