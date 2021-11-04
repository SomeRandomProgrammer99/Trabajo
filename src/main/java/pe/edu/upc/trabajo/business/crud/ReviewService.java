package pe.edu.upc.trabajo.business.crud;

import java.util.Date;
import java.util.List;

import pe.edu.upc.trabajo.models.entities.Review;
import pe.edu.upc.trabajo.models.entities.ReviewId;

public interface ReviewService extends CrudService<Review, ReviewId> {
	List<Review> findByQualification(Integer qualification) throws Exception;
	List<Review> findByDate(Date date) throws Exception;
}
