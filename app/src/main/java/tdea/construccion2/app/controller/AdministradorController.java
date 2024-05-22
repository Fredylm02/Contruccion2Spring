package tdea.construccion2.app.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.service.AdminService;
import tdea.construccion2.app.validators.PersonValidator;

@Component
public class AdministradorController {
	private static Scanner reader = new Scanner(System.in);
	

	public VeterinaryController veterinaryController ;
	
	@Autowired
	private  PersonValidator personValidator;
	
	@Autowired
	private  AdminService  adminService;
	
	private static final String MENUADMIN = "ingrese\n1.Para crear usuario \n2.Para cerrar Sesion";

	public  void createUser() throws Exception {
	    System.out.println(" Ingrese el nombre completo ");
	    String fullName = reader.nextLine();
	    personValidator.fullNameValidator(fullName);
	    
	    System.out.println(" Ingrese la cedula del usuario ");
	    Long id = personValidator.idValidator(reader.nextLine());
	    
	    System.out.println(" Ingrese la edad del ususario ");
	    int age = personValidator.ageValidator(reader.nextLine());
	    
	    System.out.println(" Ingrese el rol de ususario ");
	    String rol = reader.nextLine();
	    personValidator.fullNameValidator(rol);
	    
	    System.out.println(" Ingrese el nombre de ususario ");
	    String userName = reader.nextLine();
	    personValidator.fullNameValidator(userName);
	    
	    System.out.println(" Ingrese la contraseña de ususario ");
	    String password = reader.nextLine();
	    personValidator.fullNameValidator(password);
	    
	    PersonDto personDto = new PersonDto(id, fullName, age, rol, userName, password);
	    System.out.println(" Se cumplieron todas las validaciones ");
	    adminService.createUser(personDto);
	}
	
	public  void sessionAdmin() {
		boolean runApp = true;
		while (runApp) {
			try {
				System.out.println(MENUADMIN);
				String option = reader.nextLine();
				runApp=MENUADMIN(option);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
	
	private  boolean MENUADMIN(String option) throws Exception{
		switch (option) {
		case "1":{
		//	MYSQLConnection  con = new MYSQLConnection();
			createUser();
			return true;
		}
		case "2": {
	
			return false;
		}
		
		default :{
			System.out.println("ingrese una opcion valida");
			return true;
		}
		}
	}


	public PersonValidator getPersonValidator() {
		return personValidator;
	}


	public void setPersonValidator(PersonValidator personValidator) {
		this.personValidator = personValidator;
	}


	public AdminService getAdminService() {
		return adminService;
	}


	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}


	public VeterinaryController getVeterinaryController() {
		return veterinaryController;
	}


	public void setVeterinaryController(VeterinaryController veterinaryController) {
		this.veterinaryController = veterinaryController;
	}


	
}
