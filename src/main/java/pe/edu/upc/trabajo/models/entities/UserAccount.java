package pe.edu.upc.trabajo.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User_accounts", 
		indexes = { @Index(columnList = "username", name = "user_index_username")})
public class UserAccount {
	
	@Id
	private Integer id;
	
	@Column(name = "username", length = 20, nullable = false)
	private String username;
	
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	

	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "id")
	private User user;
	
	public UserAccount(  ) {
	
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}

