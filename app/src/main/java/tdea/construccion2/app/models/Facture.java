package tdea.construccion2.app.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.FactureDto;

@Entity
@Table(name="Factura")
public class Facture { // Clase facturas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id; 

	@Column(name = "mascota")
	private long petsId; 

	@Column(name = "propietario")
	private long ownerId;


	@Column(name = "orderId")
	private int orderId;

	@Column(name="producto")
	private String productName;

	@Column(name="valor")
	private double value;

	@Column(name="cantidad")
	private int quantity;

	@Column(name="fecha")
	private Date date;

	public Facture (FactureDto factureDto ){
		this.id = factureDto.getId();
		this.petsId = factureDto.getPetsId();
		this.ownerId = factureDto.getOwnerId();
		this.productName = factureDto.getProductName();
		this.value = factureDto.getValue();
		this.quantity = factureDto.getQuantity();
		this.date = factureDto.getDate();
	}    

	public Facture () { }

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

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
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
