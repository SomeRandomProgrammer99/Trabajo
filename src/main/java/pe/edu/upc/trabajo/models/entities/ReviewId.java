package pe.edu.upc.trabajo.models.entities;

import java.io.Serializable;
import java.util.Objects;

public class ReviewId implements Serializable{
private static final long serialVersionUID = 1L;
	
	private Integer comment;
	private Integer wholesaler;
	
	
	public ReviewId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewId(Integer comment, Integer wholesaler) {
		super();
		this.comment = comment;
		this.wholesaler = wholesaler;
	}

	public Integer getComment() {
		return comment;
	}

	public void setComment(Integer comment) {
		this.comment = comment;
	}

	public Integer getWholesaler() {
		return wholesaler;
	}

	public void setWholesaler(Integer wholesaler) {
		this.wholesaler = wholesaler;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, wholesaler);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		
		ReviewId reviewId = (ReviewId)obj;
		
		if(this.comment != reviewId.comment)
			return false;
		if(this.wholesaler != reviewId.wholesaler)
			return false;
		return true;
		
	}
}
