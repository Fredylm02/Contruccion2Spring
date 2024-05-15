package tdea.construccion2.app.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tdea.construccion2.app.dto.HistoryClinicDto;
import tdea.construccion2.app.dto.PetsDto;

import tdea.construccion2.app.service.VeterinaryanService;
import tdea.construccion2.app.validators.HistoryClinicValidator;
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
	

	private static final String MENUVET = "ingrese\n1.Para crear mascota \n2. Para crear historia clinica \n3.Para cerrar Sesion";

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

		/*System.out.println("Nesecita una orden? \n1.Si\n2.No");
		idOrder = reader.nextInt();*/

		/*
		 * switch (reader.nextInt()) { case 1: System.out.print("Ingrese ID del dueño");
		 * long owner = reader.nextLong();
		 * System.out.println("Ingrese ID del veterinario"); long veterinarian =
		 * reader.nextLong(); System.out.println("Ingrese nombre del medicamento");
		 * String medicationName = reader.nextLine();
		 * System.out.println("Ingrese la dosis"); String dosage = reader.nextLine();
		 * Order orden = new Order(petsId,owner, veterinarian, medicationName,dosage);
		 * orderDao.createOrden(new OrderDto(orden)); OrderDto Oid =
		 * orderDao.orderById(orden.getOrderId()); idOrder = Oid.getOrderId(); break;
		 * case 2: { return; } default:{ throw new Exception("no es una opcion valida");
		 * }
		 * 
		 * }
		 */

		HistoryClinicDto historyClinicDto = new HistoryClinicDto(petsId, 0, reasonforConsultation,
				symptomatology, diagnostico, medication, doseofMedication, 0, vaccineHistory, allergiesMedicines,
				detailProcedure, false);
		veterinaryanService.createHistoryClinic(historyClinicDto);

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
			return false;
		}
		default: {
			System.out.println("ingrese una opcion valida");
			return true;
		}
		}
	}

}
