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

import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.*;
import org.openmrs.api.ConceptService;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.kenyacore.calculation.*;
import org.openmrs.module.kenyaemr.Dictionary;
import org.openmrs.module.kenyaemr.calculation.EmrCalculationUtils;
import org.openmrs.module.kenyaemr.metadata.CommonMetadata;
import org.openmrs.module.kenyaemr.metadata.HivMetadata;
import org.openmrs.module.kenyaemr.metadata.SARIMetadata;
import org.openmrs.module.kenyaemr.util.EmrUtils;
import org.openmrs.module.metadatadeploy.MetadataUtils;

import java.util.*;

/**
 * Calculates the eligibility for SARI/ILI patients
 */

        public class EligibleForSariScreeningCalculation extends AbstractPatientCalculation implements PatientFlagCalculation {
        protected static final Log log = LogFactory.getLog(EligibleForSariScreeningCalculation.class);

       public static final EncounterType triageEncType = MetadataUtils.existing(EncounterType.class, CommonMetadata._EncounterType.TRIAGE);
       public static final Form triageScreeningForm = MetadataUtils.existing(Form.class, CommonMetadata._Form.TRIAGE);

    public static final EncounterType sariScreenType = MetadataUtils.existing(EncounterType.class, CommonMetadata._EncounterType.SARI_SCREENING);
    public static final Form sariScreeningForm = MetadataUtils.existing(Form.class, CommonMetadata._Form.SARI_SCREENING);
       //sari screening

// ili screening form
        public static final EncounterType greenCardEncType = MetadataUtils.existing(EncounterType.class,  HivMetadata._EncounterType.HIV_CONSULTATION);
        public static final Form greenCardForm = MetadataUtils.existing(Form.class, HivMetadata._Form.HIV_GREEN_CARD);
    public static final EncounterType sariEnrollType = MetadataUtils.existing(EncounterType.class, SARIMetadata._EncounterType.SARI_ENROLLMENT);
    public static final Form sariEnrolForm = MetadataUtils.existing(Form.class, SARIMetadata._Form.SARI_ENROLLMENT_FORM);


    @Override
        public String getFlagMessage() {
        return "Screen for SARI";
        }
        Integer MEASURE_FEVER = 140238;
        Integer COUGH_PRESENCE = 143264;
        Integer SYMPTOMS = 1729;
        Integer PATIENT_TYPE = 1896;
        Integer POSITIVE = 1065;
        /**
         * Evaluates the calculation
         */

        @Override
        public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> parameterValues, PatientCalculationContext context) {

            Set<Integer> alive = Filters.alive(cohort, context);
            PatientService patientService = Context.getPatientService();
//            Date isToday = new Date();
            CalculationResultMap ret = new CalculationResultMap();


        for (Integer ptId :alive) {
            boolean result = false;

            Patient patient = patientService.getPatient(ptId);
            Encounter lastTriageEnc = EmrUtils.lastEncounter(patient, triageEncType, triageScreeningForm);
            Encounter lastSariInc = EmrUtils.lastEncounter(patient, sariScreenType, sariScreeningForm);
            Encounter lastGreenCardEnc = EmrUtils.lastEncounter(patient, greenCardEncType, greenCardForm);
            //With Greencard Encounter
            EncounterType greenCardEncType = MetadataUtils.existing(EncounterType.class, HivMetadata._EncounterType.HIV_CONSULTATION);
            Form pocHivFollowup = MetadataUtils.existing(Form.class, HivMetadata._Form.HIV_GREEN_CARD);
            Encounter lastFollowUpEncounter = EmrUtils.lastEncounter(patientService.getPatient(ptId), greenCardEncType, Arrays.asList(pocHivFollowup));  //last hiv followup encounter




            ConceptService cs = Context.getConceptService();
                Concept measureFeverResult = cs.getConcept(MEASURE_FEVER);
                Concept coughPresenceResult = cs.getConcept(COUGH_PRESENCE);
                Concept symptomsResult = cs.getConcept(SYMPTOMS);
                Concept PatientTypeResult = cs.getConcept(PATIENT_TYPE);
                Concept positive = cs.getConcept(POSITIVE);
                boolean patientFeverResult = lastTriageEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastTriageEnc, measureFeverResult, positive) : false;
                boolean pantientCoughResult = lastTriageEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastTriageEnc, coughPresenceResult, positive) : false;
                boolean patientSymptomsResult = lastTriageEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastTriageEnc, symptomsResult, positive) : false;
                boolean patientTypeResult = lastTriageEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastTriageEnc, PatientTypeResult, positive) : false;

                boolean greenFever = lastGreenCardEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastGreenCardEnc, measureFeverResult, positive) : false;
                boolean greenCough = lastGreenCardEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastGreenCardEnc, coughPresenceResult, positive) : false;
                boolean greenSymptoms = lastGreenCardEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastGreenCardEnc, symptomsResult, positive) : false;
                boolean greenPatientType = lastGreenCardEnc != null ? EmrUtils.encounterThatPassCodedAnswer(lastGreenCardEnc, PatientTypeResult, positive) : false;

//||

            if (lastTriageEnc != null && !DateUtils.isSameDay(new Date(), lastTriageEnc.getEncounterDatetime()) ) {
                result = false;
            }else if(lastSariInc != null){
                result = false;
            } else {
                if (patientFeverResult && pantientCoughResult && patientSymptomsResult && patientTypeResult) {
                    result = true;
                }
                if (greenFever && greenCough && greenSymptoms && greenPatientType) {
                    result = true;
                }
            }
            ret.put(ptId, new BooleanResult(result, this));
            }

            return ret;
        }
}
