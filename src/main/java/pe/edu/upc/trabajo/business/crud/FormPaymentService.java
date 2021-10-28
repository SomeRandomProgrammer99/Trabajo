package pe.edu.upc.trabajo.business.crud;

import java.util.List;

import pe.edu.upc.trabajo.models.entities.FormPayment;

public interface FormPaymentService extends CrudService<FormPayment, Integer> {
	List<FormPayment> findByName(String name) throws Exception;
}
