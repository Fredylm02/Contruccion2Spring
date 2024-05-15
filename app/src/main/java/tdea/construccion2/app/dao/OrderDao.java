package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.OrderDto;

public interface OrderDao {
    
    public OrderDto createOrden (OrderDto orderDto)throws Exception;
    public OrderDto orderById (long orderId)throws Exception;
}
