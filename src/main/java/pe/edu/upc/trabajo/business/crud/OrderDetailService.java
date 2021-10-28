package pe.edu.upc.trabajo.business.crud;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.OrderDetail;
import pe.edu.upc.trabajo.models.entities.OrderDetailId;
import pe.edu.upc.trabajo.models.entities.Product;

public interface OrderDetailService extends CrudService<OrderDetail, OrderDetailId> {
	List<OrderDetail> findByProduct(Product product) throws Exception;

}
