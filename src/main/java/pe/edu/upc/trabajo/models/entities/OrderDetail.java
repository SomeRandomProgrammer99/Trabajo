package pe.edu.upc.trabajo.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Order_details")
@IdClass(OrderDetailId.class)
public class OrderDetail {
	
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="order_id")
	private Order order;
	
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "unit_price", columnDefinition = "DECIMAL(8,2)")
	private Float price;

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	

}
