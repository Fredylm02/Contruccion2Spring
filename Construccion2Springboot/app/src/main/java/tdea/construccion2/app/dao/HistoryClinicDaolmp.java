package tdea.construccion2.app.dao;


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

	@Override
	public HistoryClinicDao findClinicalHistoryById(int clinicalHistoryId) throws Exception {
		
     return null; 
 
	}
}
