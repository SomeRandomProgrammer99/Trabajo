package pe.edu.upc.trabajo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.trabajo.models.entities.FormPayment;


@Repository
public interface FormPaymentRepository extends JpaRepository<FormPayment, Integer> {

}
