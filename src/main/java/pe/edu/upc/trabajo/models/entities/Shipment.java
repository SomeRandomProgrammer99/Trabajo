package pe.edu.upc.trabajo.models.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Shipments", 
		indexes = { @Index(columnList = "date", name = "shipments_index_date"),
					@Index(columnList = "typeShipping_id", name = "shipments_index_typeShipping_id")})
public class Shipment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shipment_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@OneToMany(mappedBy = "shipment", fetch = FetchType.LAZY)
	private List<Order> orders;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name = "address", length = 30)
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "typeShipping_id", nullable = false)
	private TypeShipment typeShipment;

	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TypeShipment getTypeShipment() {
		return typeShipment;
	}

	public void setTypeShipment(TypeShipment typeShipment) {
		this.typeShipment = typeShipment;
	}
	
	
}
