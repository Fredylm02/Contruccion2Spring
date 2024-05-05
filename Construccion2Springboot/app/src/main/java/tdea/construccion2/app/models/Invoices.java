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
import tdea.construccion2.app.dto.InvoiceDto;


@Entity
@Table(name="Invoices")
public class Invoices { // Clase facturas
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private long invoiceId; 
	    
	    @ManyToOne
	    @JoinColumn(name = "mascota")
	    private Pets petsId; 
	    
	    @ManyToOne
	    @JoinColumn(name = "propietario")
	    private Person ownerId;
	    
	    @ManyToOne
	    @JoinColumn(name = "orderId")
	    private Order orderId;
	    
	    @Column(name="productName")
	    private String productName;
	    
	    @Column(name="valor")
	    private double value;
	    
	    @Column(name="cantidad")
	    private int quantity;
	    
	    @Column(name="date")
	    private Date date;
	    
	    public Invoices(InvoiceDto invoiceDto){
			this.invoiceId = invoiceDto.getInvoiceId();
			this.petsId = new Pets(invoiceDto.getPetsId());
			this.ownerId = new Person(invoiceDto.getOwnerId());
			this.productName = invoiceDto.getProductName();
			this.value = invoiceDto.getValue();
			this.quantity = invoiceDto.getQuantity();
			this.date = invoiceDto.getDate();
		}
	    
		public Long getInvoiceId() {
			return invoiceId;
		}
		public void setInvoiceId(int invoiceId) {
			this.invoiceId = invoiceId;
		}
		public Pets getPetId() {
			return petsId;
		}
		public void setPetId(Pets petId) {
			 this.petsId = petId;
		}
		public Person getOwnerId() {
			return ownerId;
		}
		public void setOwnerId(Person ownerId) {
			this.ownerId = ownerId;
		}
		public Order getOrderId() {
			return orderId;
		}
		public void setOrderId(Order orderId) {
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
