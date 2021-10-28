package pe.edu.upc.trabajo.business.crud;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.Product;

public interface ProductService extends CrudService<Product, Integer> {
	List<Product> findByName(String name) throws Exception;
}
