package tdea.construccion2.app.validators;

import org.springframework.stereotype.Component;

@Component
public  class PersonValidator  extends InputsValidator{
	
public void fullNameValidator (String fullName) throws Exception {
	super.stringValidator(fullName, "Nombre de usuario");
}

public long idValidator (String number) throws Exception {
	return super.longValidator(number, "Id del usuario");
}
public int ageValidator (String age) throws Exception {
	return super.integerValidator(age, "Edad del usuario");
}
public void rollValidator (String rol) throws Exception {
	 super.stringValidator(rol, "roll del usuario");
}
public void userNameValidator (String userName) throws Exception {
	 super.stringValidator(userName, "usuario");
}
public void passwordValidator (String password) throws Exception {
	 super.stringValidator(password, "Contraseña de usuario");
}
}
