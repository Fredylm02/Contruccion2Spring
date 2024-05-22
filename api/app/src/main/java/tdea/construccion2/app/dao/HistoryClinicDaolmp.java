package tdea.construccion2.app.dao;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdea.construccion2.app.dto.HistoryClinicDto;
import tdea.construccion2.app.models.HistoryClinic;
import tdea.construccion2.app.repository.HistoryClinicRepository;

   @Service
   public class HistoryClinicDaolmp implements HistoryClinicDao {
    
   @Autowired
   private HistoryClinicRepository historyClinicRepository;


	@Override
	public void createClinicalHistory(HistoryClinicDto historyClinicDto) throws Exception {
		HistoryClinic historyClinic =  new HistoryClinic(historyClinicDto);
           historyClinicRepository.save(historyClinic);
	}

     //Metodo para encontar la historia clinica por la orden 
	@Override
	public List<HistoryClinicDto> findHistoryByOrden(HistoryClinicDto historyClinicDto) throws Exception { 
		   List<HistoryClinic> Historylist = historyClinicRepository.findByOrder(historyClinicDto.getIdOrder());
		return Historylist.stream().map(this::toDTO).collect(Collectors.toList());
	}

	private HistoryClinicDto toDTO(HistoryClinic historyclinic1) {
		return new HistoryClinicDto(historyclinic1);
	}

	@Override
	public void cancelOrder(long orderId) throws Exception {
		List<HistoryClinicDto> listH = this.findHistoryByOrden(new HistoryClinicDto(orderId));
		for(HistoryClinicDto history : listH) {
			history.setAnnulmentOrder(true);
			historyClinicRepository.save(new HistoryClinic(history));
		}
		
	}

	public HistoryClinicRepository getHistoryClinicRepository() {
		return historyClinicRepository;
	}

	public void setHistoryClinicRepository(HistoryClinicRepository historyClinicRepository) {
		this.historyClinicRepository = historyClinicRepository;
	}
    

	
}
