package tdea.construccion2.app.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.service.LoginService;
import tdea.construccion2.app.validators.PersonValidator;
@Component
public class LoginController {
	private static Scanner reader = new Scanner(System.in);
	@Autowired
	private  PersonValidator personValidator ;
	@Autowired
	private  LoginService loginService ;
	@Autowired
	private  VeterinaryController veterinaryController;
	@Autowired
	private  AdministradorController administradorController;
	@Autowired
	private SellerController sellerController;
	
	
	

	public void login() throws Exception {
		System.out.println("ingrese su usuario");
		String userName = reader.nextLine();
		personValidator.userNameValidator(userName);
		System.out.println("ingrese su contraseña");
		String password = reader.nextLine();
		personValidator.passwordValidator(password);
		PersonDto personDto = new PersonDto(userName, password);
		loginService.login(personDto);
		loginRouter(personDto);
		loginService.logout();
	}

	private void loginRouter(PersonDto personDto) {
	    if (personDto.getRol().equals("Administrador")) {
	        administradorController.sessionAdmin();
	    } else if (personDto.getRol().equals("Veterinario")) {
	        veterinaryController.sessionVet();
	    } else if (personDto.getRol().equals("Vendedor")) {
	    	sellerController.sessionSeller(); 
	    } else {
	        System.out.println("Rol no encontrado en el aplicativo.");
	    }
	}

	public PersonValidator getPersonValidator() {
		return personValidator;
	}

	public void setPersonValidator(PersonValidator personValidator) {
		this.personValidator = personValidator;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public VeterinaryController getVeterinaryController() {
		return veterinaryController;
	}

	public void setVeterinaryController(VeterinaryController veterinaryController) {
		this.veterinaryController = veterinaryController;
	}

	public AdministradorController getAdministradorController() {
		return administradorController;
	}

	public void setAdministradorController(AdministradorController administradorController) {
		this.administradorController = administradorController;
	}

	public SellerController getSellerController() {
		return sellerController;
	}

	public void setSellerController(SellerController sellerController) {
		this.sellerController = sellerController;
	}
	

}
