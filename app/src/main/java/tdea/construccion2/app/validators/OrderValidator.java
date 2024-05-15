package tdea.construccion2.app.validators;

import org.springframework.stereotype.Component;

@Component
public class OrderValidator extends InputsValidator {
	public long orderIdValidator (String orderId) throws Exception {
		return super.longValidator(orderId, "Numero de orden: ");
	}
	
	public long petIdValidator (String petId) throws Exception {
		return super.longValidator(petId, "ID mascota: ");
	}
	
	 public void medicationNameValidador(String medicationName) throws Exception {
	        super.stringValidator(medicationName, "Nombre del medicamento: ");
	}
	 
   public void dosageValidador(String dosage) throws Exception {
	        super.stringValidator(dosage, "Dosis del medicamento: ");
    }
	
   public double generationDateValidator(String generationDate) throws Exception{
		 return super.doubleValidator(generationDate, "Fecha incorrecta");
	}
}
