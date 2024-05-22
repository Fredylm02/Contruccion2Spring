package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tdea.construccion2.app.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	public Order findById(long orderId );
	public boolean existsById(long orderId);

}
