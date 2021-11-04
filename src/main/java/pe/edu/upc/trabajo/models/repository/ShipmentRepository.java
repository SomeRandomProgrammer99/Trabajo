package pe.edu.upc.trabajo.models.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.trabajo.models.entities.Shipment;
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
	List<Shipment> findByDate(Date date);
	List<Shipment> findByTypeShipment(Integer typeShipment);
}
