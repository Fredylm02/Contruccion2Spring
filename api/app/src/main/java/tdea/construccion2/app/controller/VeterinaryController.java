package tdea.construccion2.app.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.dto.HistoryClinicDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PetsDto;
import tdea.construccion2.app.service.VeterinaryanService;
import tdea.construccion2.app.validators.HistoryClinicValidator;
import tdea.construccion2.app.validators.OrderValidator;
import tdea.construccion2.app.validators.petsValidator;

@Component
public class VeterinaryController {
	private static Scanner reader = new Scanner(System.in);
	@Autowired
	private petsValidator petsValidator;
	@Autowired
	private HistoryClinicValidator historyClinicValidator;
	@Autowired
	private VeterinaryanService veterinaryanService;
	@Autowired
	private OrderValidator orderValidator;



	private static final String MENUVET = "ingrese\n1.Para crear mascota \n2. Para crear historia clinica \n3.Para buscar historia clinica "
			+ "\n4.Buscar la orden \n5.Para cancelar orden  \n6.Para cerrar Sesion";

	// Crear mascota

	public void createPets() throws Exception {
		/*
		 * System.out.println(" Ingrese el id de la mascota "); Long idPets =
		 * petsValidator.idValidator(reader.nextLine());
		 */

		System.out.println(" Ingrese el nombre de la mascota");
		String name = reader.nextLine();
		petsValidator.nameValidator(name);

		System.out.println(" Ingrese el ID del dueño ");
		long ownerId = petsValidator.ownerIdValidator(reader.nextLine());

		System.out.println(" Ingrese la edad de la mascota ");
		int age = petsValidator.ageValidator(reader.nextLine());

		System.out.println(" Ingrese la especie de la mascota (Gato, Perro, Peces,Aves ) ");
		String species = reader.nextLine();
		petsValidator.speciesValidator(species);

		System.out.println(" Ingrese la raza de la mascota");
		String breed = reader.nextLine();
		petsValidator.speciesValidator(breed);

		System.out.println(" Ingrese las caracteristica de la mascota ");
		String characteristics = reader.nextLine();
		petsValidator.speciesValidator(characteristics);

		System.out.println(" Ingrese el peso de la mascota");
		double weight = petsValidator.weightValidator(reader.nextLine());

		PetsDto petsDto = new PetsDto(name, ownerId, age, species, breed, characteristics, weight);
		veterinaryanService.createPets(petsDto);
	}

	// Se crea la historia clinica
	private void createClinicalHistory() throws Exception {
		//long idOrder = 0;
		System.out.println(" Ingrese el id de la mascota: ");
		long petsId = historyClinicValidator.petsIdValidator(reader.nextLine());

		// System.out.println(" Ingrese el medico Veterinario: ");
		//long veterinaryMedical = historyClinicValidator.petsIdValidator(reader.nextLine());

		System.out.println(" Motivo consulta: ");
		String reasonforConsultation = reader.nextLine();
		historyClinicValidator.reasonforConsultationValidator(reasonforConsultation);

		System.out.println("Ingrese el sintoma: ");
		String symptomatology = reader.nextLine();
		historyClinicValidator.symptomatologyValidator(symptomatology);

		System.out.println("Diagnostico de mascota: ");
		String diagnostico = reader.nextLine();
		historyClinicValidator.diagnosticoValidator(diagnostico);

		System.out.println("Medicamentos: ");
		String medication = reader.nextLine();
		historyClinicValidator.medicationValidator(medication);

		System.out.println("Ingrese dosis de medicamento: ");
		String doseofMedication = reader.nextLine();
		historyClinicValidator.doseofMedicationValidator(doseofMedication);

		System.out.println("Ingrese el historial de vacunacion: ");
		String vaccineHistory = reader.nextLine();
		historyClinicValidator.vaccineHistoryValidator(vaccineHistory);

		System.out.println("Alergia de mascota: ");
		String allergiesMedicines = reader.nextLine();
		historyClinicValidator.vaccineHistoryValidator(allergiesMedicines);

		System.out.println("Detalles del procedimiento: ");
		String detailProcedure = reader.nextLine();
		historyClinicValidator.detailProcedureValidator(detailProcedure);



		HistoryClinicDto historyClinicDto = new HistoryClinicDto(petsId, 0, reasonforConsultation,
				symptomatology, diagnostico, medication, doseofMedication, 0, vaccineHistory, allergiesMedicines,
				detailProcedure, false);
		veterinaryanService.createHistoryClinic(historyClinicDto);

	}

