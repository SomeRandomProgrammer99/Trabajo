package pe.edu.upc.trabajo.business.crud.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.UserService;
import pe.edu.upc.trabajo.models.entities.User;
import pe.edu.upc.trabajo.models.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public JpaRepository<User, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return userRepository;
	}


	
}
