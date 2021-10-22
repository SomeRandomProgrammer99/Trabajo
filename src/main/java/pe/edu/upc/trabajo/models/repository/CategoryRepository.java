package pe.edu.upc.trabajo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.trabajo.models.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
