package pe.edu.upc.trabajo.business.crud.impl;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.OrderService;
import pe.edu.upc.trabajo.models.entities.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public JpaRepository<Order, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findByDate(Date date) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
