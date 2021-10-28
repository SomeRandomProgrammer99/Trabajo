package pe.edu.upc.trabajo.business.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.FormPaymentService;
import pe.edu.upc.trabajo.models.entities.FormPayment;
import pe.edu.upc.trabajo.models.repository.FormPaymentRepository;

@Service
public class FormPaymentServiceImpl implements FormPaymentService {

	@Autowired
	private FormPaymentRepository formPaymentRepository;
	
	@Override
	public JpaRepository<FormPayment, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return formPaymentRepository;
	}

	@Override
	public List<FormPayment> findByName(String name) throws Exception{
		return formPaymentRepository.findByName(name);
	}
	
}
