package pe.edu.upc.trabajo.business.crud;

import java.util.Date;
import java.util.List;

import pe.edu.upc.trabajo.models.entities.Post;

public interface PostService extends CrudService<Post, Integer> {
	List<Post> findByDate(Date date) throws Exception;
}
