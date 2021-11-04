package pe.edu.upc.trabajo.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Shipment_statuses", 
		indexes = { @Index( columnList = "status_id", name = "shipment_statuses_index_status_id" ),
				 @Index( columnList = "shipment_id", name = "shipment_statuses_index_shipment_id" )})
@IdClass(ShipmentStatusId.class)
public class ShipmentStatus {
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status_id", nullable = false)
	private Status status;
	
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "shipment_id", nullable = false)
	private Shipment shipment;
	
	@Column(name = "date_start")
	@Temporal(TemporalType.DATE)
	private Date dateStart;
	
	@Column(name = "date_end")
	@Temporal(TemporalType.DATE)
	private Date dateEnd;

	public ShipmentStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
}
