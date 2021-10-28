package pe.edu.upc.trabajo.business.crud.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.PostService;
import pe.edu.upc.trabajo.models.entities.Post;

import pe.edu.upc.trabajo.models.repository.PostRepository;


@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public JpaRepository<Post, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return postRepository;
	}
	
	@Override
	public List<Post> findByDate(Date date) throws Exception{
		return postRepository.findByDate(date);
	}
	
}
