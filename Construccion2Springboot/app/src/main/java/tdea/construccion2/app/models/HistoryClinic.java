package tdea.construccion2.app.models;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.HistoryClinicDto;


@Entity
@Table(name="historiaclinica")
public class HistoryClinic {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "fecha")	
private Date registerDate;

@Column(name = "mascota")
private long petsId;
 
@Column(name = "medico")
private long veterinaryMedical;
 
@Column(name = "Motivo")
private String reasonforConsultation; // Razon de consulta
 
@Column(name = "sintomatologia")
private String symptomatology;
 
@Column(name = "diagnostico")
private String diagnostico;
 
@Column(name = "medicamento")
private String medication;
 
@Column(name = "doseofMedication")
private String doseofMedication;


@Column(name = "orden")
private long idOrder;
 
@Column(name = "vaccineHistory")
private String vaccineHistory;
 
@Column(name = "alergia")
private String allergiesMedicines;
 
@Column(name = "detalles_procedimiento")
private String detailProcedure;
 
@Column(name = "ordercancelation")
private boolean annulmentOrder;
 
public HistoryClinic(long petsId, long veterinaryMedical, String reasonforConsultation, String symptomatology,
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



public HistoryClinic (HistoryClinicDto historyClinicDto) {
	this.registerDate=historyClinicDto.getRegisterDate();
	this.petsId= historyClinicDto.getPetsId();
	this.veterinaryMedical= historyClinicDto.getVeterinaryMedical();
	this.reasonforConsultation=historyClinicDto.getReasonforConsultation();
	this.symptomatology=historyClinicDto.getSymptomatology();
	this.diagnostico=historyClinicDto.getDiagnostico();
	this.medication=historyClinicDto.getMedication();
	this.doseofMedication=historyClinicDto.getDoseofMedication();
	this.idOrder= historyClinicDto.getIdOrder();
	this.vaccineHistory=historyClinicDto.getVaccineHistory();
	this.allergiesMedicines=historyClinicDto.getAllergiesMedicines();
	this.detailProcedure=historyClinicDto.getDetailProcedure();
	this.annulmentOrder=historyClinicDto.getAnnulmentOrder();
}

public HistoryClinic() {}
 
public Date getRegisterDate() {
	return registerDate;
}
public void setRegisterDate(Date registerDate) {
	this.registerDate = registerDate;
}
 
public long getPetId() {
    return petsId;
}
 
public void setPetId(long petId) {
    this.petsId = petId;
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
public long getIdorder() {
	return idOrder;
}
public void setIdorder(long Idorder) {
	idOrder = Idorder;
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
