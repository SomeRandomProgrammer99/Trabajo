package pe.edu.upc.trabajo.business.crud;

import java.util.Date;
import java.util.List;

import pe.edu.upc.trabajo.models.entities.Review;

public interface ReviewService extends CrudService<Review, Integer> {
	List<Review> findByQualification(Integer qualification) throws Exception;
	List<Review> findByDate(Date date) throws Exception;
}
