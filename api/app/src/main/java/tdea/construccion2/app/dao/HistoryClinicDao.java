package tdea.construccion2.app.dao;

import java.util.List;

import tdea.construccion2.app.dto.HistoryClinicDto;


public interface HistoryClinicDao {
	
	public void createClinicalHistory(HistoryClinicDto historyClinicDto) throws Exception;
	public List<HistoryClinicDto> findHistoryByOrden (HistoryClinicDto historyClinicDto)throws Exception;
	public void cancelOrder(long orderId)throws Exception;
}




