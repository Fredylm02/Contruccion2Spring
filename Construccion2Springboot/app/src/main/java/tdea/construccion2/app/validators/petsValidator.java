package tdea.construccion2.app.validators;

import org.springframework.stereotype.Component;

@Component
public class petsValidator  extends InputsValidator {
	public void nameValidator (String name) throws Exception {
		super.stringValidator(name, "Nombre de mascota");
	}
	
	public long ownerIdValidator (String ownerIdNumber) throws Exception {
		return super.longValidator(ownerIdNumber, "Id del dueño");
	}
	public int ageValidator (String age) throws Exception {
		return  super.integerValidator(age, " Edad de mascota ");
	}
	
	public long idValidator (String id) throws Exception {
		return super.longValidator(id, " Edad de mascota ");
	}
	public void speciesValidator (String species) throws Exception {
		 super.stringValidator(species, " Especie de mascota ");
	}
	public void breedValidator (String breed) throws Exception {
		 super.stringValidator(breed, " Raza de mascota ");
	}
	public void characteristicsValidator (String characteristics) throws Exception {
		 super.stringValidator(characteristics, " Caracteristica de mascota ");
	}
	public double weightValidator (String weight) throws Exception {
		return super.integerValidator(weight, " Peso de mascota ");
	}
	
}
