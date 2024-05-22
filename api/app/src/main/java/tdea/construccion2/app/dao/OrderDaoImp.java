package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.models.Order;
import tdea.construccion2.app.repository.OrderRepository;
@Service
public class OrderDaoImp implements OrderDao {
	
@Autowired
public OrderRepository orderRepository;

	@Override
	public OrderDto createOrden(OrderDto orderDto) throws Exception {
		Order order = new Order(orderDto);
		orderRepository.save(order);
		orderDto.setOrderId(order.getOrderId());
		return orderDto;
		
	}

	

	@Override
	public OrderDto searchOrder(OrderDto orderDto) throws Exception {
	  Order Order =  orderRepository.findById(orderDto.getOrderId());
		return new OrderDto(Order);
	}



	@Override
	public boolean findOrderExist(OrderDto orderDto) throws Exception {
		return orderRepository.existsById(orderDto.getOrderId());
	}



	public OrderRepository getOrderRepository() {
		return orderRepository;
	}



	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
}
