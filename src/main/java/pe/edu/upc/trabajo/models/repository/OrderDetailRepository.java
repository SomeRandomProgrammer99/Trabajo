package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.trabajo.models.entities.OrderDetail;
import pe.edu.upc.trabajo.models.entities.OrderDetailId;
import pe.edu.upc.trabajo.models.entities.Product;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
	List<OrderDetail> findByProduct(Product product);

}
