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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Orders",
	indexes= {@Index(columnList="date",name="orders_index_date_order")})
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "wholesaler_id")
	private Wholesaler wholesaler;
	
	@Column(name = "amount", columnDefinition = "DECIMAL(8,2)")
	private Float amount;
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "payment_id")
	private TypePayment typePayment; 
	
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private List<Detail> cards;
	
	@OneToOne(mappedBy = "order", fetch = FetchType.LAZY)
	private Shipment shipment;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Wholesaler getWholesaler() {
		return wholesaler;
	}

	public void setWholesaler(Wholesaler wholesaler) {
		this.wholesaler = wholesaler;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TypePayment getTypePayment() {
		return typePayment;
	}

	public void setTypePayment(TypePayment typePayment) {
		this.typePayment = typePayment;
	}

	public List<Detail> getCards() {
		return cards;
	}

	public void setCards(List<Detail> cards) {
		this.cards = cards;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
}
