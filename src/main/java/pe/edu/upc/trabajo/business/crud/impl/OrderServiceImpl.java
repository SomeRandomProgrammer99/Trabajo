package pe.edu.upc.trabajo.business.crud.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.OrderService;
import pe.edu.upc.trabajo.models.entities.Order;
import pe.edu.upc.trabajo.models.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public JpaRepository<Order, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return orderRepository;
	}

	
	
}
