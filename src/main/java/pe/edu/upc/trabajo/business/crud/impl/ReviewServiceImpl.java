package pe.edu.upc.trabajo.business.crud.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.ReviewService;
import pe.edu.upc.trabajo.models.entities.Review;
import pe.edu.upc.trabajo.models.entities.ReviewId;
import pe.edu.upc.trabajo.models.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	@Override
	public JpaRepository<Review, ReviewId> getJpaRepository() {
		// TODO Auto-generated method stub
		return reviewRepository;
	}

	@Override
	public List<Review> findByQualification(Integer qualification) throws Exception {
		// TODO Auto-generated method stub
		return reviewRepository.findByQualification(qualification);
	}

	@Override
	public List<Review> findByDate(Date date) throws Exception {
		// TODO Auto-generated method stub
		return reviewRepository.findByDate(date);
	}

}
