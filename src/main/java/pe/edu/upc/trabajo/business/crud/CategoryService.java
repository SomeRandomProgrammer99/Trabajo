package pe.edu.upc.trabajo.business.crud;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Category;

public interface CategoryService extends CrudService<Category, Integer>{
	List<Category> findByName(String name) throws Exception;

}
