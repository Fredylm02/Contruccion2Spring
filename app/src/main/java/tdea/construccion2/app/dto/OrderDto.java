package tdea.construccion2.app.dto;

import java.sql.Date;

import tdea.construccion2.app.models.Order;



public class OrderDto {

    private long orderId;
    private long petId;
    private long ownerID;
    private long veterinarianID;
    private String medicationName;
    private String dosage;
    private Date generationDate;

    public OrderDto(Order order) {
    	this.orderId = order.getOrderId();
    	this.petId = order.getPetId();
    	this.ownerID = order.getOwnerID();
    	this.veterinarianID = order.getVeterinarianID();
    	this.medicationName = order.getMedicationName();
    	this.dosage = order.getDosage();
        this.generationDate = getGenerationDate();
    }
    
    

    public OrderDto(long petId, long ownerID, long veterinarianID, String medicationName, String dosage,
			Date generationDate) {
		super();
		this.petId = petId;
		this.ownerID = ownerID;
		this.veterinarianID = veterinarianID;
		this.medicationName = medicationName;
		this.dosage = dosage;
		this.generationDate = generationDate;
	}



	public Date getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(Date generationDate) {
        this.generationDate = generationDate;
    }

    
    public OrderDto(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(long ownerID) {
        this.ownerID = ownerID;
    }

    public long getVeterinarianID() {
        return veterinarianID;
    }

    public void setVeterinarianID(long veterinarianID) {
        this.veterinarianID = veterinarianID;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    
}
