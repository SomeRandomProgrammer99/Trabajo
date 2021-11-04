package pe.edu.upc.trabajo.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Comments")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comments_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="producer_id")
	private Producer producers;
	
	@OneToMany(mappedBy = "comment", fetch = FetchType.LAZY)
	private List<Review> reviews;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
