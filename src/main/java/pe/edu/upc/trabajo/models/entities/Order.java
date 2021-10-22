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
@Table(name = "Orders",
	indexes= {@Index(columnList="date_order",name="orders_index_date_order")})
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@Column(name = "date_order")
	@Temporal(TemporalType.DATE)
	private Date dateOrder;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;
	
	@Column(name = "selling_company", length = 20)//company seller
	private String sellingCompany;//string 
	
	@ManyToOne
	@JoinColumn(name = "payment_id")
	private FormPayment payment; 
	
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private List<OrderDetail> orderDetails;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public FormPayment getPayment() {
		return payment;
	}

	public void setPayment(FormPayment payment) {
		this.payment = payment;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

}
