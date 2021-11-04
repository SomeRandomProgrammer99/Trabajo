package pe.edu.upc.trabajo.business.crud;

import java.util.Date;
import java.util.List;

import pe.edu.upc.trabajo.models.entities.Order;

public interface OrderService extends CrudService<Order, Integer> {
	List<Order> findByDate(Date date) throws Exception;
}
