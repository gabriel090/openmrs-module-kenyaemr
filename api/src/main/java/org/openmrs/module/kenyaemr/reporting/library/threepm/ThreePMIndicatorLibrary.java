/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.reporting.library.threepm;

import org.openmrs.module.kenyaemr.reporting.library.ETLReports.MOH731Greencard.ETLMoh731GreenCardCohortLibrary;
import org.openmrs.module.kenyaemr.reporting.library.kp.KPMoh731PlusCohortLibrary;
import org.openmrs.module.kenyaemr.reporting.library.kp.KPMonthlyReportCohortLibrary;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.openmrs.module.kenyacore.report.ReportUtils.map;
import static org.openmrs.module.kenyaemr.reporting.EmrReportingUtils.cohortIndicator;

/**
 * Created by dev on 1/14/17.
 */

/**
 * Library of HIV related indicator definitions. All indicators require parameters ${startDate} and ${endDate}
 */
@Component
public class ThreePMIndicatorLibrary {
    @Autowired
    private ETLMoh731GreenCardCohortLibrary moh731Cohorts;
    @Autowired
    private ThreePMCohortLibrary threePMCohorts;
    @Autowired
    private KPMonthlyReportCohortLibrary kpifCohorts;
    @Autowired
    private KPMoh731PlusCohortLibrary kpCohorts;

    public CohortIndicator htsScreenedMobile(Integer department) {
        return cohortIndicator("Number screened",
                map(threePMCohorts.htsScreenedMobile(department), "startDate=${startDate},endDate=${endDate}")
        );
    }
    public CohortIndicator htsTbNewKnownPositive(Integer department) {
        return cohortIndicator("Newly identified positive",
                map(threePMCohorts.htsTbNewKnownPositive(department), "startDate=${startDate},endDate=${endDate}")
        );
    }
    public CohortIndicator htsTbScreenedForTb(Integer department) {
        return cohortIndicator("TB screened",
                map(threePMCohorts.htsTbScreenedForTb(department), "startDate=${startDate},endDate=${endDate}")
        );
    }
    public CohortIndicator htsTBTested(Integer department) {
        return cohortIndicator("TB tested",
                map(threePMCohorts.htsTBTested(department), "startDate=${startDate},endDate=${endDate}")
        );
    }

    public CohortIndicator htsEligibleMobile(Integer department) {
        return cohortIndicator("Eligible for HIV Test",
                map(threePMCohorts.htsEligibleMobile(department), "startDate=${startDate},endDate=${endDate}")
        );
    }
    public CohortIndicator htsEligibleForTbTest(Integer department) {
        return cohortIndicator("Eligible for TB Test",
                map(threePMCohorts.htsEligibleForTbTest(department), "startDate=${startDate},endDate=${endDate}")
        );
    }
    public CohortIndicator knownTbPositive(Integer department) {
        return cohortIndicator("TB Known Positive",
                map(threePMCohorts.knownTbPositive(department), "startDate=${startDate},endDate=${endDate}")
        );
    }

    public CohortIndicator htsScreenedANC1(Integer department) {
        return cohortIndicator("Screened for HIV Test at ANC 1",
                map(threePMCohorts.htsScreenedANC1(department), "startDate=${startDate},endDate=${endDate}")
        );
    }
    public CohortIndicator htsTested(Integer department) {
        return cohortIndicator("Individuals tested", map(threePMCohorts.htsTested(department), "startDate=${startDate},endDate=${endDate}"));
    }

    public CohortIndicator htsKnownPositive(Integer department) {
        return cohortIndicator("Known Positive from HTS mobile screening", map(threePMCohorts.htsKnownPositive(department), "startDate=${startDate},endDate=${endDate}"));
    }
    public CohortIndicator htsNewPositiveMobile(Integer department) {
        return cohortIndicator("Newly tested HIV positive", map(threePMCohorts.htsNewPositiveMobile(department), "startDate=${startDate},endDate=${endDate}"));
    }

    public CohortIndicator htsLinkedToHAARTMobile(Integer department) {
        return cohortIndicator("Linked to care", map(threePMCohorts.htsLinkedToHAARTMobile(department), "startDate=${startDate},endDate=${endDate}"));
    }

    public CohortIndicator firstANCVisitMchmsAntenatal() {
        return cohortIndicator("1st ANC visit clients", map(moh731Cohorts.firstANCVisitMchmsAntenatal(), "startDate=${startDate},endDate=${endDate}"));
    }

    public CohortIndicator knownPositiveAtFirstANC() {
        return cohortIndicator("1st ANC visit clients Known positive", map(moh731Cohorts.knownPositiveAtFirstANC(), "startDate=${startDate},endDate=${endDate}"));
    }
    public CohortIndicator kpCurr() {
        return cohortIndicator("KPV2_Result: Number of KPs currently active in the DICE/Program", map(kpifCohorts.kpCurr(), "startDate=${startDate},endDate=${endDate}"));
    }
    public CohortIndicator currentlyOnARTOnSite(String kpType) {
        return cohortIndicator("KPV2_Result: Number of KPs currently active on ART at the DICE", map(kpifCohorts.currOnARTKP(kpType), "startDate=${startDate},endDate=${endDate}"));
    }
    public CohortIndicator kpCurrOnPrEP(String kpType) {
        return cohortIndicator("KPV2_Result: Number of KPs currently on PrEP", map(kpifCohorts.kpPrepCurrDice(kpType), "startDate=${startDate},endDate=${endDate}"));
    }
    public CohortIndicator kpCurrOnPrEPWithSTI(String kpType) {
        return cohortIndicator("KPV2_Result: Number of KPs currently on PrEP", map(threePMCohorts.kpCurrOnPrEPWithSTI(kpType), "startDate=${startDate},endDate=${endDate}"));
    }
    public CohortIndicator kpCurrentOnARTOffsite(String kpType) {
        return cohortIndicator("KPV2_Result: Number of KPs currently active on ART at other CCC", map(threePMCohorts.kpCurrentOnARTOffsite(kpType), "startDate=${startDate},endDate=${endDate}"));
    }
    public CohortIndicator ppCurrentOnARTOffsite() {
        return cohortIndicator("PP: Number of PP current on ART - Other Facilities", map(threePMCohorts.ppCurrentOnARTOffsite(), "startDate=${startDate},endDate=${endDate}"));
    }

    public CohortIndicator ppCurrentOnARTOnSite() {
        return cohortIndicator("PP: Number of PP current on ART - This PP DICE", map(threePMCohorts.ppCurrentOnARTOnSite(), "startDate=${startDate},endDate=${endDate}"));
    }
}

