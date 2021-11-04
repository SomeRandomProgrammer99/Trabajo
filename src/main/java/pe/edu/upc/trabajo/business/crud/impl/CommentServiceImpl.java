package pe.edu.upc.trabajo.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.CommentService;
import pe.edu.upc.trabajo.models.entities.Comment;
import pe.edu.upc.trabajo.models.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public JpaRepository<Comment, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return commentRepository;
	}

}
