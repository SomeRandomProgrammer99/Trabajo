package pe.edu.upc.trabajo.models.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.trabajo.models.entities.Review;
import pe.edu.upc.trabajo.models.entities.ReviewId;
@Repository
public interface ReviewRepository extends JpaRepository<Review, ReviewId> {
	List<Review> findByQualification(Integer qualification);
	List<Review> findByDate(Date date);
}
