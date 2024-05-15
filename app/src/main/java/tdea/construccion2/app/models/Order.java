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
import tdea.construccion2.app.dto.OrderDto;


@Entity
@Table(name="orden")
public class Order {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private long orderId;
	    
	 
	    @Column(name = "Mascota")
	    private long petId;
	    

	    @Column(name = "propietario")
	    private long ownerID;
	    
	  
	    @Column(name = "medico")
	    private long veterinarianID;
	    
	   
	    @Column(name = "medicamento")
	    private String medicationName;
	    

	    @Column(name = "dosis")
	    private String dosage;
	    

	    @Column(name = "fecha")
	    private Date generationDate = new Date(System.currentTimeMillis());
	    
	   
	    
	    public Order(OrderDto orderDto){
			this.orderId = orderDto.getOrderId();
			this.petId = orderDto.getPetId(); 
			this.ownerID = orderDto.getOwnerID(); 
			this.veterinarianID = orderDto.getVeterinarianID();
			this.medicationName = orderDto.getMedicationName();
			this.dosage = orderDto.getDosage();
		 	this.generationDate = orderDto.getGenerationDate();
		}

            public Order(long petId, long ownerID, long veterinarianID, String medicationName, String dosage) {
                this.petId = petId;
                this.ownerID = ownerID;
                this.veterinarianID = veterinarianID;
                this.medicationName = medicationName;
                this.dosage = dosage;
            }
            
            
		
            public Order() {}
		
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

	    public Date getGenerationDate() {
	        return generationDate;
	    }

	    public void setGenerationDate(Date generationDate) {
	        this.generationDate = generationDate;
	    }
}
