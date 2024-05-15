package tdea.construccion2.app.dto;

import java.sql.Date;


import tdea.construccion2.app.models.HistoryClinic;




public class HistoryClinicDto {
	
private Date registerDate;
private long petsId;
private long veterinaryMedical;
private String reasonforConsultation;
private String symptomatology;
private String diagnostico;
private String medication;
private String doseofMedication;
private long idOrder;
private String vaccineHistory;
private String allergiesMedicines;
private String detailProcedure;
private boolean annulmentOrder;


public HistoryClinicDto(long petsId, long veterinaryMedical, String reasonforConsultation, String symptomatology,
		 String diagnostico, String medication, String doseofMedication, long idOrder,
		String vaccineHistory, String allergiesMedicines, String detailProcedure, boolean annulmentOrder) {
	super();
	this.petsId = petsId;
	this.veterinaryMedical = veterinaryMedical;
	this.reasonforConsultation = reasonforConsultation;
	this.symptomatology = symptomatology;
	this.diagnostico = diagnostico;
	this.medication = medication;
	this.doseofMedication = doseofMedication;
	this.idOrder = idOrder;
	this.vaccineHistory = vaccineHistory;
	this.allergiesMedicines = allergiesMedicines;
	this.detailProcedure = detailProcedure;
	this.annulmentOrder = annulmentOrder;
}

public HistoryClinicDto (HistoryClinic historyClinic) {
	this.registerDate=historyClinic.getRegisterDate();
	this.petsId= historyClinic.getPetId();
	this.veterinaryMedical= historyClinic.getVeterinaryMedical();
	this.reasonforConsultation=historyClinic.getReasonforConsultation();
	this.symptomatology=historyClinic.getSymptomatology();
	this.diagnostico=historyClinic.getDiagnostico();
	this.medication=historyClinic.getMedication();
	this.doseofMedication=historyClinic.getDoseofMedication();
	this.idOrder= historyClinic.getIdorder();
	this.vaccineHistory=historyClinic.getVaccineHistory();
	this.allergiesMedicines=historyClinic.getAllergiesMedicines();
	this.detailProcedure=historyClinic.getDetailProcedure();
	this.annulmentOrder=historyClinic.getAnnulmentOrder();
}


public HistoryClinicDto(long idOrder) {
	this.idOrder = idOrder;
}

public HistoryClinicDto() {}


public Date getRegisterDate() {
	return registerDate;
}
public void setRegisterDate(Date registerDate) {
	this.registerDate = registerDate;
}

public long getPetsId() {
    return petsId;
}

public void setPetsId(Long petsId) {
    this.petsId = petsId;
}

public long getVeterinaryMedical() {
	return veterinaryMedical;
}
public void setVeterinaryMedical(long veterinaryMedical) {
	this.veterinaryMedical = veterinaryMedical;
}
public String getReasonforConsultation() {
	return reasonforConsultation;
}
public void setReasonforConsultation(String reasonforConsultation) {
	this.reasonforConsultation = reasonforConsultation;
}
public String getSymptomatology() {
	return symptomatology;
}
public void setSymptomatology(String symptomatology) {
	this.symptomatology = symptomatology;
}
public String getDiagnostico() {
	return diagnostico;
}
public void setDiagnostico(String diagnostico) {
	this.diagnostico = diagnostico;
}
public String getMedication() {
	return medication;
}
public void setMedication(String medication) {
	this.medication = medication;
}
public String getDoseofMedication() {
	return doseofMedication;
}
public void setDoseofMedication(String doseofMedication) {
	this.doseofMedication = doseofMedication;
}
public long getIdOrder() {
	return idOrder;
}
public void setIdOrder(long idOrder) {
	this.idOrder = idOrder;
}
public String getVaccineHistory() {
	return vaccineHistory;
}
public void setVaccineHistory(String vaccineHistory) {
	this.vaccineHistory = vaccineHistory;
}
public String getAllergiesMedicines() {
	return allergiesMedicines;
}
public void setAllergiesMedicines(String allergiesMedicines) {
	this.allergiesMedicines = allergiesMedicines;
}
public String getDetailProcedure() {
	return detailProcedure;
}
public void setDetailProcedure(String detailProcedure) {
	this.detailProcedure = detailProcedure;
}
public boolean getAnnulmentOrder() {
	return annulmentOrder;
}
public void setAnnulmentOrder(boolean annulmentOrder) {
	this.annulmentOrder = annulmentOrder;
}


}
