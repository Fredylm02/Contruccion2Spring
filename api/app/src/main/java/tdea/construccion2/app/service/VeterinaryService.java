package tdea.construccion2.app.service;

import tdea.construccion2.app.dto.HistoryClinicDto;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PetsDto;


public interface VeterinaryService {
	
	public  void createPets (PetsDto PetsDto) throws Exception ;
	public  OrderDto createOrder (OrderDto orderDto) throws Exception ;
	public  void createHistoryClinic (HistoryClinicDto historyClinicDto) throws Exception ;
	public void cancelarOrder(OrderDto orderDto) throws Exception;
}

