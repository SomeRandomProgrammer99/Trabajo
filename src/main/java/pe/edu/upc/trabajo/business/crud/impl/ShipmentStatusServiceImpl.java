package pe.edu.upc.trabajo.business.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.ShipmentStatusService;
import pe.edu.upc.trabajo.models.entities.Shipment;
import pe.edu.upc.trabajo.models.entities.ShipmentStatus;
import pe.edu.upc.trabajo.models.entities.ShipmentStatusId;
import pe.edu.upc.trabajo.models.entities.Status;
import pe.edu.upc.trabajo.models.repository.ShipmentStatusRepository;

@Service
public class ShipmentStatusServiceImpl implements ShipmentStatusService {

	@Autowired
	private ShipmentStatusRepository shipmentStatusRepository;
	
	@Override
	public JpaRepository<ShipmentStatus, ShipmentStatusId> getJpaRepository() {
		// TODO Auto-generated method stub
		return shipmentStatusRepository;
	}

	@Override
	public List<ShipmentStatus> findByStatus(Status status) throws Exception {
		// TODO Auto-generated method stub
		return shipmentStatusRepository.findByStatus(status);
	}

	@Override
	public List<ShipmentStatus> findByShipment(Shipment shipment) throws Exception {
		// TODO Auto-generated method stub
		return shipmentStatusRepository.findByShipment(shipment);
	}

}
