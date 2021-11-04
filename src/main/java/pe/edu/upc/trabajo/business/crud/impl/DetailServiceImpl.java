package pe.edu.upc.trabajo.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo.business.crud.DetailService;
import pe.edu.upc.trabajo.models.entities.Detail;
import pe.edu.upc.trabajo.models.entities.DetailId;
import pe.edu.upc.trabajo.models.repository.DetailRepository;

@Service
public class DetailServiceImpl implements DetailService {
	
	@Autowired
	private DetailRepository detailRepository;
	
	@Override
	public JpaRepository<Detail, DetailId> getJpaRepository() {
		// TODO Auto-generated method stub
		return detailRepository;
	}

}
