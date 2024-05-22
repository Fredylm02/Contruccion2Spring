package tdea.construccion2.app.dto;

import java.sql.Date;

import tdea.construccion2.app.models.Facture;



public class FactureDto {

	private long id; 
	private long petsId; 
	private long ownerId;
	private long orderId;
	private String productName;
	private double value;
	private int quantity;
	private Date date;
	
	public FactureDto (long petsId, long orderId, String productName, double value,  int quantity) {
		this.petsId = petsId;
		this.orderId = orderId;
		this.productName = productName;
		this.value = value;
		this.quantity = quantity;
		this.date =  new Date(System.currentTimeMillis());;
	}

	    public FactureDto (Facture facture){
		this.id = facture.getId();
		this.petsId = facture.getPetsId();
		this.ownerId = facture.getOwnerId();
		this.productName = facture.getProductName();
		this.value = facture.getValue();
		this.quantity = facture.getQuantity();
		this.date = facture.getDate();
	}    


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPetsId() {
		return petsId;
	}
	public void setPetsId(long petsId) {
		this.petsId = petsId;
	}
	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
