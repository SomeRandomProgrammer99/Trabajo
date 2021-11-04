package pe.edu.upc.trabajo.business.crud;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Shipment;
import pe.edu.upc.trabajo.models.entities.ShipmentStatus;
import pe.edu.upc.trabajo.models.entities.ShipmentStatusId;
import pe.edu.upc.trabajo.models.entities.Status;

public interface ShipmentStatusService extends CrudService<ShipmentStatus, ShipmentStatusId>{
	List<ShipmentStatus> findByStatus(Status status) throws Exception;
	List<ShipmentStatus> findByShipment(Shipment shipment) throws Exception;
}
