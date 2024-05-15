package tdea.construccion2.app.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.service.VeterinaryanService;

@Component
public class InvoiceController {
	
	private static Scanner reader = new Scanner(System.in);
	
	@Autowired
	private VeterinaryanService veterinaryanService;
	
	public void createInvoice () throws Exception{
		
		
	}
}
