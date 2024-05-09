/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.reporting.data.converter.definition.evaluator.pnc;

import org.openmrs.annotation.Handler;
import org.openmrs.module.kenyaemr.reporting.data.converter.definition.pnc.PNCModernFPMethodCounsellingDataDefinition;
import org.openmrs.module.reporting.data.encounter.EvaluatedEncounterData;
import org.openmrs.module.reporting.data.encounter.definition.EncounterDataDefinition;
import org.openmrs.module.reporting.data.encounter.evaluator.EncounterDataEvaluator;
import org.openmrs.module.reporting.evaluation.EvaluationContext;
import org.openmrs.module.reporting.evaluation.EvaluationException;
import org.openmrs.module.reporting.evaluation.querybuilder.SqlQueryBuilder;
import org.openmrs.module.reporting.evaluation.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Map;

/**
 * PNC Modern FP Method counselling column
 */
@Handler(supports= PNCModernFPMethodCounsellingDataDefinition.class, order=50)
public class PNCModernFPMethodCounsellingDataEvaluator implements EncounterDataEvaluator {

    @Autowired
    private EvaluationService evaluationService;

    public EvaluatedEncounterData evaluate(EncounterDataDefinition definition, EvaluationContext context) throws EvaluationException {
        EvaluatedEncounterData c = new EvaluatedEncounterData(definition, context);

        String qry = "select v.encounter_id,\n" +
			"       (case v.family_planning_method when 160570 then 'Emergency contraceptive pills'\n" +
			"                                    when 780 then 'Oral Contraceptives Pills' \n" +
			"                                    when 5279 then 'Injectible' \n" +
			"                                    when 1359 then 'Implant'\n" +
			"                                    when 5275 then 'Intrauterine Device' \n" +
			"                                    when 136163 then 'Lactational Amenorhea Method' \n" +
			"                                    when 5278 then 'Diaphram/Cervical Cap'\n" +
			"                                    when 5277 then 'Fertility Awareness'\n" +
			"                                    when 1472 then 'Tubal Ligation' \n" +
			"                                    when 190 then 'Condoms' \n" +
			"                                    when 1489 then 'Vasectomy' \n" +
			"                                    when 162332 then 'Undecided' else '' end) as family_planning_method\n" +
			"    from kenyaemr_etl.etl_mch_postnatal_visit v\n" +
			"    where date(v.visit_date) between date(:startDate) and date(:endDate);";

        SqlQueryBuilder queryBuilder = new SqlQueryBuilder();
        queryBuilder.append(qry);
        Date startDate = (Date)context.getParameterValue("startDate");
        Date endDate = (Date)context.getParameterValue("endDate");
        queryBuilder.addParameter("endDate", endDate);
        queryBuilder.addParameter("startDate", startDate);
        Map<Integer, Object> data = evaluationService.evaluateToMap(queryBuilder, Integer.class, Object.class, context);
        c.setData(data);
        return c;
    }
}
