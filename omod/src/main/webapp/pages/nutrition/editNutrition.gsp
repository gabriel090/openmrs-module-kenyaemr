<%
	ui.decorateWith("kenyaemr", "standardPage")
%>
<div class="ke-page-content">
	${ ui.includeFragment("kenyaemr", "nutrition/editNutrition", [ patient: currentPatient, returnUrl: returnUrl ]) }
</div>