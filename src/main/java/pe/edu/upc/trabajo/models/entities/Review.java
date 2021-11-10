package pe.edu.upc.trabajo.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Reviews", 
		indexes = { @Index(columnList = "qualification", name = "reviews_index_qualification"),
				@Index(columnList = "date", name = "reviews_index_date")})
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "review_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "producer_id", nullable = false)
	private Producer producers;
	
	@ManyToOne
	@JoinColumn(name = "wholesaler_id", nullable = false)
	private Wholesaler wholesalers;
	
	@Column(name = "review_description", length = 50)
	private String description;
	
	@Column(name = "qualification", columnDefinition = "NUMERIC(1)")
	private Integer qualification;
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;

	public Review() {  
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producer getProducers() {
		return producers;
	}

	public void setProducers(Producer producers) {
		this.producers = producers;
	}

	public Wholesaler getWholesalers() {
		return wholesalers;
	}

	public void setWholesalers(Wholesaler wholesalers) {
		this.wholesalers = wholesalers;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQualification() {
		return qualification;
	}

	public void setQualification(Integer qualification) {
		this.qualification = qualification;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
