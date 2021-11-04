package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.trabajo.models.entities.Shipment;
import pe.edu.upc.trabajo.models.entities.ShipmentStatus;
import pe.edu.upc.trabajo.models.entities.ShipmentStatusId;
import pe.edu.upc.trabajo.models.entities.Status;
@Repository
public interface ShipmentStatusRepository extends JpaRepository<ShipmentStatus, ShipmentStatusId>{
	List<ShipmentStatus> findByStatus(Status status);
	List<ShipmentStatus> findByShipment(Shipment shipment);
}
