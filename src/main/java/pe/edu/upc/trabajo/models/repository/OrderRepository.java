package pe.edu.upc.trabajo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.trabajo.models.entities.Order;
import pe.edu.upc.trabajo.models.entities.OrderDetailId;

@Repository
public interface OrderRepository extends JpaRepository<Order, OrderDetailId> {

}
