package tdea.construccion2.app.dto;

import java.sql.Date;

public class InvoiceDto {
    private long invoiceId;
    private PetsDto petsId;
    private PersonDto ownerId;
    private int orderId;
    private String productName;
    private double value;
    private int quantity;
    private Date date;
    
    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public PetsDto getPetsId() {
        return petsId;
    }

    public void setPetsId(PetsDto petsId) {
        this.petsId = petsId;
    }

    public PersonDto getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(PersonDto ownerId) {
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
