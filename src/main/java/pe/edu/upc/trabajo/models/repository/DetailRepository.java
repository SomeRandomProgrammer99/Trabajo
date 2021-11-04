package pe.edu.upc.trabajo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.trabajo.models.entities.Detail;
import pe.edu.upc.trabajo.models.entities.DetailId;
@Repository
public interface DetailRepository extends JpaRepository<Detail, DetailId> {

}
