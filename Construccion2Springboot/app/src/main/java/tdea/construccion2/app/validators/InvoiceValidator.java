package tdea.construccion2.app.validators;

import org.springframework.stereotype.Component;

@Component
public class InvoiceValidator  extends InputsValidator{
	
	 public long invoiceIdValidator(String number) throws Exception {
	        return super.longValidator(number, "Numero de la factura: ");
	    }

	    public long orderIdValidator(String orderId) throws Exception {
	        return super.longValidator(orderId, "Numero de la orden: ");
	    }

	    public void productNameValidador(String productName) throws Exception {
	        super.stringValidator(productName, "Nombre del producto: ");
	    }

	    public double valueValidator(String number, String element) throws Exception {
	        return super.doubleValidator(number, "Valor de producto: ");
	    }

	    public long quantityValidator(String number) throws Exception {
	        return super.longValidator(number, "Cantidad de producto: ");
	    }
	    
}
