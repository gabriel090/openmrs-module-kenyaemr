/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.reporting.builder.mchms;

import org.openmrs.PatientIdentifierType;
import org.openmrs.PersonAttributeType;
import org.openmrs.module.kenyacore.report.HybridReportDescriptor;
import org.openmrs.module.kenyacore.report.ReportDescriptor;
import org.openmrs.module.kenyacore.report.ReportUtils;
import org.openmrs.module.kenyacore.report.builder.AbstractHybridReportBuilder;
import org.openmrs.module.kenyacore.report.builder.Builds;
import org.openmrs.module.kenyaemr.metadata.CommonMetadata;
import org.openmrs.module.kenyaemr.metadata.HivMetadata;
import org.openmrs.module.kenyaemr.reporting.ColumnParameters;
import org.openmrs.module.kenyaemr.reporting.EmrReportingUtils;
import org.openmrs.module.kenyaemr.reporting.cohort.definition.MaternityRegisterCohortDefinition;
import org.openmrs.module.kenyaemr.reporting.data.converter.definition.*;
import org.openmrs.module.kenyaemr.reporting.data.converter.definition.maternity.*;
import org.openmrs.module.kenyaemr.reporting.library.pmtct.PMTCTIndicatorLibrary;
import org.openmrs.module.metadatadeploy.MetadataUtils;
import org.openmrs.module.reporting.cohort.definition.CohortDefinition;
import org.openmrs.module.reporting.data.DataDefinition;
import org.openmrs.module.reporting.data.converter.BirthdateConverter;
import org.openmrs.module.reporting.data.converter.DataConverter;
import org.openmrs.module.reporting.data.converter.DateConverter;
import org.openmrs.module.reporting.data.converter.ObjectFormatter;
import org.openmrs.module.reporting.data.patient.definition.ConvertedPatientDataDefinition;
import org.openmrs.module.reporting.data.patient.definition.PatientIdentifierDataDefinition;
import org.openmrs.module.reporting.data.person.definition.*;
import org.openmrs.module.reporting.dataset.definition.CohortIndicatorDataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reporting.dataset.definition.PatientDataSetDefinition;
import org.openmrs.module.reporting.evaluation.parameter.Mapped;
import org.openmrs.module.reporting.evaluation.parameter.Parameter;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Component
@Builds({"kenyaemr.mchcs.report.maternityRegister"})
public class MaternityRegisterReportBuilder extends AbstractHybridReportBuilder {
	public static final String DATE_FORMAT = "dd/MM/yyyy";

	@Autowired
	PMTCTIndicatorLibrary pmtctMATIndicators;
	@Autowired
	private PMTCTIndicatorLibrary pmtctIndicators;

	@Override
	protected Mapped<CohortDefinition> buildCohort(HybridReportDescriptor descriptor, PatientDataSetDefinition dsd) {dsd.setName("maternityRegister");
		return allPatientsCohort();
	}

    protected Mapped<CohortDefinition> allPatientsCohort() {
        CohortDefinition cd = new MaternityRegisterCohortDefinition();
		cd.addParameter(new Parameter("startDate", "Start Date", Date.class));
		cd.addParameter(new Parameter("endDate", "End Date", Date.class));
		return ReportUtils.map(cd, "startDate=${startDate},endDate=${endDate}");
    }

    @Override
    protected List<Mapped<DataSetDefinition>> buildDataSets(ReportDescriptor descriptor, ReportDefinition report) {

        PatientDataSetDefinition allPatients = maternityDataSetDefinition();
        allPatients.addRowFilter(allPatientsCohort());
		//allPatients.addRowFilter(buildCohort(descriptor));
        DataSetDefinition allPatientsDSD = allPatients;


        return Arrays.asList(
                ReportUtils.map(allPatientsDSD, "startDate=${startDate},endDate=${endDate}"),
				ReportUtils.map(maternityDataSet(), "")
        );
    }

	@Override
	protected List<Parameter> getParameters(ReportDescriptor reportDescriptor) {
		return Arrays.asList(
				new Parameter("startDate", "Start Date", Date.class),
				new Parameter("endDate", "End Date", Date.class),
				new Parameter("dateBasedReporting", "", String.class)
		);
	}

