package tdea.construccion2.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import tdea.construccion2.app.models.HistoryClinic;



public interface HistoryClinicRepository extends JpaRepository <HistoryClinic, Long> {

	public List<HistoryClinic> findByOrder(long idOrder);

}
