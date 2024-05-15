package tdea.construccion2.app.validators;

import org.springframework.stereotype.Component;

@Component
public class HistoryClinicValidator extends InputsValidator {
	
	public Long petsIdValidator (String  petsId) throws Exception {
		return super.longValidator(petsId, "ID mascota");
	}
	
	public void veterinaryMedicalValidator (String veterinaryMedical) throws Exception {
		super.stringValidator(veterinaryMedical, "Nombre de mascota");
	}
	
	public void reasonforConsultationValidator (String reasonforConsultation) throws Exception {
		super.stringValidator(reasonforConsultation, "Nombre de mascota");
	}
	
	public void symptomatologyValidator (String symptomatology) throws Exception {
		super.stringValidator(symptomatology, "Nombre de mascota");
	}
	
	
	public void diagnosticoValidator (String diagnostico) throws Exception {
		super.stringValidator(diagnostico, "Nombre de mascota");
	}
	
	public void medicationValidator (String medication) throws Exception {
		super.stringValidator(medication, "Nombre de mascota");
	}
	
	public void doseofMedicationValidator (String doseofMedication) throws Exception {
		super.stringValidator(doseofMedication, "Nombre de mascota");
	}
	
	public int IdorderValidator (String Idorder) throws Exception {
		return  super.integerValidator(Idorder, " Edad de mascota ");
	}
	
	public void vaccineHistoryValidator (String vaccineHistory) throws Exception {
		super.stringValidator(vaccineHistory, "Nombre de mascota");
	}
	
	public void allergiesMedicinesValidator (String allergiesMedicines) throws Exception {
		super.stringValidator(allergiesMedicines, "Nombre de mascota");
	}
	
	public void detailProcedureValidator (String detailProcedure) throws Exception {
		super.stringValidator(detailProcedure, "Nombre de mascota");
	}
	
	public double annulmentOrderValidator (String annulmentOrder) throws Exception {
		return super.doubleValidator(annulmentOrder, "Nombre de mascota");
	}
}