	protected PatientDataSetDefinition maternityDataSetDefinition() {

		PatientDataSetDefinition dsd = new PatientDataSetDefinition("maternityAllClients");
		dsd.addParameter(new Parameter("startDate", "Start Date", Date.class));
		dsd.addParameter(new Parameter("endDate", "End Date", Date.class));
		PatientIdentifierType upn = MetadataUtils.existing(PatientIdentifierType.class, HivMetadata._PatientIdentifierType.UNIQUE_PATIENT_NUMBER);
		DataConverter identifierFormatter = new ObjectFormatter("{identifier}");
		DataDefinition identifierDef = new ConvertedPatientDataDefinition("identifier", new PatientIdentifierDataDefinition(upn.getName(), upn), identifierFormatter);

		DataConverter nameFormatter = new ObjectFormatter("{familyName}, {givenName}");
		DataDefinition nameDef = new ConvertedPersonDataDefinition("name", new PreferredNameDataDefinition(), nameFormatter);
		PersonAttributeType phoneNumber = MetadataUtils.existing(PersonAttributeType.class, CommonMetadata._PersonAttributeType.TELEPHONE_CONTACT);
		dsd.addColumn("id", new PersonIdDataDefinition(), "");

		dsd.addColumn("Unique Patient No", identifierDef, "");
		dsd.addColumn("Sex", new GenderDataDefinition(), "");
		// new columns
		dsd.addColumn("Admission Number", new MaternityAdmissionNumberDataDefinition(),"");
		dsd.addColumn("Date of Admission", new MaternityAdmissionDateDataDefinition(),"", new DateConverter(DATE_FORMAT));
		dsd.addColumn("Number of ANC Visits", new MaternityNumberOfANCVisitsDataDefinition(),"");
		dsd.addColumn("Name", nameDef, "");
		dsd.addColumn("Telephone No", new PersonAttributeDataDefinition(phoneNumber), "");
		dsd.addColumn("Date of Birth", new BirthdateDataDefinition(), "", new BirthdateConverter(DATE_FORMAT));
		dsd.addColumn("Age", new AgeDataDefinition(), "");
		dsd.addColumn("Marital Status", new KenyaEMRMaritalStatusDataDefinition(), "");
		dsd.addColumn("Parity", new MaternityANCParityDataDefinition(),"");
		dsd.addColumn("Gravida", new MaternityGravidaDataDefinition(),"");
		dsd.addColumn("LMP", new MaternityLMPDateDataDefinition(),"", new DateConverter(DATE_FORMAT));
		dsd.addColumn("Ultra Sound", new MaternityEDDUltrasoundDateDataDefinition(),"", new DateConverter(DATE_FORMAT));
		dsd.addColumn("Diagnosis", new MaternityDiagnosisDataDefinition(),"");
		dsd.addColumn("Duration of Labour", new MaternityDurationOfLabourDataDefinition(),"");
		dsd.addColumn("Delivery Date", new MaternityDeliveryDateDataDefinition(),"",new DateConverter(DATE_FORMAT));
		dsd.addColumn("Delivery Time", new MaternityDeliveryTimeDataDefinition(),"");
		dsd.addColumn("Gestation at Birth in weeks", new MaternityGestationAtBirthDataDefinition(),"");
		dsd.addColumn("Mode of Delivery", new MaternityDeliveryModeDataDefinition(),"");
		dsd.addColumn("Placenta Complete", new MaternityPlacentaCompleteDataDefinition(),"");
		dsd.addColumn("Uterotonic given", new MaternityUterotonicGivenDataDefinition(),"");
		dsd.addColumn("Vaginal Examination", new MaternityVaginalExaminationDataDefinition(),"");
		dsd.addColumn("Blood Loss", new MaternityBloodLossDataDefinition(),"");
		dsd.addColumn("Condition after delivery", new MaternityConditionAfterDeliveryDataDefinition(),"");
		dsd.addColumn("Deaths Audited", new MaternityDeathAuditedDataDefinition(),"");
		dsd.addColumn("Other Delivery Complications", new MaternityOtherDeliveryComplicationsDataDefinition(),"");
		dsd.addColumn("Baby Sex", new MaternityBabySexDataDefinition(),"");
		dsd.addColumn("Birth weight", new MaternityBirthWeightDataDefinition(),"");
		dsd.addColumn("Baby Condition", new MaternityBabyConditionDataDefinition(),"");
		dsd.addColumn("Initiated BF <1 Hr", new MaternityInitiatedBFWithinOneHourDataDefinition(),"");
		dsd.addColumn("Kangaroo Mother care given", new MaternityKangarooMotherCareGivenDataDefinition(),"");
		dsd.addColumn("TEO Given at Birth", new MaternityTEOGivenAtBirthDataDefinition(),"");
		dsd.addColumn("Chlorhexidine applied on cord stump", new MaternityTEOGivenAtBirthDataDefinition(),"");
		dsd.addColumn("Baby with deformity", new MaternityBabyWithDeformityDataDefinition(),"");
		dsd.addColumn("Given Vitamin K", new MaternityGivenVitaminKDataDefinition(),"");
		dsd.addColumn("APGAR Score", new MaternityApgarScoreDataDefinition(),"");
		dsd.addColumn("VDRL/RPR Results", new MaternityVDRLRPRResultsDataDefinition(),"");
		dsd.addColumn("HIV Status at ANC", new MaternityHIVStatusAtANCDataDefinition(),"");
		dsd.addColumn("HIV Test One", new MaternityHIVTestOneDataDefinition(),"");
		dsd.addColumn("HIV Test Two", new MaternityHIVTestTwoDataDefinition(),"");
		dsd.addColumn("HIV Final Results", new MaternityHIVFinalResultsDataDefinition(),"");
		dsd.addColumn("ARV Prophylaxis Issued from ANC", new MaternityARVProphylaxisIssuedFromANCDataDefinition(),"");
		dsd.addColumn("ARV Prophylaxis Issued at Maternity", new MaternityARVProphylaxisIssuedAtMaternityDataDefinition(),"");
		dsd.addColumn("ARV Prophylaxis To Baby in Maternity", new MaternityARVProphylaxisToBabyAtMaternityDataDefinition(),"");
		dsd.addColumn("CTX To Mother", new MaternityCTXToMotherDataDefinition(),"");
		dsd.addColumn("Vitamin A", new MaternityVitaminADataDefinition(),"");
		dsd.addColumn("Partner Tested For HIV", new MaternityPartnerTestedForHIVDataDefinition(),"");
		dsd.addColumn("Partner HIV Test Results", new MaternityPartnerHIVTestResultsDataDefinition(),"");
		dsd.addColumn("Counselled on Infant Feeding", new MaternityCounselledOnInfantFeedingDataDefinition(),"");
		dsd.addColumn("Delivery Conducted by", new MaternityDeliveryConductedByDataDefinition(),"");
		dsd.addColumn("Birth Notification Number", new MaternityBirthNotificationNumberDataDefinition(),"");
		dsd.addColumn("Discharged Date", new MaternityDischargeDateDataDefinition(),"");
		dsd.addColumn("Status of Baby at Discharge", new MaternityStatusOfBabyDataDefinition(),"");
		dsd.addColumn("Referred From", new MaternityReferredFromDataDefinition(),"");
		dsd.addColumn("Referred To", new MaternityReferredToDataDefinition(),"");
		dsd.addColumn("Reasons for referral", new MaternityReasonForReferralDataDefinition(),"");
		dsd.addColumn("Comments", new MaternityCommentsDataDefinition(),"");

		return dsd;
	}

