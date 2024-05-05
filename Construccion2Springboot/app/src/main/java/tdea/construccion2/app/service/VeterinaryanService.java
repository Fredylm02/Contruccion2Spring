package tdea.construccion2.app.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdea.construccion2.app.dao.HistoryClinicDao;
import tdea.construccion2.app.dao.LoginDao;
import tdea.construccion2.app.dao.PersonDao;
import tdea.construccion2.app.dao.PetsDao;
import tdea.construccion2.app.dto.HistoryClinicDto;
import tdea.construccion2.app.dto.InvoiceDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.dto.PetsDto;
import tdea.construccion2.app.dto.SessionDto;
import tdea.construccion2.app.models.Order;


@Service
public class VeterinaryanService implements VeterinaryService, LoginService, AdminService,InvoiceService {
	
	List<String> roles = Arrays.asList("Administrador", "Veterinario", "Vendedor ", "dueño", "Mascota");
	List<String> speciesPets = Arrays.asList("Gato", "Perro", "Peces", "Aves");
	private static long sessionId = 0L;
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private LoginDao loginDao;
	
	@Autowired
	private PetsDao petsDao;
	
	@Autowired
	private HistoryClinicDao historyClinicDao;
	
	

	@Override
	public void login(PersonDto personDto) throws Exception {
		PersonDto personDtoValidate = personDao.findUserByUserName(personDto);
		if (personDtoValidate == null) {
			throw new Exception("usuario no valido");
		}
		if (!personDto.getPassword().equals(personDtoValidate.getPassword())) {
			throw new Exception("usuario o contraseña incorrectos");
		}
		personDto.setRol(personDtoValidate.getRol());
		SessionDto sesionDto = loginDao.login(personDtoValidate);
		setSesionID(sesionDto.getId());
		System.out.println("se inicia la sesion " + sessionId);
	}
	
	
	@Override
	public void createUser(PersonDto personDto) throws Exception {
		if (!roles.contains(personDto.getRol())) {
			throw new Exception("el rol no es valido");
		     }
			if (personDao.findUserExist(personDto.getId())) {
				throw new Exception("ya existe un usuario con esa cedula");
			}
			if (personDao.existUserByUserName(personDto)) {
				throw new Exception("ya existe el usuario");
			}
			personDao.createPerson(personDto);
			System.out.println("se ha creado el usuario");
	}

	@Override
	public void createPets(PetsDto PetsDto) throws Exception {
		SessionDto sessionDto = loginDao.findSessionById(sessionId);
		if (sessionDto == null) {
			throw new Exception("no hay una sesion valida");
		}
		PersonDto personDto = new PersonDto(PetsDto.getOwnerId());
		personDto = personDao.findUserById(personDto);
		if (personDto == null) {
			throw new Exception("No hay dueño con es ID");
		}
		if (!speciesPets.contains(PetsDto.getSpecies())) {
			throw new Exception("Especie de mascota no valida");
		}
		petsDao.createPets(PetsDto);
	}
	
	@Override
	public void createHistoryClinic(HistoryClinicDto historyClinicDto) throws Exception {
		Boolean petsDto = petsDao.findPetsById(historyClinicDto.getPetsId());
		if (petsDto == false)
			throw new Exception("No existe la mascota.");
		if (!personDao.findUserExist(historyClinicDto.getVeterinaryMedical()))
			throw new Exception("No existe el veterinario.");
                
                Order orden = new Order(historyClinicDto.getPetsId(),historyClinicDto.getIdOrder() , 
                        historyClinicDto.getVeterinaryMedical(), historyClinicDto.getMedication(),
                        historyClinicDto.getDoseofMedication());
		OrderDto orderCreate = new OrderDto(orden);

		historyClinicDto.setIdOrder(orderCreate.getOrderId());

		// Creación de historia clinica
		historyClinicDao.createClinicalHistory(historyClinicDto);
		System.out.println("Se ha creado la historia clinica");
		
	}
	
	
	@Override
	public void setSesionID(long sesionId) {
		sessionId = sesionId;
	}
	
	
	@Override
	public void createUSerol(PersonDto personDto) throws Exception {
		createUser(personDto);
					
   }
	
    @Override
	public void logout() throws Exception {
			loginDao.logout(sessionId);
			setSesionID(0);
    }

	@Override
	public void createInvoice(InvoiceDto invoiceDto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createOrder(OrderDto orderDto) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void findHistoryClinic(HistoryClinicDto historyClinicDto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findOrders() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelarOrder(OrderDto orderDto) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
	
		

