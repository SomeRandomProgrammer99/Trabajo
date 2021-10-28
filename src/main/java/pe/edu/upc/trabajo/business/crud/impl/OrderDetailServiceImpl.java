package pe.edu.upc.trabajo.business.crud.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.OrderDetailService;
import pe.edu.upc.trabajo.models.entities.OrderDetail;
import pe.edu.upc.trabajo.models.entities.OrderDetailId;
import pe.edu.upc.trabajo.models.entities.Product;
import pe.edu.upc.trabajo.models.repository.OrderDetailRepository;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Override
	public JpaRepository<OrderDetail, OrderDetailId> getJpaRepository() {
		// TODO Auto-generated method stub
		return orderDetailRepository;
	}

	@Override
	public List<OrderDetail> findByProduct(Product product)  throws Exception{
		return orderDetailRepository.findByProduct(product);
	}
	
}
