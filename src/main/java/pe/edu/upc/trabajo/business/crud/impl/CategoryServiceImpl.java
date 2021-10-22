package pe.edu.upc.trabajo.business.crud.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.CategoryService;
import pe.edu.upc.trabajo.models.entities.Category;
import pe.edu.upc.trabajo.models.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired	
	private CategoryRepository categoryRepository;
	
	@Override
	public JpaRepository<Category, Integer> getJpaRepository() {
		return categoryRepository;
	}
}
