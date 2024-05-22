package tdea.construccion2.app.controller;


import java.sql.Date;
import java.util.Scanner;

import tdea.construccion2.app.dto.FactureDto;
import tdea.construccion2.app.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tdea.construccion2.app.models.Order;
import tdea.construccion2.app.models.Person;
import tdea.construccion2.app.models.Pets;



import tdea.construccion2.app.service.VeterinaryanService;
import tdea.construccion2.app.validators.FactureValidator;
import tdea.construccion2.app.validators.HistoryClinicValidator;
import tdea.construccion2.app.validators.OrderValidator;
import tdea.construccion2.app.validators.PersonValidator;
import tdea.construccion2.app.validators.petsValidator;

@Component
public class SellerController  {
	
	private static Scanner reader = new Scanner(System.in);
	
	@Autowired
	private VeterinaryanService veterinaryanService;
	@Autowired
	private petsValidator petsValidator;
	@Autowired
	private OrderValidator orderValidator;
	@Autowired
	private FactureValidator factureValidator;
	private static final String MENUSELLER = "ingrese\n1.Venta de medicamentos \n2.Para cerrar Sesion";
	


    public void sellProducts() throws Exception {
    

        System.out.println("Ingrese el ID de la mascota:");
    	long petsId = petsValidator.idValidator(reader.nextLine());

        System.out.println("Ingrese el ID orden:");
        long orderId = orderValidator.orderIdValidator(reader.nextLine());

        System.out.println("Ingrese Producto ( Medicamentos):");
        String productName  = reader.nextLine();
		factureValidator.productNameValidador(productName);

        System.out.println("Ingrese El valor: ");
    	double value = factureValidator.valueValidator(reader.nextLine());

        System.out.println("Ingrese la cantidad:");
        int quantity = factureValidator.quantityValidator(reader.nextLine());
        
        veterinaryanService.CreateFacture(new FactureDto(petsId, orderId, productName, value, quantity));
  
	}
    
	public  void sessionSeller() {
		boolean runApp = true;
		while (runApp) {
			try {
				System.out.println(MENUSELLER);
				String option = reader.nextLine();
				runApp=MENUSELLER(option);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
	
	private  boolean MENUSELLER(String option) throws Exception{
		switch (option) {
		case "1":{
			sellProducts();
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
        
    }

