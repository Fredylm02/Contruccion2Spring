package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.HistoryClinicDto;


public interface HistoryClinicDao {
	
	public void createClinicalHistory(HistoryClinicDto historyClinicDto) throws Exception;
	
	public HistoryClinicDao findClinicalHistoryById (int clinicalHistoryId)throws Exception;
}