	private  void searchHistoryClinic() throws Exception {
		System.out.println("ingrese el id de la orden");
		long orderId = orderValidator.orderIdValidator(reader.nextLine());

		List<HistoryClinicDto> listHistoryDtoSearch = veterinaryanService
				.consultHistoryClinicDto(new HistoryClinicDto(orderId));

		if (!listHistoryDtoSearch.isEmpty()) {
			System.out.println("Historia clínicas encontradas:");
			for(HistoryClinicDto HistoryDtoSearch:listHistoryDtoSearch)
			{
				System.out.println("Fecha: " + HistoryDtoSearch.getRegisterDate());
				System.out.println("Mascota: " + HistoryDtoSearch.getPetsId());
				System.out.println("Medico Vet: " + HistoryDtoSearch.getVeterinaryMedical());
				System.out.println("Razón de consulta: " + HistoryDtoSearch.getReasonforConsultation());
				System.out.println("Sintomatologia: " + HistoryDtoSearch.getSymptomatology());
				System.out.println("Diagnostico: " + HistoryDtoSearch.getDiagnostico());
				System.out.println("Medicamentos: " + HistoryDtoSearch.getMedication());
				System.out.println("Dosis de medicamento: " + HistoryDtoSearch.getDoseofMedication());
				System.out.println("Id orden: " + HistoryDtoSearch.getIdOrder());
				System.out.println("Historia de Vacunacion: " + HistoryDtoSearch.getVaccineHistory());
				System.out.println("Alergia Medicamentos: " + HistoryDtoSearch.getAllergiesMedicines());
				System.out.println("Detalle de procedimiento: " + HistoryDtoSearch.getDetailProcedure());
				System.out.println("Cancelar orden: " + HistoryDtoSearch.getAnnulmentOrder());
				System.out.println("-------------------------------------");
			}
		} else
			System.out.println("No existe una Historia clinica con esta orden " + orderId);
	}

	public void searchOrder() throws Exception {
		System.out.println("ingrese el id de la orden");
		long orderId = orderValidator.orderIdValidator(reader.nextLine());
		OrderDto orderSearch = veterinaryanService.consultOrdern(new OrderDto(orderId));
		if(orderSearch != null)
		{
			System.out.println("Orden encontrada:");
			System.out.println("Mascota: " + orderSearch.getPetId());
			System.out.println("Cédula de dueño: " + orderSearch.getOwnerID());
			System.out.println("Veterinario: " + orderSearch.getVeterinarianID());
			System.out.println("Nombre de medicamento/s: " + orderSearch.getMedicationName());
			System.out.println("Fecha de registro: " + orderSearch.getGenerationDate());
			List<HistoryClinicDto> listHistorySearch = veterinaryanService.consultHistoryClinicDto(new HistoryClinicDto(orderSearch.getOrderId()));
			for(HistoryClinicDto HistoryDtoSearch:listHistorySearch)
				if(HistoryDtoSearch.getAnnulmentOrder())
					System.out.println(" Se Cancelo la orden ");
			System.out.println("-------------------------------------");
		}else
			System.out.println("No se encontro la orden");
	}

	public void cancelOrder() throws Exception {
		System.out.println("ingrese el id de la orden");
		long orderId = orderValidator.orderIdValidator(reader.nextLine());

		veterinaryanService.cancelarOrder(new OrderDto(orderId));
		System.out.println("Orden cancelada correctamente.");
	}


	public void sessionVet() {
		boolean runApp = true;
		while (runApp) {
			try {
				System.out.println(MENUVET);
				String option = reader.nextLine();
				runApp = MENUVET(option);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	private boolean MENUVET(String option) throws Exception {
		switch (option) {
		case "1": {
			System.out.println("Crear mascota");
			createPets();
			return true;
		}
		case "2": {
			System.out.println("Crear Historia Clinica");
			createClinicalHistory();
			return true;
		}
		case "3": {
			searchHistoryClinic();
			return true;
		}
		case "4": {
			searchOrder();
			return true;
		}
		case "5": {
			cancelOrder();
			return true;
		}
		case "6": {
			return false;
		}
		default: {
			System.out.println("ingrese una opcion valida");
			return true;
		}
		}
	}

	public petsValidator getPetsValidator() {
		return petsValidator;
	}

	public void setPetsValidator(petsValidator petsValidator) {
		this.petsValidator = petsValidator;
	}

	public HistoryClinicValidator getHistoryClinicValidator() {
		return historyClinicValidator;
	}

	public void setHistoryClinicValidator(HistoryClinicValidator historyClinicValidator) {
		this.historyClinicValidator = historyClinicValidator;
	}

	public VeterinaryanService getVeterinaryanService() {
		return veterinaryanService;
	}

	public void setVeterinaryanService(VeterinaryanService veterinaryanService) {
		this.veterinaryanService = veterinaryanService;
	}

	public OrderValidator getOrderValidator() {
		return orderValidator;
	}

	public void setOrderValidator(OrderValidator orderValidator) {
		this.orderValidator = orderValidator;
	}



}
