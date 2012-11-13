/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.kenyaemr.fragment.controller;

import java.util.Iterator;
import java.util.List;

import org.openmrs.Patient;
import org.openmrs.PatientIdentifier;
import org.openmrs.Visit;
import org.openmrs.api.context.Context;
import org.openmrs.module.appframework.AppStatus;
import org.openmrs.module.appframework.AppUiUtil;
import org.openmrs.module.kenyaemr.MetadataConstants;
import org.openmrs.ui.framework.WebConstants;
import org.openmrs.ui.framework.fragment.FragmentConfiguration;
import org.openmrs.ui.framework.fragment.FragmentModel;
import org.openmrs.ui.framework.page.PageModel;
import org.openmrs.ui.framework.session.Session;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * A thin banner showing which patient this page is in the context of
 */
public class SelectedPatientHeaderFragmentController {

	public void controller(PageModel sharedPageModel,
	                       FragmentConfiguration config,
	                       FragmentModel model,
	                       Session session) {

		Patient patient = (Patient) config.get("patient");
		if (patient == null) {
			patient = (Patient) sharedPageModel.getAttribute("patient");
		}

		model.addAttribute("patient", patient);
		model.addAttribute("activeVisits", Context.getVisitService().getActiveVisitsByPatient(patient));
		
		AppStatus currentApp = AppUiUtil.getCurrentApp(session);
		if (currentApp != null) {
			model.addAttribute("appHomepageUrl", "/" + WebConstants.CONTEXT_PATH + "/" + currentApp.getApp().getHomepageUrl());
		} else {
			model.addAttribute("appHomepageUrl", null);
		}
		
		// TODO: utility to get identifiers besides OpenMRS ID (or get that if it's the only one)
		List<PatientIdentifier> idsToShow = patient.getActiveIdentifiers();
		for (Iterator<PatientIdentifier> i = idsToShow.iterator(); i.hasNext(); ) {
			if (i.next().getIdentifierType().getUuid().equals(MetadataConstants.OPENMRS_ID_UUID)) {
				i.remove();
			}
		}
		if (idsToShow.isEmpty()) {
			idsToShow.add(patient.getPatientIdentifier());
		}
		// TODO: end utility
		model.addAttribute("idsToShow", idsToShow);
	}

}