	protected DataSetDefinition maternityDataSet() {
		CohortIndicatorDataSetDefinition cohortDsd = new CohortIndicatorDataSetDefinition();
		cohortDsd.setName("cohortIndicator");
		cohortDsd.addParameter(new Parameter("startDate", "Start Date", Date.class));
		cohortDsd.addParameter(new Parameter("endDate", "End Date", Date.class));
		ColumnParameters colTotal = new ColumnParameters(null, "Total", "");
		ColumnParameters f10_to14 = new ColumnParameters(null, "10-14, Female", "gender=F|age=10-14");
		ColumnParameters f15_to19 = new ColumnParameters(null, "15-19, Female", "gender=F|age=15-19");
		ColumnParameters f10_to19 = new ColumnParameters(null, "10-19, Female", "gender=F|age=10-19");
		ColumnParameters f20_to24 = new ColumnParameters(null, "20-24, Female", "gender=F|age=20-24");
		ColumnParameters fAbove25 = new ColumnParameters(null, "25+, Female", "gender=F|age=25+");

		List<ColumnParameters>  maternityAgeDisaggregation = Arrays.asList(f10_to14, f15_to19, f20_to24, fAbove25,colTotal);
		List<ColumnParameters>  maternityAdolescentsAgeDisaggregation = Arrays.asList(f10_to19,colTotal);
		String indParams = "startDate=${startDate},endDate=${endDate}";

		EmrReportingUtils.addRow(cohortDsd, "Maternity clients", "", ReportUtils.map(pmtctIndicators.maternityClients(), indParams), maternityAgeDisaggregation, Arrays.asList("01", "02", "03", "04", "05"));
		cohortDsd.addColumn("clientsWithAPH", "Clients With APH", ReportUtils.map(pmtctMATIndicators.clientsWithAPH(), indParams), "");
        cohortDsd.addColumn("clientsWithPPH", "Clients With PPH", ReportUtils.map(pmtctMATIndicators.clientsWithPPH(), indParams), "");
        cohortDsd.addColumn("clientsWithEclampsia", "Clients With Eclampsia", ReportUtils.map(pmtctMATIndicators.clientsWithEclampsia(), indParams), "");
        cohortDsd.addColumn("clientsWithRapturedUterus", "Clients With Raptured Uterus", ReportUtils.map(pmtctMATIndicators.clientsWithRapturedUterus(), indParams), "");
        cohortDsd.addColumn("clientsWithObstructedLabour", "Clients With Obstructed Labour", ReportUtils.map(pmtctMATIndicators.clientsWithObstructedLabour(), indParams), "");
        cohortDsd.addColumn("clientsWithSepsis", "Clients With Sepsis", ReportUtils.map(pmtctMATIndicators.clientsWithSepsis(), indParams), "");
        cohortDsd.addColumn("clientsAlive", "Clients Alive", ReportUtils.map(pmtctMATIndicators.clientsAlive(), indParams), "");
        cohortDsd.addColumn("clientsDead", "Clients Dead", ReportUtils.map(pmtctMATIndicators.clientsDead(), indParams), "");
        cohortDsd.addColumn("preTermBabies", "Pre-term Babies", ReportUtils.map(pmtctMATIndicators.preTermBabies(), indParams), "");
        cohortDsd.addColumn("underWeightBabies", "Underweight Babies", ReportUtils.map(pmtctMATIndicators.underWeightBabies(), indParams), "");
        cohortDsd.addColumn("liveBirths", "Live Births", ReportUtils.map(pmtctMATIndicators.liveBirths(), indParams), "");
        cohortDsd.addColumn("stillBirths", "Still Births", ReportUtils.map(pmtctMATIndicators.stillBirths(), indParams), "");
        cohortDsd.addColumn("initialTestAtMaternity", "Initial Test At Maternity", ReportUtils.map(pmtctMATIndicators.initialTestAtMaternity(), indParams), "");
        cohortDsd.addColumn("positiveResultsAtMaternity", "HIV Positive Results at Maternity", ReportUtils.map(pmtctMATIndicators.positiveResultsAtMaternity(), indParams), "");
        cohortDsd.addColumn("hivPositiveDeliveries", "HIV Positive Deliveries", ReportUtils.map(pmtctMATIndicators.hivPositiveDeliveries(), indParams), "");
        cohortDsd.addColumn("adolescentsNewHivPositiveAtMaternity", "HIV Positive new Adolescents at Maternity", ReportUtils.map(pmtctMATIndicators.adolescentsNewHivPositiveAtMaternity(), indParams), "");
        cohortDsd.addColumn("startedHAARTMaternity", "Started HAART at Maternity", ReportUtils.map(pmtctMATIndicators.startedHAARTMaternity(), indParams), "");
        cohortDsd.addColumn("infantARVProphylaxisMaternity", "Given Infant ARV Prophylaxis Maternity", ReportUtils.map(pmtctMATIndicators.infantARVProphylaxisMaternity(), indParams), "");
        cohortDsd.addColumn("normalDeliveries", "Normal Deliveries", ReportUtils.map(pmtctMATIndicators.normalDeliveries(), indParams), "");
        cohortDsd.addColumn("caesareanSections", "Caesarean Sections", ReportUtils.map(pmtctMATIndicators.caesareanSections(), indParams), "");
        cohortDsd.addColumn("breechDeliveries", "Breech Deliveries", ReportUtils.map(pmtctMATIndicators.breechDeliveries(), indParams), "");
        cohortDsd.addColumn("assistedVaginalDeliveries", "Assisted Vaginal Deliveries", ReportUtils.map(pmtctMATIndicators.assistedVaginalDeliveries(), indParams), "");
        cohortDsd.addColumn("uterotonicGiven", "Uterotonic Given", ReportUtils.map(pmtctMATIndicators.uterotonicGiven(), indParams), "");
        cohortDsd.addColumn("carbetocin", "Carbetocin", ReportUtils.map(pmtctMATIndicators.carbetocin(), indParams), "");
        cohortDsd.addColumn("oxytocin", "Oxytocin", ReportUtils.map(pmtctMATIndicators.oxytocin(), indParams), "");
		cohortDsd.addColumn("deformity", "Deformity", ReportUtils.map(pmtctMATIndicators.deformity(), indParams), "");
		cohortDsd.addColumn("maceratedStillbirth", "Macerated Stillbirth", ReportUtils.map(pmtctMATIndicators.maceratedStillbirth(), indParams), "");
		cohortDsd.addColumn("apgar", "Apgar", ReportUtils.map(pmtctMATIndicators.lowApgar(), indParams), "");
		cohortDsd.addColumn("deaths10to14Years", "Maternal deaths 10-14Years", ReportUtils.map(pmtctMATIndicators.deaths10to14Years(), indParams), "");
		cohortDsd.addColumn("deaths15to19Years", "Maternal deaths 15-19Years", ReportUtils.map(pmtctMATIndicators.deaths15to19Years(), indParams), "");
		cohortDsd.addColumn("deaths20toplus", "Maternal deaths 20 years plus", ReportUtils.map(pmtctMATIndicators.deaths20toplus(), indParams), "");
		cohortDsd.addColumn("deathAudited", "Maternal death audited", ReportUtils.map(pmtctMATIndicators.deathAudited(), indParams), "");
		cohortDsd.addColumn("appliedChlorhexidine", "Babies applied chlorhexidine for cord care", ReportUtils.map(pmtctMATIndicators.appliedChlorhexidine(), indParams), "");
		cohortDsd.addColumn("givenTetracycline", "Babies given tetracycline at birth", ReportUtils.map(pmtctMATIndicators.givenTetracycline(), indParams), "");
		cohortDsd.addColumn("infantsIntiatiedOnBreastfeeding", "Infants intiatied on breastfeeding within 1 hour after birth", ReportUtils.map(pmtctMATIndicators.infantsIntiatiedOnBreastfeeding(), indParams), "");
		cohortDsd.addColumn("vitaminK", "Vitamin K given ", ReportUtils.map(pmtctMATIndicators.vitaminK(), indParams), "");
		cohortDsd.addColumn("startedHaart10to19", "Adolescents (10-19 yrs) Started HAART maternity", ReportUtils.map(pmtctMATIndicators.startedHaart10to19(), indParams), "");



		return cohortDsd;
	}
}

