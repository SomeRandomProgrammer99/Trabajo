package pe.edu.upc.trabajo.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@IdClass(ReviewId.class)
public class Review {
	@Id
	@ManyToOne
	@JoinColumn(name = "comment_id", nullable = false)
	private Comment comment;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "wholesaler_id", nullable = false)
	private Wholesaler wholesaler;
	
	@Column(name = "review_description", length = 20)
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

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Wholesaler getWholesaler() {
		return wholesaler;
	}

	public void setWholesaler(Wholesaler wholesaler) {
		this.wholesaler = wholesaler;
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
