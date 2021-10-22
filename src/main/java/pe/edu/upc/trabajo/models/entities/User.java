package pe.edu.upc.trabajo.models.entities;

import java.util.ArrayList;
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


@Entity
@Table(name = "Users",
		indexes = { @Index(columnList = "company_name", name = "user_index_company_name")})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", columnDefinition = "NUMERIC(4)")
	private Integer id;

	@Column(name = "user_type")
	private Integer type;

	//@transiet sirve para especificar que el atributo no se guarda en la base de datos, no se hace persistente
	
	@Column(name = "company_name", length = 20)
	private String company;

	@Column(name = "phone", columnDefinition = "NUMERIC(9)")
	private Integer phone;

	@Column(name = "email", length = 20)
	private String email;

	@Column(name = "address", length = 20)
	private String address;

	@Column(name = "home_page", length = 20, nullable = false)
	private String page;

	@ManyToOne
	@JoinColumn(name = "district_id", nullable = false)
	private District district;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Product> products;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Post> posts;

	@OneToOne(mappedBy = "user")
	private UserAccount userAccount;	
	
	@OneToMany(mappedBy = "userId", fetch = FetchType.LAZY)
	private List<Order> ordersId;
	
	
	public User() {
		products=new ArrayList<Product>();
		posts=new ArrayList<Post>();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public List<Order> getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(List<Order> ordersId) {
		this.ordersId = ordersId;
	}

}
