package pe.edu.upc.trabajo.business.crud.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.OrderDetailService;
import pe.edu.upc.trabajo.models.entities.OrderDetail;
import pe.edu.upc.trabajo.models.repository.OrderDetailRepository;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Override
	public JpaRepository<OrderDetail, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return orderDetailRepository;
	}

}
