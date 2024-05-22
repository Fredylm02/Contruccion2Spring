package tdea.construccion2.app.validators;

import org.springframework.stereotype.Component;

@Component
public class FactureValidator  extends InputsValidator{
	
	 public long IdValidator(String number) throws Exception {
	        return super.longValidator(number, "Numero de la factura: ");
	    }

	    public int orderIdValidator(String orderId) throws Exception {
	        return super.integerValidator(orderId, "Numero de la orden: ");
	    }

	    public void productNameValidador(String productName) throws Exception {
	        super.stringValidator(productName, "Nombre del producto: ");
	    }

	    public double valueValidator(String value ) throws Exception {
	        return super.doubleValidator(value, "Valor de producto: ");
	    }

	    public int quantityValidator(String quantity) throws Exception {
	        return super.integerValidator(quantity, "Cantidad de producto: ");
	    }
	    
}
