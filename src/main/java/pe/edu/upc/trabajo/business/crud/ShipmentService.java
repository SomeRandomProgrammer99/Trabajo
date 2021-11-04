package pe.edu.upc.trabajo.business.crud;

import java.util.Date;
import java.util.List;

import pe.edu.upc.trabajo.models.entities.Shipment;

public interface ShipmentService extends CrudService<Shipment, Integer> {
	List<Shipment> findByDate(Date date) throws Exception;
	List<Shipment> findByTypeShipment(Integer typeShipment) throws Exception;
}
